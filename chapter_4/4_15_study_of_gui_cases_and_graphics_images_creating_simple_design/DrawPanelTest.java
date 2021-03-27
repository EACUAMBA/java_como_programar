import javax.swing.JFrame;

public class DrawPanelTest{
	public static void main(String... args){
		DrawPanel drawPanel = new DrawPanel();
		
		JFrame application = new JFrame();
		
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		application.add(drawPanel);
		application.setSize(300, 300);
		application.setVisible(true);
	}
}

