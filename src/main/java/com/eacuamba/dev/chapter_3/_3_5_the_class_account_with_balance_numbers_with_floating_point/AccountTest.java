package com.eacuamba.dev.chapter_3._3_5_the_class_account_with_balance_numbers_with_floating_point;

import java.util.Scanner;

public class AccountTest{
	public static void main(String[] args){
		
		Account account1 = new Account("Luisa Madalena", 50.0);
		Account account2 = new Account("Sofia Ricardo", -34.56);
		
		System.out.printf("%s is $%.2f%n", account1.getName(), account1.getBalance());
		System.out.printf("%s is $%.2f%n", account2.getName(), account2.getBalance());
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter deposit amount for account1:");
		double depositAmount = scanner.nextDouble();
		System.out.printf("%nadding %.2f to account1 balance%n%n", depositAmount);
		account1.deposit(depositAmount);
		
		System.out.printf("%s is $%.2f%n", account1.getName(), account1.getBalance());
		System.out.printf("%s is $%.2f%n", account2.getName(), account2.getBalance());
		
		System.out.print("Enter deposit amount for account2:");
		depositAmount = scanner.nextDouble();
		System.out.printf("%nadding %.2f to account1 balance%n%n", depositAmount);
		account2.deposit(depositAmount);
		
		System.out.printf("%s is $%.2f%n", account1.getName(), account1.getBalance());
		System.out.printf("%s is $%.2f%n", account2.getName(), account2.getBalance());
	}
}
		