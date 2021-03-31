package com.algorithm.an;


public class DoitExam {

    /** p100 */
    public static int sequentialSearch() {

        int[] n = {3, 4, 1, 2, 7, 9, 8};
        int searchTarget = 2;

        for (int i = 0; i < n.length; i++) {
            if (searchTarget == n[i]) return i;
        }

        return -1;
    }

    /** p100 */
    public static void binarySearch() {

        int[] n = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int target = 5;

        int start = 0;
        int last = n.length - 1;

        do {
            int center = (start + last) / 2;
            if (n[center] == target) {
                System.out.println(center);
                break;
            } else if (n[center] < target) {
                start = center + 1;
            } else {
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
}
