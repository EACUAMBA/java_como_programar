import java.util.Scanner;

public class AccountTest{
	public static void main(String[] args){
		
		Scanner scanner = new Scanner(System.in);
		
		Account myAccount = new Account();
		
		System.out.printf("Initial name is %s%n", myAccount.getName());
		
		System.out.print("Please enter the name:");
		String newName = scanner.nextLine();
		myAccount.setName(newName);
		System.out.println();
		
		System.out.printf("Name in object myAccount is: %s%n", myAccount.getName());
		
	}
}
		