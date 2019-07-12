package com.yuanian.masterdata.config;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * @author Zhangxin
 * @title: RealAddress
 * @projectName hop-ecs
 * @description: 获取配置地址信息,并对配置信息的合法性进行校验
 * @date 2019/5/31  3:06
 */
@Component
public class RealAddress {
    @Autowired
    private Envoriment consoleSelfYml;

    private  String mdsProjectAddr;
    private  String mdsParcelAddr;
    private  String mdsIncorporatedCompanyAddr;
    private  String ncCompanyAddr;
    private  String toC1Addr;
    private  String toTBase;

    @PostConstruct
    public void initAddress() throws Exception {
        boolean getUrlSuccess = false;
        Address mdsProjectAddress = consoleSelfYml.getMdsProject();
        Address mdsParcelAddress = consoleSelfYml.getMdsParcel();
        Address mdsIncorporatedCompanyAddress = consoleSelfYml.getMdsIncorporatedCompany();
        Address ncCompanyAddress = consoleSelfYml.getNcCompany();

        getUrlSuccess =
                (consoleSelfYml.getIstest().equals("true")&&
                        (StringUtils.isEmpty(consoleSelfYml.getIsproduction())||
                        consoleSelfYml.getIsproduction().equals("false"))
                )||
                ((StringUtils.isEmpty(consoleSelfYml.getIstest())||
                        consoleSelfYml.getIstest().equals("false"))&&
                        consoleSelfYml.getIsproduction().equals("true"));

        if(!getUrlSuccess){
            throw new Exception("consoleself的istest与isproduction配置错误");
        }else{
            if(consoleSelfYml.getIstest().equals("true")){
                this.mdsProjectAddr = mdsProjectAddress.getTest();
                this.mdsParcelAddr = mdsParcelAddress.getTest();
                this.mdsIncorporatedCompanyAddr = mdsIncorporatedCompanyAddress.getTest();
                this.ncCompanyAddr = ncCompanyAddress.getTest();
                this.toC1Addr = consoleSelfYml.getToC1().getTest();
                this.toTBase = consoleSelfYml.getToTBase().getTest();
            }else{
                this.mdsProjectAddr = mdsProjectAddress.getProduction();
                this.mdsParcelAddr = mdsParcelAddress.getProduction();
                this.mdsIncorporatedCompanyAddr = mdsIncorporatedCompanyAddress.getProduction();
                this.ncCompanyAddr = ncCompanyAddress.getProduction();
                this.toC1Addr = consoleSelfYml.getToC1().getProduction();
                this.toTBase = consoleSelfYml.getToTBase().getProduction();
            }
        }

    }

    public String getMdsProjectAddr() {
        return mdsProjectAddr;
    }

    public String getMdsParcelAddr() {
        return mdsParcelAddr;
    }

    public String getMdsIncorporatedCompanyAddr() {
        return mdsIncorporatedCompanyAddr;
    }


    public String getNcCompanyAddr() {
        return ncCompanyAddr;
    }

    public String getToC1Addr() {
        return toC1Addr;
    }

    public String getToTBase() {
        return toTBase;
    }

}
