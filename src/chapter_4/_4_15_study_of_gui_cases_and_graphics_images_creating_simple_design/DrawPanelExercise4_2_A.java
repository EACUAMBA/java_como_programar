package chapter_4._4_15_study_of_gui_cases_and_graphics_images_creating_simple_design;

import java.awt.Graphics;
import javax.swing.JPanel;

public class DrawPanelExercise4_2_A extends JPanel{
	public void paintComponent(Graphics graphics){
		super.paintComponent(graphics);
		
		int width = this.getWidth();
		int height = this.getHeight();
		
		
		int previousWidth = (width/15);
		int previousHeight = height;
		
		int initialHeight = 0;
		int initialWidth = 0;
		
		int counter = 1;
		while (counter <=15){
			
			
			graphics.drawLine(initialWidth, initialHeight, previousWidth, previousHeight);
			previousWidth += (width/15);
			initialHeight += (height/15);
			
			counter++;
		}
	}
}