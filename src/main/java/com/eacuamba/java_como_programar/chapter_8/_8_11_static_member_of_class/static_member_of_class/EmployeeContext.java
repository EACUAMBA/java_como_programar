package com.eacuamba.java_como_programar.chapter_8._8_11_static_member_of_class.static_member_of_class;

/*
 * Author: Edilson Alexandre Cuamba
 * Data: 5/12/2021
 */
public class EmployeeContext {
    public static void main(String[] args) {

        System.out.printf("%nAccessing the static count variable without creating object. count = %d%n", Employee.getCount());
        Employee employee = new Employee("Edilson", "Cuamba");
        Employee employee1 = new Employee("Edilson1", "Cuamba1");
        Employee employee2 = new Employee("Edilson2", "Cuamba");
        Employee employee3 = new Employee("Edilson3", "Cuamba");
        Employee employee4 = new Employee("Edilson4", "Cuamba");
        Employee employee5 = new Employee("Edilson5", "Cuamba");
        Employee employee6 = new Employee("Edilson6", "Cuamba");
        Employee employee7 = new Employee("Edilson7", "Cuamba");
        Employee employee8 = new Employee("Edilson8", "Cuamba");
        Employee employee9 = new Employee("Edilson9", "Cuamba");
        Employee employee10 = new Employee("Edilson10", "Cuamba");

        System.out.println(Employee.getCount());
    }
}
