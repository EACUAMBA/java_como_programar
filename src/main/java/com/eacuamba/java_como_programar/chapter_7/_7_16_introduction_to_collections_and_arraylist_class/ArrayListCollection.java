package com.eacuamba.java_como_programar.chapter_7._7_16_introduction_to_collections_and_arraylist_class;

import java.util.ArrayList;

public class ArrayListCollection {
    public static void main (String... args){

        ArrayList<String> colorsName = new ArrayList<>();
        colorsName.add("BLACK");
        colorsName.add(0, "WHITE");

        System.out.printf("***** %s *****%n", "PRINTING USING FOR() WITH COUNTER");
        System.out.printf("%6s-> %-6s%n", "INDEX", "VALUE");
        for (int i=0; i < colorsName.size(); i++)
            System.out.printf("%6s-> %-2s%n", i, colorsName.get(i));

        colorsName.add("GRAY");
        colorsName.add("BLACK");
        outputArrayList(colorsName, "PRINTING USING ENHANCED FOR");

        colorsName.remove("BLACK");
        outputArrayList(colorsName, "REMOVING THE FIRST \"BLACK\" OCCURS, FIRST INSTANCE");

        colorsName.remove(1);
        outputArrayList(colorsName, "REMOVER THE COLOR IN INDEX \"1\", SECOND ELEMENT (GRAY)");

        System.out.printf("%n***** %s %d *****%n", "THE SIZE IS ", colorsName.size());

    }

    public static void outputArrayList(ArrayList<String> arrayList, String message){
        System.out.printf("%n***** %s *****%n", message);
        System.out.printf("%6s-> %-6s%n", "INDEX", "VALUE");
        int index = 0;
        for (String value: arrayList)
            System.out.printf("%6d-> %-6s%n", index++, value);

        System.out.printf("****** %s *****%n", "IMPRESSÃƒO CONCLUÃ�DA");
    }
}
