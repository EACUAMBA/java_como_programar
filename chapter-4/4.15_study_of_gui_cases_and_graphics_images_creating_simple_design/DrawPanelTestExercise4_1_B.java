import javax.swing.JFrame;

public class DrawPanelTestExercise4_1_B{

	public static void main(String... args){
		DrawPanelExercise4_1_B dpeb = new DrawPanelExercise4_1_B();
		
		JFrame application = new JFrame();
		
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		application.add(dpeb);
		application.setSize(600, 600);
		application.setVisible(true);
	}
	
}