package com.epam.valevataya.module3.task7;

public class NumberReverter {
  public void revert(int number) {
    int hundreds = number / 100;
    int units = number % 10;
    int dozens = (number - hundreds * 100 - units) / 10;
    int reverseNumber = units * 100 + dozens * 10 + hundreds;
    System.out.println(number + " -> " + reverseNumber);
  }
}