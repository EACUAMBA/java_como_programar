package com.eacuamba.dev.chapter_16._16_7_1_metodo_sort;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Sort3 {
    public static void main(String[] args) {
        List<LocalTime> localTimeList = new ArrayList<>();

        localTimeList.add(LocalTime.of(6, 27, 45));
        localTimeList.add(LocalTime.of(5, 35, 25));
        localTimeList.add(LocalTime.of(3, 10, 35));
        localTimeList.add(LocalTime.of(5, 40, 45));
        localTimeList.add(LocalTime.of(8, 50, 15));
        localTimeList.add(LocalTime.of(9, 38, 35));
        localTimeList.add(LocalTime.of(4, 50, 25));
        localTimeList.add(LocalTime.of(4, 30, 45));

        System.out.printf("Lista (localTimeList) não ordenada:%n");
        localTimeList.forEach(System.out::println);
        System.out.println();


        Collections.sort(localTimeList, new LocalTimeComparator());
        System.out.printf("Lista (list) ordenada:%n");
        localTimeList.forEach(System.out::println);
        System.out.println();
    }
}
