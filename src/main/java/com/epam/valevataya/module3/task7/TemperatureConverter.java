package com.epam.valevataya.module3.task7;

public class TemperatureConverter {
  public void toFahrenheit(int temperatureCelsius) {
    double temperatureFahrenheit = 1.8 * temperatureCelsius + 32;
    System.out.println(temperatureCelsius + " -> " + temperatureFahrenheit);
  }
}
