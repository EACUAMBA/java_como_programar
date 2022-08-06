package com.eacuamba.dev.chapter_17_lambdas_e_fluxos_java_se_8._17_6_manipulacao_stream_employee;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

public class ProcessingEmployees {
    private static Employee[] employees;
    static {
        employees = new Employee[]{
                new Employee("Andre", "Galorte", BigDecimal.valueOf(1000), "Finanças"),
                new Employee("Boavida", "Norton", BigDecimal.valueOf(2000.50), "Finanças"),
                new Employee("Klopes", "Ultron", BigDecimal.valueOf(3000.50), "CEO"),
                new Employee("Iury", "Bordon", BigDecimal.valueOf(4000), "Comercio"),
                new Employee("Orpew", "Urpin", BigDecimal.valueOf(5000), "Comercio"),
                new Employee("Ana", "Junina", BigDecimal.valueOf(6000.40), "Suporte"),
                new Employee("Welsy", "Ertinho", BigDecimal.valueOf(7000), "Presidente"),
                new Employee("Querty", "Asdof", BigDecimal.valueOf(8999.99), "Accionista"),
        };
    }
    public static void main(String[] args) {
        List<Employee> employeeList = Arrays.asList(employees);

        System.out.println("Lista completa dos colaboradores:");
        employeeList.forEach(System.out::println);

        //
    }
}
