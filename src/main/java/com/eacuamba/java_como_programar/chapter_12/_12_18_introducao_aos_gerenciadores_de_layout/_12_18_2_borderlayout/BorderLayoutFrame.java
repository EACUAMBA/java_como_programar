package com.eacuamba.java_como_programar.chapter_12._12_18_introducao_aos_gerenciadores_de_layout._12_18_2_borderlayout;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BorderLayoutFrame extends JFrame implements ActionListener {
    private final JButton[] jButtons;
    private final String[] designacoes;
    private final BorderLayout borderLayout;

    public BorderLayoutFrame(){
        super("Aprendendo a usaro o border layout");

        borderLayout = new BorderLayout(5, 5);
        setLayout(borderLayout);
        designacoes = new String[]{"Norte Oculto", "Sul Oculto", "Ocultar Est", "Ocultar Oeste", "Ocultar Centro"};

        jButtons = new JButton[designacoes.length];

        for(int i = 0; i < jButtons.length; i++){
            jButtons[i] = new JButton(designacoes[i]);
            jButtons[i].addActionListener(this);

        }

        this.add(jButtons[0], BorderLayout.NORTH);
        this.add(jButtons[1], BorderLayout.SOUTH);
        this.add(jButtons[2], BorderLayout.EAST);
        this.add(jButtons[3], BorderLayout.WEST);
        this.add(jButtons[4], BorderLayout.CENTER);




    }

    @Override
    public void actionPerformed(ActionEvent e) {
        for(JButton bt : this.jButtons){
            if(e.getSource() == bt)
                bt.setVisible(false);
            else
                bt.setVisible(true);
        }
        borderLayout.layoutContainer(getContentPane());
    }
}
