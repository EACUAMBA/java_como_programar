package com.eacuamba.dev.chapter_14._14_7_expressoes_regulares_classe_pattern_e_classe_matcher;

public class ValidateInput {
	
	public static boolean validateFirstName(String firstName) {
		return firstName.matches("[A-Z][a-zA-Z]*");
	}
	
	public static boolean validateLastName(String lastName) {
		return lastName.matches("[a-zA-Z]+(['-][a-zA-Z]+)*");
	}
	
	public static boolean validateAddress(String address) {
		return address.matches("\\d+\\s+([a-zA-Z]+|[a-zA-Z]+\\s[a-zA-Z]+)");
	}
	
	public static boolean validateCity(String city) {
		return city.matches("([a-zA-Z]+|[a-zA-Z]+\\s[a-zA-Z]+)");
	}
	
	public static boolean validateState(String state) {
		return state.matches("([a-zA-Z]+|[a-zA-Z]+\\s[a-zA-Z]+)");
	}
	
	public static boolean validateZip(String zip) {
		return zip.matches("\\d{5}");
	}
	
	public static boolean validatePhone(String phone) {
		//84 1234 567
		return phone.matches("[1-9]\\d{2}-[1-9]\\d{4}-[0-9]\\d{3}");
	}
	
	public static boolean validate(String state) {
		return state.matches("([a-zA-Z]+|[a-zA-Z]+\\s[a-zA-Z]+)");
	}
	
	
}
