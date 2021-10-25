package com.eacuamba.java_como_programar.chapter_12._12_13_listas_de_selecao_multipla;

import javax.swing.*;
import java.awt.*;

public class SelecaoMultiplaContext {
    public static void main(String[] args) {
        SelecaoMultiplaJFrame selecaoMultiplaJFrame = new SelecaoMultiplaJFrame();

        selecaoMultiplaJFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        selecaoMultiplaJFrame.getContentPane().setBackground(new Color(252, 242, 212));
        selecaoMultiplaJFrame.setVisible(true);
        Dimension dimension = new Dimension();
        dimension.setSize(500, 500);
        selecaoMultiplaJFrame.setMinimumSize(dimension);
    }
}
