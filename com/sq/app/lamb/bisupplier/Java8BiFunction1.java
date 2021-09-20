package com.sq.app.lamb.bisupplier;

import java.util.function.BiFunction;
import java.util.function.Function;

/**
 * @Author fanht
 * @Description Bifunction<T,U,R></U,R> 串联function
 * @Date 2020/12/9 下午8:32
 * @Version 1.0
 */
public class Java8BiFunction1 {

    public static void main(String[] args) {
        BiFunction<Integer,Integer,Double> function =
                (x1,x2) -> Math.pow(x1,x2);

        //把Double 转为String

        Function<Double,String> fun = (d) ->String.valueOf(d);

        //使用andThen转化
        String result = function.andThen(fun).apply(2,4);

        System.out.println("result:" + result);

        String conRes = convert(2,4,(a1,a2) -> a1*a2,(r)->"a1*a2=" +String.valueOf(r));

        System.out.println(conRes);
    }


    private static <A1,A2,R1,R2> R2 convert(A1 a1,A2 a2,BiFunction<A1,A2,R1> fun,Function<R1,R2> r2){
        return fun.andThen(r2).apply(a1,a2);
    }
}
