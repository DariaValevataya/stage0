package com.epam.valevataya.module4.condiitions.task3;

public class Main {
  public static void main(String[] args) {
    Seasons seasons = new Seasons();
    seasons.tellTheSeasonByMonthNumber(12);
    AliquotNumbers aliquotNumbers = new AliquotNumbers();
    aliquotNumbers.isFirstAliquot(5, 5);
    IsEnglishSymbolDeterminer isEnglishSymbolDeterminer = new IsEnglishSymbolDeterminer();
    isEnglishSymbolDeterminer.isEnglishSymbol('[');
    SalaryCalculator salaryCalculator = new SalaryCalculator();
    salaryCalculator.calculateSalary(-3);
    DaysInMonthPrinter daysInMonthPrinter = new DaysInMonthPrinter();
    daysInMonthPrinter.amountOfDays(4);
  }
}
