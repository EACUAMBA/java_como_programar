package chapter_4._4_15_study_of_gui_cases_and_graphics_images_creating_simple_design;

import java.awt.Graphics;
import javax.swing.JPanel;

public class DrawPanelExercise4_2_B extends JPanel{
	public void paintComponent(Graphics graphics){
		super.paintComponent(graphics);
		
		int width = this.getWidth();
		int height = this.getHeight();
		
		int zeroZeroWidth = 0;
		int zeroZeroHeight = 0;
		
		int undredZeroWidth = 0;
		int undredZeroHeight = 0;
		
		int undredUndredWidth = 0;
		int undredUndredHeight = height;
		
		int zeroUndredWidth = 0;
		int zeroUndredHeight = height;
		
		int counter = 1;
		while (counter <=15){
			
			// x = 0 , y = 0
			graphics.drawLine(0, zeroZeroHeight, zeroZeroWidth, height);
			zeroZeroHeight += (height/15);
			zeroZeroWidth += (width/15);
			
			// x = 100% , y = 0;
			graphics.drawLine(width, undredZeroHeight, undredZeroWidth, 0);
			undredZeroHeight += (height/15);
			undredZeroWidth += (width/15);
			
			// x = 100% , y = 100%;
			graphics.drawLine(0, undredUndredHeight, undredUndredWidth, 0);
			undredUndredHeight -= (height/15);
			undredUndredWidth += (width/15);
			
			// x = 0 , y = 100%;
			graphics.drawLine(width, zeroUndredHeight, zeroUndredWidth, height);
			zeroUndredHeight -= (height/15);
			zeroUndredWidth += (width/15);
			
			counter++;
		}
	}
}