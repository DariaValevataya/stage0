package com.epam.valevataya.module4.condiitions.task6;

public class TriangleValidator {
  public void validate(double firstSide, double secondSide, double thirdSide) {
    if (firstSide < secondSide + thirdSide && secondSide < firstSide + thirdSide && thirdSide < secondSide + firstSide) {
      System.out.println("this is a valid triangle");
    } else {
      System.out.println("it's not a triangle");
    }
  }
}
