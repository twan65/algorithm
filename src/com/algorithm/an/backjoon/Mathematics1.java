package com.algorithm.an.backjoon;

public class Mathematics1 {
    /**
     * https://www.acmicpc.net/problem/1712
     */
    public static void breakEvenPoint () {
        int A = 3;
        int B = 2;
        int C = 1;

        int i = 1;
        while (true) {
            if (B * i + A < C * i) {
                System.out.println(i);
                return;
            }

            if (i > 20000) {
                System.out.println(-1);
                return;
            }
            i++;
        }
    }
}
