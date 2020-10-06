import java.util.Scanner;

public class Addition{
	
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		int num1;
		int num2;
		int sum;
		
		System.out.println("Enter first integer:");
		num1 = scanner.nextInt();
		
		System.out.println("Enter second integer:");
		num2 = scanner.nextInt();
		
		sum = num1 + num2;
		
		System.out.printf("Sum is %d%n", sum);
		
	}
}