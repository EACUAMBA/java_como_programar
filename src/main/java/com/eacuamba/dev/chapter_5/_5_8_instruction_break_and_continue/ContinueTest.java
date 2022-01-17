package com.eacuamba.dev.chapter_5._5_8_instruction_break_and_continue;

public class ContinueTest{
	public static void main(String args[]){
		
		int count;
		
		for(count =1; count<=10; count++){
			
			if(count == 5)
				continue;
			
					
			System.out.printf("Inside the for count value is %d%n", count);
			
		}
		
		System.out.printf("Outside the for count value is %d%n", count);
		
	}
}