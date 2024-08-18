package com.epam.valevataya.module4.condiitions.task4;

public class MaxNumberPrinter {
  public void printGreatest(int first, int second, int third) {
    if (first >= second && first >= third) {
      System.out.println("first = " + first);
    } else if (second >= first && second >= third) {
      System.out.println("second = " + second);
    } else  {
      System.out.println("third = " + third);
    }
  }
}