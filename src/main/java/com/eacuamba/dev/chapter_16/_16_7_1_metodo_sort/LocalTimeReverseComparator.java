package com.eacuamba.dev.chapter_16._16_7_1_metodo_sort;

import java.time.LocalTime;
import java.util.Comparator;

public class LocalTimeReverseComparator implements Comparator<LocalTime> {
    //Esta é uma classe comparator, usada ara fazer comparações, como regra ela deve retornar inteiros,
    // -1 caso o 1st argumento seja menor que o 2nd,
    // 0 se os argumentos forem iguais e
    // 1 se o 1st argumento for maior que o 2nd.
    public int compare(LocalTime localTime1, LocalTime localTime2) {

        //Estou a inverter a subtração para ela compara usando o 2nd parametro.
        //Ela faz l2 -l1 que retorna uma valor, se for negativo significa que l1 é maior que l2 logo, tem que retornar um valor negativo para o l2 estar entes desse valor.
        int hourDifference = localTime2.getHour() - localTime1.getHour();
        if (hourDifference != 0)
            return hourDifference;

        int minuteDifference = localTime2.getMinute() - localTime1.getMinute();
        if (minuteDifference != 0)
            return minuteDifference;

        return localTime2.getSecond() - localTime1.getSecond();
    }
}
