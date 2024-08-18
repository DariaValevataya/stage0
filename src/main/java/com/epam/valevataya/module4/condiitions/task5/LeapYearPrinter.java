package com.epam.valevataya.module4.condiitions.task5;

public class LeapYearPrinter {
  public void isLeapYear(int year) {
    if (year % 4 == 0) {
      System.out.println("Leap");
    } else {
      System.out.println("Not leap");
    }
  }
}