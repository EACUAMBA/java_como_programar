import javax.swing.*;

public class DrawRainbowContext {
    public static void main(String[] args){
        DrawRainbow drawRainbow = new DrawRainbow();
        JFrame jFrame = new JFrame();

        jFrame.add(drawRainbow);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setSize(500, 500);
        jFrame.setVisible(true);


    }
}
