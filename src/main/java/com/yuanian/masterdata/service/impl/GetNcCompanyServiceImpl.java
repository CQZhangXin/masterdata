package com.yuanian.masterdata.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.yuanian.masterdata.config.RealAddress;
import com.yuanian.masterdata.dao.NcCompanyDAO;
import com.yuanian.masterdata.entity.NcCompany;
import com.yuanian.masterdata.entity.NcCompanyExample;
import com.yuanian.masterdata.service.GetNcCompanyService;
import com.yuanian.masterdata.util.DateUtil;
import com.yuanian.masterdata.util.HelpUtil;
import com.yuanian.masterdata.util.HttpGet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Zhangxin
 * @title: GetNcCompanyServiceImpl
 * @projectName masterdata
 * @description: 获取NC法人公司数据
 * @date 2019/7/8  18:34
 */
@Service
public class GetNcCompanyServiceImpl implements GetNcCompanyService {

    @Autowired
    private NcCompanyDAO ncompanyDAO;

    @Autowired
    private RealAddress realAddress;

    @Autowired
    private HelpUtil helpUtil;

    @Autowired
    private LogServiceImpl logService;

    @Override
    public void doHttpNcCompany() {

    }

    public void getNcCompanyExcuter(){
        try {
            String data = HttpGet.sendGet(realAddress.getNcCompanyAddr(),null, helpUtil.getToken());
            System.out.println(data);
            String code = (String) JSONObject.parseObject(data).get("code");
            if(!code.equals("0")){
                String msg = (String) JSONObject.parseObject(data).get("msg");
                throw new Exception("NC业务单元接口返回编码失败，返回编码为"+code+"!返回的信息为："+msg);
            }
            List<JSONObject> list = (List<JSONObject>) JSONObject.parseObject(data).get("data");

            if(list==null||list.size()==0){
                throw new Exception("接口返回的数据为空！");
            }
            for (JSONObject object:
                    list) {
                Object pk_org = object.get("PK_ORG");
                NcCompanyExample ncCompanyExample = new NcCompanyExample();
                NcCompanyExample.Criteria criteria = ncCompanyExample.createCriteria();
                criteria.andPkOrgEqualTo(pk_org.toString());

                List<NcCompany> ncCompanies = ncompanyDAO.selectByExample(ncCompanyExample);
                if(ncCompanies==null||ncCompanies.size()==0){
                    ncompanyDAO.insertSelective(JSONObject.toJavaObject(object, NcCompany.class));
                    System.out.println("新增"+object.toJSONString());
                }else {
                    ncompanyDAO.updateByExample(JSONObject.toJavaObject(object, NcCompany.class),ncCompanyExample);
                    System.out.println("更新"+object.toJSONString());
                }

            }
            logService.insertLog("NcCompany接口", DateUtil.getNow()+"NcCompany接口同步到的数据量为："+list.size()+"条");
        } catch (Exception e) {
            logService.insertLog("NcCompany接口",e.toString());
        }
    }


}
