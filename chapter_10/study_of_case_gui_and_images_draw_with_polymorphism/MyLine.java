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
