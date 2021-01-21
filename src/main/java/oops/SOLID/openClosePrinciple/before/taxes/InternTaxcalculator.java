package oops.SOLID.openClosePrinciple.before.taxes;

import oops.SOLID.openClosePrinciple.before.employees.Employee;
/*
3) For interns
- If annual income < 300000 => no tax
- Else => only 15% income tax
* */

public class InternTaxcalculator extends TaxCalculator{

    private final static int INCOME_TAX_PERCENTAGE = 15;

    public int getIncomeTax(Employee employee) {
        if(employee.getMonthlyIncome()>30000)
            return INCOME_TAX_PERCENTAGE;
        return 0;
    }

    public double calculateTax(Employee employee)
    {
        return (employee.getMonthlyIncome() * getIncomeTax(employee)) / 100.0;
    }

}
