package chapter_5._5_11_gui_creating_rectangles_and_ovals;

import java.util.Scanner;
public class Exercicio_5_16{
	public static void main(String[] args){
		
		int value = 0;
		String graphic = "";
		System.out.printf("%s%n%s:", "Please intruduce the values to create de bar graphics (When you finish use the <ctrl> z and Enter no stop the introducer):", "Value");
		
		Scanner scanner = new Scanner(System.in);
		
		while(scanner.hasNext()){
			
			value =scanner.nextInt();
			
			graphic += value + " - ";
			for(int i = 1; i<=value; i++){
				graphic += "*";
				if(i==value)
				graphic += "\n";
			}
			
		}
		System.out.printf("%s%n%s", "This is the graphic generated:", graphic);
	}
}