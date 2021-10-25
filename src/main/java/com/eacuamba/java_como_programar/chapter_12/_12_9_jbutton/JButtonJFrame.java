package com.eacuamba.java_como_programar.chapter_12._12_9_jbutton;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JButtonJFrame extends JFrame {

    private JButton botaoSimples;
    private JButton botaoComIcon;

    public JButtonJFrame(){
        super("JButton com JFrame e Eventos");
        setLayout(new FlowLayout());

        botaoSimples = new JButton();
        botaoSimples.setText("Botão Simples...");
        this.add(botaoSimples);

        Icon lista = new ImageIcon("./files/list.png");
        Icon lista_rollover = new ImageIcon("./files/list_rollover.png");
        botaoComIcon = new JButton("Botão com icon...", lista);
        botaoComIcon.setRolloverIcon(lista_rollover);
        botaoComIcon.setSize(200, 70);
        botaoComIcon.setHorizontalTextPosition(SwingConstants.CENTER);
        botaoComIcon.setVerticalTextPosition(SwingConstants.BOTTOM);
        botaoComIcon.setToolTipText("Precisa de ajuda!");
        this.add(botaoComIcon);

        JButtonHandler jButtonHandler = new JButtonHandler();
        botaoComIcon.addActionListener(jButtonHandler);
        botaoSimples.addActionListener(jButtonHandler);

    }

    private class JButtonHandler implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(JButtonJFrame.this, String.format("Voce pressionou: %s", e.getActionCommand()
            ));
        }
    }
}
