package com.eacuamba.dev.chapter_4._4_15_study_of_gui_cases_and_graphics_images_creating_simple_design;

import java.awt.Graphics;
import javax.swing.JPanel;

public class DrawPanelExercise4_1_B extends JPanel{
	public void paintComponent(Graphics graphics){
		super.paintComponent(graphics);
		
		int width = this.getWidth();
		int height = this.getHeight();
		
		int zeroZeroWidth = 0;
		int zeroZeroHeight = height;
		
		int undredZeroWidth = width;
		int undredZeroHeight = height;
		
		int undredUndredWidth = 0;
		int undredUndredHeight = height;
		
		int zeroUndredWidth = width;
		int zeroUndredHeight = height;
		
		int counter = 1;
		while (counter <=15){
			
			// x = 0 , y = 0
			graphics.drawLine(0, 0, zeroZeroWidth, zeroZeroHeight);
			zeroZeroHeight -= (height/15);
			zeroZeroWidth += (width/15);
			
			// x = 100% , y = 0;
			graphics.drawLine(width, 0, undredZeroWidth, undredZeroHeight);
			undredZeroHeight -= (height/15);
			undredZeroWidth -= (width/15);
			
			// x = 100% , y = 100%;
			graphics.drawLine(width, height, undredUndredWidth, undredUndredHeight);
			undredUndredHeight -= (height/15);
			undredUndredWidth += (width/15);
			
			// x = 0 , y = 100%;
			graphics.drawLine(0, height, zeroUndredWidth, zeroUndredHeight);
			zeroUndredHeight -= (height/15);
			zeroUndredWidth -= (width/15);
			
			counter++;
		}

	}
}