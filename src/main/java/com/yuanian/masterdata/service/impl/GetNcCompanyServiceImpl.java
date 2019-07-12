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
            JSONObject pageInfo = (JSONObject)JSONObject.parseObject(data.toString()).get("pageInfo");
            String result = JSONObject.parseObject(data.toString()).get("result").toString();

            if(result==null||!result.equals("true")){
                throw new Exception("接口返回数据标识不为true。");
            }

            List<JSONObject> list = (List<JSONObject>) pageInfo.get("list");
            if(list==null||list.size()==0){
                throw new Exception("接口返回的数据为空！");
            }
            for (JSONObject object:
                    list) {
    //            System.out.println(object.toJSONString());
                String company_id = object.get("company_id").toString();
                String jdCode = object.get("jdCode").toString();
                NcCompanyExample ncCompanyExample = new NcCompanyExample();
                NcCompanyExample.Criteria criteria = ncCompanyExample.createCriteria();
                criteria.andCompanyIdEqualTo(company_id);
                criteria.andJdcodeEqualTo(jdCode);
                List<NcCompany> ncCompanies = ncompanyDAO.selectByExample(ncCompanyExample);
                if(ncCompanies==null){
                    ncompanyDAO.insertSelective(JSONObject.toJavaObject(object, NcCompany.class));
                }else {
                    ncompanyDAO.updateByExampleSelective(JSONObject.toJavaObject(object, NcCompany.class),ncCompanyExample);
                }

            }
            logService.insertLog("NcCompany接口", DateUtil.getNow()+"NcCompany接口同步到的数据量为："+list.size()+"条");
        } catch (Exception e) {
            logService.insertLog("NcCompany接口",e.toString());
        }
    }


}
