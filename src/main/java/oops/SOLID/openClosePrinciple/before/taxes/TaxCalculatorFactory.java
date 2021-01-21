package oops.SOLID.openClosePrinciple.before.taxes;

import oops.SOLID.openClosePrinciple.before.employees.Employee;
import oops.SOLID.openClosePrinciple.before.employees.FullTimeEmployee;
import oops.SOLID.openClosePrinciple.before.employees.Intern;
import oops.SOLID.openClosePrinciple.before.employees.PartTimeEmployee;

public class TaxCalculatorFactory {
    public static TaxCalculator getTaxCalculator(Employee employee){
        if(employee instanceof FullTimeEmployee)
            return new FullTimeEmployeeTaxcalculator();
        else if(employee instanceof PartTimeEmployee)
                return new PartTimeEmployeeTaxcalculator();
        else if(employee instanceof Intern)
            return new InternTaxcalculator();
        return null;
    }
}
