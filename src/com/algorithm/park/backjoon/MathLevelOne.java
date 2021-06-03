package com.algorithm.park.backjoon;

public class MathLevelOne {

  /**
   * https://www.acmicpc.net/problem/1712
   *
   * @param params
   */
  public static void breakEvenPoint(String params) {
    int rent = Integer.parseInt(params.split(" ")[0]);
    int materialCost = Integer.parseInt(params.split(" ")[1]);
    int price = Integer.parseInt(params.split(" ")[2]);

    int index = 0;
    int test1 = rent;
    int sum = 0;
    while (test1 >= sum) {
      index++;
      if (index % 12 == 0) {
        test1 += rent;
      }
      test1 += materialCost;
      sum += price;
    }

    System.out.println(index);
  }

  /**
   * https://www.acmicpc.net/problem/2292
   *
   * @param params
   */
  public static void honeycomb(String params) {
    int target = Integer.parseInt(params);
    // 6n-5
    int maxNum = 1;
    int count = 0;
    while (maxNum < target) {
      count++;
      maxNum += 6 * (count - 1);
    }

    System.out.println(count);
  }

  /**
   * https://www.acmicpc.net/problem/1193
   *
   * @param params
   */
  public static void findFractions(String params) {
    int target = Integer.parseInt(params);
    int colIndex = 0;
    int num = 0;

    if (target == 1) {
      System.out.println("1/1");
      return;
    }

    while (num < target) {
      colIndex++;
      num = ((colIndex * (colIndex + 1)) / 2);
    }

    int firstNum = 0;
    int lastNum = 0;

    if (colIndex % 2 == 0) {
      firstNum = colIndex;
      lastNum = 1;

      while (num != target) {
        firstNum--;
        lastNum++;
        num--;
      }
    } else {
      firstNum = 1;
      lastNum = colIndex;

      while (num != target) {
        firstNum++;
        lastNum--;
        num--;
      }
    }

    System.out.println(firstNum + "/" + lastNum);
  }

  /**
   * https://www.acmicpc.net/problem/2869
   *
   * @param params
   */
  public static void snailHight(String params) {
    int up = Integer.parseInt(params.split(" ")[0]);
    int down = Integer.parseInt(params.split(" ")[1]);
    int tree = Integer.parseInt(params.split(" ")[2]);

    int day = 0;
    int sum = 0;
    while (sum < tree) {
      day++;
      sum += up;
      if (sum >= tree) break;
      sum -= down;
    }

    System.out.println(day);
  }

  /**
   * https://www.acmicpc.net/problem/10250
   *
   * @param params
   */
  public static void reservierenHotel(String params) {
    int hight = Integer.parseInt(params.split(" ")[0]);
    int customer = Integer.parseInt(params.split(" ")[2]);

    if (customer < hight) System.out.println(customer + "01");
    else {
      int widthCount = 1;

      while (customer > hight) {
        widthCount++;
        customer -= hight;
      }
      System.out.println(customer + "" + (widthCount < 10 ? "0" + widthCount : widthCount));
    }
  }

  /**
   * https://www.acmicpc.net/problem/2775
   *
   * @param params
   */
  public static void countApartmentPeople(String params) {
    int height = Integer.parseInt(params.split(" ")[0]);
    int width = Integer.parseInt(params.split(" ")[1]);

    if (width == 1) {
      System.out.println(1);
      return;
    } else if (height == 0) {
      System.out.println(width);
      return;
    }

    int[] test = new int[width];

    for (int i = 0; i < width - 1; i++) {
      test[i] = i + 1;
    }

    for (int i = 0; i < height; i++) {
      for (int j = 1; j < width; j++) {
        test[j] = test[j] + test[j - 1];
      }
    }
    System.out.println(test[width - 1]);
  }

  /**
   * https://www.acmicpc.net/problem/2839
   *
   * @param params
   */
  public static void sugarDeliver(String params) {
    int sugar = Integer.parseInt(params);
    int count = 0;

    if (sugar < 5 && sugar != 3) {
      System.out.println(-1);
      return;
    }

    if (sugar % 3 == 0) {
      count = sugar / 3;

      if (count > 5) {
        int test1 = sugar / 5;
        int test2 = sugar % 5;
        count = (test1 * 3 / 5) + test2;
      }

      System.out.println(count);
      return;
    }

    if (sugar % 5 == 0) {
      System.out.println(sugar / 5);
      return;
    }
    int target = sugar % 5;
    count = sugar / 5;
    while (true) {
      if (target % 3 != 0 && count >= 1) {
        count--;
        target += 5;

      } else if (target % 3 == 0) {
        count += target / 3;
        break;
      } else if (count == 0) {
        count = -1;
        break;
      }
    }

    System.out.println(count);
  }

  /**
   * https://www.acmicpc.net/problem/1011
   * 
   * @param params
   */
  public static void lastProblem(String params) {
    int start = Integer.parseInt(params.split(" ")[0]);
    int end = Integer.parseInt(params.split(" ")[1]);
    int distance = end - start;
    boolean isOdd = distance % 2 == 1;
    int test1 = (int) Math.floor(distance / 2);

    int test2 = 0;
    int count = 1;
    while (true) {
      test2 = (count * (count + 1)) / 2;
      if (test1 <= test2) {
        if (test1 < test2) {
          count--;
          test2 = (count * (count + 1)) / 2;
        }
        break;
      }
      count++;
    }
    int answer = count * 2;
    int test3 = distance - (test2 * 2);
    if (isOdd) {
      test3++;
    }

    if (test3 - 1 <= count) {
      answer++;
    } else {
      answer += 2;
    }
    System.out.println(answer);
  }
}
