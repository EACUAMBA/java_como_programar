package com.eacuamba.dev.chapter_18_recursao._18_4_reimplementando_a_classe_factorialcalculator_usando_a_classe_biginteger;

import java.math.BigInteger;

public class FactorialCalculator {
  public static void main(String[] args) {
    Long factorialAlvo = 200L;
    Long currentTimeMillis = System.currentTimeMillis();
    System.out.println(compareMillis(currentTimeMillis, System.currentTimeMillis()));
    System.out.println("Factorial com recursividade e a classe BigInteger");
    for (Long contador = 0L; contador <= factorialAlvo; contador++)
      System.out.printf("%d! = %d%n", contador, factorial(BigInteger.valueOf(contador)));
    System.out.println(compareMillis(currentTimeMillis, System.currentTimeMillis()));
  }

  public static BigInteger factorial(BigInteger alvo) {
    if (alvo.compareTo(BigInteger.ONE) < 1)
      return BigInteger.ONE;
    else
      return alvo.multiply(factorial(alvo.subtract(BigInteger.ONE)));
  }

  public static String compareMillis(Long firstTimeMillis, Long secondTimeMillis) {
    Long diffTimeMillis = (secondTimeMillis - firstTimeMillis);
    return diffTimeMillis + " ms";
  }
}
