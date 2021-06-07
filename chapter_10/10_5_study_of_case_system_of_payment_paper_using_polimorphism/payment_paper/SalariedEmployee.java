package payment_paper;

public class SalariedEmployee extends Employee {
    private double weeklySalary;
    public SalariedEmployee(String firstName, String lastName, String socialSecurityNumber, double weeklySalary){
        super(firstName, lastName, socialSecurityNumber);
        if(weeklySalary < 0.0)
            throw new IllegalArgumentException("O valor do salário semanal deverá ser um número maior que zero (0).");
        this.weeklySalary = weeklySalary;
    }

    public void setWeeklySalary(double weeklySalary){
        if(weeklySalary < 0.0)
            throw new IllegalArgumentException("O valor do salário semanal deverá ser um número maior que zero (0).");
        this.weeklySalary = weeklySalary;
    }
    public double getWeeklySalary(){
        return this.weeklySalary;
    }

    @Override
    public double earnings(){
        return this.getWeeklySalary();
    }

    @Override
    public String toString(){
        return String.format("%s%n%s%n%s %s", "Salaried Employee:", super.toString(), "Weekly Salary:", this.getWeeklySalary());
    }
}