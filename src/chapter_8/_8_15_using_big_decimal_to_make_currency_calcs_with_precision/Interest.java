package chapter_8._8_15_using_big_decimal_to_make_currency_calcs_with_precision;

import java.math.*;
import java.text.NumberFormat;
import java.util.Locale;

/*
 * Author: Edilson Alexandre Cuamba
 * Data: 5/12/2021
 */
public class Interest {
    public static void main(String[] args) {
        //Quantidades iniciais antes de qualquer juro.
        BigDecimal valorPrincipal = BigDecimal.valueOf(1000.0);
        BigDecimal taxaDeJuro = BigDecimal.valueOf(0.05);

        System.out.printf("%10s %20s %n", "YEAR", "AMOUNT on deposit");
        for(int year =1; year<=10 ; year++){
            //Transformando a taxa em um valor como 1.05
            BigDecimal taxaDeJuroSomadoCom1 = taxaDeJuro.add(BigDecimal.ONE);
            System.out.printf("Valor apos adicionar 1: %.10f%n" ,taxaDeJuroSomadoCom1.doubleValue());

            //Elevando a taxa de juros a cada ano, 1.5^1, 1.5^2, 1.5^3, 1.5^4 assim sucessivamente.
            BigDecimal taxaDeJuroElevadoAoAno = taxaDeJuroSomadoCom1.pow(year);
            System.out.printf("Valor apos elever ao ano " + year + ": %5.10f%n", taxaDeJuroElevadoAoAno.doubleValue());

            BigDecimal amount = valorPrincipal.multiply(taxaDeJuroElevadoAoAno);
           System.out.printf("Valor do amout apos multiplicar taxaPrincipal(%.10f) por taxa de juro(%.2f) que sobe a cada ano resulou em: %.2f%n", taxaDeJuroElevadoAoAno.doubleValue(), valorPrincipal.doubleValue(), amount.doubleValue());

            System.out.printf("%4d%20s%n", year, NumberFormat.getCurrencyInstance(new Locale("PT", "MZ")).format(amount));

            System.out.printf("%n%n%s%n%s%n%s%n", BigDecimal.valueOf(3.985).setScale(3),
                    BigDecimal.valueOf(3.985).setScale(2, RoundingMode.CEILING),
                    BigDecimal.valueOf(3.985).setScale(2, 3));
        }
    }
}
