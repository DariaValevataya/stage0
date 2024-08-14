package com.epam.valevataya.module3.task4;

import java.util.Arrays;

public class FormulaCreator {
  public static void main(String[] args) {
    int a = 3;
    int b = 5;
    double result = (9 * Math.pow(a, 2) - 5 * b + 2 + a - 7) * ((a + b - 4 * a * b) / 2.0);
    System.out.println("(9 * a ^ 2 - 5 * b + 2 + a - 7) * ((a + b - 4 * a * b) / 2) = " + result);
  }
}
