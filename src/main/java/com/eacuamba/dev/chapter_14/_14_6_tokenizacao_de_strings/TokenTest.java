package com.eacuamba.dev.chapter_14._14_6_tokenizacao_de_strings;

import java.util.Scanner;

public class TokenTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("\nEnter a setence and press Enter\nSentence: ");
        String sentence = input.nextLine();

        String[] strings = sentence.split(" ");
        System.out.printf("Number of elements: %d%nThe tokens are: %n", strings.length);

        for(String string : strings)
            System.out.println(string);

    }
}
