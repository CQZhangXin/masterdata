package com.yuanian.masterdata.service.impl;


import com.alibaba.fastjson.JSONObject;
import com.yuanian.masterdata.config.RealAddress;
import com.yuanian.masterdata.dao.InCorporatedCompanyDAO;
import com.yuanian.masterdata.dao.ParcelDAO;
import com.yuanian.masterdata.dao.ProjectDAO;
import com.yuanian.masterdata.entity.*;
import com.yuanian.masterdata.service.GetProjectService;
import com.yuanian.masterdata.util.DateUtil;
import com.yuanian.masterdata.util.HelpUtil;
import com.yuanian.masterdata.util.HttpGet;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;


/**
 * @author Zhangxin
 * @title: GetProjectServiceImpl
 * @projectName masterdata
 * @description: 将工程数据接口调用落地
 * @date 2019/7/8  11:54
 */
@Service
public class GetProjectServiceImpl implements GetProjectService {

    private Logger logger = LoggerFactory.getLogger(GetProjectServiceImpl.class);

    @Autowired
    private ProjectDAO projectDAO;

    @Autowired
    private ParcelDAO parcelDAO;

    @Autowired
    private InCorporatedCompanyDAO incorporatedCompanyDAO;

    @Autowired
    private RealAddress realAddress;

    @Autowired
    private HelpUtil helpUtil;

    @Autowired
    private LogServiceImpl logService;

    /**
     * 方法说明：调用项目表接口的定时调度
     */
    @Override
    public void doHttpGetProject() {
        String url = realAddress.getMdsProjectAddr();
        projectDAO.deleteAll();
        this.newExcuterGetProject(url,HelpUtil.PAGESIZE,"project");
    }

    /**
     *
     * 方法说明：向数据库插入数据
     * @param list
     * @param type
     */
    public void insertdata(List<JSONObject> list,String type){
        try {
            for (JSONObject object:
                    list) {
                if(type.equals("project")){
//                    String projectversionid = object.get("projectversionid").toString();
//                    ProjectExample projectExample = new ProjectExample();
//                    ProjectExample.Criteria criteria = projectExample.createCriteria();
//                    criteria.andProjectversionidEqualTo(projectversionid);
//                    List<Project> list1 = projectDAO.selectByExample(projectExample);
//                    if(list1==null){
//                        projectDAO.insertSelective(JSONObject.toJavaObject(object, Project.class));
//                    }else{
//                        projectDAO.updateByExampleSelective(JSONObject.toJavaObject(object, Project.class),projectExample);
//                    }
                    projectDAO.insertSelective(JSONObject.toJavaObject(object, Project.class));
                }else if(type.equals("parcel")){
//                    String parcelversionid = object.get("parcelversionid").toString();
//                    ParcelExample parcelExample = new ParcelExample();
//                    ParcelExample.Criteria criteria = parcelExample.createCriteria();
//                    criteria.andParcelversionidEqualTo(parcelversionid);
//                    List<Parcel> parcels = parcelDAO.selectByExample(parcelExample);
//                    if(parcels==null){
//                        parcelDAO.insertSelective(JSONObject.toJavaObject(object, Parcel.class));
//                    }else{
//                        parcelDAO.updateByExampleSelective(JSONObject.toJavaObject(object, Parcel.class),parcelExample);
//                    }
                    parcelDAO.insertSelective(JSONObject.toJavaObject(object, Parcel.class));
                }else if(type.equals("incorporatedCompany")){
                    String fcompanyid = object.get("fcompanyid").toString();
                    InCorporatedCompanyExample inCorporatedCompanyExample = new InCorporatedCompanyExample();
                    InCorporatedCompanyExample.Criteria criteria = inCorporatedCompanyExample.createCriteria();
                    criteria.andFcompanyidEqualTo(fcompanyid);
                    List<InCorporatedCompany> inCorporatedCompanies = incorporatedCompanyDAO.selectByExample(inCorporatedCompanyExample);
                    if (inCorporatedCompanies==null){
                        incorporatedCompanyDAO.insertSelective(JSONObject.toJavaObject(object, InCorporatedCompany.class));
                    }else{
                        incorporatedCompanyDAO.updateByExampleSelective(JSONObject.toJavaObject(object, InCorporatedCompany.class),inCorporatedCompanyExample);
                    }
                }

            }
        } catch (Exception e) {
            logService.insertLog("数据插入报错！",e.toString());
        }

    }

    /**
     * 方法说明：真实执行分页调用接口
     * @param address
     * @param pageSize
     * @param type
     */
    public void newExcuterGetProject(String address , int pageSize,String type){
        int pageNum=1;
        int totalPage = 0;
        String data = "";
        int totalNum =0;

        try {
            while (pageNum==1||totalPage>=pageNum){
                String parm = "pageNum="+pageNum
                        +"&pageSize="+pageSize
                        +"&token="+helpUtil.getToken();

                if(type.equals("project")||type.equals("parcel")){
                    parm = parm+"&isnew=1";
                }

                data = HttpGet.sendGet(address,parm,null);
                String success = JSONObject.parseObject(data.toString()).get("success").toString();
                if(success==null||!success.equals("true")){
                    throw new Exception("接口返回数据标识不为true。");
                }

                JSONObject pageInfo = (JSONObject)JSONObject.parseObject(data.toString()).get("pageInfo");
                int size =Integer.valueOf(pageInfo.get("size").toString()) ;
                totalPage = Integer.valueOf(pageInfo.get("pages").toString()) ;
                List<JSONObject> list = (List<JSONObject>)pageInfo.get("list");
                totalNum = Integer.valueOf(pageInfo.get("total").toString());

                if(list.size()==0||list==null){
                    throw new Exception("接口返回数据的结果集List为空！");
                }
                insertdata(list,type);
                pageNum++;
            }
            logService.insertLog(HelpUtil.INTERFACETYPE.get(type),
                    DateUtil.getNow() +type+"接口同步到的数据量为："+totalNum+"条");
        } catch (Exception e) {
            e.printStackTrace();
            logService.insertLog(HelpUtil.INTERFACETYPE.get(type),e.toString());
        }

    }


    public void testSelect(){
        ProjectExample projectExample = new ProjectExample();
        ProjectExample.Criteria criteria = projectExample.createCriteria();
        criteria.andProjectversionidEqualTo("3AC87E10-199B-40FD-A0CF-52FD4B9F8181");
        List<Project> list1 = projectDAO.selectByExample(projectExample);
        System.out.println(list1.get(0).toString());
    }
}
