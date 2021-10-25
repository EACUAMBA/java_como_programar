package com.eacuamba.java_como_programar.chapter_4._4_15_study_of_gui_cases_and_graphics_images_creating_simple_design;

import java.awt.Graphics;
import javax.swing.JPanel;

public class DrawPanelExercise4_1_A extends JPanel{
	public void paintComponent(Graphics graphics){
		super.paintComponent(graphics);
		
		int width = this.getWidth();
		int height = this.getHeight();
		int previousWidth = 0;
		int previousHeight = height;
		
		int counter = 1;
		while (counter <=15){
			
			graphics.drawLine(0, 0, previousWidth, previousHeight);
			previousHeight -= (height/15);
			previousWidth += (width/15);
			
			counter++;
		}
	}
}