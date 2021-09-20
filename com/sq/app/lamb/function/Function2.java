package com.sq.app.lamb.function;

import java.util.function.Function;

/**
 * @Author fanht
 * @Description
 * @Date 2021/2/2 上午10:37
 * @Version 1.0
 */
public class Function2 {
    public static void main(String[] args) {
        Function<String,Integer> func = x->x.length();
        Function<Integer,Integer> func1 = x->x*2;
        Integer result = func.andThen(func1).apply("myexample");
        System.out.println(result);
    }
}
