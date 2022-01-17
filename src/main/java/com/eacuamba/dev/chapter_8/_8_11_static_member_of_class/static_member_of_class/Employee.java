package com.eacuamba.dev.chapter_8._8_11_static_member_of_class.static_member_of_class;

/*
 * Author: Edilson Alexandre Cuamba
 * Data: 5/12/2021
 */
public class Employee {
    private static int count;
    private String firstName;
    private String lastName;

    public Employee(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;

        ++count;

        System.out.printf("%n%nThe employee %s, %s was successful created, you've created %d objects of class Employee.%n%n", this.lastName, this.firstName, count);
    }

    public String getFirstName(){
        return this.firstName;
    }

    public String getLastName(){
        return this.lastName;
    }

//    I can access only through object method, if we don't create a object it will not be accessible.
//    public int getCount() {
//        return count;
//    }
//
//    We can access usin the class name we don't need object.
    public static int getCount() {
        return count;
    }
}
