package com.eacuamba.dev.chapter_12._12_10_botoes_que_mantem_estado._12_10_2_jradiobutton;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class JRadioButtonJFrame extends JFrame {

    private final JTextField textField;
    private final Font fontSimples;
    private final Font fontNegrito;
    private final Font fontItalico;
    private final Font fontNegrito_Italico;
    private final JRadioButton simplesRB;
    private final JRadioButton negritoRB;
    private final JRadioButton italicoRB;
    private final JRadioButton negritoItalicoRB;
    private final ButtonGroup radioButtonGroup;


    public JRadioButtonJFrame(){
        super("Utilizando o JRadioButton...");
        this.setLayout(new FlowLayout());
        Dimension d = new Dimension();
        d.setSize(300, 300);
        this.setMinimumSize(d);


        this.textField = new JTextField("Edilson Alexandre Cuamba", 50);
        this.add(this.textField);

        //Criando fonts
        String fontName = "Arial";
        this.fontItalico = new Font(fontName, Font.ITALIC, 14);
        this.fontNegrito = new Font(fontName, Font.BOLD, 14);
        this.fontNegrito_Italico = new Font(fontName, Font.BOLD + Font.ITALIC, 14);
        this.fontSimples = new Font(fontName, Font.PLAIN, 14);

        this.negritoRB = new JRadioButton("Negrito", false);
        this.italicoRB = new JRadioButton("Italico", false);
        this.simplesRB = new JRadioButton("Simples", true);
        this.negritoItalicoRB = new JRadioButton("Negrito e Italico", false);
        this.add(this.italicoRB);
        this.add(this.negritoItalicoRB);
        this.add(this.negritoRB);
        this.add(this.simplesRB);

        this.radioButtonGroup = new ButtonGroup();
        this.radioButtonGroup.add(this.italicoRB);
        this.radioButtonGroup.add(this.negritoRB);
        this.radioButtonGroup.add(this.negritoItalicoRB);
        this.radioButtonGroup.add(this.simplesRB);

        this.negritoItalicoRB.addItemListener(new JRadioButtonHandler(this.fontNegrito_Italico));
        this.negritoRB.addItemListener(new JRadioButtonHandler(this.fontNegrito));
        this.italicoRB.addItemListener(new JRadioButtonHandler(this.fontItalico));
        this.simplesRB.addItemListener(new JRadioButtonHandler(this.fontSimples));

        this.negritoRB.addActionListener(
                new AbstractAction() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        System.out.println("Me clicaste?");
                    }
                }
        );


    }
    public class JRadioButtonHandler implements ItemListener {

        private Font f;
        public JRadioButtonHandler (Font f){
            this.f = f;
        }

        @Override
        public void itemStateChanged(ItemEvent e) {
            JRadioButtonJFrame.this.textField.setFont(this.f);
        }
    }
}
