package com.eacuamba.java_como_programar.chapter_6._6_13_study_case_of_guis_graphic_images_colors_filled_shapes;

import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;

public class DrawSmiley extends JPanel{
	
	public void paintComponent(Graphics g){
	
	super.paintComponent(g);
	
	//draw the face
	g.setColor(Color.YELLOW);
	g.fillOval(10, 10, 200, 200);
	
	//draw the eyes
	g.setColor(Color.BLACK);
	g.fillOval(55, 65, 30, 30);
	g.fillOval(135, 65, 30, 30);
	
	g.setColor(Color.RED);
	//draw the mouth
	g.fillOval(50, 110, 120, 60);
	
	//retoca a mouth to create a smiley
	g.setColor(Color.PINK);
	g.fillRect(50, 110, 120, 30);
	g.fillOval(50, 120, 120, 40);
	
	}
}