package com.eacuamba.dev.chapter_18_recursao._18_3_exemplo_que_utiliza_recursao_factoriais;

import java.util.concurrent.TimeUnit;

public class FactorialCalculator {
  public static void main(String[] args) {
    Long factorialAlvo = 21L;
    Long currentTimeMillis = System.currentTimeMillis();
    System.out.println(compareMillis(currentTimeMillis, System.currentTimeMillis()));
    System.out.println("Factorial com recursividade");
    for (Long contador = 0L; contador <= factorialAlvo; contador++)
      System.out.printf("%d! = %d%n", contador, factorial(contador));
    System.out.println(compareMillis(currentTimeMillis, System.currentTimeMillis()));
    currentTimeMillis = System.currentTimeMillis();
    for (Long contador = 0L; contador <= factorialAlvo; contador++)
      System.out.printf("%d! = %d%n", contador, factorialComFor(contador));
    System.out.println(compareMillis(currentTimeMillis, System.currentTimeMillis()));
  }

  public static Long factorial(Long valor) {
    if (valor <= 1)
      return 1L;
    else
      return valor * factorial(valor - 1);
  }

  public static Long factorialComFor(Long valor) {
    Long resultado = 1L;
    for (Long contador = valor; contador >= 1; contador--)
      resultado *= contador;
    return resultado;
  }

  public static String compareMillis(Long firstTimeMillis, Long secondTimeMillis) {
    Long diffTimeMillis = (secondTimeMillis - firstTimeMillis);
    return diffTimeMillis + " ms";
  }
}
