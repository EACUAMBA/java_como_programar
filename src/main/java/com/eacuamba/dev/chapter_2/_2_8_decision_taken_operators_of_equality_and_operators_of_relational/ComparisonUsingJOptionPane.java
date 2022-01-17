package com.eacuamba.dev.chapter_2._2_8_decision_taken_operators_of_equality_and_operators_of_relational;

import javax.swing.JOptionPane;

public class ComparisonUsingJOptionPane{
	public static void main(String[] args){
		
		
		int number1;
		int number2;
		
		number1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter first integer:"));

		
		number2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter second"));
		
		
		if(number1 == number2){
			String message = String.format("%d == %d%n", number1, number2);
		
			JOptionPane.showMessageDialog(null, message);
		}
		
		if(number1 != number2){
			String message = String.format("%d != %d%n", number1, number2);
		
			JOptionPane.showMessageDialog(null, message);
		}
		
		if(number1 > number2){
			String message = String.format("%d > %d%n", number1, number2);
		
			JOptionPane.showMessageDialog(null, message);
		}
		
		if(number1 < number2){
			String message = String.format("%d < %d%n", number1, number2);
		
			JOptionPane.showMessageDialog(null, message);
		}
		
		if(number1 >= number2){
			String message = String.format("%d >= %d%n", number1, number2);
		
			JOptionPane.showMessageDialog(null, message);
		}
		
		if(number1 <= number2){
			String message = String.format("%d <= %d%n", number1, number2);
		
			JOptionPane.showMessageDialog(null, message);
		}
		
	}
}