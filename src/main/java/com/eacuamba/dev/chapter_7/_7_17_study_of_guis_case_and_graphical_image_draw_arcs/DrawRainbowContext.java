package com.eacuamba.dev.chapter_7._7_17_study_of_guis_case_and_graphical_image_draw_arcs;

import javax.swing.*;

public class DrawRainbowContext {
    public static void main(String[] args){
        DrawRainbow drawRainbow = new DrawRainbow();
        JFrame jFrame = new JFrame();

        jFrame.add(drawRainbow);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setSize(500, 500);
        jFrame.setVisible(true);


    }
}
