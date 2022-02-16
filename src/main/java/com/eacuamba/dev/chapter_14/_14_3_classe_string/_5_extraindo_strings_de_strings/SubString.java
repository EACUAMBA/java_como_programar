package com.eacuamba.dev.chapter_14._14_3_classe_string._5_extraindo_strings_de_strings;

public class SubString {
    public static void main(String[] args) {
        String nome = "Edilson Alexandre Cuamba";

        System.out.printf("Nome do meio (8): %s%n", nome.substring(8));
        System.out.printf("Nome do meio (8 - 17): %s%n", nome.substring(8, 17));
        System.out.printf("Nome do meio (8): .%s.%n", nome.substring(nome.indexOf(' ')+1, nome.lastIndexOf(' ')));
    }
}
