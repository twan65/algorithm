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

    /**
     * https://www.acmicpc.net/problem/2292
     * TODO
     */
    public static void honeycomb () {
        int n = 13;

        if (n == 1) {
            System.out.println(n);
            return;
        }

        int cnt = 2;
        while (true) {
            int start = cnt * 6 + 1;
            if (start <= n && n <= ((cnt + 1) * 6) + start) {
                System.out.println(cnt);
                return;
            }
            cnt++;
        }

    }
}
