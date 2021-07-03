package chapter_7._7_4_examples_that_use_arrays;

import java.security.SecureRandom;

public class InitArray{

	private static final SecureRandom sr = new SecureRandom();
	public static void main(String args[]){
		emptyArray();
		System.out.printf("%n%n");
		populatedArray();
		System.out.printf("%n%n");
		populatingArray();
		System.out.printf("%n%n");
		summingArrayElementsValue();
		System.out.printf("%n%n");
		printingChartUsingArray();
		System.out.printf("%n%n");
		rollDie();
		System.out.printf("%n%n");
		new InitArray().survey();
		
	}
	public void survey(){
	
		int[] responses = {40,1, 1, 5, 3, 2, 5, 4, 1, 5, 2, 3, 4,24324 ,5, 1,2 , 4, 1,3 , 4, 2 , 3 ,4 ,5, 2 , 2, 20};
		int[] frequency = new int[6];
		
		for(int i = responses.length-1 ; i>=0; i--){
		try{
			frequency[responses[i]]++;
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.printf("Invalid value in responses[%d] = %d. %n", i, responses[i] );
		}
		}
		
		System.out.printf("%10s%10s%n", "Rating", "Frequency");
		
		for(int i =1; i < frequency.length; i++){
			System.out.printf("%10d%10d%n", i, frequency[i]);
		}
	
	}
	
	public static void rollDie(){
	
		int[] face = new int[7];
		
		for(long i =0; i <= 6_000_000L; i++ ){
			int numberFace = 1+sr.nextInt(6);
			face[numberFace] ++;
			
		}
		
		System.out.printf("%s%n", "These are the roll face repetitions: ");
		for(int i = 1; i <= 6; i++){
			System.out.printf("%4d : %d%n", i, face[i]);
		}
	
	}
	public static void printingChartUsingArray(){
		
		
		int[] results = {10, 20, 30, 80, 70, 60, 78, 56, 49, 78, 90, 100, 89, 79, 73, 62, 43, 10, 78, 95, 45, 36, 23, 85, 14, 23, 75, 87, 67, 98, 100};
		int[] bars = new int[11];
		
		for(int i = (results.length-1); i >= 0 ; i--){
			for(int j = 1; j <=10; j++){
				if(results[i] >= (j*10) && results[i] <= (j*10+9)){
					 bars[j] ++; break;
				}
			}
		}
		
		System.out.printf("%10s:%s%n", "Interval", "Stars");
		for(int i =1; i <=10; i++){
			String interval = (i*10) + "->" + (i*10+9);
			String stars = "";
			for(int j = 1; j <= bars[i]; j++)
			stars = stars + "*";
			
			System.out.printf("%10s:%s%n", interval,stars );
		}
		System.out.printf("%s: %d", "The total of result received is", results.length);
	}
	public static void summingArrayElementsValue(){
		
		int[] array =  {10, 20, 30, 40, 50, 60, 70 ,80, 90, 100};
		int total = 0;
		
		for(int i = array.length /*first executed and is executed only one time*/; i > 0 /*second one and the next start*/; i-- /*the last one*/)
		total = total + array[--i]; /*the third one*/
		
		System.out.printf("%s: %d", "The sum of the all elements value of the array \"array[]\" is", total);
		
	}
	public static void populatingArray(){
		
		final int ARRAY_LENGTH = 10;
		int array[] = new int[ARRAY_LENGTH];
		
		for(int i = 0; i< array.length; i++)
		array[i] = 5 + 5 * i;
		
		System.out.printf("Populating Array%n%s%8s%n", "Index", "Value");
		
		
		for(int i = 0; i< array.length; i++)
		System.out.printf("%5s%8s%n", i, array[i]);
	}
	
	public static void populatedArray(){
		//Declarando um array com dados.
		int[] array = {10, 20, 30, 20, 33, 20, 40, 10, 30, 20, 30};
		
		//Imprimindo uma string inicial para a tabela.
		System.out.printf("Populated Array%n%s%8s%n", "Index", "Value");
		
		//Percorendo o array.
		for(int i = 0; i < array.length; i++){
			System.out.printf("%5s%8s%n", i, array[i]);
		}
	}
	public static void emptyArray(){
		//Declarando o array, sem dados.
		int[] array = new int[10];
		
		//Imprimindo uma string inicial para a tabela.
		System.out.printf("Empty Array%n%s%8s%n", "Index", "Value");
		
		//Percorendo o array.
		for(int i = 0; i < array.length; i++){
			System.out.printf("%5s%8s%n", i, array[i]);
		}
	}
}