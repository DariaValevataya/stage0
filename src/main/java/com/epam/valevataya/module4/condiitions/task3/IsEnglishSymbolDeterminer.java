package com.epam.valevataya.module4.condiitions.task3;

public class IsEnglishSymbolDeterminer {
  public void isEnglishSymbol(char symbol) {
    if ((symbol >= 65 && symbol <= 90) || (symbol >= 97 && symbol <= 125)) {
      System.out.println("English");
    } else {
      System.out.println("Non English");
    }
  }
}