package com.sq.app.lamb.function;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

/**
 * @Author fanht
 * @Description list转map
 * @Date 2021/2/2 上午10:43
 * @Version 1.0
 */
public class Function3 {
    public static void main(String[] args) {
        Function3 function3 = new Function3();
        List<String> list = Arrays.asList("java","C","python",".net");
        Map<String,Integer> map = function3.listToMap(list,x->x.length());
        System.out.println(map);
    }

    public <T,R> Map<T,R> listToMap(List<T> list, Function<T,R> func){

        Map<T,R> map = new HashMap<>();
        list.forEach(t->{
            map.put(t,func.apply(t));
        });
        return map;
    }
}
