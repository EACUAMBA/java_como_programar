package chapter_11._11_2_example_dividing_by_zero_without_exception_treatment;

import java.util.Scanner;

public class DevideByZeroNoExceptionHandling {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Write the numerator: ");
        int numerator = (input.nextInt());

        System.out.print("Write the denominator: ");
        int denominator = (input.nextInt());

        double quotient = quotient(numerator, denominator);
        System.out.printf("%s%.2f", "The result is ", quotient);
    }
    public static double quotient(int numerator, int denominator){
        return  (double)numerator / denominator;
    }
}
