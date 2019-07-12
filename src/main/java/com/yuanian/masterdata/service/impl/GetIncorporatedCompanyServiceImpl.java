package com.yuanian.masterdata.service.impl;

import com.yuanian.masterdata.config.RealAddress;
import com.yuanian.masterdata.service.GetIncorporatedCompanyService;
import com.yuanian.masterdata.util.HelpUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Zhangxin
 * @title: GetIncorporatedCompanyServiceImpl
 * @projectName masterdata
 * @description: 获取法人公司数据
 * @date 2019/7/8  19:23
 */
@Service
public class GetIncorporatedCompanyServiceImpl implements GetIncorporatedCompanyService {

    @Autowired
    private GetProjectServiceImpl getProjectService;

    @Autowired
    private RealAddress realAddress;

    @Override
    public void doHttpGetIncorporatedCompany() {
        String url = realAddress.getMdsIncorporatedCompanyAddr();
        getProjectService.newExcuterGetProject(url, HelpUtil.PAGESIZE,"incorporatedCompany");
    }
}
