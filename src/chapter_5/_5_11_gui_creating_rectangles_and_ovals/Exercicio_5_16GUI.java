package chapter_5._5_11_gui_creating_rectangles_and_ovals;

import java.awt.Graphics;
import javax.swing.JPanel;

public class Exercicio_5_16GUI extends JPanel{
	public int v1;
	public int v2;
	public int v3;
	public int v4;
	public int v5;
	
	public Exercicio_5_16GUI(int v1, int v2, int v3, int v4, int v5){
		this.v1 = v1;
		this.v2 = v2;
		this.v3 = v3;
		this.v4 = v4;
		this.v5 = v5;
	}
	
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		
		int X=25, Y=100; // Um assuming tha the screen will be 125x150;
		
		int y = Y - v1*10;
		g.drawRect(X, y, 10, v1*10);
		
		y = Y - v2*10;
		g.drawRect(X += 15, y, 10, v2*10);
		
		y = Y - v3*10;
		g.drawRect(X += 15, y, 10, v3*10);
		
		y = Y - v4*10;
		g.drawRect(X += 15, y, 10, v4*10);
		
		y = Y - v5*10;
		g.drawRect(X += 15, y, 10, v5*10);
		
	}
	
	
}