package com.algorithm.an.backjoon;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;
import java.util.stream.Collectors;

/** 文字列 예제 20210401 */
public class StringExam {
  /** https://www.acmicpc.net/problem/11654 */
  public static void asciiCode() {
    // start
    String param = "0";
    System.out.println((int) param.charAt(0));
  }

  /** https://www.acmicpc.net/problem/11720 */
  public static void sum() {
    // start
    String number = "10987654321";
    String splitNum = number.replaceAll("0", "");

    int sum = 0;
    for (int i = 0; i < splitNum.length(); i++) {
      sum += (int) splitNum.charAt(i) - 48; // 아스키코드
      //            sum += Character.digit(splitNum.charAt(0), 10);
    }

    // result
    System.out.println(sum);
  }

  /** https://www.acmicpc.net/problem/10809 */
  public static void searchAlphabet() {
    // start
    String s = "a";

    int[] answer =
        new int[] {
          -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
          -1, -1, -1, -1
        };

    for (int i = 0; i < s.length(); i++) { // 1

      int index = (int) s.charAt(i) - 97; // 아스키코드
      if (answer[index] == -1) {
        answer[index] = i;
      }
    }

    // result
    System.out.println("result: " + Arrays.toString(answer));
  }

  /** https://www.acmicpc.net/problem/2675 */
  public static void repeatString1() {
    // start
    int repeatCount = 3;
    String s = "ABC";

    String[] sArray = s.split("");

    for (int i = 0; i < sArray.length; i++) {

      StringBuilder sb = new StringBuilder(sArray[i]);
      for (int j = 1; j < repeatCount; j++) {
        sb.append(sArray[i]);
      }

      sArray[i] = sb.toString();
    }

    // result
    String answer = String.join("", sArray);
    System.out.println("result: " + answer);

  }

  /** https://www.acmicpc.net/problem/2675 */
  public static void repeatString2() {
    // start
    int repeatCount = 3;
    String s = "ABC";

    String[] sArray = s.split("");

    String answer = Arrays.stream(sArray).map(x -> {
      String temp = x;
      for (int i = 1; i < repeatCount; i++) {
        temp += x;
      }
      return temp;
    }).collect(Collectors.joining());

    // result
    System.out.println("result: " + answer);

  }

  /** TODO: https://www.acmicpc.net/problem/1157 */
  public static void studyWord() {
    // start
    String s = "Mississipi";
    String lowerStr = s.toLowerCase();
    Integer aa = 0;

    Map<Character, Integer> map = new HashMap<>();

    for (char c : s.toCharArray()) {
      if (!map.containsKey(c)) {
        map.put(c, 0);
      } else {
        int value = map.get(c);
        map.put(c, ++value);
      }
    }

    // result
  }

  /** https://www.acmicpc.net/problem/1152 */
  public static void countWord1() {
    // start
    String s = "eull inika Teullyeotzi";

    int startIdx = s.startsWith(" ") ? 1 : 0;
    int endIdx = s.endsWith(" ") ? s.length() - 1 : s.length();

    int cnt = 1;
    for (int i = startIdx; i < endIdx; i++) {
      if (s.charAt(i) == ' ') {
        cnt++;
      }
    }

    // result
    System.out.println("result: " + cnt);
  }

  /** https://www.acmicpc.net/problem/2908 */
  public static void sangsu1() {
    // start
    String s = "143 132";

    String[] strArray = s.split(" ");

    String answer = "";
    for (int i = 2; i >= 0; i--) {
      if (strArray[0].charAt(i) > strArray[1].charAt(i)) {
        answer = new StringBuilder(strArray[0]).reverse().toString();
        break;
      } else if (strArray[0].charAt(i) < strArray[1].charAt(i)) {
        answer = new StringBuilder(strArray[1]).reverse().toString();
        break;
      } else {}
    }

    // result
    System.out.println("result: " + answer);
  }

  /** https://www.acmicpc.net/problem/2908 */
  public static void sangsu2() {
    // start
    String s = "143 133";

    String[] strArray = s.split(" ");

    for (int i = 2; i >= 0; i--) {

      if (strArray[0].charAt(i) == strArray[1].charAt(i)) {
        continue;
      }

      int index = 0;
      if (strArray[0].charAt(i) < strArray[1].charAt(i)) {
        index = 1;
      }

      // result
      String answer = new StringBuilder(strArray[index]).reverse().toString();
      System.out.println("result: " + answer);
      return;
    }
  }

  /**
   * 問題：https://www.acmicpc.net/problem/5622
   * TODO
   */
  public static void dial() {
    String s = "UNUCIC";
    int second = 0;

    String[] al ={"ABC", "DEF", "GHI", "JKL", "MNO", "PQRS", "TUV", "WXYZ"};

  }

  /**
   * 問題：https://www.acmicpc.net/problem/2941
   * TODO
   */
  public static void croatiaOs() {
    String input = "ljes=njak";
    final String[] values = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};



  }
}
