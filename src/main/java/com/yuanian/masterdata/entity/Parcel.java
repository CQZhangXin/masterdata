package com.yuanian.masterdata.entity;

import java.math.BigDecimal;
import java.util.Date;

public class Parcel {
    private Object parcelversionid;

    private String projectid;

    private String projectcode;

    private String parcelcode;

    private String parcelid;

    private Object parcelname;

    private String fcompanycode;

    private Object fcompanyname;

    private Short version;

    private Object parcelgeneralizename;

    private String contractcode;

    private BigDecimal contractamount;

    private String parcelstatus;

    private String parcelproperty;

    private Object parcelgaindate;

    private Object parceltransferdate;

    private String parcelselltype;

    private Object parcelsellman;

    private Object address;

    private String datastage;

    private BigDecimal totalusearea;

    private BigDecimal buildingarea;

    private BigDecimal expropriatedarea;

    private BigDecimal expropriatedgreenarea;

    private BigDecimal expropriatedroadarea;

    private BigDecimal expropriatedotherarea;

    private BigDecimal buildingholdarea;

    private BigDecimal totalroadarea;

    private BigDecimal totalgreenarea;

    private BigDecimal demonstrationarea;

    private BigDecimal totalcapacityarea;

    private BigDecimal upcapacityarea;

    private BigDecimal downcapacityarea;

    private BigDecimal upnoncapacityarea;

    private BigDecimal downnoncapacityarea;

    private BigDecimal totalbuildingarea;

    private BigDecimal upbuildingarea;

    private BigDecimal downbuildingarea;

    private BigDecimal downgaragearea;

    private BigDecimal stiltfloorarea;

    private BigDecimal towerdownarea;

    private Short storeroomnum;

    private BigDecimal storeroomarea;

    private BigDecimal totalsellarea;

    private BigDecimal upselfsellarea;

    private BigDecimal upavailablesellarea;

    private BigDecimal upgovernmentarea;

    private BigDecimal downselfsellarea;

    private BigDecimal downothersellarea;

    private BigDecimal totalpresentarea;

    private BigDecimal uppresentarea;

    private BigDecimal downpresentarea;

    private BigDecimal additionalarea;

    private String buildingmaxheight;

    private String planratio;

    private String plandensity;

    private String buildingminheight;

    private BigDecimal realratio;

    private BigDecimal realdensity;

    private BigDecimal availablethan;

    private Short totalstallnum;

    private Short upstallnum;

    private Short upgroundstallnum;

    private Short semiundergroundstallnum;

    private Short stallnuminbuilding;

    private Short downautostallnum;

    private Short downdefencenum;

    private Short downdefencemachinenum;

    private Short downdefencenonmachinenum;

    private Short downnondefencenum;

    private Short downnondefencemachinenum;

    private Short downnondefencenonmachinenum;

    private Short semidownnodefencemachinenum;

    private Short downnonautostallnum;

    private String plangreenradio;

    private BigDecimal greenradio;

    private BigDecimal stallarea;

    private String status;

    private Short housetypenum;

    private String sellsystemcode;

    private String costsystemcode;

    private String purchasesystemcode;

    private String financialsystemcode;

    private String createuser;

    private Object createdate;

    private String modifyuser;

    private Object modifydate;

    private Object f1;

    private Object f2;

    private Object f3;

    private Object fcompanyid;

    private Object projectversionid;

    private Object remark;

    private Short nosellstallnum;

    private Short downdefencesellnum;

    private Short downnondefencesellnum;

    private Object parceltype;

    private String fcompanycodechange;

    private Object fcompanyidchange;

    private Date updateTime;

    public Object getParcelversionid() {
        return parcelversionid;
    }

    public void setParcelversionid(Object parcelversionid) {
        this.parcelversionid = parcelversionid;
    }

    public String getProjectid() {
        return projectid;
    }

    public void setProjectid(String projectid) {
        this.projectid = projectid == null ? null : projectid.trim();
    }

    public String getProjectcode() {
        return projectcode;
    }

    public void setProjectcode(String projectcode) {
        this.projectcode = projectcode == null ? null : projectcode.trim();
    }

    public String getParcelcode() {
        return parcelcode;
    }

    public void setParcelcode(String parcelcode) {
        this.parcelcode = parcelcode == null ? null : parcelcode.trim();
    }

    public String getParcelid() {
        return parcelid;
    }

    public void setParcelid(String parcelid) {
        this.parcelid = parcelid == null ? null : parcelid.trim();
    }

    public Object getParcelname() {
        return parcelname;
    }

    public void setParcelname(Object parcelname) {
        this.parcelname = parcelname;
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

    public Short getVersion() {
        return version;
    }

    public void setVersion(Short version) {
        this.version = version;
    }

    public Object getParcelgeneralizename() {
        return parcelgeneralizename;
    }

    public void setParcelgeneralizename(Object parcelgeneralizename) {
        this.parcelgeneralizename = parcelgeneralizename;
    }

    public String getContractcode() {
        return contractcode;
    }

    public void setContractcode(String contractcode) {
        this.contractcode = contractcode == null ? null : contractcode.trim();
    }

    public BigDecimal getContractamount() {
        return contractamount;
    }

    public void setContractamount(BigDecimal contractamount) {
        this.contractamount = contractamount;
    }

    public String getParcelstatus() {
        return parcelstatus;
    }

    public void setParcelstatus(String parcelstatus) {
        this.parcelstatus = parcelstatus == null ? null : parcelstatus.trim();
    }

    public String getParcelproperty() {
        return parcelproperty;
    }

    public void setParcelproperty(String parcelproperty) {
        this.parcelproperty = parcelproperty == null ? null : parcelproperty.trim();
    }

    public Object getParcelgaindate() {
        return parcelgaindate;
    }

    public void setParcelgaindate(Object parcelgaindate) {
        this.parcelgaindate = parcelgaindate;
    }

    public Object getParceltransferdate() {
        return parceltransferdate;
    }

    public void setParceltransferdate(Object parceltransferdate) {
        this.parceltransferdate = parceltransferdate;
    }

    public String getParcelselltype() {
        return parcelselltype;
    }

    public void setParcelselltype(String parcelselltype) {
        this.parcelselltype = parcelselltype == null ? null : parcelselltype.trim();
    }

    public Object getParcelsellman() {
        return parcelsellman;
    }

    public void setParcelsellman(Object parcelsellman) {
        this.parcelsellman = parcelsellman;
    }

    public Object getAddress() {
        return address;
    }

    public void setAddress(Object address) {
        this.address = address;
    }

    public String getDatastage() {
        return datastage;
    }

    public void setDatastage(String datastage) {
        this.datastage = datastage == null ? null : datastage.trim();
    }

    public BigDecimal getTotalusearea() {
        return totalusearea;
    }

    public void setTotalusearea(BigDecimal totalusearea) {
        this.totalusearea = totalusearea;
    }

    public BigDecimal getBuildingarea() {
        return buildingarea;
    }

    public void setBuildingarea(BigDecimal buildingarea) {
        this.buildingarea = buildingarea;
    }

    public BigDecimal getExpropriatedarea() {
        return expropriatedarea;
    }

    public void setExpropriatedarea(BigDecimal expropriatedarea) {
        this.expropriatedarea = expropriatedarea;
    }

    public BigDecimal getExpropriatedgreenarea() {
        return expropriatedgreenarea;
    }

    public void setExpropriatedgreenarea(BigDecimal expropriatedgreenarea) {
        this.expropriatedgreenarea = expropriatedgreenarea;
    }

    public BigDecimal getExpropriatedroadarea() {
        return expropriatedroadarea;
    }

    public void setExpropriatedroadarea(BigDecimal expropriatedroadarea) {
        this.expropriatedroadarea = expropriatedroadarea;
    }

    public BigDecimal getExpropriatedotherarea() {
        return expropriatedotherarea;
    }

    public void setExpropriatedotherarea(BigDecimal expropriatedotherarea) {
        this.expropriatedotherarea = expropriatedotherarea;
    }

    public BigDecimal getBuildingholdarea() {
        return buildingholdarea;
    }

    public void setBuildingholdarea(BigDecimal buildingholdarea) {
        this.buildingholdarea = buildingholdarea;
    }

    public BigDecimal getTotalroadarea() {
        return totalroadarea;
    }

    public void setTotalroadarea(BigDecimal totalroadarea) {
        this.totalroadarea = totalroadarea;
    }

    public BigDecimal getTotalgreenarea() {
        return totalgreenarea;
    }

    public void setTotalgreenarea(BigDecimal totalgreenarea) {
        this.totalgreenarea = totalgreenarea;
    }

    public BigDecimal getDemonstrationarea() {
        return demonstrationarea;
    }

    public void setDemonstrationarea(BigDecimal demonstrationarea) {
        this.demonstrationarea = demonstrationarea;
    }

    public BigDecimal getTotalcapacityarea() {
        return totalcapacityarea;
    }

    public void setTotalcapacityarea(BigDecimal totalcapacityarea) {
        this.totalcapacityarea = totalcapacityarea;
    }

    public BigDecimal getUpcapacityarea() {
        return upcapacityarea;
    }

    public void setUpcapacityarea(BigDecimal upcapacityarea) {
        this.upcapacityarea = upcapacityarea;
    }

    public BigDecimal getDowncapacityarea() {
        return downcapacityarea;
    }

    public void setDowncapacityarea(BigDecimal downcapacityarea) {
        this.downcapacityarea = downcapacityarea;
    }

    public BigDecimal getUpnoncapacityarea() {
        return upnoncapacityarea;
    }

    public void setUpnoncapacityarea(BigDecimal upnoncapacityarea) {
        this.upnoncapacityarea = upnoncapacityarea;
    }

    public BigDecimal getDownnoncapacityarea() {
        return downnoncapacityarea;
    }

    public void setDownnoncapacityarea(BigDecimal downnoncapacityarea) {
        this.downnoncapacityarea = downnoncapacityarea;
    }

    public BigDecimal getTotalbuildingarea() {
        return totalbuildingarea;
    }

    public void setTotalbuildingarea(BigDecimal totalbuildingarea) {
        this.totalbuildingarea = totalbuildingarea;
    }

    public BigDecimal getUpbuildingarea() {
        return upbuildingarea;
    }

    public void setUpbuildingarea(BigDecimal upbuildingarea) {
        this.upbuildingarea = upbuildingarea;
    }

    public BigDecimal getDownbuildingarea() {
        return downbuildingarea;
    }

    public void setDownbuildingarea(BigDecimal downbuildingarea) {
        this.downbuildingarea = downbuildingarea;
    }

    public BigDecimal getDowngaragearea() {
        return downgaragearea;
    }

    public void setDowngaragearea(BigDecimal downgaragearea) {
        this.downgaragearea = downgaragearea;
    }

    public BigDecimal getStiltfloorarea() {
        return stiltfloorarea;
    }

    public void setStiltfloorarea(BigDecimal stiltfloorarea) {
        this.stiltfloorarea = stiltfloorarea;
    }

    public BigDecimal getTowerdownarea() {
        return towerdownarea;
    }

    public void setTowerdownarea(BigDecimal towerdownarea) {
        this.towerdownarea = towerdownarea;
    }

    public Short getStoreroomnum() {
        return storeroomnum;
    }

    public void setStoreroomnum(Short storeroomnum) {
        this.storeroomnum = storeroomnum;
    }

    public BigDecimal getStoreroomarea() {
        return storeroomarea;
    }

    public void setStoreroomarea(BigDecimal storeroomarea) {
        this.storeroomarea = storeroomarea;
    }

    public BigDecimal getTotalsellarea() {
        return totalsellarea;
    }

    public void setTotalsellarea(BigDecimal totalsellarea) {
        this.totalsellarea = totalsellarea;
    }

    public BigDecimal getUpselfsellarea() {
        return upselfsellarea;
    }

    public void setUpselfsellarea(BigDecimal upselfsellarea) {
        this.upselfsellarea = upselfsellarea;
    }

    public BigDecimal getUpavailablesellarea() {
        return upavailablesellarea;
    }

    public void setUpavailablesellarea(BigDecimal upavailablesellarea) {
        this.upavailablesellarea = upavailablesellarea;
    }

    public BigDecimal getUpgovernmentarea() {
        return upgovernmentarea;
    }

    public void setUpgovernmentarea(BigDecimal upgovernmentarea) {
        this.upgovernmentarea = upgovernmentarea;
    }

    public BigDecimal getDownselfsellarea() {
        return downselfsellarea;
    }

    public void setDownselfsellarea(BigDecimal downselfsellarea) {
        this.downselfsellarea = downselfsellarea;
    }

    public BigDecimal getDownothersellarea() {
        return downothersellarea;
    }

    public void setDownothersellarea(BigDecimal downothersellarea) {
        this.downothersellarea = downothersellarea;
    }

    public BigDecimal getTotalpresentarea() {
        return totalpresentarea;
    }

    public void setTotalpresentarea(BigDecimal totalpresentarea) {
        this.totalpresentarea = totalpresentarea;
    }

    public BigDecimal getUppresentarea() {
        return uppresentarea;
    }

    public void setUppresentarea(BigDecimal uppresentarea) {
        this.uppresentarea = uppresentarea;
    }

    public BigDecimal getDownpresentarea() {
        return downpresentarea;
    }

    public void setDownpresentarea(BigDecimal downpresentarea) {
        this.downpresentarea = downpresentarea;
    }

    public BigDecimal getAdditionalarea() {
        return additionalarea;
    }

    public void setAdditionalarea(BigDecimal additionalarea) {
        this.additionalarea = additionalarea;
    }

    public String getBuildingmaxheight() {
        return buildingmaxheight;
    }

    public void setBuildingmaxheight(String buildingmaxheight) {
        this.buildingmaxheight = buildingmaxheight == null ? null : buildingmaxheight.trim();
    }

    public String getPlanratio() {
        return planratio;
    }

    public void setPlanratio(String planratio) {
        this.planratio = planratio == null ? null : planratio.trim();
    }

    public String getPlandensity() {
        return plandensity;
    }

    public void setPlandensity(String plandensity) {
        this.plandensity = plandensity == null ? null : plandensity.trim();
    }

    public String getBuildingminheight() {
        return buildingminheight;
    }

    public void setBuildingminheight(String buildingminheight) {
        this.buildingminheight = buildingminheight == null ? null : buildingminheight.trim();
    }

    public BigDecimal getRealratio() {
        return realratio;
    }

    public void setRealratio(BigDecimal realratio) {
        this.realratio = realratio;
    }

    public BigDecimal getRealdensity() {
        return realdensity;
    }

    public void setRealdensity(BigDecimal realdensity) {
        this.realdensity = realdensity;
    }

    public BigDecimal getAvailablethan() {
        return availablethan;
    }

    public void setAvailablethan(BigDecimal availablethan) {
        this.availablethan = availablethan;
    }

    public Short getTotalstallnum() {
        return totalstallnum;
    }

    public void setTotalstallnum(Short totalstallnum) {
        this.totalstallnum = totalstallnum;
    }

    public Short getUpstallnum() {
        return upstallnum;
    }

    public void setUpstallnum(Short upstallnum) {
        this.upstallnum = upstallnum;
    }

    public Short getUpgroundstallnum() {
        return upgroundstallnum;
    }

    public void setUpgroundstallnum(Short upgroundstallnum) {
        this.upgroundstallnum = upgroundstallnum;
    }

    public Short getSemiundergroundstallnum() {
        return semiundergroundstallnum;
    }

    public void setSemiundergroundstallnum(Short semiundergroundstallnum) {
        this.semiundergroundstallnum = semiundergroundstallnum;
    }

    public Short getStallnuminbuilding() {
        return stallnuminbuilding;
    }

    public void setStallnuminbuilding(Short stallnuminbuilding) {
        this.stallnuminbuilding = stallnuminbuilding;
    }

    public Short getDownautostallnum() {
        return downautostallnum;
    }

    public void setDownautostallnum(Short downautostallnum) {
        this.downautostallnum = downautostallnum;
    }

    public Short getDowndefencenum() {
        return downdefencenum;
    }

    public void setDowndefencenum(Short downdefencenum) {
        this.downdefencenum = downdefencenum;
    }

    public Short getDowndefencemachinenum() {
        return downdefencemachinenum;
    }

    public void setDowndefencemachinenum(Short downdefencemachinenum) {
        this.downdefencemachinenum = downdefencemachinenum;
    }

    public Short getDowndefencenonmachinenum() {
        return downdefencenonmachinenum;
    }

    public void setDowndefencenonmachinenum(Short downdefencenonmachinenum) {
        this.downdefencenonmachinenum = downdefencenonmachinenum;
    }

    public Short getDownnondefencenum() {
        return downnondefencenum;
    }

    public void setDownnondefencenum(Short downnondefencenum) {
        this.downnondefencenum = downnondefencenum;
    }

    public Short getDownnondefencemachinenum() {
        return downnondefencemachinenum;
    }

    public void setDownnondefencemachinenum(Short downnondefencemachinenum) {
        this.downnondefencemachinenum = downnondefencemachinenum;
    }

    public Short getDownnondefencenonmachinenum() {
        return downnondefencenonmachinenum;
    }

    public void setDownnondefencenonmachinenum(Short downnondefencenonmachinenum) {
        this.downnondefencenonmachinenum = downnondefencenonmachinenum;
    }

    public Short getSemidownnodefencemachinenum() {
        return semidownnodefencemachinenum;
    }

    public void setSemidownnodefencemachinenum(Short semidownnodefencemachinenum) {
        this.semidownnodefencemachinenum = semidownnodefencemachinenum;
    }

    public Short getDownnonautostallnum() {
        return downnonautostallnum;
    }

    public void setDownnonautostallnum(Short downnonautostallnum) {
        this.downnonautostallnum = downnonautostallnum;
    }

    public String getPlangreenradio() {
        return plangreenradio;
    }

    public void setPlangreenradio(String plangreenradio) {
        this.plangreenradio = plangreenradio == null ? null : plangreenradio.trim();
    }

    public BigDecimal getGreenradio() {
        return greenradio;
    }

    public void setGreenradio(BigDecimal greenradio) {
        this.greenradio = greenradio;
    }

    public BigDecimal getStallarea() {
        return stallarea;
    }

    public void setStallarea(BigDecimal stallarea) {
        this.stallarea = stallarea;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public Short getHousetypenum() {
        return housetypenum;
    }

    public void setHousetypenum(Short housetypenum) {
        this.housetypenum = housetypenum;
    }

    public String getSellsystemcode() {
        return sellsystemcode;
    }

    public void setSellsystemcode(String sellsystemcode) {
        this.sellsystemcode = sellsystemcode == null ? null : sellsystemcode.trim();
    }

    public String getCostsystemcode() {
        return costsystemcode;
    }

    public void setCostsystemcode(String costsystemcode) {
        this.costsystemcode = costsystemcode == null ? null : costsystemcode.trim();
    }

    public String getPurchasesystemcode() {
        return purchasesystemcode;
    }

    public void setPurchasesystemcode(String purchasesystemcode) {
        this.purchasesystemcode = purchasesystemcode == null ? null : purchasesystemcode.trim();
    }

    public String getFinancialsystemcode() {
        return financialsystemcode;
    }

    public void setFinancialsystemcode(String financialsystemcode) {
        this.financialsystemcode = financialsystemcode == null ? null : financialsystemcode.trim();
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

    public Object getFcompanyid() {
        return fcompanyid;
    }

    public void setFcompanyid(Object fcompanyid) {
        this.fcompanyid = fcompanyid;
    }

    public Object getProjectversionid() {
        return projectversionid;
    }

    public void setProjectversionid(Object projectversionid) {
        this.projectversionid = projectversionid;
    }

    public Object getRemark() {
        return remark;
    }

    public void setRemark(Object remark) {
        this.remark = remark;
    }

    public Short getNosellstallnum() {
        return nosellstallnum;
    }

    public void setNosellstallnum(Short nosellstallnum) {
        this.nosellstallnum = nosellstallnum;
    }

    public Short getDowndefencesellnum() {
        return downdefencesellnum;
    }

    public void setDowndefencesellnum(Short downdefencesellnum) {
        this.downdefencesellnum = downdefencesellnum;
    }

    public Short getDownnondefencesellnum() {
        return downnondefencesellnum;
    }

    public void setDownnondefencesellnum(Short downnondefencesellnum) {
        this.downnondefencesellnum = downnondefencesellnum;
    }

    public Object getParceltype() {
        return parceltype;
    }

    public void setParceltype(Object parceltype) {
        this.parceltype = parceltype;
    }

    public String getFcompanycodechange() {
        return fcompanycodechange;
    }

    public void setFcompanycodechange(String fcompanycodechange) {
        this.fcompanycodechange = fcompanycodechange == null ? null : fcompanycodechange.trim();
    }

    public Object getFcompanyidchange() {
        return fcompanyidchange;
    }

    public void setFcompanyidchange(Object fcompanyidchange) {
        this.fcompanyidchange = fcompanyidchange;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}