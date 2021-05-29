public class CommissionEmployee extends Object {
    private final String firstName;
    private final String lastName;
    private final String socialSecurityNumber;
    private double grossSales;
    private double commissionRate;

    public CommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales, double commissionRate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
        this.setGrossSales(grossSales);
        this.setCommissionRate(commissionRate);
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getSocialSecurityNumber() {
        return this.socialSecurityNumber;
    }


    public double getGrossSales() {
        return this.grossSales;
    }

    public void setGrossSales(double grossSales) {
        if (grossSales < 0.0)
            throw new IllegalArgumentException("The value should be more than 0.0 or equally to 0.0.");
        this.grossSales = grossSales;
    }

    public double getCommissionRate() {
        return this.commissionRate;
    }

    public void setCommissionRate(double commissionRate) {
        if (commissionRate < 0.0 || commissionRate > 1.0)
            throw new IllegalArgumentException("The percentage value should be between 0.0 and 1.0.");
        this.commissionRate = commissionRate;
    }

    public double earnings() {
        return this.commissionRate * this.grossSales;
    }

    @Override
    public String toString() {
        return String.format("%n%30s:%s%n%30s:%s%n%30s:%.2f%n%30s:%.2f", "Nome", this.firstName + " " + this.lastName, "Numero de Seguranca Social", this.socialSecurityNumber, "Vendas Brutas Semanais", this.grossSales, "Percentagem da Comissao", this.commissionRate);
    }
}