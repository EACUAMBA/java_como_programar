package com.eacuamba.dev.chapter_9._9_7_study_of_gui_case_and_graphical_images_showing_text_and_images_using_labels;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class LabelContext{
    public static void main(String[] args) {
        JLabel northText = new JLabel("This is in north");

        ImageIcon labelIage = new ImageIcon("logo.png"); //This image should be in the same level as the .class file, because the IDEA don't work well we did it. The context of the .class file generated is the root of the project as you can see.
        JLabel centerImageText = new JLabel(labelIage);

        JLabel southImageText = new JLabel(labelIage);
        southImageText.setText("This is in south");

        JFrame app = new JFrame();

        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        app.add(northText, BorderLayout.NORTH);
        app.add(centerImageText, BorderLayout.CENTER);
        app.add(southImageText, BorderLayout.SOUTH);

        app.setSize(500, 500);
        app.setVisible(true);

    }
}