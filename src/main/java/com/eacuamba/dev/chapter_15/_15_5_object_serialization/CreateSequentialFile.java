package com.eacuamba.dev.chapter_15._15_5_object_serialization;

import java.io.IOException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.NoSuchElementException;
import java.util.Scanner;

import com.eacuamba.dev.chapter_15.model.Account;

public class CreateSequentialFile {
	private static ObjectOutput objectOutput;

	public static void main(String[] args) {
		openFile();
		addRecords();
	}

	public static void openFile() {
		try {
			objectOutput = new ObjectOutputStream(
					Files.newOutputStream(Paths.get("files").resolve("objectOutput.serialization")));
		} catch (IOException ioException) {
			System.err.println("Error opening file.terminating...");
			System.exit(1);
		}
	}

	public static void addRecords() {
		Scanner scanner = new Scanner(System.in);
		System.out.printf("%n%s%n%s%n->", "Enter account number, first name, last name and balance.",
				"Enter end-of-file indicator to end input.");

		while (scanner.hasNext()) {
			try {

				Account account = new Account();
				account.setNumber(scanner.nextInt());
				account.setFirstName(scanner.next());
				account.setLastName(scanner.next());
				account.setBalance(scanner.nextDouble());

				objectOutput.writeObject(account);

			} catch (NoSuchElementException noSuchElementException) {
				System.err.println("Invalid value, write again...");
				scanner.nextLine();
			} catch (IOException ioException) {
				System.err.println("Error writing in a file. Terminating...");
				break;
			}
			
			System.out.println("->");
		}
		scanner.close();
	}
	
	public static void closeFile() {
		try {
		if(objectOutput != null)
			objectOutput.close();
		}catch (IOException ioException) {
			System.err.println(ioException.getLocalizedMessage());
		}
	}
}
