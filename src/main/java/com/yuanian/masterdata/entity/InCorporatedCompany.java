package com.yuanian.masterdata.entity;

import java.util.Date;

public class InCorporatedCompany {
    private Object fcompanyid;

    private String fcompanycode;

    private Object fcompanyname;

    private Object upperid;

    private String status;

    private String createuser;

    private Object createdate;

    private String modifyuser;

    private Object modifydate;

    private Object f1;

    private Object f2;

    private Object f3;

    private Date updatetime;

    public Object getFcompanyid() {
        return fcompanyid;
    }

    public void setFcompanyid(Object fcompanyid) {
        this.fcompanyid = fcompanyid;
    }

    public String getFcompanycode() {
        return fcompanycode;
    }

    public void setFcompanycode(String fcompanycode) {
        this.fcompanycode = fcompanycode == null ? null : fcompanycode.trim();
    }

    public Object getFcompanyname() {
        return fcompanyname;
    }

    public void setFcompanyname(Object fcompanyname) {
        this.fcompanyname = fcompanyname;
    }

    public Object getUpperid() {
        return upperid;
    }

    public void setUpperid(Object upperid) {
        this.upperid = upperid;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getCreateuser() {
        return createuser;
    }

    public void setCreateuser(String createuser) {
        this.createuser = createuser == null ? null : createuser.trim();
    }

    public Object getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Object createdate) {
        this.createdate = createdate;
    }

    public String getModifyuser() {
        return modifyuser;
    }

    public void setModifyuser(String modifyuser) {
        this.modifyuser = modifyuser == null ? null : modifyuser.trim();
    }

    public Object getModifydate() {
        return modifydate;
    }

    public void setModifydate(Object modifydate) {
        this.modifydate = modifydate;
    }

    public Object getF1() {
        return f1;
    }

    public void setF1(Object f1) {
        this.f1 = f1;
    }

    public Object getF2() {
        return f2;
    }

    public void setF2(Object f2) {
        this.f2 = f2;
    }

    public Object getF3() {
        return f3;
    }

    public void setF3(Object f3) {
        this.f3 = f3;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }
}