package oops.SOLID.openClosePrinciple.before.taxes;

import oops.SOLID.openClosePrinciple.before.employees.Employee;

public abstract class TaxCalculator {
    public abstract double calculateTax(Employee employee);
}