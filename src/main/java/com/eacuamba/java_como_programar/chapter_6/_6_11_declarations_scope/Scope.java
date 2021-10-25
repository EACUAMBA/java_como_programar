package com.eacuamba.java_como_programar.chapter_6._6_11_declarations_scope;

public class Scope{
	private static int x = 1;
	
	public static void main(String args[]){
		
		int x = 100;
		
		System.out.printf("local X in main is %d%n", x);
		
		useLocalVariable();
		useField();
		useLocalVariable();
		useField();
		
		System.out.printf("local X in main is %d%n.", x);
		
	}
	
	public static void useLocalVariable(){
		int x = 1000;
		
		System.out.printf("%n local x in entering method useLocalVariable is %d%n.", x);
		
		x++;
		
		System.out.printf("local x in existing method useLocalVariable is %d%n.", x);
		
	}
	
	public static void useField(){
		System.out.printf("%nfield x on entering method useField is %d%n", x);
		x++;
		System.out.printf("%nfield x on existing method useField is %d%n", x);
	}
}