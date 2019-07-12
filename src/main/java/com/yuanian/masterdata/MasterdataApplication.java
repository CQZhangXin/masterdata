package com.yuanian.masterdata;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * @author Zhangxin
 * @title: MasterdataApplication
 * @projectName masterdata
 * @description: 项目的启动类
 * @date 2019/7/2  13:53
 */
@SpringBootApplication
@MapperScan(basePackages = {"com.yuanian.**.dao"})
@ImportResource(locations = {"classpath*:spring-quartz.xml"})
public class MasterdataApplication {

    public static void main(String[] args) {
        SpringApplication.run(MasterdataApplication.class, args);
    }

}