package com.eacuamba.java_como_programar.chapter_8._8_16_study_of_case_gui_and_graphical_images_using_objects_withh_graphical_images;

import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;
import java.security.SecureRandom;

/*
 * Author: Edilson Alexandre Cuamba
 * Data: 5/13/2021
 */
public class DrawPanel extends JPanel{
    protected static SecureRandom sr = new SecureRandom();
    private MyLine[] lines;
    private MyOval[] ovals;
    private MyRectangle[] rects;
    private String status;

    public DrawPanel(){
        this.lines = new MyLine[5 + sr.nextInt(5)];
        this.ovals = new MyOval[1 + sr.nextInt(5)];
        this.rects = new MyRectangle[5 + sr.nextInt(5)];
        this.setBackground(Color.BLACK);


        for(int i = 0; i<lines.length; i++){
            MyLine line = new MyLine(sr.nextInt(1300), sr.nextInt(600), sr.nextInt(300), sr.nextInt(300), new Color(sr.nextInt(255), sr.nextInt(255), sr.nextInt(255)));
            lines[i] = line;
        }
        for(int i = 0; i<rects.length; i++){
            MyRectangle rect = new MyRectangle(sr.nextInt(1300), sr.nextInt(600), sr.nextInt(100), sr.nextInt(100), new Color(sr.nextInt(255), sr.nextInt(255), sr.nextInt(255)), (i/2 == 0));
            rects[i] = rect;
        }
        for(int i = 0; i<ovals.length; i++){
            MyOval oval = new MyOval(sr.nextInt(1300), sr.nextInt(600), sr.nextInt(100), sr.nextInt(100), new Color(sr.nextInt(255), sr.nextInt(255), sr.nextInt(255)), (i/2 == 0));
            ovals[i] = oval;
        }
        this.status = String.format("%s:%d     %s:%d     %s:%d", "Number of lines", this.lines.length, "Number of rects", this.rects.length, "Number of ovals", this.ovals.length) ;
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        for (MyRectangle line: this.rects)
            line.draw(g);
        for (MyLine line: this.lines)
            line.draw(g);
        for (MyOval line: this.ovals)
            line.draw(g);


    }

    public String getStatus(){
        return this.status;
    }
}
