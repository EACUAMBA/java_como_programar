package com.eacuamba.dev.chapter_14._14_4_stringbuilder._4_metodo_stringbuilder_append;

public class StringBuilderAppend {
    public static void main(String[] args) {
        Object objectRef = "Ediilson";
        String string = "Cuamba";
        char[] charArray = {'A', 'l', 'e', 'x', 'a', 'n', 'd',  'r', 'e'};
        boolean booleanValue = true;
        char characterValue = 'A';
        int integerValue = 1;
        long longValue = 2;
        float floatValue = 2.5F;
        double doubleValue = 3.5;

        StringBuilder lastBuilder = new StringBuilder("last Builder");
        StringBuilder builder = new StringBuilder();

        builder.append(objectRef)
                .append("%n")
                .append(charArray)
                .append("%n")
                .append(string)
                .append("%n")
                .append(booleanValue)
                .append("%n")
                .append(characterValue)
                .append("%n")
                .append(integerValue)
                .append("%n")
                .append(longValue)
                .append("%n")
                .append(floatValue)
                .append("%n")
                .append(doubleValue)
                .append(lastBuilder);

        System.out.printf(builder.toString());



    }
}
