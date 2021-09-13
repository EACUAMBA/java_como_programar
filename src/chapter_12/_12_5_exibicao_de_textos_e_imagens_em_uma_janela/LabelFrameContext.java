package chapter_12._12_5_exibicao_de_textos_e_imagens_em_uma_janela;

import javax.swing.*;
import java.io.IOException;

public class LabelFrameContext {
    public static void main(String[] args) throws IOException{
        System.out.println("Iniciando a aplicação...");

        LabelFrame  lf = new LabelFrame();
        lf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        lf.setSize(500, 500);
        lf.setVisible(true);
    }
}
