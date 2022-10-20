package com.eacuamba.dev.chapter_19_pesquisa_classificacao_e_big_o._19_6_classificacao_por_selecao;

import java.security.SecureRandom;
import java.util.Arrays;

public class SelectionSortTest {
    private static void selectionSort(int[] data) {
        //iterate the array starting from 0 to the array.size() minus 1;
        for (int i = 0; i < data.length; i++) {
            //saving the smallest item of the array, we assume that is the item at the i position of the outer iterator;
            int smallestIndex = i;
            //iterate the array but now starting from the i plus one position to the end of the array;
            for (int j = i + 1; j < data.length; j++) {
                //check if the value in this position is small than the smallest value;
                if (data[j] < data[smallestIndex]) {
                    //if is small we set that this is the new smallest one;
                    smallestIndex = j;
                }
            }

            //change the position of the smallest and the i value; so if we have the smallest at position 9 and we are iterating statrting fom position 5 we will change de content of the element of 9 to 5 a vice versa;
            swap(data, smallestIndex, i);
            //printing the change, to see what happened to the array.
            imprimaTroca(data, i, smallestIndex);
        }
    }

    public static void swap(int[] data, int sourceIndex, int targetIndex) {
        //saving the a value of the source value;
        int temporary = data[sourceIndex];
        //set to the position of the source value is the targe value;
        data[sourceIndex] = data[targetIndex];
        //set the target value is the temporary value
        data[targetIndex] = temporary;
    }

    private static void imprimaTroca(int[] data, int alvo, int destino) {
        //printing the two values that we changed the position
        System.out.printf("Trocando %-2d e %-2d:%n", data[destino], data[alvo]);

        //iterate until the value we changed
        for (int i = 0; i < destino; i++)
            System.out.printf("%2d  ", data[i]);

        // printing the changed value
        System.out.printf("%2d* ", data[destino]);

        //iterate from the next value after the value we changed to the end of the array
        for (int i = destino + 1; i < data.length; i++)
            System.out.printf("%2d  ", data[i]);

        System.out.printf("%n");
        //iterate from the 0 position to the target, the changed value
        for (int j = 0; j < alvo; j++)
            System.out.print("--  ");

        System.out.println();
    }

    public static void executarTest() {
        SecureRandom sr = new SecureRandom();

        int[] data = new int[10];
        for (int i = data.length - 1; i >= 0; i--)
            data[i] = sr.nextInt(20);

        System.out.printf("Unsorted array:%n");
        System.out.println(Arrays.toString(data));

        selectionSort(data);

        System.out.printf("Sorted Array:%n");
        System.out.println(Arrays.toString(data));
    }

    public static void main(String[] args) {
        for(int i =0; i < 10000; i++)
            executarTest();
    }
}
