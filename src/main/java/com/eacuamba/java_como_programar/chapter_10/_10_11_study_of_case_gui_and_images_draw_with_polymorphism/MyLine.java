package com.eacuamba.java_como_programar.chapter_10._10_11_study_of_case_gui_and_images_draw_with_polymorphism;

import java.awt.*;

public class MyLine extends MyShape {
    public MyLine() {
        super();
    }

    public MyLine(int x, int y, int width, int height, Color color) {
        super(x, y, width, height, color);
    }

    @Override
    public void draw(Graphics graphics) {
        graphics.setColor(this.getColor());
        graphics.setColor(this.getColor());
        graphics.drawLine(this.getX(), this.getY(), this.getWidth(), this.getHeight());

    }
}
