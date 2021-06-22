import java.awt.*;

public class MyOval extends MyShape{
    private boolean isFilled;

    public MyOval(){
        super();
        this.isFilled= false;
    }

    public MyOval(int x1, int y1, int width, int height, Color color, boolean isFilled){
        super(x1, y1, width, height, color);
        this.isFilled = isFilled;
    }

    @Override
    public void draw(Graphics graphics) {

    }
}
