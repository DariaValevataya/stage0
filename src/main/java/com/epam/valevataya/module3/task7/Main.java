package com.epam.valevataya.module3.task7;


public class Main {
  public static void main(String[] args) {
    NumbersPrinter numbersPrinter = new NumbersPrinter();
    numbersPrinter.printIsPositive(-8);
    NumberReverter numberReverter = new NumberReverter();
    numberReverter.revert(453);
    DigitsSumCalculator digitsSumCalculator= new DigitsSumCalculator();
    digitsSumCalculator.calculateSum(345);
    TemperatureConverter temperatureConverter=new TemperatureConverter();
    temperatureConverter.toFahrenheit(34);
  }
}
