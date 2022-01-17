package com.eacuamba.dev.chapter_13._13_8_java_2d_api;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.GeneralPath;
import java.security.SecureRandom;

public class CaminhoGeralJPanel extends JPanel {
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        SecureRandom secureRandom = new SecureRandom();
        int[] xPoints = {55, 67, 109, 73, 83, 55, 27, 37, 1, 43};
        int[] yPoints = {0, 36, 36, 54, 96, 72, 96, 54, 36, 36};

        Graphics2D graphics2D = (Graphics2D) g;
        GeneralPath starGeneralPath = new GeneralPath();

        starGeneralPath.moveTo(xPoints[0], yPoints[0]);

        for(int i = 0; i < xPoints.length; i++){
            starGeneralPath.lineTo(xPoints[i], yPoints[i]);
        }
        starGeneralPath.closePath();
        graphics2D.translate(150, 150);

        for (int i = 0; i <= 20; i++){
            graphics2D.rotate(Math.PI / 10.0);

            graphics2D.setColor(new Color(secureRandom.nextInt(256), secureRandom.nextInt(256), secureRandom.nextInt(256)));

            graphics2D.fill(starGeneralPath);

        }
    }
}

class CaminhoGeral{
    public static void main(String[] args) {
        JFrame tela = new JFrame();
        tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tela.setVisible(true);
        tela.setSize(500, 500);
        tela.add(new CaminhoGeralJPanel());
    }
}
