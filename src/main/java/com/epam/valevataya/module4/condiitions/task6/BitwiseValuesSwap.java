package com.epam.valevataya.module4.condiitions.task6;

public class BitwiseValuesSwap {
  public void swap(int first, int second) {
    System.out.println("first = " + first + ", second = " + second);
    first = first | second;
    second = first ^ second;
    first = first ^ second;
    System.out.println("first = " + first + ", second = " + second);
  }
}

