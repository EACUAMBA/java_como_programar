import java.awt.Graphics;
import javax.swing.JPanel;

public class DrawPanel extends JPanel{
	
	public void paintComponent(Graphics graphics){
		
		super.paintComponent(graphics);
		
		int width = this.getWidth();
		int height = this.getHeight();
		
		graphics.drawLine(0,0, width, height);
		
		graphics.drawLine(0, height, width, 0);
	}	
}