package com.yuanian.masterdata.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.yuanian.masterdata.config.RealAddress;
import com.yuanian.masterdata.dao.ToC1EntityDAO;
import com.yuanian.masterdata.service.ToC1Service;
import com.yuanian.masterdata.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.net.URLEncoder;
import java.util.List;
import java.util.Map;

/**
 * @author Zhangxin
 * @title: ToC1ServiceImpl
 * @projectName masterdata
 * @description: 将数据从中间库同步到C1
 * @date 2019/7/9  18:05
 */
@Service
@Component
public class ToC1ServiceImpl implements ToC1Service {

    @Autowired
    private ToC1EntityDAO toC1EntityDAO;

    @Autowired
    private LogServiceImpl logService;

    @Autowired
    private RealAddress realAddress;

    /**
     * 字段说明：同步到C1的维度名称
     */
    @Value("${org}")
    private String org;

    /**
     * 将数据从中间库同步到C1的二维库
     */
    @Override
    public void sysDataToC1() {
        try {
            //查询一次要同步总的数量
            int totalNum = toC1EntityDAO.selectNum();
            int pageSize = HelpUtil.PAGESIZE;
            if(totalNum == 0){
                throw new Exception("本次同步的数据里量为0");
            }
            int pages = (totalNum% pageSize)==0?totalNum/pageSize:(totalNum/pageSize)+1;
            //分页同步C1
            for(int i=1; i<=pages; i++){
                List<Map<String,Object>> list = toC1EntityDAO.selectPage((i-1)*pageSize+1,i*pageSize);
                for (Map<String,Object> map:
                     list) {
                    String url = realAddress.getToC1Addr();
                    JSONObject object = new JSONObject();
                    object.put("agcode",map.get("FENTITYCODE"));
                    object.put("zh_CN",map.get("FENTITYNAME"));
                    object.put("en_US","");

                    String parm = "dimName="+URLEncoder.encode(org,"utf-8")
                            +"&memberName="+URLEncoder.encode(map.get("FENTITYNAME").toString(),"utf-8")
                            +"&parentName=" +URLEncoder.encode(map.get("FPARENTNAME").toString(),"utf-8")
//                            +"&parentName=" +URLEncoder.encode("测试成员1","utf-8")
                            +"&languageValues="
                            + URLEncoder.encode(object.toJSONString(),"utf-8");

                    JSONObject jsonObject = new JSONObject();
                    jsonObject.put("languageValues",object);
                    String data = HttpGet.sendGet(url,parm,null);
                    if(data.equals("success")){
                        logService.insertLog(DateUtil.getNow()+"sysDataToC1接口",map.toString()
                                +"同步到C1二维库"+org+"维度下操作成功！");
                    }else{
                        logService.insertLog(DateUtil.getNow()+"sysDataToC1接口",map.toString()
                                +"同步到C1二维库"+org+"维度下操作失败！");
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            logService.insertLog(DateUtil.getNow()+"sysDataToC1接口",e.toString());
        }
    }

    /**
     * 方法说明：讲组织架构从二维库同步到多维库
     */
    @Override
    public void sysEbase() {
        try {
            String url = realAddress.getToTBase();
            String parm = "dimName="+URLEncoder.encode(org,"utf-8");
            String data = HttpGet.sendGet(url,null,null);
            System.out.println(data);
            logService.insertLog(DateUtil.getNow()+"sysEbase接口",data);
        } catch (Exception e) {
            e.printStackTrace();
            logService.insertLog(DateUtil.getNow()+"sysEbase接口",e.toString());
        }
    }
}
