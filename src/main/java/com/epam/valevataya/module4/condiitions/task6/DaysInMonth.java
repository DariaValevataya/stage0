package com.epam.valevataya.module4.condiitions.task6;

public class DaysInMonth {
  public void printDays(int year, int month) {
    if (year % 4 == 0) {
      switch (month) {
        case 1, 3, 5, 7, 8, 10, 12 -> System.out.println("31 days");
        case 2 -> System.out.println("29 days");
        case 4, 6, 9, 11 -> System.out.println("30 days");
        default -> System.out.println("Wrong number");
      }
    } else {
      switch (month) {
        case 1, 3, 5, 7, 8, 10, 12 -> System.out.println("31 days");
        case 2 -> System.out.println("28 days");
        case 4, 6, 9, 11 -> System.out.println("30 days");
        default -> System.out.println("Wrong number");
      }
    }
  }
}