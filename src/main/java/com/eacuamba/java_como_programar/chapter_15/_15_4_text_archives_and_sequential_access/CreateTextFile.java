package com.eacuamba.java_como_programar.chapter_15._15_4_text_archives_and_sequential_access;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class CreateTextFile {
	private static Formatter formatter;
	private static PrintWriter printWriter;

	public static void main(String[] args) {
		CreateTextFile.openFile();
		CreateTextFile.addRecords();
		CreateTextFile.closeFile();
	}

	public static void openFile() {
		try {
			Path path = Paths.get("files"); // Cria um path que representa o directorio files
			if(!Files.exists(path)) // Verifica se o directorio files que esta na referencia da instancia de Path n�o existe
				Files.createDirectories(path);// Se n�o existir vamos criar o directorio.
			
			formatter = new Formatter(path.resolve("clients_formatter.txt").toFile());
			printWriter = new PrintWriter(path.resolve("clients_printwriter.txt").toFile());
		} catch (SecurityException securityException) {
			System.err.printf("%n%f", "Write permission denied. Terminating...");
			System.exit(1);
		} catch (FileNotFoundException fileNotFoundException) {
			System.err.printf("%n%s", "Error opening file. Terminating...");
			System.exit(1);
		}catch(IOException ioException) {
			System.err.printf("%n%s%n", ioException.getMessage());
			System.exit(1);
		}
	}

	public static void addRecords() {
		Scanner scanner = new Scanner(System.in);

		System.out.printf("%n%s%n%s%n->", "Enter account number, first name, last name and balance.",
				"Enter end-of-file indicator to end input.");
		while (scanner.hasNext()) { // hasNext() verifica se n�o foi inserida uma conbina��o de teclas que indica o
									// fim da inser��o, se for arquivo verifica se ja chegamos no fim do arquivo.
			try {
				//printWriter.format("%d %s %s %.2f%n", scanner.nextInt(), scanner.next(), scanner.next(), scanner.nextDouble());
				formatter.format("%d %s %s %.2f%n", scanner.nextInt(), scanner.next(), scanner.next(),
						scanner.nextDouble());
			} catch (FormatterClosedException formatterClosedException) {
				System.err.printf("%n%s%n", "Error while writing file. Terminating...");
				System.exit(1);
			} catch (NoSuchElementException noSuchElementException) {
				System.err.printf("%n%s%n", "Invalid input. Please try again.");
				scanner.nextLine();
			}
			System.out.println("?");
		}

		scanner.close();
	}

	public static void closeFile() {
		if (formatter != null)
			formatter.close();
		
		if (printWriter != null)
			printWriter.flush();
	}
}
