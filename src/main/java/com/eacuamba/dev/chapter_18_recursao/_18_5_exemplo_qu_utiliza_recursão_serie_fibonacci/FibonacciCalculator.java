package com.eacuamba.dev.chapter_18_recursao._18_5_exemplo_qu_utiliza_recursão_serie_fibonacci;

import java.math.BigInteger;

import static java.math.BigInteger.ONE;
import static java.math.BigInteger.ZERO;

public class FibonacciCalculator {
    private static final BigInteger TWO = BigInteger.valueOf(2L);

    private static BigInteger fibonacci(BigInteger number){
        if(number.equals(ZERO) || number.equals(ONE)){
            return number;
        }else{
            return fibonacci(number.subtract(ONE)).add(fibonacci(number.subtract(TWO)));
        }
    }

    public static void main(String[] args) {
        for(int i =0; i <= 50; i++){
            System.out.printf(
                    "Fibonacci of %d is %d%n",
                    i,
                    fibonacci(BigInteger.valueOf(i))
            );
        }
    }
}
