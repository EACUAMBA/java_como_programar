import java.awt.Graphics;
import java.awt.Color;

/*
 * Author: Edilson Alexandre Cuamba
 * Data: 5/13/2021
 */
public class MyOval {
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

    public MyOval(int x1, int y1, int width, int height, Color color, boolean isFill){
        setX1(x1);
        setY1(y1);
        setWidth(width);
        setHeight(height);
        this.color = color;
        this.isFill = isFill;
    }

    public MyOval(){
        this.color = Color.BLACK;
        isFill = false;
    }
    public void draw(Graphics g){
        g.setColor(this.color);
        if(this.isFill)
            g.drawOval(this.x1, this.y1, this.width, this.height);
        else
            g.fillOval(this.x1, this.y1, this.width, this.height);
    }
}
