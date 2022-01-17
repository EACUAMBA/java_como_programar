package com.eacuamba.dev.chapter_2._2_5_another_application_adding_numbers;

import javax.swing.JOptionPane;

public class AdditionUsingJOptionPane{
	
	public static void main(String[] args){

		int num1;
		int num2;
		int sum;

		num1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter first integer:"));

		
		num2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter second"));
		
		sum = num1 + num2;
		
		String message = String.format("Sum is %d%n", sum);
		
		JOptionPane.showMessageDialog(null, message);
		
	}
}