package com.sq.app.dao;

/**
 * @Author fanht
 * @Description
 * @Date 2020/10/31 下午8:53
 * @Version 1.0
 */
public class UserTop <T> {

    private  TopInterface<T> topInterface;

    private Class<T> tClass;

    public UserTop(TopInterface<T> topInterface,Class<T> tClass) {
        this.topInterface = topInterface;
        this.tClass = tClass;
    }
}
