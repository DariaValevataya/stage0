package com.epam.valevataya.module4.loops.finalTask;

public class MultiplicationTable {
  public void printTable(int numberTableToPrint) {
    for (int i = 1; i < 10; i++) {
      System.out.println(numberTableToPrint + " x " + i + " = " + numberTableToPrint * i);
    }
  }
}
