package com.sq.app.lamb.optional;

import java.util.Arrays;
import java.util.List;

/**
 * @Author fanht
 * @Description
 * @Date 2021/2/2 下午2:54
 * @Version 1.0
 */
public class OptionalToString {

    public static void main(String[] args) {
        List<String> listStr = Arrays.asList("a","b","c","d");
        String result = listStr.stream().filter(x->x.length()==1).findFirst().map(Object::toString).orElse("");
        System.out.println(result);
    }
}
