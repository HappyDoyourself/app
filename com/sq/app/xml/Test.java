package com.sq.app.xml;

import com.alibaba.fastjson.JSONObject;
import org.simpleframework.xml.Serializer;
import org.simpleframework.xml.core.Persister;

import java.io.*;
import java.util.Map;

/**
 * @Author fanht
 * @Description
 * @Date 2021/3/5 上午10:34
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {
        File file = new File("/Users/fan/workspace/app/src/main/resources/templates/test.xml");
        XmlToBean xmlToBean = new XmlToBean();

        Serializer serializer = new Persister();

        try {
            InputStreamReader isr = new InputStreamReader(new FileInputStream(file),"utf-8");

            try {
                xmlToBean = serializer.read(XmlToBean.class,isr);

                System.out.println(JSONObject.toJSONString(xmlToBean));

               Map<String,String> map = xmlToBean.getDict();

                System.out.println(map.get("driverShowCities"));

            } catch (Exception e) {
                e.printStackTrace();
            }

        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
