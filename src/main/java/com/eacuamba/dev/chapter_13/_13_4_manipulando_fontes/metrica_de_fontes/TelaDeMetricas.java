package com.eacuamba.dev.chapter_13._13_4_manipulando_fontes.metrica_de_fontes;

import javax.swing.*;

public class TelaDeMetricas {
    public static void main(String[] args) {
        JFrame tela = new JFrame("Mtricas");
        tela.add(new JScrollPane(new MetricasPainel()));
        tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tela.setSize(500, 500);
        tela.setVisible(true);
    }
}
