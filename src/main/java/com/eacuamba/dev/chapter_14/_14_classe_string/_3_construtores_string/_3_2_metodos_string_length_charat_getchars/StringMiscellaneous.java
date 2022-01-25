package com.eacuamba.dev.chapter_14._14_classe_string._3_construtores_string._3_2_metodos_string_length_charat_getchars;

public class StringMiscellaneous {
    public static void main(String[] args) {
        String nome = "Edilson Alexandre Cuamba";
        char[] nomeChar = new char[9];

        System.out.printf("nome: %s%n", nome);

        //imprime o comprimento da string
        System.out.printf("O comprimento da string: %d%n", nome.length());

        for(int i = nome.length()-1; i >= 0; i--){
            System.out.print(nome.charAt(i) + "");
        }

        nome.getChars(8, 8+9, nomeChar, 0);

        System.out.printf("%nValores do array de  char: %s%n", "nomeChar");
        for(char character : nomeChar)
            System.out.print(character + " ");

        System.out.println();
    }
}
