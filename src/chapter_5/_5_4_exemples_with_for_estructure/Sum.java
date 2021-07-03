package chapter_5._5_4_exemples_with_for_estructure;

public class Sum{
	public static void main(String args[]){
		
		int total = 0;
		
		for(int counter = 2; counter <=20; counter += 2){
			total +=counter;
		}
		
		System.out.printf("Sum is %d%n", total);
		
	}
}