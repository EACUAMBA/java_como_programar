package com.eacuamba.dev.chapter_14._14_classe_string._3_construtores_string;

public class ConstructorsString {
    public static void main(String[] args) {
        char[] nomeChar = new char[]{'=', 'E', 'd', 'i', 'l', 's', 'o', 'n'};
        String s = new String("Edilson");

        //Utilizando constructors
        String s1 = new String(); //String vazia
        String s2 = new String(s);
        String s3 = new String(nomeChar);
        //Array de chars, de onde começa a ler os char, onde termina a leitura.
        String s4 = new String(nomeChar, 1, 7);

        System.out.printf("s - %s%n s1- %s%n s2 - %s%n s3 - %s%n s4 - %s%n", s, s1, s2, s3, s4, s);

    }
}
