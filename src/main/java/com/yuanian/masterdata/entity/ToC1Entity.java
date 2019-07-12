package com.yuanian.masterdata.entity;

import java.util.Date;

public class ToC1Entity {
    private Object fentityCode;

    private Object fentityName;

    private Object fparentCode;

    private Object fparentName;

    private Short fentityLevel;

    private Object fentityAlialname1;

    private Short forderno;

    private Date updateTime;

    public Object getFentityCode() {
        return fentityCode;
    }

    public void setFentityCode(Object fentityCode) {
        this.fentityCode = fentityCode;
    }

    public Object getFentityName() {
        return fentityName;
    }

    public void setFentityName(Object fentityName) {
        this.fentityName = fentityName;
    }

    public Object getFparentCode() {
        return fparentCode;
    }

    public void setFparentCode(Object fparentCode) {
        this.fparentCode = fparentCode;
    }

    public Object getFparentName() {
        return fparentName;
    }

    public void setFparentName(Object fparentName) {
        this.fparentName = fparentName;
    }

    public Short getFentityLevel() {
        return fentityLevel;
    }

    public void setFentityLevel(Short fentityLevel) {
        this.fentityLevel = fentityLevel;
    }

    public Object getFentityAlialname1() {
        return fentityAlialname1;
    }

    public void setFentityAlialname1(Object fentityAlialname1) {
        this.fentityAlialname1 = fentityAlialname1;
    }

    public Short getForderno() {
        return forderno;
    }

    public void setForderno(Short forderno) {
        this.forderno = forderno;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}