package com.sq.app.data.param1;

/**
 * @Author fanht
 * @Description
 * @Date 2021/3/12 3:21 PM
 * @Version 1.0
 */
public class FindExist {
    /**在一个二维数组中（每个一维数组的长度相同），每一行都按照从左到右递增的顺序排序，
     * 每一列都按照从上到下递增的顺序排序。请完成一个函数，
     * 输入这样的一个二维数组和一个整数，判断数组中是否含有该整数
     */

    private static boolean exist(Integer[][] array,Integer k){
        boolean bl = false;

        int count = 0;
        //思路:从右上角来看，向左数字递减，向下递增。如果查询的数字比右上角大，向下。
        //如果查询的数字比右上角小，则向左 出了边界，则说明不存在
        if(array.length == 0 || k == null){
            return bl;
        }

        int m = array[0].length-1;
        int n = 0;

        int temp = array[n][m];
        while (temp != k){
            count++;
            if(array[n][m]>k){
                m = m-1;
            }else if(array[n][m]<k) {
                n = n+1;
            }
            if(m>=0 && n<= array.length-1){

                temp = array[n][m];
            }else {
                System.out.println("总次数" + count);
                return false;
            }
        }


        System.out.println("总次数:" + count);
        return true;
    }

    //todo 知识点 二维数组，array[0][0]、array[0][1]、array[0][2]
    public static void main(String[] args) {
        Integer[][] array = {{1,2,},{3,4,5,6},{ 7,8,9},{10,22,33},{66,77,88}};
        boolean bl = exist(array,65);
        System.out.println(bl);
     }
}
