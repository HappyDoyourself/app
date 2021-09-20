package com.sq.app.lamb.predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * @Author fanht
 * @Description
 * @Date 2021/2/2 下午1:41
 * @Version 1.0
 */
public class Predicate2 {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);

        //找出大于5 且小于7的
        List<Integer> afterList = list.stream().filter(x->x>5 && x<8).collect(Collectors.toList());
        System.out.println(afterList);

        Predicate<Integer> predicate = x->x>5;

        Predicate<Integer> predicate1 = x->x<8;

        List<Integer> filter = list.stream().filter(predicate.and(predicate1)).collect(Collectors.toList());
        System.out.println(filter);

        //找出大于5 或者小于3的
        List<Integer> filterList = list.stream().filter(x->x>5 || x<3).collect(Collectors.toList());
        System.out.println(filterList);

        Predicate<Integer> predicate2 = x->x>5;
        Predicate<Integer> predicate3 = x->x<3;
        System.out.println(list.stream().filter(predicate2.or(predicate3)).collect(Collectors.toList()));
    }
}
