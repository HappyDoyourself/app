package com.sq.app.xml;

import org.simpleframework.xml.ElementMap;
import org.simpleframework.xml.Root;

import java.util.Map;

/**
 * @Author fanht
 * @Description
 * @Date 2021/3/5 上午10:10
 * @Version 1.0
 */
@Root
public class XmlToBean {

    @ElementMap(entry = "dict",key = "key",attribute = true,inline = true)
    private Map<String,String> dict;


    public Map<String, String> getDict() {
        return dict;
    }

    public void setDict(Map<String, String> dict) {
        this.dict = dict;
    }
}
