package com.eacuamba.java_como_programar.chapter_8._8_16_study_of_case_gui_and_graphical_images_using_objects_withh_graphical_images;

import java.awt.*;

/*
 * Author: Edilson Alexandre Cuamba
 * Data: 5/13/2021
 */
public class MyRectangle {
    private int x1;
    private int y1;;
    private int width;
    private int height;
    private Color color;
    private boolean isFill;

    public int getX1() {
        return x1;
    }

    public void setX1(int x1) {
        if(x1<=0)
            return;
        this.x1 = x1;
    }

    public int getY1() {
        return y1;
    }

    public void setY1(int y1) {
        if(y1<=0)
            return;
        this.y1 = y1;
    }

    public void setWidth(int width) {
        if(width<=0)
            return;
        this.width = width;
    }

    public void setHeight(int height) {
        if(height<=0)
            return;
        this.height = height;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public boolean isFill() {
        return isFill;
    }

    public void setFill(boolean fill) {
        isFill = fill;
    }

    public MyRectangle(int x1, int y1, int width, int height, Color color, boolean isFill){
        setX1(x1);
        setY1(y1);
        setWidth(width);
        setHeight(height);
        this.color = color;
        this.isFill = isFill;
    }

    public MyRectangle(){
        this.color = Color.BLACK;
        isFill = false;
    }
    public void draw(Graphics g){
        g.setColor(this.color);
        if(this.isFill)
            g.drawRect(this.getUpperLeftX(), this.getUpperLefty(), this.getWidth(), this.getHeight());
        else
            g.fillRoundRect(this.getUpperLeftX(), this.getUpperLefty(), this.getWidth(), this.getHeight(), 20, 20);
    }

    public int getUpperLeftX(){
        return (x1 > width)? width : x1;
    }
    public int getUpperLefty(){
        return (y1 > height)? height : y1;
    }
    public int getWidth(){
        return (x1-width) < 0  ? (x1-width)*-1 : (x1-width);
    }

    public int getHeight(){
        return (y1-height) < 0  ? (y1-height)*-1 : (y1-height);
    }
}
