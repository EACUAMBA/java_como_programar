package chapter_12._12_16_subclasse_jpanel_para_desenhar_com_mouse;

import javax.swing.*;
import java.awt.*;
import java.util.Arrays;

public class DesenhandoComMOuseContext extends JFrame {
    public static void main(String[] args) {
        DesenhandoComMOuseContext desenhandoComMOuseContext = new DesenhandoComMOuseContext();
        desenhandoComMOuseContext.add(new DesenhandoComMousePanel(), BorderLayout.CENTER);
        desenhandoComMOuseContext.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        desenhandoComMOuseContext.setSize(500, 500);
        desenhandoComMOuseContext.setVisible(true);

    }
}
