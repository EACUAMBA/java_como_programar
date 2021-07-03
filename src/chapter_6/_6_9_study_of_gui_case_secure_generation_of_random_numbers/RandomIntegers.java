package chapter_6._6_9_study_of_gui_case_secure_generation_of_random_numbers;

import java.security.SecureRandom;


public class RandomIntegers{
	public static void main(String args[]){
		SecureRandom secureRandom = new SecureRandom();
		
		for(int i =1; i<=20; i++){
			
			//Me retorna um numero aleatorio de 1 ate 6, o 1 somado com o resultado do nextInt(6) serve para 
			int face = 1 + secureRandom.nextInt(6);
			
			System.out.printf("%d   ", face);
			
			if(i % 5 == 0){
				System.out.println();
			}
		}
	}
}