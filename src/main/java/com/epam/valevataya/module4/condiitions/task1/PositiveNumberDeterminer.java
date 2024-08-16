package com.epam.valevataya.module4.condiitions.task1;

public class PositiveNumberDeterminer {
  public void isPositive(int numberToBeDetermined) {
    if (numberToBeDetermined > 0) {
      System.out.println("true "+ numberToBeDetermined + " is positive");
    } else {
      System.out.println("false");
    }
  }
}
