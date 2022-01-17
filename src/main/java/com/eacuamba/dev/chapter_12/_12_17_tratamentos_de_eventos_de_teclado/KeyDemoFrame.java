package com.eacuamba.dev.chapter_12._12_17_tratamentos_de_eventos_de_teclado;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyDemoFrame extends JFrame implements KeyListener {
    private  String line1 = "";
    private  String line2 = "";
    private  String line3 = "";
    private final JTextArea jTextArea;

    public KeyDemoFrame(){
        super("Demonstrando o Keystrok Event");

        this.jTextArea = new JTextArea(10, 15);
        this.jTextArea.setText("Press any key on the keyboard");
        this.jTextArea.setEnabled(false);
        this.jTextArea.setDisabledTextColor(Color.BLUE);
        this.add(this.jTextArea);

        this.addKeyListener(this);
    }

    @Override
    public void keyTyped(KeyEvent e) {
        this.line1 = String.format("Tecla pressionada: %s", KeyEvent.getKeyText(e.getKeyCode()));
        this.setLines2And3(e);
    }

    @Override
    public void keyPressed(KeyEvent e) {
        this.line1 = String.format("Tecla pressionada: %s", KeyEvent.getKeyText(e.getKeyCode()));
        this.setLines2And3(e);
    }

    @Override
    public void keyReleased(KeyEvent e) {
        this.line1 = String.format("Tecla pressionada: %s", KeyEvent.getKeyText(e.getKeyCode()));
        this.setLines2And3(e);
    }

    private void setLines2And3(KeyEvent event){
        this.line2 = String.format("This key is %s an action key.", (event.isActionKey() ? "" : "not"));

        String temp = KeyEvent.getKeyModifiersText(event.getModifiers());

        this.line3 = String.format("Teclas modificadores pressionadas em : %s", (temp.equals("") ? "none" : temp));

        jTextArea.setText(String.format("%s\n%s\n%s\n", this.line1, this.line2, this.line3));
    }
}
