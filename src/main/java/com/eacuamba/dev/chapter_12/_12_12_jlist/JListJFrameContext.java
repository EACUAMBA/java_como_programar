package com.eacuamba.dev.chapter_12._12_12_jlist;

import javax.swing.*;

public class JListJFrameContext {
    public static void main(String[] args) {
        JListJFrame jListJFrame = new JListJFrame();
        jListJFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jListJFrame.setVisible(true);
        jListJFrame.setAlwaysOnTop(true);
        jListJFrame.setSize(500, 500);
    }
}
