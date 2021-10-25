package com.eacuamba.java_como_programar.chapter_13._13_3_controle_de_cor.usando_jcolorchooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Painel extends JPanel {
    private final JButton colorChooseButton;
    private final JColorChooser jColorChooser;
    private Color color;

    public Painel (){
        this.colorChooseButton = new JButton("Selecionar cor");
        this.jColorChooser = new JColorChooser();
        this.color = Color.WHITE;

        this.setBackground(this.color);

        this.colorChooseButton.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        Painel.this.color = JColorChooser.showDialog(Painel.this, "Escolha a cor", color);

                        if(color ==null)
                            color = Color.WHITE;

                        Painel.this.setBackground(color);
                    }
                }
        );

    }

    public static void main(String[] args) {
        JFrame jf = new JFrame();
        Painel painel = new Painel();
        jf.add(painel, BorderLayout.CENTER);
        jf.add(painel.colorChooseButton, BorderLayout.SOUTH);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setVisible(true);
        jf.setSize(500, 500);
    }
}
