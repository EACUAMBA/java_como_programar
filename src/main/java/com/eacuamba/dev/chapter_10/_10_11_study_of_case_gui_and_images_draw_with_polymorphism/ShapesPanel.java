package com.eacuamba.dev.chapter_10._10_11_study_of_case_gui_and_images_draw_with_polymorphism;

import javax.swing.*;
import java.awt.*;
import java.security.SecureRandom;

public class ShapesPanel extends JPanel {
    private static SecureRandom sr = new SecureRandom();
    private int numberOfShapes;
    private MyShape[] shapes;

    public ShapesPanel(int numberOfShapes){
        this.numberOfShapes = numberOfShapes;


    }

    public void createShapes(){
        this.shapes = new MyShape[this.numberOfShapes];
        for(int i = 0; i < this.numberOfShapes; i++) {
            int whichShape = sr.nextInt(3);
            int x = sr.nextInt(400);
            int y = sr.nextInt(400);
            int width = x+100;
            int height = y+100;
            Color color = new Color(sr.nextInt(255), sr.nextInt(255), sr.nextInt(255));

            switch (whichShape){
                case 0:{
                    this.shapes[i] = new MyLine(x, y, width, height, color);
                    break;
                }
                case 1:{
                    this.shapes[i] = new MyOval(x, y, width, height, color, (x%2 == 0));
                    break;
                }
                case 2:{
                    this.shapes[i] = new MyRectangle(x, y, width, height, color, (x%2 == 0));
                    break;
                }
            }

        }
    }

    @Override
    public void paintComponent(Graphics graphics){
        super.paintComponent(graphics);
        this.createShapes();
        for (MyShape shape: this.shapes)
            shape.draw(graphics);
    }
}
