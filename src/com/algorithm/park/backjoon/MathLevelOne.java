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
   * @param params
   */
  public static void snailHight(String params){
    int up = Integer.parseInt(params.split(" ")[0]);
    int down = Integer.parseInt(params.split(" ")[1]);
    int tree = Integer.parseInt(params.split(" ")[2]);

    int day=0;
    int sum=0;
    while (sum<tree){
      day++;
      sum+=up;
      if(sum>=tree) break;
      sum-=down;
    }

    System.out.println(day);
  }

  /**
   * https://www.acmicpc.net/problem/10250
   * @param params
   */
  public static void reservierenHotel(String params){
    int hight=Integer.parseInt(params.split(" ")[0]);
    int customer=Integer.parseInt(params.split(" ")[2]);

    if(customer<hight) System.out.println(customer+"01");
    else{
      int widthCount=1;

      while (customer>hight){
        widthCount++;
        customer-=hight;
      }
      System.out.println(customer+""+(widthCount<10?"0"+widthCount:widthCount));
    }
  }

  /**
   * https://www.acmicpc.net/problem/2775
   * @param params
   */
  public static void countApartmentPeple(String params){
    int hight = Integer.parseInt(params.split(" ")[0]);
    int width = Integer.parseInt(params.split(" ")[1]);

    if(width==1) {
      System.out.println(1);
      return;
    }else if(hight==1){
      System.out.println(width);
      return;
    }

  }

}
