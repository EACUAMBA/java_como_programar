package com.eacuamba.java_como_programar.chapter_6._6_13_study_case_of_guis_graphic_images_colors_filled_shapes;

import javax.swing.JFrame;

public class DrawShuffleShapesTest{
	public static void main(String args[]){
	
		DrawShuffleShapes dss = new DrawShuffleShapes();
		JFrame application = new JFrame();
		
		application.add(dss);
		application.setVisible(true);
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		application.setSize(600, 600);
		
	
	}
}