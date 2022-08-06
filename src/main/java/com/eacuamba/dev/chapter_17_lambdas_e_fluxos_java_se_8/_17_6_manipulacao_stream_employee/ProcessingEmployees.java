package com.eacuamba.dev.chapter_17_lambdas_e_fluxos_java_se_8._17_6_manipulacao_stream_employee;

import java.math.BigDecimal;
import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ProcessingEmployees {
    private static Employee[] employees;

    static {
        employees = new Employee[]{
                new Employee("Andre", "Junina", BigDecimal.valueOf(1040), "Finanças"),
                new Employee("Iury", "Bordon", BigDecimal.valueOf(4100), "Comercio"),
                new Employee("Boavida", "Junina", BigDecimal.valueOf(2400.50), "Finanças"),
                new Employee("Klopes", "Ultron", BigDecimal.valueOf(3300.50), "CEO"),
                new Employee("Orpew", "Urpin", BigDecimal.valueOf(5800), "Comercio"),
                new Employee("Ana", "Junina", BigDecimal.valueOf(6004.40), "Suporte"),
                new Employee("Welsy", "Ertinho", BigDecimal.valueOf(7000), "Finanças"),
                new Employee("Querty", "Asdof", BigDecimal.valueOf(8999.99), "CTO"),
        };
    }

    public static void main(String[] args) {
        List<Employee> employeeList = Arrays.asList(employees);
        Collections.shuffle(employeeList);

        System.out.println("Lista completa dos colaboradores:");
        employeeList.forEach(System.out::println);

        //Filtrando e exibindo
        Predicate<Employee> employeePredicate = (e -> e.getSalary().doubleValue() >= 4000 && e.getSalary().doubleValue() <= 6999);

        System.out.printf("%nColaborados que ganham entre 4000 e 6999 meticais:%n");
        employeeList.stream()
                .filter(employeePredicate)
                .sorted(Comparator.comparing(Employee::getSalary))
                .forEach(System.out::println);

        System.out.printf("%nPrimeiro colaborador que recebe entre 4000 e 6999:%n%s%n", employeeList.stream()
                .filter(employeePredicate)
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Colaborador não encontrado!")));

        //Comparing
        Function<Employee, String> byFirstName = Employee::getFirstName;//Recebe um objecto employee e retorna uma String.
        Function<Employee, String> byLastName = Employee::getLastName;

        //Recebe uma function que sabe estrair e cria um comparator com isso.
        Comparator<Employee> employeeComparator = Comparator.comparing(byLastName).thenComparing(byFirstName);

        System.out.printf("%nColaboradores em ordem crescente dos apelidos depois o p/ nome:%n");
        employeeList.stream()
                .sorted(employeeComparator)
                .forEach(System.out::println);

        System.out.printf("%nColaboradores em ordem decrescente dos apelidos depois o p/ nome:%n");
        employeeList.stream()
                .sorted(employeeComparator.reversed())
                .forEach(System.out::println);

        //Processing last names
        System.out.printf("%nApelidos únicos:%n");
        employeeList.stream()
                .map(new Function<Employee, String>() {
                    @Override
                    public String apply(Employee employee) {
                        return employee.getLastName();
                    }
                })
                .distinct()
                .forEach(System.out::println);

        System.out.printf("%nApelidos únicos em ordem alfabetica:%n");
        employeeList.stream()
                .sorted(employeeComparator)
                .map(Employee::getLastName)
                .distinct()
                .forEach(System.out::println);

        //Grouping data
        System.out.printf("%nColaboradores por departamento:%n");
        Map<String, List<Employee>> employeeDPGroups = employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment));

        //Usando um biConsumir recebe um k de key e um v value, com o v podemos realizar mais actividades.
        employeeDPGroups.forEach((key, value) -> {
            System.out.println(key);
            value.forEach(System.out::println);
            System.out.println("---");
        });

        //Grouping data and counting
        System.out.printf("%nContando colaboradores pode departamento:%n");
        Map<String, Long> employeesDPCounting = employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
        employeesDPCounting.forEach((s, aLong) -> {
            System.out.println(s);
            System.out.printf("Temos %d colaboradores.%n", aLong);
        });

        //Medias e totais
        System.out.printf("%nSomatorio dos salarios dos colaboradores usando SUM(): %.2f%n", employeeList.stream()
                .map(Employee::getSalary)
                .mapToDouble(BigDecimal::doubleValue)
                .sum());

        System.out.printf("%nSomatorio dos salarios dos colaboradores usando reduce(): %.2f%n", employeeList.stream()
                .map(Employee::getSalary)
                .mapToDouble(BigDecimal::doubleValue)
                .reduce(0, Double::sum));

        System.out.printf("%nMedia dos salarios dos colaboradores usando average(): %.2f%n", employeeList.stream()
                .map(Employee::getSalary)
                .mapToDouble(BigDecimal::doubleValue)
                .average().orElseThrow(() -> new RuntimeException("Resultado invalido!")));

    }
}
