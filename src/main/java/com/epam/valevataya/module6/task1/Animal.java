package com.epam.valevataya.module6.task1;

public class Animal {
  private String color;
  private int numberOfPaws;
  private boolean hasFur;

  public Animal(String color, int numberOfPaws, boolean hasFur) {
    this.color = color;
    this.numberOfPaws = numberOfPaws;
    this.hasFur = hasFur;
  }

  public String getDescription() {
    String paw = numberOfPaws > 1 ? "paws" : "paw";
    return hasFur ? "This animal is mostly " + color + ". It has " + numberOfPaws + " " + paw + " and a fur." : "This animal is mostly " + color + ". It has " + numberOfPaws + " paws and no fur.";
  }
}
