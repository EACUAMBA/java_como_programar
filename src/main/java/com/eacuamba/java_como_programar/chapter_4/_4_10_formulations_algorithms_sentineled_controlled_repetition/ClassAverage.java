package com.eacuamba.java_como_programar.chapter_4._4_10_formulations_algorithms_sentineled_controlled_repetition;

import java.util.Scanner;

public class ClassAverage{
	public static void main(String... args){
		
		Scanner scanner = new Scanner(System.in);
		
		int total = 0;
		int gradeCounter = 0;
		
		System.out.print("Enter grade or -1 to quit: ");
		int grade = scanner.nextInt();
		
		while(grade != -1){
			
			total = total + grade;
			gradeCounter = gradeCounter + 1;
			
			System.out.print("Enter grade or -1 to quit: ");
			grade = scanner.nextInt();
			
		}
		
		if(gradeCounter != 0){
			double gradeAverage = (double)total / gradeCounter;
			System.out.printf("%nThe total of all 10 grades is %d%n", total);
			System.out.printf("The class average is %.2f%n", gradeAverage);
		}else
			System.out.println("No grades were entered!");
	}
}
			