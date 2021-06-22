import java.awt.*;

public abstract class MyShape {
    private int x1;
    private int y1;;
    private int width;
    private int height;
    private Color color;
    private boolean isFilled;

    public MyShape(){
        this.x1 = 0;
        this.y1 = 0;
        this.width = 0;
        this.height = 0;
        this.color = Color.BLACK;

    }
    public MyShape(int x1, int y1, int  width, int height, Color color){
        this.x1 = x1;
        this.y1 = y1;
        this.width = width;
        this.height = height;
        this.color = color;

    }
    public abstract void draw(Graphics graphics);

    public int getX1() {
        return x1;
    }

    public void setX1(int x1) {
        this.x1 = x1;
    }

    public int getY1() {
        return y1;
    }

    public void setY1(int y1) {
        this.y1 = y1;
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
