package com.eacuamba.dev.chapter_17_lambdas_e_fluxos_java_se_8._17_6_manipulacao_stream_employee;

import java.math.BigDecimal;
import java.math.MathContext;

public class Employee {
    private String firstName;
    private String lastName;
    private BigDecimal salary;
    private String department;

    public Employee(String firstName, String lastName, BigDecimal salary, String department){
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.department = department;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getName(){
        return String.format("%s %s", this.firstName, this.lastName);
    }

    @Override
    public String toString(){
        return String.format("%-8s %-8s %8.2f   %s", this.getFirstName(), this.getLastName(), this.getSalary(), this.getDepartment());
    }
}
