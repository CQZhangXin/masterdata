package com.yuanian.masterdata.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author Zhangxin
 * @title: Envoriment
 * @projectName testWar
 * @description: TODO
 * @date 2019/7/2  14:32
 */
@Component
@ConfigurationProperties(prefix = "c1-configuration")
public class Envoriment {
    private String istest;
    private String isproduction;
    private Address mdsProject;
    private Address mdsParcel;
    private Address mdsIncorporatedCompany;
    private Address ncCompany;
    private Address toC1;
    private Address toTBase;

    public String getIstest() {
        return istest;
    }

    public void setIstest(String istest) {
        this.istest = istest;
    }

    public String getIsproduction() {
        return isproduction;
    }

    public void setIsproduction(String isproduction) {
        this.isproduction = isproduction;
    }

    public Address getMdsProject() {
        return mdsProject;
    }

    public void setMdsProject(Address mdsProject) {
        this.mdsProject = mdsProject;
    }

    public Address getMdsParcel() {
        return mdsParcel;
    }

    public void setMdsParcel(Address mdsParcel) {
        this.mdsParcel = mdsParcel;
    }

    public Address getMdsIncorporatedCompany() {
        return mdsIncorporatedCompany;
    }

    public void setMdsIncorporatedCompany(Address mdsIncorporatedCompany) {
        this.mdsIncorporatedCompany = mdsIncorporatedCompany;
    }

    public Address getNcCompany() {
        return ncCompany;
    }

    public void setNcCompany(Address ncCompany) {
        this.ncCompany = ncCompany;
    }

    public Address getToC1() {
        return toC1;
    }

    public void setToC1(Address toC1) {
        this.toC1 = toC1;
    }

    public Address getToTBase() {
        return toTBase;
    }

    public void setToTBase(Address toTBase) {
        this.toTBase = toTBase;
    }
}
