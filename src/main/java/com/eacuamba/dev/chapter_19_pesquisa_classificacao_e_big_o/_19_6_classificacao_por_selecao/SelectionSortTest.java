package com.eacuamba.dev.chapter_19_pesquisa_classificacao_e_big_o._19_6_classificacao_por_selecao;

public class SelectionSortTest {
  private static void selectionSort(int[] data) {
    for (int i = 0; i < data.length; i++) {
      int smallestIndex = i;
      for (int j = i + 1; i < data.length; i++) {
        if (data[j] < data[smallestIndex]) {
          smallestIndex = j;
        }
      }

      swap(data, smallestIndex, i);
    }
  }

  public static void swap(int[] data, int sourceIndex, int targetIndex) {
    int temporary = data[sourceIndex];
    data[sourceIndex] = data[targetIndex];
    data[targetIndex] = temporary;
  }
}
