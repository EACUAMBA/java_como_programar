package com.eacuamba.dev.chapter_14._14_3_classe_string._3_construtores_string._3_comparando_string;

public class StringStarteEnd {
    private static final String[] WORDS = {"starts", "starting", "started", "end", "ended", "ending"};
    public static void main(String[] args) {
        for(String word : WORDS)
            if(word.startsWith("st"))
                System.out.printf("%s - starts with \"st\".%n", word);

        System.out.println();
        for(String word : WORDS)
            if(word.startsWith("art", 2))
                System.out.printf("%s - starts with \"art\" at position 2.%n", word);

        System.out.println();
        for(String word : WORDS)
            if(word.endsWith("ing"))
                System.out.printf("%s - ends with \"ing\".%n", word);
    }
}
