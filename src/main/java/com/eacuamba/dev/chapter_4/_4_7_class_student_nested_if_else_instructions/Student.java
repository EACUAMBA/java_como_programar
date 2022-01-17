package com.eacuamba.dev.chapter_4._4_7_class_student_nested_if_else_instructions;


public class Student{
	private String name;
	private double average;
	
	public Student(String name, double average){
		this.name = name;
		
		if(average>0.0)
			if(average<=100.00)
				this.average = average;
	}
	
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return this.name;
	}
	
	public void setAverage(double average){
		if(average>0.0)
			if(average<=100.0)
				this.average = average;
	}
	public double getAverage(){
		return this.average;
	}
	
	public String getLetterGrade(){
		String letterGrade = "";
		
		if(this.average >= 90.0)
			letterGrade = "A";
		else if(this.average >= 80.0)
			letterGrade = "B";
		else if(this.average >= 70.0)
			letterGrade = "C";
		else if(this.average >= 60.0)
			letterGrade = "D";
		else 
			letterGrade = "F";
		
		return letterGrade;
		
	}
}
	