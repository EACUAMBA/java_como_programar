package com.eacuamba.java_como_programar.chapter_6._6_12_method_overload;

public class MethodOverload{
	
	
	public static void main (String args[]){
	
	System.out.printf("Square of integer 5 is %d.%n", square(5));
	System.out.printf("Square of integer 2.5 is %f.%n", square(2.5));
	
	}
	public static int square(int intValue){
		
		System.out.printf("Called square with int` argument %d.%n", intValue);
		return intValue*intValue;
	}
	public static double square(double doubleValue){
		System.out.printf("Called quare with double value %f.%n", doubleValue);
		return doubleValue*doubleValue;
		
	}
}