package com.sq.app.dao;

/**
 * @Author fanht
 * @Description
 * @Date 2020/10/31 下午8:51
 * @Version 1.0
 */
public class ExtendsTop  <T> implements TopInterface<T>{

    @Override
    public String top(Object o) {
        System.out.println("*****methor: extendsTop****");
        return "I am  next。。.";
    }
}
