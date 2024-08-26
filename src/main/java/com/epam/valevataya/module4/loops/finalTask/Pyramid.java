package com.epam.valevataya.module4.loops.finalTask;

public class Pyramid {
  public void printPyramid(int cathetusLength) {
    for (int i = 0; i < cathetusLength; i++) {
      int numbers = i * 2 + 1;
      int spaces = cathetusLength - i - 1;
      for (int j = 0; j < spaces; j++) {
        System.out.print(" ");
      }
      for (int j = numbers / 2 + 1; j > 0; j--) {
        System.out.print(j);
      }
      for (int j = numbers / 2 + 1; j < numbers; j++) {
        System.out.print(j - i + 1);
      }

      System.out.println();
    }
  }
}

