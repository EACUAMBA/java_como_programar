package com.eacuamba.dev.chapter_20_classes_e_metodos_genericos._20_3_metodos_genericos_implementacao_e_traducao_em_tempo_de_compilacao;

public class GenericMethodTest {

    public static void main(String[] args) {
        Integer[] integers = {1, 3, 2, 4,5 , 23, 4, 2};
        Double[] doubles = {1.2, 4.3, 7.5, 8.3, .6};
        Character[] characters = {'a', 'q', 'A', 'R', 's', 'W'};

        System.out.println("Array integers contains: ");
        printArray(integers);

        System.out.println("Array doubles contains: ");
        printArray(doubles);

        System.out.println("Array characters contains: ");
        printArray(characters);
    }

    private static <T> void printArray(T[] t){

        for(int i = 0; i<t.length; i++)
            System.out.printf("%2s ", t[i]);

        System.out.println();
    }
}
