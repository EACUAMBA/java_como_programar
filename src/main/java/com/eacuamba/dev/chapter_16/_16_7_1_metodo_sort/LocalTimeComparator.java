package com.eacuamba.dev.chapter_16._16_7_1_metodo_sort;

import java.time.LocalTime;
import java.util.Comparator;

public class LocalTimeComparator implements Comparator<LocalTime> {
    //Esta é uma classe comparator, usada ara fazer comparações, como regra ela deve retornar inteiros,
    // -1 caso o 1st argumento seja menor que o 2nd,
    // 0 se os argumentos forem iguais e
    // 1 se o 1st argumento for maior que o 2nd.
    public int compare(LocalTime localTime1, LocalTime localTime2) {
        int hourDifference = localTime1.getHour() - localTime2.getHour();
        if (hourDifference != 0)
            return hourDifference;

        int minuteDifference = localTime1.getMinute() - localTime2.getMinute();
        if (minuteDifference != 0)
            return minuteDifference;

        return localTime1.getSecond() - localTime2.getSecond();
    }
}
