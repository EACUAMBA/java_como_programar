import javax.swing.JFrame;

public class DrawPanelTestExercise4_1_A{

	public static void main(String... args){
		DrawPanelExercise4_1_A dpea = new DrawPanelExercise4_1_A();
		
		JFrame application = new JFrame();
		
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		application.add(dpea);
		application.setSize(250, 250);
		application.setVisible(true);
	}
	
}