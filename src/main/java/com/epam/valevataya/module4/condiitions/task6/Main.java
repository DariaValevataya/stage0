package com.epam.valevataya.module4.condiitions.task6;

public class Main {
  public static void main(String[] args) {
    TriangleValidator triangleValidator = new TriangleValidator();
    triangleValidator.validate(4.3, 5.6, 5.6);
    DaysInMonth daysInMonth = new DaysInMonth();
    daysInMonth.printDays(2023, 2);
    IntegerDivider integerDivider = new IntegerDivider();
    integerDivider.printCompletelyDivided(45, 55);
    BitwiseValuesSwap bitwiseValuesSwap = new BitwiseValuesSwap();
    bitwiseValuesSwap.swap(5, 10);
  }
}
