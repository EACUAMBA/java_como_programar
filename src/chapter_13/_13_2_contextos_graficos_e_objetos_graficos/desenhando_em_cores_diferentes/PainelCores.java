package chapter_13._13_2_contextos_graficos_e_objetos_graficos.desenhando_em_cores_diferentes;

import javax.swing.*;
import java.awt.*;

public class PainelCores extends JPanel {
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        this.setBackground(Color.WHITE);

        g.setColor(Color.RED);
        g.fillRect(10, 20, 100, 50);
        g.drawString("Cor em RGB: " + Color.RED.toString(), 130, 20);

        g.setColor(Color.getHSBColor(0.5F, 0.7F, 0.9F));
        g.fillRect(10, 90, 100, 50);
        g.drawString("Cor em RGB: " + Color.getHSBColor(0.5F, 0.7F, 0.9F).toString(), 130, 90);

        g.setColor(Color.YELLOW);
        g.fillRect(10, 160, 100, 50);
        g.drawString("Cor em RGB: " + Color.YELLOW.toString(), 130, 160);

        Color blue = Color.BLUE;
        g.setColor(blue);
        g.fillRect(10, 220, 100, 50);
        g.drawString(String.format("Cor em RGB: RED: %d, GREEN: %d, BLUE: %d", blue.getRed(), blue.getGreen(), blue.getBlue()), 130, 220);
    }
}
