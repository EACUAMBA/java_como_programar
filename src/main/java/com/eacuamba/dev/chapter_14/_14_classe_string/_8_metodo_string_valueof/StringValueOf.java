package com.eacuamba.dev.chapter_14._14_classe_string._8_metodo_string_valueof;

public class StringValueOf {
    public static void main(String[] args) {
        char[] charArray = {'E', 'd', 'i', 'l', 's', 'o', 'n'};
        boolean booleanValue = true;
        char charValue = 'E';
        int integerValue = 23;
        long longValue = 230000000001L;
        float floatValue = 23.2F;
        double doubleValue = 23.25;
        Object objectReference = "flutter is great!";

        System.out.println("char array: " + String.valueOf(charArray));
        System.out.println("boolean value: " + String.valueOf(booleanValue));
        System.out.println("integer value: " + String.valueOf(integerValue));
        System.out.println("char value: " + String.valueOf(charValue));
        System.out.println("long value: " + String.valueOf(longValue));
        System.out.println("float value: " + String.valueOf(floatValue));
        System.out.println("double value: " + String.valueOf(doubleValue));
        System.out.println("object reference: " + String.valueOf(objectReference));
    }
}
