package com.eacuamba.dev.chapter_12._12_13_listas_de_selecao_multipla;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SelecaoMultiplaJFrame extends JFrame {

    private final JList<String> colorJList;
    private final JList<String> copyJList;
    private final JButton copyButton;

    public SelecaoMultiplaJFrame() {
        this.setTitle("Selecao Multipla");
        this.setLayout(new FlowLayout());

        this.colorJList = new JList<>();
        this.colorJList.setListData(new String[]{"Black", "White", "Red", "Yellow", "Green", "Azul", "Pink", "Cyan", "Brown", "Gray"});
        this.colorJList.setVisibleRowCount(5);
        this.colorJList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        this.add(new JScrollPane(this.colorJList));

        this.copyButton = new JButton("Copy");
        this.copyButton.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        SelecaoMultiplaJFrame.this.copyJList.setListData(
                                SelecaoMultiplaJFrame.this.colorJList.getSelectedValuesList().toArray(new String[0])
                        );
                    }
                }
        );
        this.add(this.copyButton);

        this.copyJList = new JList<String>();
        this.copyJList.setVisibleRowCount(5);
        this.copyJList.setFixedCellHeight(15);
        this.copyJList.setFixedCellWidth(100);
        this.copyJList.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        this.add(new JScrollPane(this.copyJList));


    }
}
