package chapter_6._6_4_declaring_methods_with_multiple_parameters;

import java.util.Scanner;

public class Maximum{
	public static void main(String args[]){
		
		Scanner input = new Scanner(System.in);
		
		System.out.printf("%s%n", "Please enter the three number to compare:");
		int number1 = input.nextInt();
		int number2 = input.nextInt();
		int number3 = input.nextInt();
		
		
		int maxValue = Max(number1, number2, number3);
		System.out.printf("%s %d, %d, %d %s %d", "The biggest number among ", number1, number2, number3, "is", Math.max(number1, Math.max(number2, number3)));
		
		//Another way to do this is using the class Math inseide the Java libraries.
		//
		
	}
	public static int Max(int b, int c, int d){
		int maxValue = b;
		
		maxValue = c > maxValue ? c : maxValue;
		maxValue = d > maxValue ? d : maxValue;
		
		return maxValue;
		
	}
}