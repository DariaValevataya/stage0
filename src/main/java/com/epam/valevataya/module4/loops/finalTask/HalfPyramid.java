package com.epam.valevataya.module4.loops.finalTask;

public class HalfPyramid {
  public void printHalfPyramid(int cathetusLength) {
    for (int i = 0; i < cathetusLength; i++) {
      int stars = i * 2 + 1;
      int spaces = (int) Math.round(cathetusLength / 2.0);
      for (int j = 0; j < spaces; j++) {
        System.out.print(" ");
      }
      for (int j = 0; j < stars - stars / 2; j++) {
        System.out.print("*");
      }
      System.out.println();
    }

  }
}
