package com.epam.valevataya.module3.task7;

public class DigitsSumCalculator {
  public void calculateSum(int number) {
    int hundreds = number / 100;
    int units = number % 10;
    int dozens = (number - hundreds * 100 - units) / 10;
    int sum = units + dozens + hundreds;
    System.out.println("sum = " + sum);
  }
}
