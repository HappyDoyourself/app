package com.sq.app.lamb;

//import com.alibaba.fastjson.JSONObject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 * @Author fanht
 * @Description  测试Function 和 BiFunction
 * @Date 2020/8/4 上午11:04
 * @Version 1.0
 */
public class Test2 {


    public static void main(String[] args) {

        Test2 test2 = new Test2();

        System.out.println(test2.compute(1,a->a+1));

        BiFunction<Integer,Integer,Integer> biFunction = (x,y) -> x+y;
        Integer appay = biFunction.apply(2,5);
        System.out.println(appay);


        /**
         *  reduce ：规约操作
         */
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        Integer sumCount = list.stream().reduce(0,(x,y)->x+y);

        System.out.println(sumCount);


        List<Product> proList = new ArrayList<>();
        Product pro = new Product();
        pro.setPrice(0.01);
        proList.add(pro);
        Product pro1 = new Product();
        pro1.setPrice(0.02);
        proList.add(pro1);

        List<Double> integers = proList.stream().map(Product::getPrice).collect(Collectors.toList());
        //System.out.println(JSONObject.toJSONString(integers));

/*        Optional<Double> sum = emps.stream()
                .map(Employee::getSalary)
                .reduce(Double::sum);
        System.out.println(sum);*/


    }


    public  int compute(int a , Function<Integer,Integer> function){
        return function.apply(a);
    }

}
