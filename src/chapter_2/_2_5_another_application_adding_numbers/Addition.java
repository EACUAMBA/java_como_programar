package chapter_2._2_5_another_application_adding_numbers;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Addition{
	
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		int num1;
		int num2;
		int sum;
		/*
		System.out.println("Enter first integer:");
		
		*last version
		num1 = scanner.nextInt();
		
		new version
		*/
		num1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter first integer:"));
		
		/*
		*last version
		System.out.println("Enter second integer:");
		num2 = scanner.nextInt();
		
		*new version*/
		
		num2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter second"));
		sum = num1 + num2;
		
		System.out.printf("Sum is %d%n", sum);
		
	}
}