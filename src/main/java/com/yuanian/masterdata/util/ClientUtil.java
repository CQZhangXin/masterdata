package com.yuanian.masterdata.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;

/**
 *  客户端调用第三方系统接口工具类
 *
 * @author 薛强
 * @date 2019/4/11
 */
@Component
public class ClientUtil {

    private Logger logger = LoggerFactory.getLogger(ClientUtil.class);

    /**
     *  方法描述：http—POST方法调服务端接口
     * @param url 调用请求地址
     * @param query 请求参数json串
     * @param transferSystem 调用请求系统标识
     * @return
     * @throws Exception
     */
    public final String httpPost(String url, String query, String transferSystem)
    {
        StringBuffer sbuffer= new StringBuffer("");
        HttpURLConnection conn = null;
        try {
            logger.info("调用请求开始-请求系统："+transferSystem+";请求url:"+url+";请求参数:"+query);
            URL restURL = new URL(url);
            /*
             * 此处的urlConnection对象实际上是根据URL的请求协议(此处是http)生成的URLConnection类 的子类HttpURLConnection
             */
            conn = (HttpURLConnection) restURL.openConnection();
            //请求方式
            conn.setRequestMethod("GET");
            //设置是否从httpUrlConnection读入，默认情况下是true; httpUrlConnection.setDoInput(true);
            conn.setDoOutput(true);
            //allowUserInteraction 如果为 true，则在允许用户交互（例如弹出一个验证对话框）的上下文中对此 URL 进行检查。
            conn.setAllowUserInteraction(false);
            //设置请求格式
            conn.setRequestProperty("Content-Type", " application/json");

            conn.setReadTimeout(1000*60);//设置读取超时时间   60秒       
            conn.setConnectTimeout(1000*60);//设置连接超时时间     60秒          
            conn.connect();
            OutputStream out = conn.getOutputStream();//向对象输出流写出数据，这些数据将存到内存缓冲区中
            if(query!=null){
                out.write(query.toString().getBytes());            //out.write(new String("测试数据").getBytes());
            }

            // 刷新对象输出流，将任何字节都写入潜在的流中       
            out.flush();
            // 关闭流对象,此时，不能再向对象输出流写入任何数据，先前写入的数据存在于内存缓冲区中          
            out.close();
            //读取响应           
            if (conn.getResponseCode()==200){
                logger.info("调用请求成功："+conn.getResponseCode());
                // 从服务器获得一个输入流
                InputStreamReader inputStream =new InputStreamReader(conn.getInputStream());//调用HttpURLConnection连接对象的getInputStream()函数, 将内存缓冲区中封装好的完整的HTTP请求电文发送到服务端。
                BufferedReader reader = new BufferedReader(inputStream);
                String lines;
                while ((lines = reader.readLine()) != null) {
                    lines = new String(lines.getBytes(), "utf-8");
                    sbuffer.append(lines);
                }
                logger.info("调用返回信息："+sbuffer.toString());
                reader.close();
            }else{
                logger.error("调用接口请求失败"+conn.getResponseCode());
            }
            //断开连接           
            conn.disconnect();
        } catch (IOException e) {
            logger.error("调用接口请求失败:{}",e.getMessage());
        }
        return  String.valueOf(sbuffer);
    }



}