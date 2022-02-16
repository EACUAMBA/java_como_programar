package com.eacuamba.dev.chapter_14._14_3_classe_string._7_metodos_string_diversos;

public class StringMiscellaneous2 {
    public static void main(String[] args) {
        String pnome = "Edilson", nomem = " Alexandre ", anome = "Cuamba";

        System.out.printf("pnome = %s%n nomem = %s%n anome = %s%n", pnome, nomem, anome);

        System.out.printf("Replace l to nothing: %s -> %s%n", pnome, pnome.replace("l", ""));
        System.out.printf("Uppercase anome: %s -> %s%n", pnome, pnome.toUpperCase());
        System.out.printf("Lowercase l to nothing: %s -> %s%n", pnome, pnome.toLowerCase());
        System.out.printf("Trim '%s': %s%n", nomem, nomem.trim());

        char[] pnomeAsChar = pnome.toCharArray();
        for(char letter : pnomeAsChar)
            System.out.printf("%s ", letter);

        System.out.println();

    }
}
