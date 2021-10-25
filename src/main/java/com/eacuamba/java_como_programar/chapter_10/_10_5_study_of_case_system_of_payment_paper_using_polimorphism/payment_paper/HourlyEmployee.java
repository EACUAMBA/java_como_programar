package com.eacuamba.java_como_programar.chapter_10._10_5_study_of_case_system_of_payment_paper_using_polimorphism.payment_paper;

public class HourlyEmployee extends Employee{
    private double wage;
    private double hours;

    public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber, double wage, double hours){
        super(firstName, lastName, socialSecurityNumber);
        if(wage < 0.0)
            throw new IllegalArgumentException("O valor do salário por hora deverá ser maior ou igual a zero (0).");

        if(hours < 0.0 || hours>168.0)
            throw new IllegalArgumentException("O valor das horas trabalhadas deverá ser maior que zer (0) e menor  que cento e sessenta e oito (168.0).");

        this.hours = hours;
        this.wage = wage;
    }

    public void setWage(double wage){
        if(wage < 0.0)
            throw new IllegalArgumentException("O valor do salário por hora deverá ser maior ou igual a zero (0).");
        this.wage = wage;
    }
    public double getWage(){
        return this.wage;
    }

    public void setHours(double hours){
        if(hours < 0.0 || hours>168.0)
            throw new IllegalArgumentException("O valor das horas trabalhadas deverá ser maior que zer (0) e menor  que cento e sessenta e oito (168.0).");
        this.hours = hours;
    }
    public double getHours(){
        return this.hours;
    }

    @Override
    public double earnings(){
        double salary = 0.0;
        if(this.hours<=40)
            salary = this.hours * this.wage;
        else if(this.hours > 40)
            salary = 40 * this.wage + (this.hours - 40) * this.wage * 1.5;
        return salary;
    }

    @Override
    public String toString(){
        return String.format("%s%n%s%n%s%.2f%n%s%.2f","Hourly Employee:", super.toString(), "Hours:", this.hours, "Wage:", this.wage);
    }
}
