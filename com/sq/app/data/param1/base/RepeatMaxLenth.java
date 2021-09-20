package com.sq.app.data.param1.base;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author fanht
 * @Description
 * @Date 2021/5/17 9:38 下午
 * @Version 1.0
 */
public class RepeatMaxLenth {

    public static void main(String[] args) {
        String s = "abcdebcdfgt";
        System.out.println(maxNumber(s));

    }

    public static Integer maxNumber(String s){
        Map<Character,Integer> map = new HashMap();
        int left = 0;
        int max = 0;
        for(int k = 0;k<s.length();k++){
            if(map.containsKey(s.charAt(k))){
                left = Math.max(left,map.get(s.charAt(k))+1);
            }else{
                map.put(s.charAt(k),k);
                max = Math.max(max,k-left+1);
            }
        }
        return max;
    }

}
