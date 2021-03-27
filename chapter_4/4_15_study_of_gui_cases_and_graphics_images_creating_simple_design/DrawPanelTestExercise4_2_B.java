import javax.swing.JFrame;

public class DrawPanelTestExercise4_2_B{

	public static void main(String... args){
		DrawPanelExercise4_2_B dpeb = new DrawPanelExercise4_2_B();
		
		JFrame application = new JFrame();
		
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		application.add(dpeb);
		application.setSize(250, 250);
		application.setVisible(true);
	}
	
}