package com.eacuamba.dev.chapter_17_lambdas_e_fluxos_java_se_8._17_8_gerando_fluxos_de_valores_aleatorios;

import java.security.SecureRandom;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;
import java.util.stream.Collectors;

public class RandomIntStream {
    public static void main(String[] args) {
        SecureRandom secureRandom = new SecureRandom();
        long currentTimeMillis = System.currentTimeMillis();
        System.out.println("currentTimeMillis " + TimeUnit.MILLISECONDS.toSeconds(currentTimeMillis));
        System.out.printf("%-6s%s%n", "Face", "Frequency");
        secureRandom.ints(6_000_000, 1, 7)
                .boxed()
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .forEach((face, frequency)-> System.out.printf("%-6d%d%n", face, frequency));

        long currentTimeMillis2 = System.currentTimeMillis();
        System.out.println("currentTimeMillis " + TimeUnit.MILLISECONDS.toSeconds(currentTimeMillis2));
        System.out.println("Took: " + TimeUnit.MILLISECONDS.toSeconds((currentTimeMillis2 - currentTimeMillis)));

    }
}
