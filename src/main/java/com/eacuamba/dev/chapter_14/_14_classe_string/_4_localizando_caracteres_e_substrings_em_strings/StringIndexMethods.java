package com.eacuamba.dev.chapter_14._14_classe_string._4_localizando_caracteres_e_substrings_em_strings;

public class StringIndexMethods {
    public static void main(String[] args) {
        String nome = "Edilson Alexandre Cuamba";

        //indexOf() - localizar um caracter
        System.out.printf("a letra c esta localizada na posição: %d%n", nome.indexOf('c'));
        System.out.printf("a letra C esta localizada na posição: %d%n", nome.indexOf('C'));

        System.out.printf("a letra a esta localizada na posição: %d%n", nome.indexOf('a', 1));
        System.out.printf("a letra z esta localizada na posição: %d%n", nome.indexOf('z'));

        System.out.println();
        //lastIndexOf - localiza a ultima ocorrencia
        System.out.printf("Last index of a is at position: %d%n", nome.lastIndexOf('a'));
        System.out.printf("Last index of a is at position: %d%n", nome.lastIndexOf("re", 3));
        System.out.printf("Last index of a is at position: %d%n", nome.lastIndexOf('h'));

        System.out.println();
        //indexOf - localizar substring
        System.out.printf("\"xandre\" esta localizada em %d%n", nome.indexOf("xandre"));
        System.out.printf("\"xandre\" esta localizada em %d%n", nome.indexOf("xandre", 10));
        System.out.printf("\"xandre\" esta localizada em %d%n", nome.indexOf("xandri"));

        System.out.println();
        //lastIndexOf - localiza a ultima ocorrencia de uma substring
        System.out.printf("Last index of a is at position: %d%n", nome.lastIndexOf("andre"));
        System.out.printf("Last index of a is at position: %d%n", nome.lastIndexOf("cuam", 3));
        System.out.printf("Last index of a is at position: %d%n", nome.lastIndexOf("hituro"));



    }
}
