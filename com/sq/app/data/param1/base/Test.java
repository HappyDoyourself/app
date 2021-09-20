package com.sq.app.data.param1.base;

//import com.alibaba.fastjson.JSONObject;

/**
 * @Author fanht
 * @Description  //数组交换
 * @Date 2021/4/16 8:24 PM
 * @Version 1.0
 */
public class Test {

    public static void main(String[] args) {
        System.out.println(15/2);//7

        System.out.println("请输入三个整数");

        int[][] array = {{1,2,3},{4,5,6},{7,8,9},{10,11,12}};

        System.out.println(array);
       // System.out.println(JSONObject.toJSONString(twoArray(array)));


    }

    private static int[][] twoArray(int[][] array){

        if(array == null || array.length == 0){
            return null;
        }
        int M = array.length;
        int N = array[0].length;

        int[][] d = new int[N][M];

        for(int i = 0;i<M;i++){
            for(int j = 0;j<N;j++){
                d[j][i] =  array[i][j];
            }
        }
        return d;
    }


}
