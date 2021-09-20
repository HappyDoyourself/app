package com.sq.app.data.param1.动态规划;

/**
 * @Author fanht
 * @Description
 * @Date 2021/3/19 8:49 PM
 * @Version 1.0
 */
public class KingGold {

    /**
     * 问题描述
     * 10个工人挖5座金矿，每个金矿含有的黄金量和需要的人数为：500斤/5人、400斤/5人、350斤/3人、300斤/4人、
     * 200斤/3人。且要求每个金矿要么全挖，要么不挖，问怎么分配工作能尽可能多地挖出黄金？
     */


    public static int getMostGold_1(int n, int worker, int[] g, int[] p) {//递归算法
        if (n == 1 && worker < p[0]) {
            return 0;
        }

        if (n == 1 && worker >= p[0]) {
            return g[0];
        }

        if (n > 1 && worker < p[n - 1]) {
            return getMostGold_1(n - 1, worker, g, p);
        }

        return Math.max(getMostGold_1(n - 1, worker, g, p), (getMostGold_1(n - 1, worker - p[n - 1], g, p) + g[n - 1]));
    }

    /**
     *
     * @param n  金矿
     * @param w
     * @param g
     * @param p
     * @return
     */
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

    public static void main(String[] args) {
        int[] gold = {400, 500, 200, 300, 350};
        int[] people = {5, 5, 3, 4, 3};

        long startTime_1 = System.nanoTime();
        System.out.println(getMostGold_1(5, 10, gold, people));
        long endTime_1 = System.nanoTime();
        System.out.println("递归算法(用时)：" + (endTime_1 - startTime_1) + "ns");

        long startTime_2 = System.nanoTime();
        System.out.println(getMostGold_2(5, 10, gold, people));
        long endTime_2 = System.nanoTime();
        System.out.println("动态规划(用时)：" + (endTime_2 - startTime_2) + "ns");


        System.out.println(Math.max(1,3));
    }
}
