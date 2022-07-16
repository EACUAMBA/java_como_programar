package com.eacuamba.dev.chapter_16._16_10_conjuntos;

import java.util.Arrays;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetTest {
    public static void main(String[] args) {
        String[] colors = {"yellow", "green", "black", "tan", "grey", "white", "orange", "red", "green"};
        SortedSet<String> colorSortedSet = new TreeSet<>(Arrays.asList(colors));
        printSet(colorSortedSet, "SortedSet");

        //Obtem um subconjunto onde todos os dados são inferiores que o dado passado como argumento, neste caso pegamos uma lista do priemrio até o orange (exclusivo).
        printSet(colorSortedSet.headSet("orande"), "HeadSet (Orange)");

        //Obtem um subconjunto onde todos os dados são superiores que o dado passado como argumento, neste caso pegamos uma lista do argumento (inclusivo) até o o último argumento .
        printSet(colorSortedSet.tailSet("orande"), "TailSet (Orange)");

        System.out.printf("First: %s%n", colorSortedSet.first());
        System.out.printf("Last: %s%n", colorSortedSet.last());



    }

    public static void printSet(SortedSet<String> set, String title){
        System.out.print(title + ": ");
        for(String element : set){
            System.out.printf("%s, ", element);
        }
        System.out.println();
    }
}
