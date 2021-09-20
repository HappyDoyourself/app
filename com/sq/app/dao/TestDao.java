package com.sq.app.dao;

/**
 * @Author fanht
 * @Description
 * @Date 2020/10/31 下午8:52
 * @Version 1.0
 */
public class TestDao {

    public static void main(String[] args) {
        TopInterface<Integer> topInterface = new ExtendsTop<>();
        UserTop<Integer> userTop = new UserTop(topInterface,ExtendsTop.class);

        System.out.println("========" );

    }
}
