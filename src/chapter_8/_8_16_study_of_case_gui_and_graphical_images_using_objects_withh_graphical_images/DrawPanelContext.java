package chapter_8._8_16_study_of_case_gui_and_graphical_images_using_objects_withh_graphical_images;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.*;

/*
 * Author: Edilson Alexandre Cuamba
 * Data: 5/13/2021
 */
public class DrawPanelContext {
    public static void main(String[] args) {
        DrawPanel dp = new DrawPanel();
        JFrame jf = new JFrame();
        JLabel status = new JLabel();
        status.setText(dp.getStatus());
        status.setSize(1300, 200);
        status.setFont(new Font("Montserrat", 1, 22));

        jf.setTitle("Desenhando linhas aleatoriamente!");
        jf.setVisible(true);
        jf.setSize(1300, 500);
        jf.add(dp);
        jf.add(status, BorderLayout.SOUTH);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
