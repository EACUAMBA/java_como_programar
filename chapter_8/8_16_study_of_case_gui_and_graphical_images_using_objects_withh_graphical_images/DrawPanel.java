import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;
import java.security.SecureRandom;

/*
 * Author: Edilson Alexandre Cuamba
 * Data: 5/13/2021
 */
public class DrawPanel extends JPanel{
    protected static SecureRandom sr = new SecureRandom();
    private MyLine[] lines;
    private MyOval[] ovals;
    private MyRectangle[] rects;

    public DrawPanel(){
        this.lines = new MyLine[5 + sr.nextInt(5)];
        this.ovals = new MyOval[1 + sr.nextInt(5)];
        this.rects = new MyRectangle[5 + sr.nextInt(5)];
        this.setBackground(Color.BLACK);

        for(int i = 0; i<lines.length; i++){
            MyLine line = new MyLine(sr.nextInt(1300), sr.nextInt(600), sr.nextInt(300), sr.nextInt(300), new Color(sr.nextInt(255), sr.nextInt(255), sr.nextInt(255)));
            lines[i] = line;
        }
        for(int i = 0; i<rects.length; i++){
            MyRectangle rect = new MyRectangle(sr.nextInt(1300), sr.nextInt(600), sr.nextInt(100), sr.nextInt(100), new Color(sr.nextInt(255), sr.nextInt(255), sr.nextInt(255)), (i/2 == 0));
            rects[i] = rect;
        }
        for(int i = 0; i<ovals.length; i++){
            MyOval oval = new MyOval(sr.nextInt(1300), sr.nextInt(600), sr.nextInt(100), sr.nextInt(100), new Color(sr.nextInt(255), sr.nextInt(255), sr.nextInt(255)), (i/2 == 0));
            ovals[i] = oval;
        }
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);

        for (MyLine line: this.lines)
            line.draw(g);
        for (MyOval line: this.ovals)
            line.draw(g);

        for (MyRectangle line: this.rects)
            line.draw(g);


    }
}
