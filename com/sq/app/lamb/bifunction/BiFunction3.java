package com.sq.app.lamb.bifunction;

import com.sq.app.lamb.bisupplier.Gps;

import java.util.function.BiFunction;

/**
 * @Author fanht
 * @Description 工厂模式
 * @Date 2021/2/1 上午11:18
 * @Version 1.0
 */
public class BiFunction3 {

    public static void main(String[] args) {

        Gps obj = factory("32.3443","23344.322",Gps::new);
        System.out.println(obj.toString());
    }

    public static <R extends Gps> R factory(String lat, String lgt,
                                            BiFunction<String,String,R> function){
        return function.apply(lat,lgt);
    }
}
