package com.eacuamba.dev.chapter_16._16_6_2_linked_list;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListTest {
    public static void main(String[] args) {
        String[] colors = {"balck", "yellow", "green", "blue", "violet", "silver"};
        List<String> list1 = new LinkedList<>();

        for(String color: colors)
            list1.add(color);

        String[] colors2 = {"gold ", "white", "brown", "blue", "gray", "silver"};
        List<String> list2 = new LinkedList<>();

        for(String color: colors2)
            list2.add(color);

        list1.addAll(list2);
        list2 = null; //Libera recursos, o GC vai limpar os dados que estão na memoria que está var apontava.
        printList(list1);

        converteParaCaixaAltaStrings(list1);
        printList(list1);

        System.out.printf("%nDeleting elements from 4 to 6...");
        removeItems(list1, 4, 7);
        printList(list1);
        printReversedList(list1);
    }

    public static void printList(List<String> list){
        System.out.printf("%nlist:%n");

        for(String item: list)
            System.out.printf("%s ", item);
        System.out.println();
    }

    private static void converteParaCaixaAltaStrings(List<String> list){
        ListIterator<String> iterator = list.listIterator();

        while (iterator.hasNext()){
            String color = iterator.next();
            iterator.set(color.toUpperCase());
        }
    }

    private static void removeItems(List<String> list, int from, int to){
        list.subList(from, to).clear();
    }

    private static void printReversedList(List<String> list){
        ListIterator<String> iterator = list.listIterator(list.size());
        System.out.printf("%nReversed List:%n");

        while (iterator.hasPrevious())
            System.out.printf("%s ", iterator.previous());

    }
}
