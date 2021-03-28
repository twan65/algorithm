package com.algorithm.an;

import java.util.*;

/** 1차원 배열 예제 20210326 */
public class ArrayExam {

  /** 문제 : https://www.acmicpc.net/problem/10818 다른사람 해답 : https://st-lab.tistory.com/43 */
  public static void minMax1() {

    String str = "20 10 35 30 7";
    String[] strArray = str.split(" ");

    OptionalInt min = Arrays.stream(strArray).mapToInt(x -> Integer.parseInt(x)).min();
    OptionalInt max = Arrays.stream(strArray).mapToInt(x -> Integer.parseInt(x)).max();

    // result
    System.out.println("min: " + min.getAsInt());
    System.out.println("max: " + max.getAsInt());

  }

  /** 문제 : https://www.acmicpc.net/problem/10818 다른사람 해답 : https://st-lab.tistory.com/43 */
  public static void minMax2() {

    String numbers = "20 10 35 30 7";

    String[] strArray = numbers.split(" ");

    int[] resultArray =
        Arrays.stream(strArray).mapToInt(x -> Integer.parseInt(x)).sorted().toArray();

    // result
    System.out.println("min: " + resultArray[0]);
    System.out.println("max: " + resultArray[resultArray.length - 1]);

  }

  /** 문제 : https://www.acmicpc.net/problem/10818 다른사람 해답 : https://st-lab.tistory.com/43 */
  public static void minMax3() {

    int[] numbers = new int[] {20, 10, 35, 30, 7};

    Arrays.sort(numbers);

    // result
    System.out.println("min: " + numbers[0]);
    System.out.println("max: " + numbers[numbers.length - 1]);

  }

  /** 문제 : https://www.acmicpc.net/problem/10818 다른사람 해답 : https://st-lab.tistory.com/43 */
  public static void minMax4() {

    int[] numbers = new int[] {20, 10, 35, 30, 7};

    int min = 1000000;
    int max = 0;

    for (int i = 0; i < numbers.length; i++) {
      if (min > numbers[i]) {
        min = numbers[i];
      }
      if (max < numbers[i]) {
        max = numbers[i];
      }
    }

    // result
    System.out.println("min: " + min);
    System.out.println("max: " + max);

  }

  /** 문제 : https://www.acmicpc.net/problem/2562 */
  public static void max() {

    // start
    int[] numbers = new int[] {3, 29, 38, 12, 57, 74, 40, 85, 61};

    int max = 0;
    int maxIndex = 0;

    for (int i = 0; i < numbers.length; i++) {
      if (max < numbers[i]) {
        max = numbers[i];
        maxIndex = i + 1;
      }
    }

    // result
    System.out.println("max value: " + max);
    System.out.println("index: " + maxIndex);

  }

  /** 문제 : https://www.acmicpc.net/problem/2577 */
  public static void numCount() {

    // start
    int a = 150;
    int b = 266;
    int c = 427;

    int multiplyValue = a * b * c;
    int multiplyValueLen = (int) (Math.log10(multiplyValue) + 1);

    // idx = 0~9
    int[] result = new int[] {2, 0, 0, 1, 0, 0, 0, 0, 0, 0};

    for (int i = 0; i < multiplyValueLen; i++) {
      result[multiplyValue % 10]++;
      multiplyValue = multiplyValue / 10;
    }

    // result
    for (int i = 0; i < result.length; i++) {
      System.out.println(i + "count : " + result[i]);
    }

  }

  /** 문제 : https://www.acmicpc.net/problem/3052 */
  public static void remainder() {

    // start
    int[] inputs1 = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    int[] inputs2 = new int[] {42, 84, 252, 420, 840, 126, 42, 84, 420, 126};
    int[] inputs3 = new int[] {39, 40, 41, 42, 43, 44, 82, 83, 84, 85};

    long result1 = Arrays.stream(inputs1).map(x -> x % 42).distinct().count();
    long result2 = Arrays.stream(inputs2).map(x -> x % 42).distinct().count();
    long result3 = Arrays.stream(inputs3).map(x -> x % 42).distinct().count();

    // result
    System.out.println("result1: " + result1);
    System.out.println("result2: " + result2);
    System.out.println("result3: " + result3);
  }

  /** 문제 : https://www.acmicpc.net/problem/3052 */
  public static void average(int n, int[] numbers) {
    double max = 0;
    for (int i = 0; i < numbers.length; i++) {
      if (max < numbers[i]) {
        max = numbers[i];
      }
    }

    double total = 0;
    for (int i = 0; i < numbers.length; i++) {
      total = (numbers[i] / max * 100) + total;
    }

    double result = total / numbers.length;

    // result
    System.out.println("result: " + result);
  }

  /** 문제 : https://www.acmicpc.net/problem/8958 */
  public static void ox() {
    // start
    String ox = "OOOOXOOOOXOOOOX";

    int count = 0;
    int sum = 0;
    for (int i = 0; i < ox.length(); i++) {
      if ('O' == ox.charAt(i)) {
        count++;
        sum += count;
      } else {
        count = 0;
      }
    }

    // result
    System.out.println("result: " + sum);
  }

  /** 문제 : https://www.acmicpc.net/problem/4344 */
  public static void overAverage1() {
    // start
    int student = 3;
    int[] numbers = new int[] {70, 90, 80};

    // average
    int sum = 0;
    for (int i = 0; i < student; i++) {
      sum += numbers[i];
    }

    int average = sum / student;

    // result
    double count = 0;
    for (int i = 0; i < student; i++) {
      if (average < numbers[i]) {
        count++;
      }
    }

    double result = count / student * 100;

    // result
    System.out.println("result: " + String.format("%.3f", result) + "%");
  }

  /** 문제 : https://www.acmicpc.net/problem/4344 */
  public static void overAverage2() {
    // start
    int student = 3;
    int[] numbers = new int[] {70, 90, 81};

    // average
    OptionalDouble average = Arrays.stream(numbers).average();

    // result
    long count = Arrays.stream(numbers).filter(x -> average.getAsDouble() < x).count();
    double result = Double.valueOf(count) / student * 100;

    // result
    System.out.println("result: " + String.format("%.3f", result) + "%");
  }

}
