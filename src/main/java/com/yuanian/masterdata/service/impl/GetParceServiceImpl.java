package com.yuanian.masterdata.service.impl;

import com.yuanian.masterdata.config.RealAddress;
import com.yuanian.masterdata.dao.ParcelDAO;
import com.yuanian.masterdata.service.GetParcelService;
import com.yuanian.masterdata.util.HelpUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Zhangxin
 * @title: GetParceServiceImpl
 * @projectName masterdata
 * @description: 地块表接口查询
 * @date 2019/7/8  19:19
 */
@Service
public class GetParceServiceImpl implements GetParcelService {

    @Autowired
    private GetProjectServiceImpl getProjectService;

    @Autowired
    private RealAddress realAddress;

    @Autowired
    private ParcelDAO parcelDAO;

    @Override
    public void doHttpGetParcel() {
        String url = realAddress.getMdsParcelAddr();
        parcelDAO.deleteAll();
        getProjectService.newExcuterGetProject(url, HelpUtil.PAGESIZE,"parcel");
    }
}
