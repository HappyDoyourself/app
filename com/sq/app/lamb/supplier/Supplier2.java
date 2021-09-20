package com.sq.app.lamb.supplier;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;


/**
 * @Author fanht
 * @Description 工厂模式 注意<T></T>
 * @Date 2020/12/11 上午10:35
 * @Version 1.0
 */
public class Supplier2<T> {

    public static void main(String[] args) {
        Supplier2<String> supplier2 = new Supplier2<>();
        List<String> listStr = supplier2.supplier().get();
        System.out.println(listStr);
    }

    private Supplier<List<T>> supplier(){
        return ArrayList::new;
    }
}
