package com.yuanian.masterdata.util;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Zhangxin
 * @title: DateUtil
 * @projectName masterdata
 * @description: TODO
 * @date 2019/7/9  17:12
 */
public class DateUtil {
    public static final String getNow(){
        SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss");
        return sdf.format(new Date());
    }
}
