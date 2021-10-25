package com.eacuamba.java_como_programar.chapter_3._3_4_account_class_initializing_objects_using_constructors;




public class Account{
	private String name;
	
	public Account(String name){
		this.name = name;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getName(){
		return name;
	}
}