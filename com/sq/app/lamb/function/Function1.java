package com.sq.app.lamb.function;

import java.util.function.Function;

/**
 * @Author fanht
 * @Description
 * @Date 2021/2/2 上午10:36
 * @Version 1.0
 */
public class Function1 {
    public static void main(String[] args) {
        Function<String,Integer> func = x->x.length();
        Integer l = func.apply("myexample");
        System.out.println(l);
    }
}
