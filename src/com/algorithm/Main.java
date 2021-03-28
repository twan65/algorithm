package com.algorithm;

import com.algorithm.an.StringExam;

import java.util.stream.IntStream;

public class Main {

  public static void main(String[] args) {
    long beforeTime = System.currentTimeMillis();
    StringExam.sangsu2();
    System.out.println("시간차이(m) : " + (System.currentTimeMillis() - beforeTime) / 1000);
  }

  /** 文字列を逆転する。 */
  private static void reverseString1() {
    String target = "bananaaae";

    char[] result = new char[target.length()];
    for (int i = 0; i <= target.length() - 1; i++) {
      result[i] = target.charAt(target.length() - i - 1);
    }

    System.out.println(result);
  }

  /** 文字列を逆転する。 */
  private static void reverseString2() {
    String target = "banana";

    StringBuilder sb = new StringBuilder(target);
    System.out.println(sb.reverse().toString());
  }

  /** 少数 */
  private static void sosu() {
    int n = 179;
    int answer = 0;
    boolean[] sosu = new boolean[n + 1];

    for (int i = 2; i <= n; i++) sosu[i] = true;

    // 제곱근 구하기(平方根　ヘイホウコン)
    int root = (int) Math.sqrt(n);
    System.out.println(root);

    for (int i = 2; i <= root; i++) {
      if (sosu[i]) {
        for (int j = i; i * j <= n; j++) sosu[i * j] = false;
      }
    }

    for (int i = 2; i <= n; i++) {
      if (sosu[i]) answer++;
    }
  }

  /** 約数약수의합 구하기 */
  private static void addMeasure1() {
    int n = 12;

    int answer = 0;

    for (int i = 1; i <= n; i++) {
      if (n % i == 0) {
        answer += i;
      }
    }

    System.out.println(answer);
  }

  /** 約数약수의합 구하기 */
  private static void addMeasure2() {
    int n = 12;

    // range: 1부터 n - 1까지
    // rangeClosed: 1부터 n까지
    int answer =  IntStream.rangeClosed(1, n)
            .filter(i -> n % i == 0)
            .reduce(0, (n1, n2) -> n1 + n2);

    System.out.println(answer);
  }
}
