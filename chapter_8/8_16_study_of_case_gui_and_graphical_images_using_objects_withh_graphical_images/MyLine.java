import java.awt.Color;
import java.awt.Graphics;

/*
 * Author: Edilson Alexandre Cuamba
 * Data: 5/13/2021
 */
public class MyLine {
    private int x1;
    private int y1;;
    private int x2;
    private int y2;
    private Color color;

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

    public void setX2(int x2) {
        if(x2 <=0)
            return;
        this.x2 = x2;
    }

    public void setY2(int y2) {
        if(y2 <=0)
            return;
        this.y2 = y2;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public MyLine(int x1, int y1, int x2, int y2, Color color){
        setX1(x1);
        setY1(y1);
        setX2(x2);
        setY2(y2);
        this.color = color;
    }

    public MyLine(){
        this.color = Color.BLACK;

    }

    public void draw(Graphics graphics){
        graphics.setColor(this.color);
        graphics.drawLine(this.x1, this.y1, this.x2, this.y2);
    }
}
