package com.eacuamba.java_como_programar.chapter_7._7_17_study_of_guis_case_and_graphical_image_draw_arcs;

import javax.swing.*;

public class DrawingSquaredSpiralContext {
    public static void main(String[] args) {
        DrawingSquaredSpiral drawingSquaredSpiral = new DrawingSquaredSpiral();
        JFrame jFrame = new JFrame();

        int tamanhoEscolhido;
        do {
            String resposta = JOptionPane.showInputDialog("(Must be lower than you screen size and more than 150)\nWidth: ");
            tamanhoEscolhido = Integer.parseInt(resposta==null || resposta.equals("") ? "0" : resposta);
        } while (tamanhoEscolhido < 150);

        jFrame.setSize(tamanhoEscolhido, tamanhoEscolhido);
        jFrame.setTitle("Desenhando uma espiral retangular!..");
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.add(drawingSquaredSpiral);
        jFrame.setResizable(false);
        jFrame.setVisible(true);
    }
}

