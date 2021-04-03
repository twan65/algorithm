package com.algorithm.an;


public class DoitExam {

    /** 선형탐색 */
    public static int sequentialSearch() {

        int[] n = {3, 4, 1, 2, 7, 9, 8};
        int searchTarget = 2;

        for (int i = 0; i < n.length; i++) {
            if (searchTarget == n[i]) return i;
        }

        return -1;
    }

    /** 이진탐색 */
    public static void binarySearch() {

        int[] n = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int target = 5;

        int start = 0;
        int last = n.length - 1;

        do {
            int center = (start + last) / 2; // ①
            if (n[center] == target) { // ②
                System.out.println(center);
                break;
            } else if (n[center] < target) { // ③
                start = center + 1;
            } else { // ④
                last = center - 1;
            }
        } while (start <= last);

    }

    /**
     * 問題：https://programmers.co.kr/learn/courses/30/lessons/68935
     * 3進法を逆転して返す。
     */
    public int reverseTernarySystem(int n) {
        final String dchar = "012";

        String answer = "";
        do {
            answer += dchar.charAt(n % 3);
            n /= 3;
        } while (n != 0);

        return Integer.parseInt(answer, 3);
    }

    /** 팩토리얼 */
    public static int factorial1(int n) {
        if (n > 0) {
            return n * factorial1(n - 1);
        } else {
            return 1;
        }
    }

    /** 팩토리얼 */
    public static void factorial2() {
        int n = 3;

        int sum = n;
        for (; n > 1; n--) {
            sum *= (n - 1);
        }

        System.out.println(sum);
    }

    /** 최대공약수 유클리드 호제법 */
    public static int gcd1(int x, int y) {
        if (y == 0) {
            return x;
        } else {
            return gcd1(y, x % y);
        }
    }

    /** 최대공약수 유클리드 호제법 */
    public static void gcd2() {
        int x = 16;
        int y = 16;

        while (y != 0) {
            int t = x;
            x = y;
            y = t % y;
        }

        System.out.println(x);
    }
}
