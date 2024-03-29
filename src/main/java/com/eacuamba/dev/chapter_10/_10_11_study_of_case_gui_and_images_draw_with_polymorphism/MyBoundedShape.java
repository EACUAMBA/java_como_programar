package com.eacuamba.dev.chapter_10._10_11_study_of_case_gui_and_images_draw_with_polymorphism;

import java.awt.*;

public abstract class MyBoundedShape extends MyShape{
    private boolean filled;

    public MyBoundedShape(){
        super();
        this.filled = false;
    }

    public MyBoundedShape(int x, int y, int width, int height, Color color, boolean filled){
        super(x, y, width, height, color);
        this.filled = filled;
    }


    public void setFilled(boolean isFilled){
        this.filled = isFilled;
    }
    public boolean isFilled(){
        return this.filled;
    }
}
