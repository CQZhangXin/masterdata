package com.yuanian.masterdata.service.impl;

import com.yuanian.masterdata.dao.ToC1EntityDAO;
import com.yuanian.masterdata.service.ChargeDataService;
import com.yuanian.masterdata.util.DateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Zhangxin
 * @title: ChargeDataServiceImpl
 * @projectName masterdata
 * @description: 调用存储过程，转化数据
 * @date 2019/7/10  16:38
 */
@Service
public class ChargeDataServiceImpl implements ChargeDataService {

    @Autowired
    private ToC1EntityDAO toC1EntityDAO;

    @Autowired
    private LogServiceImpl logService;

    @Override
    public void doCharge() {
        try{
            toC1EntityDAO.chargeData();
            System.out.println("数据转化存储过程调用成功！");
            logService.insertLog(DateUtil.getNow()+"数据转化存储过程调用成功！",DateUtil.getNow()+" 数据转化成功！");
        }catch (Exception e){
            logService.insertLog("数据转化存储过程调用失败！",e.toString());
        }


    }
}
