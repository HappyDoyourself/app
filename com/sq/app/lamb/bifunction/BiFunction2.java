package com.sq.app.lamb.bifunction;

import java.util.function.BiFunction;
import java.util.function.Function;

/**
 * @Author fanht
 * @Description andThen用法
 * @Date 2021/2/1 上午10:44
 * @Version 1.0
 */
public class BiFunction2 {

    public static void main(String[] args) {
        BiFunction<Integer,Integer,Double> function =
                (x1,x2)->Math.pow(x1,x2);
        //double转成String
        Function<Double,String> functionDToS =
                (k) -> String.valueOf(k);

        //使用andThen串联biFunction和Functiona2
        String result = function.andThen(functionDToS).apply(2,16);
        System.out.println(result);

        //平方
        String result1 = convert(2,4,(a1,a2)->Math.pow(a1,a2),(r)->String.valueOf(r));

        System.out.println(result1);
        //+
        String result2 = convert(2,3,(a1,a2)->(a1+a2),(p)->String.valueOf(p));
        System.out.println(result2);
        //-
        String result3 = convert(43434,3232,(a1,a2)->(a1-a2),m->String.valueOf(m));
        System.out.println(result3);

        //mul
        String result4 = convert(2,4,(a1,a2)->a1*a2,mul->String.valueOf(mul));
        System.out.println(result4);



    }



    public static <A1,A2,R1,R2> R2 convert(A1 a1,A2 a2,
                                           BiFunction<A1,A2,R1> biFunction,
                                           Function<R1,R2> function){
        return biFunction.andThen(function).apply(a1,a2);

    }
}
