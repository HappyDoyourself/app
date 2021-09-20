package com.sq.app.jvm;

/**
 * @Author fanht
 * @Description
 * @Date 2020/9/27 上午11:12
 * @Version 1.0
 */
public class JvmDemoTest {
    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();
        int freeMemory = (int) (runtime.freeMemory()/1024/1024);
        int totalMemory = (int) (runtime.totalMemory()/1024/1024);
        System.out.println("freeMemory:" + freeMemory + ",totalMemory:" + totalMemory);
    }
}
