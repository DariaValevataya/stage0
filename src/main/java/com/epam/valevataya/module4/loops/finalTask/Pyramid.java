package com.epam.valevataya.module4.loops.finalTask;

public class Pyramid {
  public void printPyramid(int cathetusLength) {
    for (int i = 0; i < cathetusLength; i++) {
      int numbers = i * 2 + 1;
      int spaces = cathetusLength - i;
      for (int j = 0; j <= spaces; j++) {
        System.out.print(" ");
      }
      for (int j = 0; j < numbers; j++) {
        System.out.print(j + 1);
      }
      for (int j = 0; j <= spaces; j++) {
        System.out.print(" ");
      }
      System.out.println();
    }
  }
}

