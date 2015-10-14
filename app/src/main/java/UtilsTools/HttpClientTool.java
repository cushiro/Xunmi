package UtilsTools;

import android.util.Log;

import org.apache.http.*;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.util.ArrayList;


/**
 * Created by cushiro on 15/9/7.
 */
public class HttpClientTool{
    private  HttpClient httpClient;
    private  HttpPost httpPost;
    private  HttpResponse httpResponse;
    private  HttpEntity httpEntity;
    private static String JSESSIONID=null;
    static String result = "";

    public HttpClientTool(){
        httpClient = new DefaultHttpClient();
    }

    public String executeRequest(String httpUrl ,ArrayList<NameValuePair> params) {
        try {
            //httpClient = new DefaultHttpClient();
            httpPost = new HttpPost(httpUrl);
            httpEntity = new UrlEncodedFormEntity(params, "UTF-8");
            httpPost.setEntity(httpEntity);
            httpResponse = httpClient.execute(httpPost);
            switch (httpResponse.getStatusLine().getStatusCode()) {
                case HttpStatus.SC_OK:
                    result = EntityUtils.toString(httpResponse.getEntity());
                    System.out.println(result);
                    break;
                case HttpStatus.SC_NOT_FOUND:
                    Log.i("HTTPCLIENT", "404");
                    break;
                case HttpStatus.SC_INTERNAL_SERVER_ERROR:
                    Log.i("HTTPCLIENT", "500");
                    break;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }
}