package com.epam.valevataya.module4.condiitions.task2;

public class GreatestNumberPrinter {
  public void printGreatest(int first, int second) {
    if (first > second) {
      System.out.println("first = " + first);
    } else if (first < second) {
      System.out.println("second = "+ second);
    } else {
      System.out.println(first);
    }
  }
}