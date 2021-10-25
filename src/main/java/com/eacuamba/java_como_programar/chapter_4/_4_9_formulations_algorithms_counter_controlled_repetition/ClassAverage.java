package com.eacuamba.java_como_programar.chapter_4._4_9_formulations_algorithms_counter_controlled_repetition;

import java.util.Scanner;

public class ClassAverage{
	public static void main(String... args){
		
		Scanner scanner = new Scanner(System.in);
		
		int total = 0;
		int gradeCounter = 1;
		
		while(gradeCounter <= 10){
			System.out.print("Enter grade: ");
			int grade = scanner.nextInt();
			total = total +grade;
			
			gradeCounter = gradeCounter + 1;
			
		}
		
		int gradeAverage = total / gradeCounter;
		
		System.out.printf("%nThe total of all 10 grades is %d%n", total);
		System.out.printf("The class average is %d%n", gradeAverage);
	}
}
			