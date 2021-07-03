package chapter_10._10_5_study_of_case_system_of_payment_paper_using_polimorphism.payment_paper;

public class BasePlusCommissionEmployee extends CommissionEmployee {
    private double baseSalary;

    public BasePlusCommissionEmployee(String firstName, String lastName, String socialSecurityNumber,double commisionRate, double grossSales ,double baseSalary){
        super(firstName, lastName, socialSecurityNumber, commisionRate, grossSales);
        if(baseSalary<0)
            throw new IllegalArgumentException("O valor do salario base deverá ser maior que zero (0) ou igual a zero (0).");
        this.baseSalary = baseSalary;
    }

    public void setBaseSalary(double baseSalary){
        if(baseSalary<0)
            throw new IllegalArgumentException("O valor do salario base deverá ser maior que zero (0) ou igual a zero (0).");
        this.baseSalary = baseSalary;
    }

    public double getBaseSalary(){
        return this.baseSalary;
    }

    @Override
    public double earnings(){
        return super.earnings() + baseSalary;
    }

    @Override
    public String toString(){
        return String.format("%s%n%s%n%s%.2f", "Base Plus Commissioned Employee:", super.toString(), "Base Salary:", this.baseSalary);
    }
}
