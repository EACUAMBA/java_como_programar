package com.eacuamba.dev.chapter_6._6_13_study_case_of_guis_graphic_images_colors_filled_shapes;

import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;
import java.security.SecureRandom;

public class DrawShuffleShapes extends JPanel{
SecureRandom sr = new SecureRandom();
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		
		int shape = 0;
		
		for(int i=10; i>0; i--){
		
		createShapesAndColorThem((sr.nextInt(2)+1), g);
		
		}
	}
		
	public void createShapesAndColorThem(int x, Graphics g){
	switch(x){
			case 1:
			{
				g.setColor(new Color(sr.nextInt(255), sr.nextInt(255), sr.nextInt(255)));
				g.fillOval(sr.nextInt(250), sr.nextInt(250), sr.nextInt(100), sr.nextInt(100));
			}
			break;
			
			case 2:{
				g.setColor(new Color(sr.nextInt(255), sr.nextInt(255), sr.nextInt(255)));
				g.fillRect(sr.nextInt(250), sr.nextInt(250), sr.nextInt(150), sr.nextInt(150));
			}
			break;
	}
	}

}