package com.eacuamba.dev.chapter_12._12_5_exibicao_de_textos_e_imagens_em_uma_janela;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class LabelFrame extends JFrame {
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;

    public LabelFrame() throws IOException {
        super("Testando JLabel...");
        this.setLayout(new FlowLayout()); // Criando um Layout e Adicionando ao JFrame.

        label1 = new JLabel("JLabel com texto...");
        label1.setToolTipText("Esta é a JLabel label1");
        this.add(label1);

        System.out.println(this.getClass().getResource("/").getPath());
        Files.newDirectoryStream(Paths.get(this.getClass().getResource("/").getPath().replaceFirst("/", "")).normalize()).forEach(System.out::println);
        Files.newDirectoryStream(Paths.get("/")).forEach(System.out::println);
//        Icon campo_por_do_sol = new ImageIcon(this.getClass().getResource("./files/campo-por-do-sol.jpg"));

        Icon campo_por_do_sol = new ImageIcon("./files/campo-por-do-sol.jpg");
        label2 = new JLabel("JLabel com texo e com icon/imagem", campo_por_do_sol, SwingConstants.LEFT);
        label2.setToolTipText("Esta é o JLabel labe2");
        this.add(label2);

        label3 = new JLabel();
        label3.setText("JLabel com icon/imagem na base/fundo/bottom.");
        label3.setIcon(label2.getIcon());
        label3.setHorizontalTextPosition(SwingConstants.CENTER);
        label3.setVerticalTextPosition(SwingConstants.TOP);
        label3.setToolTipText("Está é a JLabel label3");
        this.add(label3);



    }

}
