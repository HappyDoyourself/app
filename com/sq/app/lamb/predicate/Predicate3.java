package com.sq.app.lamb.predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * @Author fanht
 * @Description
 * @Date 2021/2/2 下午1:48
 * @Version 1.0
 */
public class Predicate3 {

    public static void main(String[] args) {
        Predicate<String> startWith  = x->x.startsWith("A");

        List<String> listStr = Arrays.asList("AA","BB","A","CC");

        List<String> resultList = listStr.stream().filter(startWith).collect(Collectors.toList());
        System.out.println(resultList);

        List<String> qufanList = listStr.stream().filter(startWith.negate()).collect(Collectors.toList());
        System.out.println(qufanList);
    }
}
