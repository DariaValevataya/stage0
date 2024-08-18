package com.epam.valevataya.module5.task1;

public class ArrayTasks {
  public String[] seasonsArray() {
    return new String[]{"summer", "winter", "spring", "autumn"};
  }

  public int[] generateNumbers(int length) {
    int[] numbersArray = new int[length];
    for (int i = 0; i < length; i++) {
      numbersArray[i] = i + 1;
    }
    return numbersArray;
  }

  public int totalSum(int[] arr) {
    int sum = 0;
    for (int i = 0; i < arr.length; i++) {
      sum += i;
    }
    return sum;
  }

  public int findIndexOfNumber(int[] arr, int number) {
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == number) {
        return i;
      }
    }
    return -1;
  }

  public String[] reverseArray(String[] arr) {
    String[] reverseArray = new String[arr.length];
    int index = reverseArray.length - 1;
    for (int i = 0; i < arr.length; i++) {
      reverseArray[index--] = arr[i];
    }
    return reverseArray;
  }

  public int[] getOnlyPositiveNumbers(int[] arr) {
    int count = 0;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > 0) {
        count++;
      }
    }
    int[] newArray = new int[count];
    int index = 0;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > 0) {
        newArray[index++] = arr[i];
      }
    }
    return newArray;
  }
}