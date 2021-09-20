package com.sq.app.data.param1.动态规划;

import com.alibaba.fastjson.JSONObject;

/**
 * @Author fanht
 * @Description
 * @Date 2021/3/22 10:44 AM
 * @Version 1.0
 */
public class KingExam {

    public static void main(String[] args) {
        int[]  gold= {350,400,500,300,200,220,550,550,660,910};

        int[]  person = {3,5,5,4,3,2,5,6,6,9};


        maxDtgh(gold,person,10,10);


    }

    private int maxDigui(int[] gold,int[] person,int g,int p){
        if(g==1 && p<person[0]){
            return 0;
        }
        if(g==1 && p >=person[0]){
            return gold[0];
        }

        if(g>1 && p<person[g-1]){
            return maxDigui(gold,person,g-1,p);
        }
        return Math.max(maxDigui(gold,person,g-1,p),maxDigui(gold,person,g-1,p-person[g-1])+gold[g-1]);
    }

    private static int maxDtgh(int[] gold,int[] person,int g,int p){

        int[] f = new int[p+1];

        for(int i = g;i>0;i--){

            for(int j = p;j>0;j--){
                if(j>=person[i-1]){
                    f[j] = Math.max(f[j],f[j-person[i-1]]+ gold[i-1]);
                    System.out.println("第" + i+ "矿" + "需要的人数为:" + person[i-1] + ",前面的最优解为:" + f[j-person[i-1]] +",数组下标:" +
                            (j-person[i-1])+ ",当前数组下标为:"+j + ",最优解：" + f[j]);
                }
            }
        }
        System.out.println(JSONObject.toJSONString(f));
        return f[p];
    }


    public static int getMostGold_2(int n, int w, int[] g, int[] p) {//动态规划
        int[] F = new int[w + 1];
        for (int i = n; i > 0; i--) {
            for (int j = w; j > 0; j--) {
                if (j >= p[i - 1]) {
                    F[j] = Math.max(F[j], F[j - p[i - 1]] + g[i - 1]);
                }
            }
        }
        return F[w];
    }

}
