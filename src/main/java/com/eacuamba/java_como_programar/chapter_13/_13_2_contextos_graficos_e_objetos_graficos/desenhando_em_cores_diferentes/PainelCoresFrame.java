package com.eacuamba.java_como_programar.chapter_13._13_2_contextos_graficos_e_objetos_graficos.desenhando_em_cores_diferentes;

import javax.swing.*;

public class PainelCoresFrame extends JFrame {
    public static void main(String[] args) {
        PainelCoresFrame  p = new PainelCoresFrame();

        PainelCores pc = new PainelCores();

        p.add(pc);

        p.setVisible(true);

        p.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        p.setSize(500, 500);


    }
}
