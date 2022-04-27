package com.eacuamba.dev.chapter_14._14_7_expressoes_regulares_classe_pattern_e_classe_matcher.substituindo_substrings_e_dividindo_strings;

public class RegexSubstitution {
    public static void main(String[] args) {
        String firstString = "This sentence ends in 5 stars *****";
        String secondString = "1, 2, 3, 4, 5, 6, 7, 8";

        System.out.printf("Original String 1: %s%n", firstString);

        //substituir '*' por ^
        firstString = firstString.replaceAll("\\*", "^");

        System.out.printf("^ subtitued for *: %s%n", firstString);

        //substituir asteristicos por circunflexos
        firstString = firstString.replaceAll("stars", "carets");

        System.out.printf("\"carets\" subistitue \"stars\": %s%n", firstString);

        //substitui palavras por 'palavra'
        firstString = firstString.replaceAll("\\w+", "word");

        System.out.print();
    }
}
