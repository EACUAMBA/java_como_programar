package com.eacuamba.dev.chapter_16._16_7_1_metodo_sort;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Sort2 {
    public static void main(String[] args) {
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};

        List<String> list = Arrays.asList(suits);
        System.out.printf("Lista (list) não ordenada: %s%n", list);
        System.out.printf("Lista (suits) não ordenada: %s%n", Arrays.toString(suits));

        Collections.sort(list, Collections.reverseOrder());
        System.out.printf("Lista (list) ordenada: %s%n", list);
        System.out.printf("Lista (suits) ordenada: %s%n", Arrays.toString(suits));

    }
}
