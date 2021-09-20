package com.sq.app.data.param1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Author fanht
 * @Description
 * @Date 2021/3/12 4:57 PM
 * @Version 1.0
 */
public class CollectionFind {

    /***
     * 题目：寻找给定数组的子集
     *举例：int[] arr = {1,2,3}
     *返回 [[1], [], [2], [1, 2, 3], [1, 2], [3], [2, 3], [1, 3]]
     * @param nums
     */
    private static void find(int nums[]) {
        if (nums.length == 0) {
            return ;
        }

        int nEnd = 1<< nums.length;
        HashSet set = new HashSet();
        for(int mark = 0;mark<nEnd;mark++){
            List list = new ArrayList();
            for(int j = 0;j<nums.length;j++){
                if((1<<j & mark) != 0){
                    list.add(nums[j]);
                }
            }
            Collections.sort(list);
            set.add(list);
        }
        System.out.println(set);
      }

    public static void main(String[] args) {
        int array[] = {1,2,3,4};
        find(array);
    }

    /*private static String find(int array[]){
        if(array.length == 0){
            return null;
        }


        StringBuffer stringBuffer = new StringBuffer();
        List<String> strings = new ArrayList<>();
        //思路:逗号分隔，递增的顺序 每次递增
        for(int k = 0;k<array.length;k++){
            while (k<array.length){
                for(;;){
                    stringBuffer.append(array[k]);

                }
                for(int m = k;m<array.length;m++){
                    stringBuffer.append(array[m]).append(",").append(array[m+1]);
                    m++;
                }

                 strings.add(stringBuffer.toString());
             }
        }

    }*/
}
