package com.eacuamba.java_como_programar.chapter_13._13_4_manipulando_fontes.metrica_de_fontes;

import com.eacuamba.java_como_programar.chapter_13._13_4_manipulando_fontes.PainelFonts;

import javax.swing.*;
import java.awt.*;

public class MetricasPainel extends JPanel {

    public MetricasPainel(){

    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);

        Object[] temp = PainelFonts.gerarRandomicamente();
        Font font = ((Font)temp[1]);
        g.setColor(((Color)temp[0]));
        g.setFont(font);
        FontMetrics fm = g.getFontMetrics();
        g.drawString(String.format(
                "Metricas da fonte%nNome da Familia da font: %s%nNome do estilo da font: %s%nTamanho da Font: %d%n%nMeticas%nAltura: %d%nDescendente: %d%nLinha da Base: %d%nAscendente: %d%nEntrelinha: %d",
                font.getFamily(),
                (font.isBold()? "Bold" : font.isItalic()? "Italic": "Pain"),
                font.getSize(),
                fm.getHeight(),
                fm.getDescent(),
                0,
                fm.getAscent(),
                fm.getLeading()
        ), 5, 25);

    }
}
