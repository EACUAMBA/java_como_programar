package chapter_5._5_11_gui_creating_rectangles_and_ovals;

import javax.swing.JOptionPane;
import javax.swing.JFrame;

public class Exercicio_5_16GUITest{
	public static void main(String[] args){
		
		int v1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the 1st value:"));
		int v2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the 2nd value:"));
		int v3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the 3rd value:"));
		int v4 = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the 4th value:"));
		int v5 = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the 5th value:"));
		
		Exercicio_5_16GUI exercicio_5_16GUI = new Exercicio_5_16GUI(v1, v2, v3, v4, v5);
		
		JFrame jframe = new JFrame();
		
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jframe.add(exercicio_5_16GUI);
		jframe.setSize(150, 150);
		jframe.setVisible(true);
		
	}
}