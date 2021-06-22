import java.awt.*;

public class MyOval extends MyBoundedShape{
    public MyOval(){
        super();
    }
    public MyOval(int x, int y, int width, int height, Color color, boolean filled){
        super(x, y, width, height, color, filled);
    }
    @Override
    public void draw(Graphics graphics) {
        graphics.setColor(this.getColor());
        if(!this.isFilled())
            graphics.drawOval(this.getX(), this.getY(), this.getWidth(), this.getHeight());
        else
            graphics.fillOval(this.getX(), this.getY(), this.getWidth(), this.getHeight());
    }
}
