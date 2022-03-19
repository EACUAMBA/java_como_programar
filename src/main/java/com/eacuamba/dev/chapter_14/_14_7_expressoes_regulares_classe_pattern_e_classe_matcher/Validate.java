package com.eacuamba.dev.chapter_14._14_7_expressoes_regulares_classe_pattern_e_classe_matcher;

import java.util.Scanner;

public class Validate {
	public static void main(String[] args) {
		try (Scanner input = new Scanner(System.in)){
		
		
		System.out.print("Por favor introduza o primeiro nome: ");
		String firstName = input.nextLine();
		
		System.out.print("Por favor introduza o ultimo nome: ");
		String lastName = input.nextLine();
		
		System.out.print("Por favor introduza o endereço: ");
		String address = input.nextLine();
		
		System.out.print("Por favor introduza a cidade: ");
		String city = input.nextLine();
		
		System.out.print("Por favor introduza o estado: ");
		String state = input.nextLine();
		
		System.out.print("Por favor introduza zip: ");
		String zip = input.nextLine();
		
		System.out.print("Por favor introduza phone: ");
		String phone = input.nextLine();
		
		System.out.printf("%nResultado das validações:");
		
		if(!ValidateInput.validateFirstName(firstName)) {
			System.out.printf("O seu primeiro nome é ínvalido, nome: %s%n", firstName);
		}else if(!ValidateInput.validateLastName(lastName)) {
			System.out.printf("O seu ultimo nome é ínvalido, nome: %s%n", lastName);
		}else if(!ValidateInput.validateAddress(address)) {
			System.out.printf("O seu endereco é ínvalido, nome: %s%n", address);
		}else if(!ValidateInput.validateCity(city)) {
			System.out.printf("O seu cidade é ínvalido, nome: %s%n", city);
		}else if(!ValidateInput.validateState(state)) {
			System.out.printf("O seu estado é ínvalido, nome: %s%n", state);
		}else if(!ValidateInput.validateZip(zip)) {
			System.out.printf("O seu zip é ínvalido, nome: %s%n", zip);
		}else if(!ValidateInput.validatePhone(phone)) {
			System.out.printf("O seu telefone é ínvalido, nome: %s%n", phone);
		}
		
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
