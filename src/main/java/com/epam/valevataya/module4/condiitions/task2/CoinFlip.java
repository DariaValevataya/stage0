package com.epam.valevataya.module4.condiitions.task2;

public class CoinFlip {
  public void throwCoin(int from1UpTo1000) {
    if (from1UpTo1000 < 500) {
      System.out.println("Eagle");
    } else {
      System.out.println("Tail");
    }
  }
}
