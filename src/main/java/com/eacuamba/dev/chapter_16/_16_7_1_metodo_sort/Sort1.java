package com.eacuamba.dev.chapter_16._16_7_1_metodo_sort;

import java.util.*;

public class Sort1 {
    public static void main(String[] args) {
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Sspades"};

        List<String> list = Arrays.asList(suits);
        System.out.printf("Lista (list) não ordenada: %s%n", list);
        System.out.printf("Lista (suits) não ordenada: %s%n", Arrays.toString(suits));


        Collections.sort(list);
        System.out.printf("Lista (list) ordenada: %s%n", list);
        System.out.printf("Lista (suits) ordenada: %s%n", Arrays.toString(suits));
    }
}
