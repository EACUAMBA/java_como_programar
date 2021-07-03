package chapter_3._3_4_account_class_initializing_objects_using_constructors;

import java.util.Scanner;

public class AccountTest{
	public static void main(String[] args){
		
		Scanner scanner = new Scanner(System.in);
		
		Account account1 = new Account("Luisa Madalena");
		Account account2 = new Account("Sofia Ricardo");
		
		System.out.printf("account1 name is %s%n", account1.getName());
		System.out.printf("account2 name is %s%n", account2.getName());
		
	}
}
		