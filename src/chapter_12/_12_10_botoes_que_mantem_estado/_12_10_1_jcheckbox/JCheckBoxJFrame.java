package chapter_12._12_10_botoes_que_mantem_estado._12_10_1_jcheckbox;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class JCheckBoxJFrame extends JFrame {
    private final JTextField jTextField;
    private final JCheckBox boldJCheckBox;
    private final JCheckBox italicJCheckBox;

    public JCheckBoxJFrame(){
        super("Utilizando o JCheckBox...");
        this.setLayout(new FlowLayout());

        jTextField = new JTextField("Veja o estilo da fonte mudar...", 40);
        jTextField.setFont(new Font("Serif", Font.PLAIN, 14));
        this.add(jTextField);

        boldJCheckBox = new JCheckBox("Bold");
        italicJCheckBox = new JCheckBox("Italic");
        this.add(boldJCheckBox);
        this.add(italicJCheckBox);

        JCheckBoxHandler jCheckBoxHandler = new JCheckBoxHandler();
        boldJCheckBox.addItemListener(jCheckBoxHandler);
        italicJCheckBox.addItemListener(jCheckBoxHandler);


    }

    private class JCheckBoxHandler implements ItemListener {
        @Override
        public void itemStateChanged(ItemEvent e) {
            Font font;

            if(JCheckBoxJFrame.this.italicJCheckBox.isSelected() && JCheckBoxJFrame.this.boldJCheckBox.isSelected()){
                font = new Font("Serif", Font.ITALIC + Font.BOLD, 14);
            }else if(JCheckBoxJFrame.this.boldJCheckBox.isSelected()){
                font = new Font("Serif", Font.BOLD, 14);
            }else if(JCheckBoxJFrame.this.italicJCheckBox.isSelected()){
                font = new Font("Serif", Font.ITALIC, 14);
            }else {

                font = new Font("Arial ,Serif", Font.PLAIN, 14);
            }

            JCheckBoxJFrame.this.jTextField.setFont(font);
        }
    }
}
