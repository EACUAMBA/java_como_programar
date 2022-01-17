package com.eacuamba.dev.chapter_12._12_6_campos_de_texto_e_uma_introducao_ao_tratamento_de_eventos_com_classes_aninhadas;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JOptionPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.FlowLayout;

public class TextFieldJFrame extends JFrame {
    private final JTextField textField1;
    private final JTextField textField2;
    private final JTextField textField3;
    private final JPasswordField passwordField1;

    public TextFieldJFrame(){
        super("Aprendendo Eventos...");
        this.setLayout(new FlowLayout());

        this.textField1 = new JTextField(10); //Numero de colunas que vai ocupar.
        this.add(this.textField1);

        this.textField2 = new JTextField("Insira o seu nome aqui...");
        this.add(this.textField2);

        this.textField3 = new JTextField("Campo com texto não editável", 40);
        this.textField3.setEditable(false);
        this.add(this.textField3);

        this.passwordField1 = new JPasswordField("Texto oculto...");
        this.add(this.passwordField1);

        /*
        * Lógica de eventos
        * 1 - Ter component
        * 2 - Ter uma instancia que manipula evento, ou usar uma classe anonima.
        * 3 - Essa classe deve implementar o ActionEvent
        * */

        TextFieldEventHandler handler = new TextFieldEventHandler();
        this.textField1.addActionListener(handler);
        this.textField2.addActionListener(handler);
        this.textField3.addActionListener(handler);
        this.passwordField1.addActionListener(handler);

    }

    private class TextFieldEventHandler implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent event){

            String info = "";

            if(event.getSource() == textField1){
                info = String.format("JTextField textField1 : %s" , event.getActionCommand());
                System.out.println(((JTextField)event.getSource()).getText());
            }else if(event.getSource() == textField2){
                info = String.format("JTextField textField2 : %s", event.getActionCommand());
            }else if(event.getSource() == textField3){
                info = String.format("JTextField textField3 : %s", event.getActionCommand());
            }else if(event.getSource() == passwordField1){
                info = String.format("JPasswordField passwordField1 : %s", event.getActionCommand());
            }

            JOptionPane.showMessageDialog(null, info);
        }
    }


}
