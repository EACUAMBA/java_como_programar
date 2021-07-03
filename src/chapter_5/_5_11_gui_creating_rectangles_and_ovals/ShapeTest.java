package chapter_5._5_11_gui_creating_rectangles_and_ovals;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ShapeTest{
	public static void main(String... args){
		
		int userChoice = -1;
		
		userChoice = Integer.parseInt(JOptionPane.showInputDialog(null, "Please select only one choice:\n\t1. Draw rectangles.\n\t2. Draw ovals.\n\nEnter your choice below:"));
		
		//Creating an JPanel object and give the parameters requiriment into its constructor.
		Shape shape = new Shape(userChoice);
		
		//Construting our frame where the JPanel will be and will draw all shapes objects.
		JFrame jframe = new JFrame();
		
		//Setting the button X on the panel bar, what it will do? Close when you click.
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Setting the size of the frame that we are creating.
		jframe.setSize(500, 500);
		
		//adding the JPanel into the JFrame so we can see what we drawn in the Shape object.
		jframe.add(shape);
		
		//Our JFrame already exits now we need to set if it will be visible or hiden. 
		jframe.setVisible(true);
		
	}
}