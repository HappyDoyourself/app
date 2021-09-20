package com.sq.app.controller;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author fanht
 * @Description
 * @Date 2020/7/21 下午5:21
 * @Version 1.0
 */
public class RejectMethodTest {
    public static void main(String[] args) {
        Class<List> clazz =List.class;

        Class<?extends  List> subClazz = ArrayList.class.asSubclass(clazz);


        System.out.println(subClazz.getCanonicalName());
    }
}
