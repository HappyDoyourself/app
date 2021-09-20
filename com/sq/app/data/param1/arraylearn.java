package com.sq.app.data.param1;

import com.alibaba.fastjson.JSONObject;

/**
 * @Author fanht
 * @Description
 * @Date 2021/4/16 3:41 PM
 * @Version 1.0
 */
public class arraylearn {


    //数据拷贝

    private static int[]  copyArray(int[] a){
        if(a == null || a.length == 0 ){
            return null;
        }
        int[]   b = new int[a.length];
        for(int i = 0;i<a.length;i++){
            b[i] = a[i];
        }
        System.out.println(JSONObject.toJSONString(b));

        return b;
    }

    //转换收尾


    private static   int[]  transferHeadToTail(int[]  b){
        if(b  == null || b.length == 0){
            return null;
        }

        int k = b.length/2;

        int[] t = new int[b.length];
        for(int i = 0;i<k;i++){
            int temp = b[i];
            t[i] = b[b.length-i-1];
            t[b.length-i-1] = temp;
        }

        return t;
    }

    //递归实现二分


    private static int binsearch(int[] t,int data){
        return digui(t,t.length,0,data);
    }

    private static int digui(int[] t,int high,int low,int data){
        if(high<low){
            System.out.println("没有此数据");
            return 0;
        }

        int middle = low + (high-low)/2;
        if(data > t[middle]){
            return digui(t,high,middle+1,data);
        }if(data<t[middle]){
            return digui(t,middle-1,low,data);
        }else {
            return middle;
        }
    }

    public static void main(String[] args) {

        int[] b = {3,4,5,6,7,8,9,10,11,13,23,44,333};
        System.out.println(JSONObject.toJSONString(copyArray(b)));
        System.out.println(JSONObject.toJSONString(transferHeadToTail(b)));

        System.out.println(binsearch(b,77));
    }
}
