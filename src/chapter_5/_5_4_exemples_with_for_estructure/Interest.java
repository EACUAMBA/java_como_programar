package chapter_5._5_4_exemples_with_for_estructure;

public class Interest{
	public static void main(String[] args){
		
		//Variable Declarations
		double amount = 0.0, rate = 0.05, principal = 1000.0;
		
		System.out.printf("%s%20s %n", "Year", "Amount on deposit");
		
		for(int year = 0 ;  year<=10 ; year++){
			
			amount = principal * Math.pow(1.0 + rate, year);
			
			System.out.printf("%4d%,20.2f%n", year, amount);
		}
	}
}