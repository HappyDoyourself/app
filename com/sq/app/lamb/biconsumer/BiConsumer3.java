package com.sq.app.lamb.biconsumer;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @Author fanht
 * @Description
 * @Date 2021/2/1 下午6:51
 * @Version 1.0
 */
public class BiConsumer3 {

    public static void main(String[] args) {
        Map<Integer,String> map = new LinkedHashMap<>();
        map.put(1,"java");
        map.put(2,"c++");
        map.forEach((k,v)-> System.out.println(k+":" + v));
    }
}
