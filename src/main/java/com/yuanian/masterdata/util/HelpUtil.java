package com.yuanian.masterdata.util;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Zhangxin
 * @title: PageUtil
 * @projectName masterdata
 * @description: TODO
 * @date 2019/7/8  12:32
 */
@Component
public class HelpUtil {
    public static final int PAGESIZE=1000;

    @Value("${ESBToken}")
    private String token;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public static final Map<String,String> INTERFACETYPE = new HashMap<>();

    static  {
        INTERFACETYPE.put("project","mdsProject主数据接口");
        INTERFACETYPE.put("parcel","mdsParcel主数据接口");
        INTERFACETYPE.put("incorporatedCompany","mdsIncorporatedCompany主数据接口");
    }
}
