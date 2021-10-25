package com.eacuamba.java_como_programar.chapter_12._12_19_utilizando_paineis_para_gerenciar_layouts_mais_complexos;

import javax.swing.*;
import java.awt.*;

public class Tela extends JFrame {
    private final JPanel btPanel;
    private final JPanel leftPanel;
    private final JButton[] buttons;

    public Tela() {
        super("Aprendendo a criar layouts mais complexos");

        this.buttons = new JButton[5];
        this.btPanel = new JPanel();
        this.leftPanel = new JPanel();
        this.leftPanel.setBackground(new Color(150, 201, 220));
        this.btPanel.setBackground(new Color(137, 74, 114));
        this.leftPanel.setSize(250, 0);
        this.btPanel.setLayout(new GridLayout(1, this.buttons.length));
        this.btPanel.setLayout(new FlowLayout());

        for (int count = 0; count < this.buttons.length; count++) {
            this.buttons[count] = new JButton("Botao " + (count + 1));
            if (count % 2 == 0)
                this.btPanel.add(this.buttons[count]);
            else
                this.leftPanel.add(this.buttons[count]);
        }

        this.add(this.btPanel, BorderLayout.SOUTH);
        this.add(this.leftPanel, BorderLayout.WEST);
    }
}
