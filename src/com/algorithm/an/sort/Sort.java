package com.algorithm.an.sort;

public class Sort {


//  1. 정렬되지 않은 숫자중에 가장 작은 숫자를 선택
//  2. 선택한 숫자를 정렬되자 않은 숫자들 중 첫번쨰와 자리를 바꾼다
//  3. 모든 숫자를 옮길떄까지 1, 2번을 반복한다
//  선택정렬의 시간복잡도
//    데이터의 개수가 n개라고 했을 때,
//    첫 번째 회전에서의 비교횟수 : 1 ~ (n-1) => n-1
//    두 번째 회전에서의 비교횟수 : 2 ~ (n-1) => n-2
//      ...
//      (n-1) + (n-2) + .... + 2 + 1 => n(n-1)/2
//
//    비교하는 것이 상수 시간에 이루어진다는 가정 아래,
//    n개의 주어진 배열을 정렬하는데 O(n^2) 만큼의 시간이 걸립니다.
//    최선, 평균, 최악의 경우 시간복잡도는 O(n^2) 으로 동일합니다.
//
//  선택정렬의 공간복잡도
//    주어진 배열 안에서 교환(swap)을 통해, 정렬이 수행되므로 O(n) 입니다.
//  안정적이지 않다.(중복 숫자가 있을때 자리가 봐뀔 가능성이 있음)
  public static void selection_sort(int[] numbers) {

    int minIndex;
    //  3. 모든 숫자를 옮길떄까지 1, 2번을 반복한다
    for(int i = 0; i < numbers.length - 1; i++) {
      minIndex = i;
      for (int j = i + 1; j < numbers.length; j++) {
        //  1. 정렬되지 않은 숫자중에 가장 작은 숫자를 선택
        if (numbers[minIndex] > numbers[j]) {
          minIndex = j;
        }
      }

      //  2. 선택한 숫자를 정렬되자 않은 숫자들 중 첫번쨰와 자리를 바꾼다
      swap(i, minIndex, numbers);
    }
  }

  public static void insertion_sort(int[] numbers) {

    int i, j, key;
//    for(i = 1; i < numbers.length; i++) {
//      key = numbers[i];
//      for(j = i - 1; j >= 0; j--) {
//        if (key < numbers[j]) {
//          numbers[j + 1] = numbers[j];
//        } else {
//          break;
//        }
//      }
//      numbers[j + 1] = key;
//    }
    for(i = 1; i < numbers.length; i++) {
      key = numbers[i];
      for(j = i; j > 0 && key < numbers[j - 1]; j--) {
        numbers[j] = numbers[j - 1];
      }
      numbers[j] = key;
    }
  }

  private static void swap(int i, int j, int[] targets) {
    int temp = targets[i];
    targets[i] = targets[j];
    targets[j] = temp;
  }
}
