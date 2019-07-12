package com.yuanian.masterdata.entity;


public class Log {

    private Object interfacename;

    private String logmsg;

    public Object getInterfacename() {
        return interfacename;
    }

    public void setInterfacename(Object interfacename) {
        this.interfacename = interfacename;
    }

    public String getLogmsg() {
        return logmsg;
    }

    public void setLogmsg(String logmsg) {
        this.logmsg = logmsg == null ? null : logmsg.trim();
    }
}