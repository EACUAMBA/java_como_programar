import javax.swing.*;
import java.awt.*;

public class MyShapeContext {
    public static void main(String[] args) {
        JFrame app =  new JFrame();
        int numebrOfShapes = Integer.parseInt(JOptionPane.showInputDialog("Tell me the number of shapes to create in integer:"));
        ShapesPanel shapesPanel = new ShapesPanel(numebrOfShapes);

        app.add(shapesPanel);
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.setSize(500, 500);
        app.setVisible(true);
    }
}
