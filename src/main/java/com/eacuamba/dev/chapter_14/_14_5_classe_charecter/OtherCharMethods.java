package com.eacuamba.dev.chapter_14._14_5_classe_charecter;

public class OtherCharMethods {
    public static void main(String[] args) {
        //Processo chamado de auto-boxing, conversão de valores primitivos para classe, encapsuladas.
        Character c1 = 'A';
        Character c2 = 'a';

        System.out.printf("C1 = %s%nC2 = %s%n%n", c1.charValue(), c2.toString());

        if(c1.equals(c2))
            System.out.println("c1 and c2 are equals.");
        else
            System.out.println("c1 and c2 are not equals.");
    }
}
