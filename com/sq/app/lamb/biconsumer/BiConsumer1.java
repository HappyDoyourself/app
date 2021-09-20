package com.sq.app.lamb.biconsumer;

import java.util.function.BiConsumer;

/**
 * @Author fanht
 * @Description
 * @Date 2021/2/1 下午6:37
 * @Version 1.0
 */
public class BiConsumer1 {
    public static void main(String[] args) {
        BiConsumer<Integer,Integer> addTwo = (x,y) -> System.out.println(x+y);
        addTwo.accept(1,3);
    }
}
