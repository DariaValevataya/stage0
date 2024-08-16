package com.epam.valevataya.module4.condiitions.task3;

public class SalaryCalculator {
  public void calculateSalary(int salary) {
    double salaryAfterTaxes = 0.0;
    if (salary > 0 && salary <= 10000) {
      salaryAfterTaxes = salary * 0.85;
    } else if (salary > 10000 && salary < 20000) {
      salaryAfterTaxes = salary * 0.82;
    } else if (salary > 20000) {
      salaryAfterTaxes = salary * 0.8;
    } else if (salary < 0) {
      System.out.println("Wrong input");
    }
    System.out.println("salary after taxes = " + salaryAfterTaxes);

  }
}