package com.eacuamba.java_como_programar.chapter_10._10_5_study_of_case_system_of_payment_paper_using_polimorphism.payment_paper;

public class PayrollSystemTest {
    public static void main(String[] args) {
        SalariedEmployee salariedEmployee = new SalariedEmployee("Luka", "Kilamba", "123456789", 10000.65);
        HourlyEmployee hourlyEmployee = new HourlyEmployee("Kiko", "Makanga", "234567891", 500.0, 41);
        CommissionEmployee commissionEmployee = new CommissionEmployee("Gapo", "Potinio", "345678912", .20, 5000);
        BasePlusCommissionEmployee basePlusCommissionEmployee = new BasePlusCommissionEmployee("Fourdo", "Korlange", "456789123", .10, 2000, 900);

        //Printing
        System.out.println("Employee processed individually");

        System.out.printf("%n%s%n%s $%,.2f%n%n", salariedEmployee, "Earnings", salariedEmployee.earnings());
        System.out.printf("%n%s%n%s $%,.2f%n%n", hourlyEmployee, "Earnings", hourlyEmployee.earnings());
        System.out.printf("%n%s%n%s $%,.2f%n%n", commissionEmployee, "Earnings", commissionEmployee.earnings());
        System.out.printf("%n%s%n%s $%,.2f%n%n", basePlusCommissionEmployee, "Earnings", basePlusCommissionEmployee.earnings());

        Employee[] employees = new Employee[4];
        employees[0] = salariedEmployee;
        employees[1] = hourlyEmployee;
        employees[2] =  commissionEmployee;
        employees[3] = basePlusCommissionEmployee;

        for (Employee currentEmployee: employees){
            System.out.println(currentEmployee);

            if(currentEmployee instanceof BasePlusCommissionEmployee){
                BasePlusCommissionEmployee currentBasePlusCommissionEmployee = (BasePlusCommissionEmployee)currentEmployee;

                currentBasePlusCommissionEmployee.setBaseSalary(1.10 * currentBasePlusCommissionEmployee.getBaseSalary());

                System.out.printf("%n%s%.2f", "New base salary with 10%% increase: ", currentBasePlusCommissionEmployee.getBaseSalary());
            }
            System.out.printf("%s%.2f%n%n", "Earned: ", currentEmployee.earnings());
        }
        for (int j = 0; j< employees.length; j++)
            System.out.printf("%n%s%d%s%s", "Employee ", j, " is a ", employees[j].getClass().getName());
    }
}
