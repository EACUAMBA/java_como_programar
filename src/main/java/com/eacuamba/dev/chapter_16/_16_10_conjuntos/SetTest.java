package com.eacuamba.dev.chapter_16._16_10_conjuntos;

import java.util.*;

public class SetTest {
    public static void main(String[] args) {
        String[] colors = {"red", "white", "blue", "green", "gray", "orange", "tan", "white", "cyan", "peach", "gray", "orange"};
        List<String> colorList = new ArrayList<>(Arrays.asList(colors));
        System.out.printf("Lista com diplicatas: %s%n", colorList);

        printNonDuplicates(colorList);
    }

    public static void printNonDuplicates(Collection<String> list){
        HashSet<String> set = new HashSet<>(list);

        System.out.print("Lista sem duplicatas: ");

        for(String element: set){
            System.out.printf("%s, ", element);
        }
        System.out.println();
    }
}
