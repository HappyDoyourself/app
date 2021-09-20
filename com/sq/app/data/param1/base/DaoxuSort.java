package com.sq.app.data.param1.base;

import com.alibaba.druid.sql.visitor.functions.Char;

/**
 * @Author fanht
 * @Description
 * @Date 2021/9/11 4:02 下午
 * @Version 1.0
 */
public class DaoxuSort {

    public static void main(String[] args) {
        String str = "Hello, world!  nihao!";
        StringBuilder sb = new StringBuilder();
        char[] arrStr = str.toCharArray();
        for(int k = arrStr.length-1;k>=0;k--){
            sb.append(arrStr[k] + " ");
        }
        System.out.println(sb.toString());
    }
}
