package com.eacuamba.dev.chapter_12._12_12_jlist;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;

public class JListJFrame extends JFrame {
    private final JList<String> stringJList;
    private final String[] colorsName;
    private final Color[] colors;

    public JListJFrame(){
        super("Usando JList");
        this.setLayout(new FlowLayout());

        this.colorsName =new String[]{"Black", "White", "Red", "Yellow", "Green", "Azul", "Pink", "Cyan"};
        this.colors = new Color[]{Color.BLACK, Color.WHITE, Color.RED, Color.YELLOW, Color.GREEN, Color.BLUE, Color.PINK, Color.CYAN};

        this.stringJList = new JList<>(this.colorsName);
        this.stringJList.setVisibleRowCount(5);
        this.stringJList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);


        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setViewportView(this.stringJList);

        this.add(scrollPane);

        this.stringJList.addListSelectionListener(
                new ListSelectionListener() {
                    @Override
                    public void valueChanged(ListSelectionEvent e) {
                        int itemSelecionado = JListJFrame.this.stringJList.getSelectedIndex();
                        JListJFrame.this.getContentPane().setBackground(JListJFrame.this.colors[itemSelecionado]);
                    }
                }
        );

    }

}
