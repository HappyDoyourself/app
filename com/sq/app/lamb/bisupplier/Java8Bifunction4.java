package com.sq.app.lamb.bisupplier;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;

/**
 * @Author fanht
 * @Description 条件过滤
 * @Date 2020/12/9 下午8:53
 * @Version 1.0
 */
public class Java8Bifunction4 {

    public static void main(String[] args) {

        Java8Bifunction4 fun4 = new Java8Bifunction4();

        List<String> list = Arrays.asList("java","python","c++");

        //过滤出长度大于3的（方法推导）
        List<String> result = fun4.filterList(list,3,fun4::filterByLength);

        System.out.println(result);

        //lam表达式
        List<String> result1 = fun4.filterList(list,3,(p,l)->{
            if(p.length()>l){
                return p;
            }else {
                return null;
            }
        });

        System.out.println(result1);

        //过滤出以c开头的
        List<String> result2 = fun4.filterList(list,"c",(p,l)->{
            if(p.startsWith(l)){
                return p;
            }else {
                return null;
            }
        });

        System.out.println(result2);

    }


    private String filterByLength(String str,Integer size){

        if(str.length()>size){
            return str;
        }
        return null;
    }

    private  <P1,P2,R> List<R> filterList(List<P1> list, P2 contion,
                                       BiFunction<P1,P2,R> bi){
        List<R> listR = new ArrayList<>();
        for(P1 p : list){
            R t = bi.apply(p,contion);
            if(t != null){
                listR.add(t);
            }
        }
        return listR;
    }
}
