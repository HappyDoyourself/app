package com.sq.app.lamb.predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * @Author fanht
 * @Description
 * @Date 2021/2/2 下午1:51
 * @Version 1.0
 */
public class Predicate4 {


    public static void main(String[] args) {
        List<String> list = Arrays.asList("AC","DADF","SFSF","DSD","333","DFD");

        System.out.println(filter(list,x->x.startsWith("A")));

        System.out.println(filter(list,x->x.startsWith("S") && x.length()>2));


    }


    public static List<String> filter(List<String> list, Predicate<String> predicate){
        return list.stream().filter(predicate).collect(Collectors.toList());
    }


}

