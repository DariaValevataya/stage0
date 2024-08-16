package com.epam.valevataya.module4.condiitions.task3;

public class AliquotNumbers {
  public void isFirstAliquot(int first, int second) {
    if (second % first == 0 && first != second) {
      System.out.println("Aliquot");
    } else {
      System.out.println("Not aliquot");
    }
  }
}
