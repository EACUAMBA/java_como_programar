package com.eacuamba.java_como_programar.chapter_5._5_5_do_while_repetition_instruction;

public class DoWhileTest{
	public static void main(String... args){
		int counter = 1;
		
		do{
			System.out.printf("%d%n", counter);
			counter++;
		}while(counter <=10);
		
	}
}