import java.awt.*;

public class MyRectangle extends MyShape{
    private boolean isFilled;

    public MyRectangle(){
        super();
        this.isFilled= false;
    }

    public MyRectangle(int x1, int y1, int width, int height, Color color, boolean isFilled){
        super(x1, y1, width, height, color);
        this.isFilled = isFilled;
    }

    @Override
    public void draw(Graphics graphics) {

    }
}
