package chapter_5._5_11_gui_creating_rectangles_and_ovals;

import javax.swing.JPanel;
import java.awt.Graphics;

//Extending the JPanel class and its properties, now we can send messages to its methods here and we can override the methods.
public class Shape extends JPanel{
	
	private int userChoice;
	
	public Shape(int userChoice){
		this.userChoice = userChoice;
	}
	
	//This is a fundamental and extremly important method, without this method we cannot paint anything in the JPanel. when we use the JPanel class without extends it we dont need to call this method becouse is called anyway. But if you extend you have to certify tha it will be called, i mean the JPanel method, so we use the super keyword to call methods of our class father.
	public void paintComponent(Graphics graphics){
	
		//send message to the paintComponent method on JPanel object. we have to give to the paintComponent method the Graphics object to draw.
		super.paintComponent(graphics);
		
		//Adding our own code to draw what we want.
		for(int i = 0; i<10; i++){
			switch(userChoice){
				case 1:
				
					//using graphics to draw
					graphics.drawRect(
						10 + i*10,
						10 + i*10,
						50 + i*10,
						50 + i*10
					);
					break;
				case 2:
					graphics.drawOval(
						10 + i*10,
						10 + i*10,
						50 + i*10,
						50 + i*10
					);
					break;
			}
		}
	}
}