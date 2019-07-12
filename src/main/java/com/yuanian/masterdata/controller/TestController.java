package com.yuanian.masterdata.controller;

import com.yuanian.masterdata.service.MasterDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Zhangxin
 * @title: TestController
 * @projectName masterdata
 * @description: TODO
 * @date 2019/7/5  15:58
 */
@RestController
@RequestMapping(value = "/C1")
public class TestController {

    @Autowired
    private MasterDataService testService;

    @RequestMapping(value = "/testDb")
    public String testDb(){
        return "我是C1主数据微服务！";
    }
}
