package chapter_12._12_19_utilizando_paineis_para_gerenciar_layouts_mais_complexos;

import javax.swing.*;

public class Context {
    public static void main(String[] args) {
        Tela tela = new Tela();

        tela.setVisible(true);
        tela.setSize(450, 200);
        tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
