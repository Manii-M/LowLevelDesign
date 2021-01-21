package oops.SOLID.openClosePrinciple.before.taxes;

import oops.SOLID.openClosePrinciple.before.employees.Employee;

/*
2) For part time employees

- 20% income tax
- 3% professional tax
- 1% educational cess
* */
public class PartTimeEmployeeTaxcalculator extends TaxCalculator {
    private final static int INCOME_TAX_PERCENTAGE = 30;
    private final static int PROFESSIONAL_TAX_PERCENTAGE = 2;
    private final static int EDUCATIONAL_CESS_PERCENTAGE = 1;

    public double calculateTax(Employee employee)
    {
        return (employee.getMonthlyIncome() * EDUCATIONAL_CESS_PERCENTAGE) / 100.0 +
                (employee.getMonthlyIncome() * PROFESSIONAL_TAX_PERCENTAGE) / 100.0 +
                (employee.getMonthlyIncome() * INCOME_TAX_PERCENTAGE) / 100.0;
    }
}
