package com.eacuamba.dev.chapter_12._12_17_tratamentos_de_eventos_de_teclado;

import javax.swing.*;

public class KeyFrameDemoContext {
    public static void main(String[] args) {
        KeyDemoFrame keyDemoFrame = new KeyDemoFrame();
        keyDemoFrame.setVisible(true);
        keyDemoFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        keyDemoFrame.setSize(500, 500);
    }
}
