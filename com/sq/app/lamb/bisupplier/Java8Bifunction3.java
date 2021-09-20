package com.sq.app.lamb.bisupplier;

import java.util.function.BiFunction;

/**
 * @Author fanht
 * @Description 实现工厂模式
 * @Date 2020/12/9 下午8:38
 * @Version 1.0
 */
public class Java8Bifunction3 {

    public static void main(String[] args) {

        Gps gps = factory("0.001","0.002",Gps::new);
        System.out.println(gps);


/*
        Gps obj = factory("40.741895", "-73.989308", Gps::new);
        System.out.println(obj);
*/



    }


    private static <R extends Gps> R factory(String x, String y,
                                             BiFunction<String,String,R> bi){
        return bi.apply(x,y);
    }


/*    public static <R extends Gps> R factory(String Latitude, String Longitude,
                                            BiFunction<String, String, R> func) {
        return func.apply(Latitude, Longitude);
    }*/



}
