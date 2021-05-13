import javax.swing.JFrame;

/*
 * Author: Edilson Alexandre Cuamba
 * Data: 5/13/2021
 */
public class DrawPanelContext {
    public static void main(String[] args) {
        DrawPanel dp = new DrawPanel();
        JFrame jf = new JFrame();

        jf.setTitle("Desenhando linhas aleatoriamente!");
        jf.setVisible(true);
        jf.setSize(1300, 500);
        jf.add(dp);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
