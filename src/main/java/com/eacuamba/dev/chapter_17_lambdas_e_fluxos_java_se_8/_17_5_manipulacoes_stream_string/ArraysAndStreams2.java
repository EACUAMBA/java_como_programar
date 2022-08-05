package com.eacuamba.dev.chapter_17_lambdas_e_fluxos_java_se_8._17_5_manipulacoes_stream_string;

import java.awt.*;
import java.util.Arrays;
import java.util.stream.Collectors;

public class ArraysAndStreams2 {
    public static void main(String[] args) {
        String[] strings = {"Vermelho", "laranga", "Amarelo", "verde", "azul", "azul-indigo", "Violeta"};

        System.out.printf("Valores originais: %s%n", Arrays.asList(strings));

        System.out.printf("strings in uppercase: %s%n", Arrays.stream(strings).map(String::toUpperCase).collect(Collectors.toList()));

        System.out.printf("Cores maiores que m sao ordenadas de forma crescente: %s%n", Arrays.stream(strings).filter(s -> s.compareToIgnoreCase("n") < 0).sorted(String.CASE_INSENSITIVE_ORDER).collect(Collectors.toList()));

        System.out.printf("Cores maiores que m organizadas de forma decrescente: %s%n", Arrays.stream(strings).filter(s -> s.compareToIgnoreCase("n") < 0).sorted(String.CASE_INSENSITIVE_ORDER.reversed()).collect(Collectors.toList()));
    }
}
