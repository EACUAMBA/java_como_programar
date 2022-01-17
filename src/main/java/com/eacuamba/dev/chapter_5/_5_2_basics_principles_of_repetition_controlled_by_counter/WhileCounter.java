package com.eacuamba.dev.chapter_5._5_2_basics_principles_of_repetition_controlled_by_counter;

public class WhileCounter{
	public static void main(String args[]){
		
		int counter = 0;
		//int counter =1; Forma alernativa
		
		//while (counter <= 10)
		while (++counter<=10){
			System.out.printf("%d	", counter);
			//System.out.printf("%d	", counter++);
		}
		
		System.out.println();
	}
}