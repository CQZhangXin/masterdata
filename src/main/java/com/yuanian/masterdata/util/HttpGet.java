package com.yuanian.masterdata.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;


/**
 * 注意：get请求工具类提交
 * @author Zhangxin
 * @title: HttpGet
 * @projectName hop-parent
 * @description: TODO
 * @date 2019/4/1213:19
 */
@Component
public class HttpGet {

    private Logger logger = LoggerFactory.getLogger(HttpGet.class);

    public static String sendGet(String url, String param,String token) {
        StringBuffer resultBuf = new StringBuffer();

        BufferedReader in = null;
        try {
            String urlNameString;
            if(param!=null){
                 urlNameString = url + "?" + param;
            }else{
                urlNameString = url;
            }
            URL realUrl = new URL(urlNameString);
            // 打开和URL之间的连接
            URLConnection connection = realUrl.openConnection();
            // 设置通用的请求属性
            // connection.setRequestProperty("accept", "*/*");
            // connection.setRequestProperty("connection", "Keep-Alive");
            connection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            if(token!=null){
                connection.setRequestProperty("token",token);
            }
            connection.setConnectTimeout(1000*60);
            // 建立实际的连接
            connection.connect();
            // 获取所有响应头字段
            // Map<String, List<String>> map = connection.getHeaderFields();
            // 遍历所有的响应头字段
            // for (String key : map.keySet()) {
            // System.out.println(key + "--->" + map.get(key));
            // }
            // 定义 BufferedReader输入流来读取URL的响应
            in = new BufferedReader(new InputStreamReader(connection.getInputStream(), Charset.forName("UTF-8")));
            String line;
            while ((line = in.readLine()) != null) {
                resultBuf.append(line);
            }
        } catch (Exception e) {
            // System.out.println("发送GET请求出现异常！" + e);
            e.printStackTrace();
        }
        // 使用finally块来关闭输入流
        finally {
            try {
                if (in != null) {
                    in.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return resultBuf.toString();
    }


}

