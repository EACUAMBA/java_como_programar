package com.eacuamba.dev.chapter_20_classes_e_metodos_genericos._20_2_motivacao_para_metodos_genericos;

public class OverloadMethods {
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


    private static void printArray(Integer[] inputArray){

        for(int i = 0; i<inputArray.length; i++)
            System.out.printf("%2d ", inputArray[i]);

        System.out.println();
    }

    private static void printArray(Double[] inputArray){

        for(int i = 0; i<inputArray.length; i++)
            System.out.printf("%2.2f ", inputArray[i]);

        System.out.println();
    }

    private static void printArray(Character[] inputArray){

        for(int i = 0; i<inputArray.length; i++)
            System.out.printf("%2c ", inputArray[i]);

        System.out.println();
    }
}
