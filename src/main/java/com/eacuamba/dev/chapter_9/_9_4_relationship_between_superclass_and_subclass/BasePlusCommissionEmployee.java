package com.eacuamba.dev.chapter_9._9_4_relationship_between_superclass_and_subclass;

/*
 * Author: Edilson Alexandre Cuamba
 * Data: 5/29/2021
 */
public class BasePlusCommissionEmployee extends CommissionEmployee {
    private double baseSalary;

    public BasePlusCommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales, double commissionRate, double baseSalary) {
        super(firstName, lastName, socialSecurityNumber, grossSales, commissionRate);
        this.setBaseSalary(baseSalary);
    }

    public double getBaseSalary(){
        return this.baseSalary;
    }
    public void setBaseSalary(double baseSalary){
        if(baseSalary < 0.0)
            throw new IllegalArgumentException("Base salary must be >= 0.0");
        this.baseSalary = baseSalary;
    }

    public double earnings() {
        return this.getBaseSalary() + super.earnings();
    }

    @Override
    public String toString() {
        return String.format("%n%s:%n%s%n%30s:%.2f","Base Salaried Commission Employee", super.toString(), "base salary", this.getBaseSalary());
    }
}
