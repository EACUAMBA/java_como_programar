package com.eacuamba.dev.chapter_7._7_8_passing_array_through_method;

 import java.security.SecureRandom;

public class PassArray {

    private static final SecureRandom sr = new SecureRandom();

    public static void main(String... args) {
        int[] arrayRecebido = createArray();

        System.out.printf("Effects of passing reference to entire array:%n" + "The values of the original array are:%n");
        printArray(arrayRecebido);


        modifyArray(arrayRecebido);
        System.out.printf("%n%nThe values of the modified array are: %n");
        printArray(arrayRecebido);

        System.out.printf("%n%nEffects of passing array element value:%n"+ "array[3] before modifyElement: %d%n", arrayRecebido[3]);
        modifyElement(arrayRecebido[3]);
        System.out.printf("array[3] after modifyElement: %d%n%n", arrayRecebido[3]);

        System.out.print("The entire array after all changes:");
        printArray(arrayRecebido);

    }

    public static void modifyElement(int arrayValue) {
        arrayValue *= 2;
        System.out.printf("%s%d%n", "The value of the modified element array is ", arrayValue);
    }

    public static void modifyArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) Math.sqrt(array[i]);
        }
    }

    public static int[] createArray() {
        int[] array = new int[5];

        for (int i = 0; i < array.length; i++) {
            array[i] = sr.nextInt(10);
        }
        return array;
    }

    public static void printArray(int[] array){
        System.out.printf("%n");
        for (int value : array)
            System.out.printf("      %d%n", value);

        System.out.printf("%n%n");
    }
}
