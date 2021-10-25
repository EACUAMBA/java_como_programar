package com.eacuamba.java_como_programar.chapter_8._8_8_composition.composition;

/*
 * Author: Edilson Alexandre Cuamba
 * Data: 5/11/2021
 */
public class Employee {
    private String firstName, lastName;
    private Date birthDate;
    private Date hireDate;


    public Employee(String firstName, String lastName, Date hireDate, Date birthDate){
        this.firstName = firstName;
        this.lastName = lastName;
        this.hireDate = hireDate;
        this.birthDate = birthDate;
    }

    @Override
    public String toString(){
        return String.format("%n%s, %s Contratado em: %s, e nasceu no dia %s",this.lastName, this.firstName, this.hireDate, this.birthDate );
    }
}
