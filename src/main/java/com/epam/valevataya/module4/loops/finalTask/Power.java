package com.epam.valevataya.module4.loops.finalTask;

public class Power {
  public void printPower(int numberToPrint, int power) {
    int number = numberToPrint;
    for (int i = 1; i < power; i++) {
      numberToPrint *= number;
    }
    System.out.println("number = " + number + ", power = " + power);
    System.out.println("result = " + numberToPrint);

  }
}
