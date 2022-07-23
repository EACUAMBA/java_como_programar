package com.eacuamba.dev.chapter_17_lambdas_e_fluxos_java_se_8._17_3_operacoes_intstream;

import java.security.SecureRandom;
import java.util.function.IntPredicate;
import java.util.stream.IntStream;

public class IntStreamOperations {
    public static void main(String[] args) {
        int[] values = new int[20];
        for (int i = 0; i < 20; i++)
            values[i] = new SecureRandom().nextInt(20) + 1;

        System.out.print("Original Values: ");
        IntStream.of(values).forEach(value -> System.out.printf("%d ", value));
        System.out.println();

        System.out.printf("%nCount: %d%n", IntStream.of(values).count());
        System.out.printf("Min: %d%n", IntStream.of(values).min().getAsInt());
        System.out.printf("Max: %d%n", IntStream.of(values).max().getAsInt());
        System.out.printf("Sum: %d%n", IntStream.of(values).sum());
        System.out.printf("Average (Media): %.2f%n", IntStream.of(values).average().getAsDouble());

        System.out.printf("Sum via reduce method: %d%n", IntStream.of(values).reduce(0, (x, y) -> x + y));
        System.out.printf("Sum of squares via reduce method: %d%n", IntStream.of(values).reduce(0, (x, y) -> x + y * y));
        System.out.printf("Product via reduce method: %d%n", IntStream.of(values).reduce(1, (x, y) -> x * y));
        System.out.print("Even values displayed in sorted order: ");
        IntPredicate even = (value)->  value % 2 == 0;
        IntPredicate greaterThan5 = even.and(value -> value > 5);
        IntStream.of(values)
                .filter(even)
                .sorted()
                .forEach((value)-> System.out.printf("%d ", value));
        System.out.println();

        System.out.print("Odd values multiplied by 10 displayed in sorted order: ");
        IntStream.of(values)
                .filter(value -> value % 2 != 0)
                .map(value -> value * 10)
                .sorted()
                .forEach((value)-> System.out.printf("%d ", value));
        System.out.println();

        System.out.printf("Sum of integer from 1 to 9 (Exclusive): %d%n", IntStream.range(1, 9).sum());
        System.out.printf("Sum of integer from 1 to 10 (Inclusive): %d%n", IntStream.rangeClosed(1, 10).sum());



    }
}
