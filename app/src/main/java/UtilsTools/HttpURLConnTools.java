package UtilsTools;

import android.content.Context;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintWriter;
import java.net.CookieHandler;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import xunmi.cushiro.xunmi.LoginActivity;

/**
 * Created by cushiro on 15/9/7.
 */
public class HttpURLConnTools {

    HttpURLConnection httpURLConnection;
    private String result;

    public String postRequest(String httpUrl ,Map<String, Object> paramsMap){

        StringBuffer params = new StringBuffer();
        PrintWriter printWriter=null;
        InputStream inputStream=null;;
        // 组织请求参数
        Iterator it = paramsMap.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry element = (Map.Entry) it.next();
            params.append(element.getKey());
            params.append("=");
            params.append(element.getValue());
            params.append("&");
        }
        if (params.length() > 0) {
            params.deleteCharAt(params.length() - 1);
        }
        try {
            URL url=new URL(httpUrl);
            httpURLConnection= (HttpURLConnection) url.openConnection();
            //String session_value = httpURLConnection.getHeaderField("Set-Cookie");
//            System.out.println("session_value=" + session_value);
//            if (session_value!=null||"".equals(session_value)){
//                String[] sessionId = session_value.split(";");
//                httpURLConnection.setRequestProperty("Cookie", sessionId[0]);
//            }
            httpURLConnection.setConnectTimeout(10 * 1000);
            httpURLConnection.setReadTimeout(3 * 1000);
            httpURLConnection.setDoInput(true);
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setRequestProperty("accept", "*/*");
            httpURLConnection.setRequestProperty("Charset", "UTF-8");
            httpURLConnection.setRequestProperty("Content-Length", String.valueOf(params.length()));
            httpURLConnection.setRequestProperty("Accept-Language", "zh-CN");
            httpURLConnection.setRequestMethod("POST");
            printWriter = new PrintWriter(httpURLConnection.getOutputStream());
            printWriter.write(params.toString());
            printWriter.flush();
            printWriter.close();

            if (httpURLConnection == null) {
                return result;
            }
            int responseCode = httpURLConnection.getResponseCode();
            switch (responseCode){
                case HttpURLConnection.HTTP_OK:
                    inputStream=httpURLConnection.getInputStream();
                    result= (String) readStream(inputStream);
                    break;
                default:
                    result="";
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            httpURLConnection.disconnect();
        }

        return result;
    }

    private Object readStream(InputStream inStream) throws Exception {
        String result;
        ByteArrayOutputStream outStream = new ByteArrayOutputStream();
        byte[] buffer = new byte[1024];
        int len = -1;
        while ((len = inStream.read(buffer)) != -1) {
            outStream.write(buffer, 0, len);
        }
        result = new String(outStream.toByteArray(), "UTF-8");
        outStream.close();
        inStream.close();
        return result;
    }

    public static void main(String[] args){
        String httpUrl ="http://192.168.137.1:8080/xunmi/login.action";
        LoginActivity context = null;
        Map<String, Object> requestParamsMap = new HashMap<String, Object>();
        requestParamsMap.put("email", "admin@163.com");
        requestParamsMap.put("password", "12345");
        HttpURLConnTools httpURLConnTools=new HttpURLConnTools();
        String result = httpURLConnTools.postRequest(httpUrl, requestParamsMap);
        System.out.println(result);
    }
}
