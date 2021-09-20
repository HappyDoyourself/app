package com.sq.app.lamb.bifunction;

import com.alibaba.fastjson.JSONObject;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;

/**
 * @Author fanht
 * @Description 基本用法，求几个数的加减乘除
 * @Date 2021/2/1 上午10:32
 * @Version 1.0
 */
public class BiFunction1 {

    public static void main(String[] args) {
        BiFunction<Integer,Integer,Integer> biFunction =
                (x1,x2) -> (x1+x2);
        Integer result = biFunction.apply(2,4);

        System.out.println(result);
        BiFunction<Integer,Integer,Double> biPow =
                (x1,x2) -> Math.pow(x1,x2);
        Double result1 = biPow.apply(3,5);

        System.out.println(result1);

        BiFunction<Integer,Integer,List<Integer>> biList =
                (x1,x2)-> Arrays.asList(x1,x2);

        List<Integer> result2 = biList.apply(2,4);
        System.out.println(JSONObject.toJSONString(result2));
    }
}
