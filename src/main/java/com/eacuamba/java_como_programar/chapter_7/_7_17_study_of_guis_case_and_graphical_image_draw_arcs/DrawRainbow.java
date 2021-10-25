package com.eacuamba.java_como_programar.chapter_7._7_17_study_of_guis_case_and_graphical_image_draw_arcs;

import javax.swing.*;
import java.awt.*;

public class DrawRainbow extends JPanel {
    private final Color VIOLET = new Color(128, 0, 128);
    private final Color INDIGO = new Color(75, 0, 130);

    private Color[] colors = {Color.WHITE, Color.white, VIOLET, this.INDIGO, Color.BLUE, Color.GREEN, Color.YELLOW, Color.ORANGE, Color.RED};

    public DrawRainbow() {
        outputLogMessage("PAINTING THE BACKGROUND TO WHITE");
        this.setBackground(Color.WHITE);
    }

    public void paintComponent(Graphics graphics) {
        outputLogMessage("CALLING THE PANT COMPONENT() FROM SUPER CLASS ");
        super.paintComponent(graphics);

        outputLogMessage("SETTING RADIUS TO 20");
        int RADIUS = 20;

        outputLogMessage("SETTING CENTERX AND CENTERY");
        int sizeX = this.getWidth() / 2;
        int sizeY = this.getHeight() - 10;


        outputLogMessage("USING OLD FOR TO PASS THROUGH ALL COLOR AND GET IT");
        for (int index = this.colors.length; index > 0; index--) {
            outputLogMessage("SETTING COLOR OF THE NEXT GRAPHIC OBJECT");
            graphics.setColor(colors[index - 1]);

            int positionX = sizeX - RADIUS * index , positionY = sizeY - RADIUS * index , widthRect = index * RADIUS * 2, heightRect = index* RADIUS * 2, startAngle = 0, arcAngle = 180;


            outputLogMessage("DRAWING THE ARC WITH COLOR " + colors[index - 1].toString() + " AND positionX = " + positionX + ", positionY = " + positionY + ", widthRect = " + widthRect + ", heightRect = " + heightRect + ", startAngle = " + startAngle + ", arcAngle = " + arcAngle);
            graphics.fillArc(
                    positionX,
                    positionY,
                    widthRect,
                    heightRect,
                    startAngle,
                    arcAngle
            );

        }

    }


    public void outputLogMessage(String message) {
        System.out.printf("%n***** %s *****%n", message);
    }
}
