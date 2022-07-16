package com.eacuamba.dev.chapter_16._16_11_mapas;

import java.util.*;

public class LetterTypeCount {
    public static void main(String[] args) {
        Map<Character, Integer> letterMap = new HashMap<>();

        createMap(letterMap);
        displayMap(letterMap);
    }

    public static void createMap(Map<Character, Integer> map){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Escreva uma frase bonita: ");

        String frase = scanner.useDelimiter("delimitador..........").next().toLowerCase();

//        StringTokenizer stringTokenizer = new StringTokenizer(frase, "");
        String[] strings = frase.split("");
        Iterator<String> iterator = Arrays.asList(strings).iterator();
        iterator.forEachRemaining((token)-> {
            char c = token.charAt(0);
            if(map.containsKey(c))
                map.put(c, map.get(c) + 1);
            else
                map.put(c, 1);
        });
    }

    public static void displayMap(Map<Character, Integer> map){
        Set<Character> characterSet = new TreeSet<>(map.keySet());

        System.out.printf("%nEste mapa tem:%nChaves (key)\t\tValores (value)%n");
        for(Character character : characterSet)
            System.out.printf("%-12s|%12d%n", character, map.get(character));
        System.out.printf("%nEste mapa tem %d items, e %s%n", map.size(), (map.isEmpty() ? "está vazio." : "não está vazio."));
    }
}
