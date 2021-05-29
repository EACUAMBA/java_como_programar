import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class LabelContext{
    public static void main(String[] args) {
        JLabel northText = new JLabel("This is in north");

        ImageIcon labelIage = new ImageIcon("logo.png");
        JLabel centerImageText = new JLabel(labelIage);

        JLabel southImageText = new JLabel(labelIage);
        southImageText.setText("This is in south");

        JFrame app = new JFrame();

        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        app.add(northText, BorderLayout.NORTH);
        app.add(centerImageText, BorderLayout.CENTER);
        app.add(southImageText, BorderLayout.SOUTH);

        app.setSize(500, 500);
        app.setVisible(true);

    }
}