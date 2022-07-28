package com.eacuamba.dev.chapter_17_lambdas_e_fluxos_java_se_8._17_4_manipulacoes_stream_integer;

import java.security.SecureRandom;
import java.util.*;
import java.util.stream.Collectors;

public class ArraysAndStreams {
    public static void main(String[] args) {
        Integer[] values = new Integer[20];
        for(int i = 0; i<20; i++)
            values[i] = new SecureRandom().nextInt(15);

        System.out.printf("Original values: %s%n", Arrays.asList(values));
        System.out.printf("Sorted values: %s%n", Arrays.stream(values).sorted().collect(Collectors.toList()));

        List<Integer> greaterThanFour = Arrays.stream(values).filter(value -> value > 4).collect(Collectors.toList());
        System.out.printf("Values greater than 4: %s%n", greaterThanFour);

        System.out.printf("Sorted values greater than 4: %s%n", Arrays.stream(values).filter(integer -> integer > 4).sorted().collect(Collectors.toList()));
        System.out.printf("Values greater than 4 (ascending with streams): %s%n", greaterThanFour.stream().sorted().collect(Collectors.toList()));
    }
}
