import javax.swing.JFrame;

public class DrawSmileyTest{
	public static void main(String args[]){
	
		DrawSmiley drawSmiley = new DrawSmiley();
		JFrame application = new JFrame();
		
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		application.add(drawSmiley);
		application.setSize(500, 500);
		application.setVisible(true);
		
		
		
	}
}