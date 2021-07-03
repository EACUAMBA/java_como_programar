package chapter_10._10_11_study_of_case_gui_and_images_draw_with_polymorphism;

import java.awt.*;

public class MyRectangle extends MyBoundedShape{
    public MyRectangle(){
        super();
    }
    public MyRectangle(int x, int y, int width, int height, Color color, boolean filled){
        super(x, y, width, height, color, filled);
    }
    @Override
    public void draw(Graphics graphics) {
        graphics.setColor(this.getColor());
        if(!this.isFilled())
            graphics.drawRect(this.getX(), this.getY(), this.getWidth(), this.getHeight());
        else
            graphics.fillRect(this.getX(), this.getY(), this.getWidth(), this.getHeight());
    }
}
