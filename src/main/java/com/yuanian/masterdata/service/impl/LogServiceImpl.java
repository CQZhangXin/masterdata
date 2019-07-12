package com.yuanian.masterdata.service.impl;

import com.yuanian.masterdata.dao.LogDAO;
import com.yuanian.masterdata.entity.Log;
import com.yuanian.masterdata.service.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Zhangxin
 * @title: LogServiceImpl
 * @projectName masterdata
 * @description: 日志
 * @date 2019/7/9  16:18
 */
@Service
public class LogServiceImpl implements LogService {

    @Autowired
    private LogDAO logDAO;

    @Override
    public void insertLog(String interfaceName, String msg) {
        Log log = new Log();
        log.setInterfacename(interfaceName);
        log.setLogmsg(msg);
        logDAO.insertSelective(log);
    }
}
