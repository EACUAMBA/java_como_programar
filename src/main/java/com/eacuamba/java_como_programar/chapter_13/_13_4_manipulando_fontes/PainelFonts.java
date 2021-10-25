package com.eacuamba.java_como_programar.chapter_13._13_4_manipulando_fontes;

import javax.swing.*;
import java.awt.*;
import java.security.SecureRandom;
import java.util.Arrays;

public class PainelFonts extends JPanel {

    static SecureRandom sr;

    public PainelFonts(){
        super();



    }

    public static Object[] gerarRandomicamente(){
        sr = new SecureRandom();
        Color cor = new Color(sr.nextInt(255), sr.nextInt(255), sr.nextInt(255));
        Font font = null;
        int fontType = sr.nextInt(5);
        switch (fontType){
            case 0:{
                font = new Font("Serif", Font.PLAIN, 14);
                break;
            }
            case 1:{
                font = new Font("Sansserif", Font.ITALIC, 16);
                break;
            }
            case 2:{
                font = new Font("Monospaced", Font.BOLD, 18);
                break;
            }
            case 3:{
                font = new Font("Serif", Font.BOLD, 20);
                break;
            }
            case 4:{
                font = new Font("Sansserif", Font.BOLD, 22);
                break;
            }
            case 5:{
                font = new Font("Monospaced", Font.PLAIN, 24);
                break;
            }
        }
        return new Object[]{cor, font};
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);

        int i = 1;
        while (i <= 5){
            Object[] temp = gerarRandomicamente();
            g.setColor((Color)temp[0]);
            g.setFont((Font)temp[1]);
            g.drawString(
                    String.format("A cor é %d e a família da fonte é %s e o tamanho é %d e o tipo é %s",
                            ((Color)temp[0]).getRGB(),
                            ((Font)temp[1]).getFamily(),
                            ((Font)temp[1]).getSize(),
                            ((Font)temp[1]).getStyle()
                    ),
                    5,
                    i*30
            );
            i++;
        }
    }



}
