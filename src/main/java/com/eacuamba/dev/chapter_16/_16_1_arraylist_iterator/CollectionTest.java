package com.eacuamba.dev.chapter_16._16_1_arraylist_iterator;

import java.util.*;

public class CollectionTest {
  public static void main(String[] args) {
    // adicionando os valores que vão para o array list
    String[] colors = new String[] { "RED", "GREEN", "BLUE", "GRAY", "PINK", "YELLOW" };
    List<String> colorList = new ArrayList<String>();

    for (String color : colors)
      colorList.add(color);

    // Adiciondo valore para o array removeColors
    String[] removeColors = { "RED", "BLUE", "PINK" };
    List<String> removeColorsList = new ArrayList<String>();

    for (String color : removeColors)
      removeColorsList.add(color);

    System.out.println("ArrayList: ");
    for (int i = 0; i < colorList.size(); i++)
      System.out.printf("%d - %s %n", i, colorList.get(i));
    
    removeColors(colorList, removeColorsList);

    System.out.println("ArrayList after remove: ");
    for (int i = 0; i < colorList.size(); i++)
      System.out.printf("%d - %s %n", i, colorList.get(i));

  }

  public static void removeColors(Collection<String> colorCollection, Collection<String> colorsToRemoveCollection) {
    Iterator<String> coloIterator = colorCollection.iterator();

    for (; coloIterator.hasNext();) {
      String currentColor = coloIterator.next();
      if (colorsToRemoveCollection.contains(currentColor)) {
        coloIterator.remove();
      }
    }
  }
}
