package com.yuanian.masterdata.util;

/**
 * @author Zhangxin
 * @title: AddressUtil
 * @projectName masterdata
 * @description: 四个接口测试地址（暂时用，后面要配置化）
 * @date 2019/7/8  11:57
 */
public class AddressUtil {

    //工程表地址
    public static final String projectAddress = "http://testesb.zldcgroup.com/com.primeton.esb.zldc.app.mds.mdsProject";

    //地块表
    public static final String parcelAddress = "http://testesb.zldcgroup.com/com.primeton.esb.zldc.app.mds.mdsParcel";

    public static final String incorporatedCompanyAddr= "http://testesb.zldcgroup.com/com.primeton.esb.zldc.app.mds.mdsIncorporatedCompany";

    //法人公司的token要放到请求头里面
    public static final String ncCompanyAddr = "http://testesb.zldcgroup.com/com.primeton.esb.zldc.app.corporation.v1company";

    //同步到C1的二维库
    public static final String toC1Address = "http://xx.com//C1-Planning/mdAction!addDimMember.action";

    public static final String toEBaseAddress = "http://xx.com//C1-Planning/mdAction!sychDims.action";


}
