package com.epam.valevataya.module4.condiitions.task4;

public class Main {
  public static void main(String[] args) {
    MaxNumberPrinter maxNumberPrinter = new MaxNumberPrinter();
    maxNumberPrinter.printGreatest(5, 90, 90);
    TernaryPrinter ternaryPrinter = new TernaryPrinter();
    ternaryPrinter.printWhichIsBigger(99, 99);
    TernaryAssignment ternaryAssignment = new TernaryAssignment();
    ternaryAssignment.assignAndPrintBasedOnWhichBigger(5, 6);
    TernaryMaxNumberPrinter ternaryMaxNumberPrinter = new TernaryMaxNumberPrinter();
    ternaryMaxNumberPrinter.printGreatest(99, 999, 99);
  }
}
