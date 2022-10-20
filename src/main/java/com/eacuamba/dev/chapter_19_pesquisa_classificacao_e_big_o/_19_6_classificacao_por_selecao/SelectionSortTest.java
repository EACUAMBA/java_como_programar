package com.eacuamba.dev.chapter_19_pesquisa_classificacao_e_big_o._19_6_classificacao_por_selecao;

import java.security.SecureRandom;
import java.util.Arrays;

public class SelectionSortTest {
    private static void selectionSort(int[] data) {
        for (int i = 0; i < data.length; i++) {
            int smallestIndex = i;
            for (int j = i + 1; j < data.length; j++) {
                if (data[j] < data[smallestIndex]) {
                    smallestIndex = j;
                }
            }

            swap(data, smallestIndex, i);
            imprimaTroca(data, i, smallestIndex);
        }
    }

    public static void swap(int[] data, int sourceIndex, int targetIndex) {
        int temporary = data[sourceIndex];
        data[sourceIndex] = data[targetIndex];
        data[targetIndex] = temporary;
    }

    private static void imprimaTroca(int[] data, int alvo, int destino) {
        System.out.printf("Trocando %-2d e %-2d:%n", data[destino], data[alvo]);

        for (int i = 0; i < destino; i++)
            System.out.printf("%2d  ", data[i]);

        System.out.printf("%2d* ", data[destino]);

        for (int i = destino + 1; i < data.length; i++)
            System.out.printf("%2d  ", data[i]);

        System.out.printf("%n");
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
