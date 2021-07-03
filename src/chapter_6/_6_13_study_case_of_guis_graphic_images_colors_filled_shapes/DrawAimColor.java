package chapter_6._6_13_study_case_of_guis_graphic_images_colors_filled_shapes;

import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;
import java.security.SecureRandom;

public class DrawAimColor extends JPanel{
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		
		int x=0, y=0;
		for(int i =500; i>=0; ){
		g.setColor(new Color(new SecureRandom().nextInt(255), new SecureRandom().nextInt(255), new SecureRandom().nextInt(255)));
		x +=25;
		y +=25;
		i=i-50;
		g.fillOval(x,y, i, i);
		}
		
	}
}