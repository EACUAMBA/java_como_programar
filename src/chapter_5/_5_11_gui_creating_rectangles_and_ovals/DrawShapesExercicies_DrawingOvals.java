package chapter_5._5_11_gui_creating_rectangles_and_ovals;

import java.awt.Graphics;
import javax.swing.JPanel;

public class DrawShapesExercicies_DrawingOvals extends JPanel{
	
	private int userChoice;
	
	public DrawShapesExercicies_DrawingOvals(int userChoice){
		this.userChoice = userChoice;
	}
	
	public void paintComponent(Graphics graphics){
		super.paintComponent(graphics);
		
		int oldX = 250, oldY = 250;
		
		for(int i = 0; i<12; i++){
			
			oldX -= 10;
			oldY -= 10;
			switch(userChoice){
			
			case 1:
			graphics.drawOval(oldX, oldY, 40+i*20, 40+i*20);
			break;
			
			case 2:
			graphics.drawRect(oldX, oldY, 20+i*20, 20+i*20);
			break;
			}
		}
	}
}