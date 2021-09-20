package com.sq.app.data.param1;

/**
 * @Author fanht
 * @Description
 * @Date 2021/3/16 7:50 PM
 * @Version 1.0
 */
public class LeeCode1 {

    private static boolean exit(int[][] array,int num){
        if(array == null || array.length==0){
            return false;
        }

             int m = array[0].length-1;

            int n = 0;

            int temp = array[n][m];
            if (temp != num){
                if(temp<num){
                    n = n + 1;
                }else if(temp > num){
                    m = m-1;
                }
                if(n<array[n].length && m>0){
                    temp = array[n][m];
                }else {
                    return false;
                }
            }


        System.out.println("8888");
        return true;
    }

    public static void main(String[] args) {
        int[][] array = {{1,2},{3,4,5,6},{ 7,8,9},{10,22,33},{66,77,88}};
        boolean bl = exit(array,22);
        System.out.println(bl);
    }
}
