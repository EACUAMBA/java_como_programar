package com.eacuamba.dev.chapter_18_recursao._18_7_reversao_versus_iteracao;

import java.math.BigInteger;

import static java.math.BigInteger.ONE;

public class FactorialCalculator {

    public static BigInteger factorial(BigInteger number) {
        BigInteger result = ONE;

        BigInteger i = number;
        for (
                ;
                i.compareTo(ONE) > 0;
                i = i.subtract(ONE)

        ) {
            result = result.multiply(i);
        }

        return result;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 200; i++) {
            System.out.printf(
                    "Factorial of %d is %d;%n",
                    i,
                    factorial(BigInteger.valueOf(i))
            );
        }
    }
}
