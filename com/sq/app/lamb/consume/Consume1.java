package com.sq.app.lamb.consume;

import java.util.function.Consumer;

/**
 * @Author fanht
 * @Description
 * @Date 2020/12/11 下午3:37
 * @Version 1.0
 */
public class Consume1 {

    public static void main(String[] args) {
        Consumer<String> con = x -> System.out.println(x);

        con.accept("test");
    }
}
