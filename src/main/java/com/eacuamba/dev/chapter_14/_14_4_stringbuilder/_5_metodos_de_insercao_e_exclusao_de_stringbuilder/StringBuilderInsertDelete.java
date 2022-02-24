package com.eacuamba.dev.chapter_14._14_4_stringbuilder._5_metodos_de_insercao_e_exclusao_de_stringbuilder;

public class StringBuilderInsertDelete {
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

        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.insert(0, objectRef);
        stringBuilder.insert(0, "  ");
        stringBuilder.insert(0, charArray);
        stringBuilder.insert(0, "  ");
        stringBuilder.insert(0, string);
        stringBuilder.insert(0, "  ");
        stringBuilder.insert(0, booleanValue);
        stringBuilder.insert(0, "  ");
        stringBuilder.insert(0, characterValue);
        stringBuilder.insert(0, "  ");
        stringBuilder.insert(0, integerValue);
        stringBuilder.insert(0, "  ");
        stringBuilder.insert(0, longValue);
        stringBuilder.insert(0, "  ");
        stringBuilder.insert(0, floatValue);
        stringBuilder.insert(0, "  ");
        stringBuilder.insert(0, doubleValue);
        stringBuilder.insert(0, "  ");

        System.out.printf("buiilder after inserts: %n%s%n", stringBuilder.toString());

        stringBuilder.delete(2, 6);
        System.out.printf("builder after delete: %n%s%n", stringBuilder.toString());

        stringBuilder.deleteCharAt(10);
        System.out.printf("builder after deleteCharAt: %n%s%n", stringBuilder.toString());

    }
}
