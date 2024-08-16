package com.epam.valevataya.module4.condiitions.task3;

public class DaysInMonthPrinter {
  public void amountOfDays(int month) {
    switch (month) {
      case 1, 3, 5, 7, 8, 10, 12 -> System.out.println("31 days");
      case 2 -> System.out.println("28 or 29 days");
      case 4, 6, 9, 11 -> System.out.println("30 days");
      default -> System.out.println("Wrong number");
    }
  }
}
