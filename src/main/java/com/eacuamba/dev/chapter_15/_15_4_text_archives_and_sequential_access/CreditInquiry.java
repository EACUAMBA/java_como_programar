package com.eacuamba.dev.chapter_15._15_4_text_archives_and_sequential_access;

import java.io.IOException;
import java.nio.file.Paths;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class CreditInquiry {
	private static MenuOption[] choices = MenuOption.values();
	public static void main(String[] args) {
		MenuOption accountType = getRequest();
		
		while(accountType != MenuOption.END) {
			switch(accountType) {
			case ZERO_BALANCE:
				System.out.printf("%nAccounts with zero balances:%n");
				break;
			case CREDIT_BALANCE:
				System.out.printf("%nAccounts with credit balances:%n");
				break;
			case DEBIT_BALANCE:
				System.out.printf("%nAccounts with debit balances:%n");
				break;
			}
			readRecords(accountType);
			accountType = getRequest();
		}
	}
	public static MenuOption getRequest() {
		int request = 4;
		System.out.printf("%nEnter request%n%s%n%s%n%s%n%s%n", "1 - List accounts with zero balances.", "2 - accounts with credit balances.", "3 - List accounts with debit balances.", "4 - Terminate program.");
		
		try {
			Scanner scanner = new Scanner(System.in);
			do {
			request = scanner.nextInt();
			
			}while((request<1) || (request > 4));
		}catch (NoSuchElementException noSuchElementException) {
			System.err.println(noSuchElementException.getMessage());
			System.out.println("Invalid input. Terminating...");
			System.exit(1);
		}
		
		return choices[request-1];
	}
	
	public static void readRecords(MenuOption accountType) {
		
		try(Scanner scanner = new Scanner(Paths.get("files").resolve("clients_formatter.txt"))){
			System.out.printf("%n%17s%12s%12s %22s", "Account Number", "First Name", "Last Name", "Balance");
			while(scanner.hasNext()) {
			int account = scanner.nextInt();
			String firstName = scanner.next();
			String lastName = scanner.next();
			double balance = scanner.nextDouble();
			
			if(shouldDisplay(accountType, balance)) {
				System.out.printf("%n%-17d%-12s%-12s%22s", account, firstName, lastName, NumberFormat.getCurrencyInstance(new Locale("pt", "MZ")).format(balance));
			}
			
			}
		}catch(IOException ioException) {
			System.err.printf("%n%s%n", ioException.getLocalizedMessage());
			System.exit(1);
		}
	}
	
	public static boolean shouldDisplay(MenuOption accounMenuOption, double balance) {
		if(MenuOption.CREDIT_BALANCE == accounMenuOption && balance > 0) {
			return true;
		}else if (MenuOption.DEBIT_BALANCE == accounMenuOption && balance < 0) {
			return true;
		}else if (MenuOption.ZERO_BALANCE.equals(accounMenuOption) && balance == 0) {
			return true;
		}
		return false;
	}
}
