package com.eacuamba.java_como_programar.chapter_12._12_18_introducao_aos_gerenciadores_de_layout._12_18_1_flowlayout;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FlowLayoutFrame extends JFrame {
    private final JButton leftButton;
    private final JButton centerButton;
    private final JButton rightButton;
    private final FlowLayout layout;
    private final Container container;

    public FlowLayoutFrame(){
        layout = new FlowLayout();
        container = getContentPane();
        setLayout(layout);

        this.leftButton = new JButton("Left");
        this.add(this.leftButton);
        this.leftButton.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        layout.setAlignment(FlowLayout.LEFT);
                        container.setBackground(new Color(194, 2, 136));
                        layout.layoutContainer(container);
                    }
                }
        );

        this.centerButton = new JButton("Center");
        this.add(this.centerButton);
        this.centerButton.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        layout.setAlignment(FlowLayout.CENTER);
                        container.setBackground(new Color(1, 43, 193));
                        layout.layoutContainer(container);
                    }
                }
        );

        this.rightButton = new JButton("Right");
        this.add(this.rightButton);
        this.rightButton.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        layout.setAlignment(FlowLayout.RIGHT);
                        container.setBackground(new Color(2, 104, 194));
                        layout.layoutContainer(container);
                    }
                }
        );


    }
}
