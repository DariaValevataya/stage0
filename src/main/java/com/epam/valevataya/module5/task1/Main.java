package com.epam.valevataya.module5.task1;

import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    String[] arr;
    int[] intArr;
    ArrayTasks arrayTasks = new ArrayTasks();
    arr = arrayTasks.reverseArray(new String[]{"hello", "good", "sun"});
    intArr = arrayTasks.getOnlyPositiveNumbers(new int[]{1, 6, -7, -6, 5, 4});

    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
    for (int i = 0; i < intArr.length; i++) {
      System.out.print(intArr[i] + " ");
    }
  }
}
