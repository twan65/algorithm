package com.algorithm;


import com.algorithm.an.DoitExam;
import com.algorithm.an.backjoon.Mathematics1;
import com.algorithm.an.backjoon.StringExam;

import com.algorithm.an.sort.Sort;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String day = sc.nextLine();

    day = day.replace(" ", "");
    boolean isEquals = true;
    for (int i = 1; i < day.length() && isEquals; i++) {
      isEquals = day.charAt(0) == day.charAt(i);
    }

    System.out.println(isEquals ? "YES" : "NO");
  }

  /**
   * 삽입정렬
   * 거의 정렬이 되어있는 상태라면 퀵정렬보다도 빠르다.
   */
  public static void sort_insertion(){

    int[] numbers = {1, 10, 5, 8, 7, 6, 4, 3, 2, 9};
    int i, j, temp;

    for (i = 0; i < 9; i++) {
      j = i;
      while(numbers[j] > numbers[j + 1]) {
        temp = numbers[j + 1];
        numbers[j + 1] = numbers[j];
        numbers[j] = temp;
        j--;
      }
    }

    for (i = 0; i <= 9; i++) {
      System.out.println( numbers[i]);
    }

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

  /** 文字列を逆転する。 */
  private static void reverseString3() {
    String target = "bananaaae";

    Stack result = new Stack();
    for (int i = 0; i <= target.length() - 1; i++) {
      result.push(target.charAt(i));
    }

    System.out.println(result);
  }

  /**
   * 小数が何個あるのか
   * 問題：https://programmers.co.kr/learn/courses/30/lessons/12921
   */
  private static void sosu() {
    int n = 179;
    boolean[] sosu = new boolean[n + 1];

    for (int i = 2; i <= n; i++) sosu[i] = true;

    // 제곱근 구하기(平方根　ヘイホウコン)
    int root = (int) Math.sqrt(n);

    for (int i = 2; i <= root; i++) {
      if (!sosu[i]) {
        continue;
      }

      for (int j = i; i * j <= n; j++) {
        sosu[i * j] = false;
      }
    }

    int answer = 0;
    for (boolean isSosu : sosu) {
      if (isSosu) answer++;
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
