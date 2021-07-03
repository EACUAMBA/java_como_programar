package chapter_7._7_17_study_of_guis_case_and_graphical_image_draw_arcs;

import javax.swing.*;
import java.awt.*;
import java.security.SecureRandom;
import java.util.ArrayList;

public class DrawingSquaredSpiral extends JPanel {
    private SecureRandom sr = new SecureRandom();
    public DrawingSquaredSpiral() {
        this.setBackground(Color.BLACK);
    }
    class Linha {
        int pontoInicialX, pontoInicialY, pontoFinalX, pontoFinalY;

        public Linha(int pontoInicialX, int pontoInicialY, int pontoFinalX, int pontoFinalY) {
            this.pontoInicialX = pontoInicialX;
            this.pontoInicialY = pontoInicialY;
            this.pontoFinalX = pontoFinalX;
            this.pontoFinalY = pontoFinalY;
        }
    }
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        int comprimentoDoPainel = this.getWidth();
        int alturaDoPainel = this.getHeight();
        int numeroDeLinhasNaHorizontal = comprimentoDoPainel / 20;
        ArrayList<Linha> linhas = new ArrayList<>();

        int bordaFinalDupla = 19;
        for (int i = 1; i < numeroDeLinhasNaHorizontal / 2; i++) {
            alturaDoPainel -= 19;
            comprimentoDoPainel -= 19;
            int bordeSimples = 19 * i;
            bordaFinalDupla += 19;

            Linha linhaVerticalCimaParaBaixo = new Linha(bordeSimples, bordeSimples, bordeSimples, alturaDoPainel);
            Linha linhaHorizontalEsquerdaParaDireita = new Linha(bordeSimples, alturaDoPainel, comprimentoDoPainel, alturaDoPainel);
            Linha linhaVerticalBaixoParaCima = new Linha(comprimentoDoPainel, alturaDoPainel, comprimentoDoPainel, bordaFinalDupla);
            Linha linhaHorizontalDireitaParaEsquerda = new Linha(comprimentoDoPainel, bordaFinalDupla, bordaFinalDupla, bordaFinalDupla);

            linhas.add(linhaVerticalCimaParaBaixo);
            linhas.add(linhaHorizontalEsquerdaParaDireita);
            linhas.add(linhaVerticalBaixoParaCima);
            linhas.add(linhaHorizontalDireitaParaEsquerda);
        }

        for (Linha Linha : linhas) {
            g.setColor(new Color(sr.nextInt(255), sr.nextInt(255), sr.nextInt(255)));
            g.drawLine(Linha.pontoInicialX, Linha.pontoInicialY, Linha.pontoFinalX, Linha.pontoFinalY);
        }
    }


}
