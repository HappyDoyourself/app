package com.sq.app.lamb.predicate;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Author fanht
 * @Descriptio
 * @Date 2021/2/2 下午1:39
 * @Version 1.0
 */
public class Predicate1 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);
        //找出大于5的
        List<Integer> afterFilter = list.stream().filter(x->x>5).collect(Collectors.toList());
        System.out.println(afterFilter);
    }
}
