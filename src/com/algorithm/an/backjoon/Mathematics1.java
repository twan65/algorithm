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
     */
    public static void honeycomb () {
        int n = 8;

        if (n == 1) {
            System.out.println(n);
            return;
        }

        int cnt = 2;
        int start = cnt;
        int end = 7;
        while (true) {
            if (start <= n && n <= end) {
                System.out.println(cnt);
                return;
            }
            start = end + 1;
            end = cnt * 6 + end;
            cnt++;
        }
    }

    /**
     * https://www.acmicpc.net/problem/1193
     * TODO: 문제 이해 안됨
     */
    public static void fraction() {

    }

    /**
     * https://www.acmicpc.net/problem/2292
     */
    public static void snail () {
        int a = 100;
        int b = 99;
        int v = 1000000000;

        int day = 1;
        int point = 0;
        while (true) {
            point = point + a;
            if (point >= v) {
                System.out.println(day);
                return;
            }
            point = point- b;
            day++;
        }
    }

    /**
     * https://www.acmicpc.net/problem/10250
     *  H, W, N, 세 정수를 포함하고 있으며 각각 호텔의 층 수, 각 층의 방 수, 몇 번째 손님인지를 나타낸다
     */
    public static void ACMHotel () {
        int H = 6;
        int W = 12;
        int N = 10;


    }
}
