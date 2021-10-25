package com.eacuamba.java_como_programar.chapter_11._11_2_example_treating_arithmeticexception_and_inputmismatchexceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DivideByZeroWithExceptionHandling {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean continueLoop = true;

        do{
            try{
                System.out.print("Write the numerator: ");
                int numerator = (input.nextInt());

                System.out.print("Write the denominator: ");
                int denominator = (input.nextInt());

                int quotient = quotient(numerator, denominator);
                System.out.printf("%s%d", "The result is ", quotient);
                continueLoop = false;

            }catch (ArithmeticException arithmeticException){
                System.err.printf("%nException: %s%n", arithmeticException);
                System.out.printf("%s%n%n", "You must enter integer. Please ty again!");
                System.err.flush();

                input.nextLine();
            }catch (InputMismatchException inputMismatchException){
                System.err.printf("%nException: %s%n", inputMismatchException);
                System.err.flush();
                System.out.printf("Zero is an invalid denominator. Plase try again.%n%n");

                input.nextLine();
            }

        }while(continueLoop);
    }
    public static int quotient(int numerator, int denominator){
        return  numerator / denominator;
    }
}
