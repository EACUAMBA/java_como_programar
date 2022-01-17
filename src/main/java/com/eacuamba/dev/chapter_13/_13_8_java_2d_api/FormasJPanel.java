package com.eacuamba.dev.chapter_13._13_8_java_2d_api;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;
import java.awt.image.BufferedImage;

public class FormasJPanel extends JPanel {
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D graphics2D = (Graphics2D) g; //Fazendo a Coerção de Graphics para Graphics2D

        graphics2D.setPaint(new GradientPaint(5, 30, Color.BLUE, 35, 100, Color.YELLOW, true));
        graphics2D.fill(new Ellipse2D.Double(5, 30, 65, 100));

        graphics2D.setColor(Color.RED);
        graphics2D.setStroke(new BasicStroke(10.0F));
        graphics2D.draw(new Rectangle2D.Double(80, 30, 65, 100));

        BufferedImage  bufferedImage = new BufferedImage(10, 10, BufferedImage.TYPE_INT_RGB);

        Graphics2D graphics2DBuferredImage = bufferedImage.createGraphics();
        graphics2DBuferredImage.setColor(Color.YELLOW);
        graphics2DBuferredImage.fillRect(0, 0, 10, 10);
        graphics2DBuferredImage.setColor(Color.BLACK);
        graphics2DBuferredImage.drawRect(1, 1, 6, 6);
        graphics2DBuferredImage.setColor(Color.BLUE);
        graphics2DBuferredImage.fillRect(1, 1, 3, 3);
        graphics2DBuferredImage.setColor(Color.RED);
        graphics2DBuferredImage.fillRect(4, 4, 3, 3);

        graphics2DBuferredImage.setPaint(new TexturePaint(bufferedImage, new Rectangle(10, 10)));
        graphics2DBuferredImage.fill(new RoundRectangle2D.Double(155, 30, 75, 100, 50, 50));

        graphics2D.setPaint(Color.WHITE);
        graphics2D.setStroke(new BasicStroke(6.0f));
        graphics2D.draw(new Arc2D.Double(240, 30, 75, 100, 0, 270, Arc2D.PIE));

        graphics2D.setColor(Color.GREEN);
        graphics2D.draw(new Line2D.Double(395, 30,320, 150));

        float[] dashes = {10};
        graphics2D.setPaint(Color.yellow);
        graphics2D.setStroke(new BasicStroke(4, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND, 10, dashes, 0));
        graphics2D.draw(new Line2D.Double(320, 30, 395, 150));


    }
}

class FormasApp{
    public static void main(String[] args) {
        JFrame formasApp= new JFrame();
        formasApp.setVisible(true);
        formasApp.setSize(500, 500);
        formasApp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        formasApp.add(new FormasJPanel());
    }
}
