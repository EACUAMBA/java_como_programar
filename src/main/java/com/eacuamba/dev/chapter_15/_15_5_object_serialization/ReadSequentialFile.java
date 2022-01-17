/*
* Copyright 
* Aos Jul 10, 2021
* Autor(Edilson Alexandre Cuamba)
* Thunder Mozambique
* 2021
* User(Edilson A. Cuamba)
*/

package com.eacuamba.dev.chapter_15._15_5_object_serialization;

import java.io.EOFException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;

import com.eacuamba.dev.chapter_15.model.Account;

public class ReadSequentialFile {
	private static ObjectInputStream objectInputStream;
	public static void main(String[] args) {
		openFile();
		readFile();
		closeFile();
	}
	
	public static void openFile() {
		try {
			Path path = Paths.get("files").resolve("objectOutput.serialization");
			objectInputStream = new ObjectInputStream(Files.newInputStream(path));
		}catch(NoSuchFileException e){
			System.err.println("Ficheiro n�o foi encontrado! Terminando...");
			System.err.println(e.getMessage());
			System.exit(1);
	}catch(IOException e) {
			System.err.println("Erro ao ler ficheiro!");
			e.printStackTrace();
			System.exit(1);
		}
	}
	
	public static void readFile() {
		Account[] accounts = new Account[2];
		try {
			int contador = 0;
			while(true) {
				Account account = (Account)objectInputStream.readObject();
				accounts[contador] = account;
				contador++;
			}
		}catch (EOFException eofException) {
			System.err.println("Fim do ficheiro alcan�ado.");
			System.err.println(eofException.getLocalizedMessage());
		}catch (ClassNotFoundException classNotFoundException) {
			System.err.println("A classe a ser desserializada n�o corresponde a que pretende fazer o cast. Clase1 classe = (Classe1)input(); - retorn classe3");
			System.err.println(classNotFoundException.getMessage());
		}catch (IOException ioException) {
			System.err.println(ioException.getLocalizedMessage());
			System.err.println("Erro desconhecido ao ler arquivo!");
			
		}
		
		System.out.printf("%n%20s %30s %20s", "Numero da conta", "Nome completo", "Saldo");
		for (Account account : accounts) {
			System.out.printf("%n%20d %30s %20.2f", account.getNumber(), new StringBuilder().append(account.getFirstName()).append(" ").append(account.getLastName()).toString(), account.getBalance());
		}
		
		System.out.println("\nPrinting done.");
	}
	public static void closeFile() {
		try {
		if(objectInputStream != null)
			objectInputStream.close();
		}catch(IOException ioException) {
			System.err.println("Erro ao fechar inputStream.");
			ioException.printStackTrace();
		}
	}
}
