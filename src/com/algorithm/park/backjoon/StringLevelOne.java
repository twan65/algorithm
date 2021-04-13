package com.algorithm.park.backjoon;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;

public class StringLevelOne {

  /**
   * https://www.acmicpc.net/problem/11654
   *
   * @param params
   */
  public static void asciiNumberOutput(String params) {
    System.out.println((int) params.charAt(0));
  }

  /**
   * https://www.acmicpc.net/problem/11720
   *
   * @param params
   */
  public static void numberSum(String params) {
    params = params.replaceAll("0", "");

    char[] charArray = params.toCharArray();
    int sum = 0;
    for (char num : charArray) {
      sum += (int) num;
    }

    System.out.println(sum - (48 * charArray.length));
  }

  /**
   * https://www.acmicpc.net/problem/10809
   *
   * @param params
   */
  public static void findAlphabet(String params) {
    String[] alphabetArray = {
            "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s",
            "t", "u", "v", "w", "x", "y", "z"
    };

    for (String alphabet : alphabetArray) {
      System.out.print(params.indexOf(alphabet) + " ");
    }
  }

  /**
   * https://www.acmicpc.net/problem/2675
   *
   * @param params
   */
  public static void stringRoof(String params) {
    int roofCount = Integer.parseInt(params.split(" ")[0]);
    String roofString = params.split(" ")[1];

    for (char test : roofString.toCharArray()) {
      for (int i = 0; i < roofCount; i++) {
        System.out.print(test);
      }
    }
  }

  /**
   * https://www.acmicpc.net/problem/1157
   *
   * @param params
   */
  public static void findMaxWord(String params) {
    params = params.toUpperCase();
    Map maxCountOfWord = new HashMap<Character, Integer>();
    int maxCount = 0;
    char target = ' ';
    for (Character alphabet : params.toCharArray()) {
      Integer targetCount = (Integer) maxCountOfWord.get(alphabet);
      if (targetCount == null) {
        targetCount = 1;
        maxCountOfWord.put(alphabet, targetCount);
      } else {
        targetCount++;
        maxCountOfWord.replace(alphabet, targetCount);
      }
      if (maxCount == targetCount) {
        target = '?';
      } else if (maxCount < targetCount) {
        maxCount = targetCount;
        target = alphabet;
      }
    }
    System.out.println(target);
  }

  /**
   * https://www.acmicpc.net/problem/1152
   *
   * @param params
   */
  public static void wordCount(String params) {
    System.out.println(params.trim().split(" ").length);
  }

  /**
   * https://www.acmicpc.net/problem/2908
   *
   * @param params
   */
  public static void answerRevert(String params) {
    String[] wordArray = params.split(" ");
    String ans =
            Integer.parseInt(wordArray[0]) < Integer.parseInt(wordArray[1])
                    ? wordArray[0]
                    : wordArray[1];

    StringBuilder sb = new StringBuilder();

    sb.append(ans);
    sb.reverse();

    System.out.println(sb);
  }

  //  public static void telTime(String params){
  //    97-99 2
  //          100-102 3
  //          103-105 4
  //          106-107 5
  //          108-110 6
  //          111-114 7
  //
  //  }

  /**
   * https://www.acmicpc.net/problem/2941
   *
   * @param params
   */
  public static void findCroAlpabet(String params) {
    String[] croAl = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};

    int sum = 0;
    int length = params.length();
    int count = -1;
    while (count < croAl.length - 1) {
      count++;
      params = params.replaceAll(croAl[count], "");

      if (length - params.length() == 0) continue;
      int changeCount = (length - params.length()) / croAl[count].length();
      length = params.length();
      sum += changeCount;
    }

    System.out.println(sum + params.length());
  }

  /**
   * https://www.acmicpc.net/problem/1316
   *
   * @param params
   */
  public static void countGrupword(String params) {
    String[] wordArray = params.split(" ");

    Map<String, Boolean> checkMap = new HashMap<>();

    int sum = 0;
    for (String word : wordArray) {
      String targetWord=word;
      if (word.length() == 1) {
        sum++;
        continue;
      }
      boolean breakFl=true;
      char checkword = targetWord.charAt(0);
      for (int i = 0; i < word.length(); i++) {
        while (targetWord.length() > 0) {
          if (targetWord.charAt(0) == checkword) {
            targetWord = targetWord.replaceFirst(String.valueOf(checkword), "");
          } else {
            breakFl = targetWord.indexOf(checkword) != -1;
            checkMap.put(word, !breakFl);
            if (breakFl){
              break;
            }
            checkword=targetWord.charAt(i);
          }
        }
        if(breakFl) break;
        checkMap.put(word, true);
      }
      if (checkMap.get(word)) sum++;
    }

    System.out.println(sum);
  }
}
