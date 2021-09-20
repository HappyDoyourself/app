package com.sq.app.lamb.biconsumer;

import java.util.function.BiConsumer;

/**
 * @Author fanht
 * @Description
 * @Date 2021/2/1 下午6:39
 * @Version 1.0
 */
public class BiConsumer2 {

    public static void main(String[] args) {

        addTow(1,3,(x,y)-> System.out.println(x+y));

        addTow("hh","you",(x,y)-> System.out.println(x+y));
    }

    static <T> void addTow(T t1, T t2, BiConsumer<T,T> biConsumer){
        biConsumer.accept(t1,t2);
    }
}
