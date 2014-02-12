package com.example.ADRD_GetRqst;

import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created with IntelliJ IDEA.
 * User: Jmexe
 * Date: 2/9/14
 * Time: 11:06 PM
 * To change this template use File | Settings | File Templates.
 */
public class WebUtil {
    /***
     * 发送get请求获取数据
     * @param url 请求链接
     * @return 数据
     * @throws IOException
     */
    public static String HttpGet(String url) throws IOException {

        DefaultHttpClient client = new DefaultHttpClient();
        HttpGet get = new HttpGet(url);
        HttpResponse response = client.execute(get);
        String content = null;

        if (response.getStatusLine().getStatusCode() == 200) {
            InputStream in = response.getEntity().getContent();
            byte[] data = new byte[1024];
            int length = 0;
            ByteArrayOutputStream bout = new ByteArrayOutputStream();
            while ((length = in.read(data)) != -1) {
                bout.write(data, 0, length);
            }
            content = new String(bout.toByteArray(), "utf-8");
        }
        return content;
    }
}
