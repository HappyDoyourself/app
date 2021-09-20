package com.sq.app.lamb;

import java.util.function.Supplier;

/**
 * @Author fanht
 * @Description
 * @Date 2020/12/4 上午11:22
 * @Version 1.0
 */
public class SupplierTest<T> implements Supplier<T>{

    private Supplier<T> supplier;


    public static <T> SupplierTest<T> of(Supplier<T> supplier){

        if(supplier instanceof SupplierTest){
            return (SupplierTest<T>) supplier;
        }else {
            return new SupplierTest<>();
        }
    }


    @Override
    public T get() {
        return null;
    }


    public static void main(String[] args) {
       // System.out.println(SupplierTest.of(()->));
    }
}
