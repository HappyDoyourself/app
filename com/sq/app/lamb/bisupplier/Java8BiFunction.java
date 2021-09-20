package com.sq.app.lamb.bisupplier;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;

/**
 * @Author fanht
 * @Description
 * @Date 2020/12/9 下午8:18
 * @Version 1.0
 */
public class Java8BiFunction {

    public static void main(String[] args) {
        //计算两个数之和
        BiFunction<Integer,Integer,Integer> bi = (x1,x2)->x1+x2;

        Integer result = bi.apply(2,3);

        System.out.println("计算结果:" + result);

        //计算平方
        BiFunction<Integer,Integer,Double> bi1 = (x1,x2) -> Math.pow(x1,x2);

        Double result1 = bi1.apply(3,5);

        System.out.println("结果:" + result1);

        //x1和x2通过list返回
        BiFunction<Integer,Integer,List<Integer>> bi2 = (x1,x2) -> Arrays.asList(x1+2);

        List<Integer> list = bi2.apply(1,2);
        System.out.println(list);
    }
}
