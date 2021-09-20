package chapter_12._12_10_botoes_que_mantem_estado._12_10_1_jcheckbox;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class JCheckBoxJFrameContext{
    public static void main(String[] args) {
        JCheckBoxJFrame jCheckBoxJFrame = new JCheckBoxJFrame();

        jCheckBoxJFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jCheckBoxJFrame.setVisible(true);
        jCheckBoxJFrame.setBackground(Color.BLACK);
        jCheckBoxJFrame.setSize(500, 500);

    }
}
