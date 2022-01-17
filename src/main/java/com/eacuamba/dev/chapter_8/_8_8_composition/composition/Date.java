package com.eacuamba.dev.chapter_8._8_8_composition.composition;

/*
 * Author: Edilson Alexandre Cuamba
 * Data: 5/11/2021
 */
public class Date {
    private int day;
    private int month;
    private int year;

    private static final int[] daysPerMonth= {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

    public Date(int day, int month, int year){
        if(month <= 0 || month >12){
            throw new IllegalArgumentException("Valor do mes invalido! deve estar entre [1:12]");
        }

        if(day<=0 ||
                //Verificamos se o dia é maior do que o dia do mes, ex: mes de 2 aceita dias 28 e 29 somente.
                (day > daysPerMonth[month]
                        &&
                        /**
                         * Verificamos se o mes é 2 e se o dia é 29 que é um dos aceites.
                         * se tudo for verdadeiro é falso se tudo é falaso é falso,
                         * se tudo uma coisa é falsa e falsa*
                        */
                        !(month ==2 && day == 29))){
            throw new IllegalArgumentException("Valor [" +  day + "] fora dos limites permitidos.");
        }

        if(month == 2 && day ==29 && !(year % 400 == 0 || (year % 4 ==0 && year%100 != 0))){
            throw new IllegalArgumentException("Valor [" + day + "], para dia fora dos limites permitidos.");
        }

        this.day = day;
        this.year = year;
        this.month = month;

        System.out.printf("Objecto data criado com sucesso%n%s%n", this.toString());
    }

    @Override
    public String toString(){
        return String.format("Day %d of %d of %d", this.day, this.month, this.year );
    }


}
