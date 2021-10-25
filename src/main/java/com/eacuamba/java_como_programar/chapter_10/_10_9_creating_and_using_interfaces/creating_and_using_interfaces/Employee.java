package com.eacuamba.java_como_programar.chapter_10._10_9_creating_and_using_interfaces.creating_and_using_interfaces;


public abstract class Employee implements Payable {
    private final String firstName;
    private final String lastName;
    private final String socialSecurityNumber;

    public Employee(String firstName, String lastName, String socialSecurityNumber){
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public String getFirstName(){
        return this.firstName;
    }
    public String getLastName(){
        return this.lastName;
    }
    public String getSocialSecurityNumber(){
        return this.socialSecurityNumber;
    }

    @Override
    public String toString(){
        return String.format("%s %s %s%n%s %s","Nome:", this.getFirstName(), this.getLastName(), "Social Security Number:", this.getSocialSecurityNumber());
    }
}
