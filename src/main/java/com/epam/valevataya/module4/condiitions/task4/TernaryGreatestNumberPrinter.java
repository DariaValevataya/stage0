package com.epam.valevataya.module4.condiitions.task4;

public class TernaryGreatestNumberPrinter {
  public void printGreatest(int first, int second) {
    int result = first >= second ? first : second;
    System.out.println(result);
  }
}
