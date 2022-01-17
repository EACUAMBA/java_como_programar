package com.eacuamba.dev.chapter_10._10_11_study_of_case_gui_and_images_draw_with_polymorphism;

import java.awt.*;

public abstract class MyShape {
    private int x;
    private int y;;
    private int width;
    private int height;
    private Color color;
    private boolean isFilled;

    public MyShape(){
        this.x = 0;
        this.y = 0;
        this.width = 0;
        this.height = 0;
        this.color = Color.BLACK;

    }
    public MyShape(int x, int y, int  width, int height, Color color){
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.color = color;

    }
    public abstract void draw(Graphics graphics);

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public boolean isFilled() {
        return isFilled;
    }

    public void setFilled(boolean filled) {
        isFilled = filled;
    }
}
