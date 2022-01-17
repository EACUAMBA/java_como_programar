package com.eacuamba.dev.chapter_6._6_13_study_case_of_guis_graphic_images_colors_filled_shapes;

import javax.swing.JFrame;

public class DrawAimColorTest{
	public static void main(String args[]){
	
	DrawAimColor dac = new DrawAimColor();
	JFrame application = new JFrame();
	
	application.add(dac);
	application.setVisible(true);
	application.setSize(600, 600);
	application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	}
	