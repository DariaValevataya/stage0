package com.epam.valevataya.module4.condiitions.task4;

public class TernaryMaxNumberPrinter {
  public void printGreatest(int first, int second, int third) {
    System.out.println(first >= second && first >= third ? first : second >= first && second >= third ? second : third);
  }
}