package com.yuanian.masterdata.service;

import com.yuanian.masterdata.service.impl.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @author Zhangxin
 * @title: TestService
 * @projectName masterdata
 * @description: C1主数据同步定时调度
 * @date 2019/7/5  15:54
 */
@Service
@Component
public class MasterDataService {
    @Autowired
    private GetProjectServiceImpl getProjectService;

    @Autowired
    private GetNcCompanyServiceImpl getNcCompanyService;

    @Autowired
    private GetParceServiceImpl getParceService;

    @Autowired
    private GetIncorporatedCompanyServiceImpl getIncorporatedCompanyService;

    @Autowired
    private ToC1ServiceImpl toC1Service;

    @Autowired
    private ChargeDataServiceImpl chargeDataService;

    @Value("${TrueOrFalseGetIncorporatedCompany}")
    private String trueOrFalseGetIncorporatedCompany;

    @Value("${TrueOrFalseGetMDSProject}")
    private String trueOrFalseGetMDSProject;

    @Value("${TrueOrFalseGetParcel}")
    private String trueOrFalseGetParcel;

    @Value("${TrueOrFalseGetNcCompany}")
    private String trueOrFalseGetNcCompany;

    @Value("${TrueOrFalseChargeData}")
    private String trueOrFalseChargeData;

    @Value("${TrueOrFalseToC1}")
    private String trueOrFalseToC1;

    @Value("${TrueOrfalseToTbase}")
    private String trueOrfalseToTbase;

    /**
     * 方法说明：主数据同步任务调度
     */
    public void getDataFromESB(){
        //1、将数据同步到落地表 抽取数据
        if(trueOrFalseGetMDSProject!=null&&"true".equals(trueOrFalseGetMDSProject)){
            getProjectService.doHttpGetProject();
        }

        if(trueOrFalseGetParcel!=null&&"true".equals(trueOrFalseGetParcel)){
            getParceService.doHttpGetParcel();
        }

        if(trueOrFalseGetIncorporatedCompany!=null&&"true".equals(trueOrFalseGetIncorporatedCompany)){
            getIncorporatedCompanyService.doHttpGetIncorporatedCompany();
        }

        if(trueOrFalseGetNcCompany!=null&&"true".equals(trueOrFalseGetNcCompany)){
            getNcCompanyService.getNcCompanyExcuter();
        }

        //2、调用存储过程 转化数据
        if(trueOrFalseChargeData!=null&&"true".equals(trueOrFalseChargeData)){
            chargeDataService.doCharge();
        }

        //3、将转化的数据同步到C1 数据注入
        if(trueOrFalseGetNcCompany!=null&&"true".equals(trueOrFalseToC1)){
            toC1Service.sysDataToC1();
        }

        if(trueOrfalseToTbase!=null&&"true".equals(trueOrfalseToTbase)){
            toC1Service.sysEbase();
        }
    }
}
