package com.eacuamba.java_como_programar.chapter_5._5_11_gui_creating_rectangles_and_ovals;

import javax.swing.JOptionPane;
import javax.swing.JFrame;

public class DrawShapesExercicies_DrawingOvalsTest{
	public static void main(String args[]){
		
		int userChoice = -1;
		
		userChoice = Integer.parseInt(JOptionPane.showInputDialog(null, "Please selec which shape you want to draw 12 times.\n\t1. Draw Ovals.\n\t2. Draw Rectangles.\n\nEnter the value above:"));
		
		DrawShapesExercicies_DrawingOvals drawShapesExercicies_DrawingOvals = new DrawShapesExercicies_DrawingOvals(userChoice);
		
		JFrame jframe = new JFrame();
		
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jframe.setSize(500, 500);
		jframe.add(drawShapesExercicies_DrawingOvals);
		jframe.setVisible(true);
	}
}