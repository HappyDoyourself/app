package com.sq.app.data.param1.base;

/**
 * @Author fanht
 * @Description
 * @Date 2021/4/17 9:09 AM
 * @Version 1.0
 */
public class Test1 {

    private static int maxInt(int N){
        if(N<=0 || N>Integer.MAX_VALUE){
            throw new RuntimeException("异常");
        }
        int i = 1;
        int count = -1;
        while (i<=N){
            i = i*2;
            ++count;
        }
        System.out.println(count);
        return count;
    }


    private static int sorve(int k){
        int i = 2;
        int j =0;

        while (true){
            i = i*2;
            j++;
            if(i>k){
                System.out.println(j);
                return j;
            }
        }
    }

    public static void main(String[] args) {
        maxInt(1);
        sorve(1);
        maxInt(8);
        sorve(8);
        maxInt(10);
        sorve(10);
        maxInt(20);
        sorve(20);
    }

}
