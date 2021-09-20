package com.sq.app.lamb.bifunction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;

/**
 * @Author fanht
 * @Description 条件过滤
 * @Date 2021/2/1 上午11:21
 * @Version 1.0
 */
public class BiFunction4 {

    public static void main(String[] args) {

        BiFunction4 function4 = new BiFunction4();
        //过滤出list长度大于3的(非lam表达式)

        List<String> list = Arrays.asList("Java","C++","python","html");

        List<String> result = function4.filterList(list,3,
                function4::filterLength);
        System.out.println(result);

        //lam表达式
        List<String> result1 = function4.filterList(list,3,(ll,size)->{
            if(ll.length()>size){
                return ll;
            }else {
                return null;
            }
        });

        System.out.println(result1);

        //过滤出以c开头的
        List<String> result2 = function4.filterList(list,"",(ll,condition)->{

            if(ll.startsWith(condition)){
                return ll;
            }else {
                return null;
            }
        });
        System.out.println(result2);
        List<Integer> number = Arrays.asList(2,3,4,5,6,77,8,8,9,999);
        //过滤出奇数
        List<Integer> result3 = function4.filterList(number,2,(t,condition)->{
            if(t%2 == 0){
                return t;
            }else {
                return null;
            }
        });
        System.out.println(result3);
    }


    public String filterLength(String str,Integer length){
        if(str.length()>length){
            return str;
        }else {
            return null;
        }
    }

    public <T,R,U> List<U> filterList(List<T> list,R condition,
                                     BiFunction<T,R,U> function){
        List<U> result = new ArrayList<>();
        for (T t : list){
            U apply = function.apply(t,condition);
            if(apply != null){
                result.add(apply);
            }
        }
        return result;
    }
}
