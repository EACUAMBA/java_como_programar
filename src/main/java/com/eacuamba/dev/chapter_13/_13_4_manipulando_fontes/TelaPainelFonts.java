package com.eacuamba.dev.chapter_13._13_4_manipulando_fontes;

import javax.swing.*;

public class TelaPainelFonts {

    public static void main(String[] args) {
        JFrame tela = new JFrame();
        tela.add(new PainelFonts());
        tela.setVisible(true);
        tela.setSize(500, 500);
        tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
