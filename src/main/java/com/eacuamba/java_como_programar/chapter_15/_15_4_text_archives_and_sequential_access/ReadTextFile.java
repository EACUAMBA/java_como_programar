package com.eacuamba.java_como_programar.chapter_15._15_4_text_archives_and_sequential_access;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.NumberFormat;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class ReadTextFile {
	private static Scanner scanner;
	
	public static void main(String[] args) {
		openFile();
		readFile();
		closeFile();
	}
	
	public static void openFile() {
		Path path = Paths.get("files").resolve("clients_formatter.txt");
		try {
		scanner = new Scanner(path);
		}catch(IOException ioException) {
			System.err.printf("%n%s%n", ioException.getLocalizedMessage());
			System.exit(1);
		}
	}
	
	public static void readFile() {
		try {
			System.out.printf("%n%15s %10s %10s %20s", "Account Number", "First Name", "Last Name", "Balance");
			while(scanner.hasNext()) {
				System.out.printf("%n%15d %10s %10s %20s", scanner.nextInt(), scanner.next(), scanner.next(), NumberFormat.getCurrencyInstance(new Locale("pt", "MZ")).format(scanner.nextDouble()));
			}
		}catch(InputMismatchException inputMismatchException) {
			System.err.println(inputMismatchException.getMessage());
			System.exit(1);
		}catch (NoSuchElementException noSuchElementException) {
			System.err.println(noSuchElementException.getLocalizedMessage());
			System.exit(1);
		}catch(IllegalStateException illegalStateException) {
			System.err.println(illegalStateException.getLocalizedMessage());
			System.exit(1);
		}
	}
	
	public static void closeFile() {
		if(scanner != null)
			scanner.close();
	}
}
