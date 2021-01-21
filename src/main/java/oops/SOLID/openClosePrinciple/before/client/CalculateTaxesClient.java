package oops.SOLID.openClosePrinciple.before.client;

import java.text.NumberFormat;
import java.util.List;
import java.util.Locale;

import oops.SOLID.openClosePrinciple.before.employees.Employee;
import oops.SOLID.openClosePrinciple.before.persistence.EmployeeRepository;
import oops.SOLID.openClosePrinciple.before.taxes.TaxCalculator;
import oops.SOLID.openClosePrinciple.before.taxes.TaxCalculatorFactory;


public class CalculateTaxesClient {
    private List<Employee> employees;

    private List<Employee> getEmployeeList(){
        EmployeeRepository repository = new EmployeeRepository();
        if(getEmployees()==null)
             setEmployees(repository.findAll());
        return getEmployees();
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public double calculateTotalTax(){
        double totalTaxes = 0;
        List<Employee> employees = getEmployeeList();
        for (Employee employee: employees){
            TaxCalculator taxCalculator = TaxCalculatorFactory.getTaxCalculator(employee);
            double tax = taxCalculator.calculateTax(employee);
            totalTaxes+= tax;
            System.out.println(employee.getFullName() + " Monthly Income is " + employee.getMonthlyIncome()
                    + " ans Tax is " + tax);
        }
        return totalTaxes;
    }
    public static void main(String[] args) {
        CalculateTaxesClient calculateTaxesClient = new CalculateTaxesClient();
        System.out.println("Total Tax is " + calculateTaxesClient.calculateTotalTax());
    }
}
