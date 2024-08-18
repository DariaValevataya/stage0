package com.epam.valevataya.module4.condiitions.task4;

public class TernaryAssignment {
  public void assignAndPrintBasedOnWhichBigger(int first, int second) {
    int result = first > second ? 10 : -10;
    System.out.println("result: " + result);
  }
}