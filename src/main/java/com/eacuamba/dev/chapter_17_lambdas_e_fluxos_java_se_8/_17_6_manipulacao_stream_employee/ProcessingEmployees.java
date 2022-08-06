package com.eacuamba.dev.chapter_17_lambdas_e_fluxos_java_se_8._17_6_manipulacao_stream_employee;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class ProcessingEmployees {
    private static Employee[] employees;
    static {
        employees = new Employee[]{
                new Employee("Andre", "Galorte", BigDecimal.valueOf(1000), "Finanças"),
                new Employee("Iury", "Bordon", BigDecimal.valueOf(4000), "Comercio"),
                new Employee("Boavida", "Norton", BigDecimal.valueOf(2000.50), "Finanças"),
                new Employee("Klopes", "Ultron", BigDecimal.valueOf(3000.50), "CEO"),
                new Employee("Orpew", "Urpin", BigDecimal.valueOf(5000), "Comercio"),
                new Employee("Ana", "Junina", BigDecimal.valueOf(6000.40), "Suporte"),
                new Employee("Welsy", "Ertinho", BigDecimal.valueOf(7000), "Presidente"),
                new Employee("Querty", "Asdof", BigDecimal.valueOf(8999.99), "Accionista"),
        };
    }
    public static void main(String[] args) {
        List<Employee> employeeList = Arrays.asList(employees);
        Collections.shuffle(employeeList);

        System.out.println("Lista completa dos colaboradores:");
        employeeList.forEach(System.out::println);

        //Filtrando e exibindo
        Predicate<Employee> employeePredicate = (e-> e.getSalary().doubleValue() >= 4000 && e.getSalary().doubleValue() <= 6999);

        System.out.printf("%nColaborados que ganham entre 4000 e 6999 meticais:%n");
        employeeList.stream()
                .filter(employeePredicate)
                .sorted(Comparator.comparing(Employee::getSalary))
                .forEach(System.out::println);

        System.out.printf("%nPrimeiro colaborador que recebe entre 4000 e 6999:%n%s%n",  employeeList.stream()
                .filter(employeePredicate)
                .findFirst()
                .orElseThrow(()-> new RuntimeException("Colaborador não encontrado!")));

        //Comparing
        Function<Employee, String> byFirstName = Employee::getFirstName;
        Function<Employee, String> byLastName = Employee::getLastName;

        Comparator<Employee> employeeComparator = Comparator.comparing(byLastName).thenComparing(byFirstName);

        System.out.printf("%nColaboradores em ordem crescente dos apelidos depois o p/ nome:%n");
        employeeList.stream()
                .sorted(employeeComparator)
                .forEach(System.out::println);

        System.out.printf("%nColaboradores em ordem decrescente dos apelidos depois o p/ nome:%n");
        employeeList.stream()
                .sorted(employeeComparator.reversed())
                .forEach(System.out::println);


    }
}
