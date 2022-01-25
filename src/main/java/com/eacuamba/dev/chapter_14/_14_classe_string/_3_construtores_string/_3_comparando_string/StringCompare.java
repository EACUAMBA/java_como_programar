package com.eacuamba.dev.chapter_14._14_classe_string._3_construtores_string._3_comparando_string;

public class StringCompare {
    public static void main(String[] args) {
        String s1 = new String("Edilson");
        String s2 = "Alexandre";
        String s3 = "Cuamba";
        String s4 = "cuamba";

        System.out.printf("S1 = %s%nS2 = %s%nS3 = %s%nS4 = %s%n", s1, s2, s3, s4);


        //Comparando com ==
        if(s1 == "Edilson")
            System.out.printf("s1 is the same object as \"Edilson\": %s%n", true);
        else
            System.out.printf("s1 is not he same object as \"Edilson\": %s%n", false);

        //Comparando com equals e equalsIgnoreCase, usa comparação lexicográfica
        if(s1.equals("Edilson"))
            System.out.printf("s1 is equals \"Edilson\": %s%n", true);
            else
            System.out.printf("s1 is not equals \"Edilson\": %s%n", false);

        if(s3.equalsIgnoreCase(s4))
            System.out.printf("%s equals %s with ignored case is %s%n", s3, s4, true);
        else
            System.out.printf("%s equals %s with ignored case is %s%n", s3, s4, false);


        //Comparando com String.compareTo(String), compara lexicograficamente, o que significa que compara os valores unicode. caso o valor seja igual retorna 0 caso näo retorna a diferenca dele. sendo que se s1.compareTo(s2) forrem diferentes retrona  a diferenca numerica entre s1 e s2, onde se s1 for maior que s2 o numero é postivo e caso contrario negativo.
        System.out.printf("%ns1.cooompareTo(s2) is %d", s1.compareTo(s2));
        System.out.printf("%ns2.cooompareTo(s1) is %d", s2.compareTo(s1));
        System.out.printf("%ns1.cooompareTo(s1) is %d", s1.compareTo(s1));
        System.out.printf("%ns3.cooompareTo(s4) is %d", s3.compareTo(s4));
        System.out.printf("%ns4.cooompareTo(s3) is %d%n", s4.compareTo(s3));

        //Usando regionMatcher()
        if(s3.regionMatches(0, s4, 0, 5)){
            System.out.println("Os primeiro 5 caracteres de s3 conbinam.");
        }else
            System.out.println("Os primeiro 5 caracteres de s3 não conbinam.");

        if(s3.regionMatches(true, 0, s4, 0, 5)){
            System.out.println("Os primeiro 5 caracteres de s3 e s4 conbinam com diferenças de caixas ignoradas.");
        }else
            System.out.println("Os primeiro 5 caracteres de s3 não conbinam com diferenças de caixas ignoradas.");

    }
}
