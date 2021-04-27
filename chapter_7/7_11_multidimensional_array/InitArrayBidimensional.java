 import javax.swing.*;
 import java.awt.*;
 import java.security.SecureRandom;

public class InitArrayBidimensional {
    private static SecureRandom sr = new SecureRandom();
    public static void main(String... args){
        int[][] array1 = createArray();
        int[][] array2 = createArray();

        System.out.print("Values in array1 by row are:");
        print(array1);

        System.out.printf("%nValues in array2 are:");
        print(array2);
    }

    public static void print(int[][] array){
        System.out.printf("%n%-7s%8s%n", "Linhas", "Colunas");
        boolean jaTemColunas = false;
        int contadorLinhas = 0;
        for(int[] linha: array){

            if(!jaTemColunas){
                System.out.printf("%10s", " ");
                int numeroColunas = linha.length;
                String colunas = "";
                for(int i =0; i<numeroColunas; i++ ) {
                    System.out.printf("%5d", i);
                }

                jaTemColunas = true;
            }

            System.out.printf("%n%-7s %-2d:", "Linha:", contadorLinhas);
            for(int coluna: linha){
                System.out.printf("%5d", coluna);
            }
            System.out.printf("%n");
            contadorLinhas++;
        }
    }
    public static int[][] createArray(){
        int[][] array = new int[(sr.nextInt(5)+5)][(sr.nextInt(10)+10)];
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j< array[i].length; j++){
                array[i][j] = sr.nextInt(100);
            }
        }

        return array;
    }
}
