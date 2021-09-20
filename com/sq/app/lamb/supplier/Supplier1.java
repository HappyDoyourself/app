package com.sq.app.lamb.supplier;

import java.time.LocalDateTime;
import java.util.function.Supplier;

/**
 * @Author fanht
 * @Description  基本用法
 * @Date 2020/12/11 上午10:32
 * @Version 1.0
 */
public class Supplier1 {
    public static void main(String[] args) {
        Supplier<LocalDateTime> s = ()->LocalDateTime.now();

        System.out.println(s.get());

        Supplier<String> str = ()->"str";
        System.out.println(str.get());
    }
}
