package payment_paper;

public class CommissionEmployee extends Employee {
    private double commissionRate;
    private double grossSales;

    public CommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double commissionRate, double grossSales){
        super(firstName, lastName, socialSecurityNumber);
        if(grossSales<0.0)
            throw new IllegalArgumentException("O valor das vendas deverá ser maior que 0.0 ou igual a 0.");
        this.grossSales = grossSales;
        this.commissionRate = setCommissionRateValidate(commissionRate);
    }

    static double setCommissionRateValidate(double commissionRate){
        if(commissionRate<0.0 || commissionRate>1.0)
            throw new IllegalArgumentException("O valor da percentagem que ganha deverá ser maior que 0.0 e menor que 1.0 (ex: 0.5 = 50%).");
        return commissionRate;
    }

    public void setCommissionRate(double commissionRate){
        this.commissionRate = setCommissionRateValidate(commissionRate);
    }

    public void setGrossSales(double grossSales){
        if(grossSales<0.0)
            throw new IllegalArgumentException("O valor das vendas deverá ser maior que 0.0 ou igual a 0.");
        this.grossSales = grossSales;
    }

    public double getCommissionRate(){
        return this.commissionRate;
    }
    public double getGrossSales(){
        return this.grossSales;
    }

    @Override
    public double earnings(){
        return this.commissionRate * this.grossSales;
    }

    @Override
    public String toString(){
        return String.format("%s%n%s%n%s%.2f%n%s%.2f","Commissioned Employee",super.toString(),"Commission Rate:", this.commissionRate, "Gross Sales:",  this.grossSales);
    }
}
