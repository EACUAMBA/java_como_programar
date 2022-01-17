package com.eacuamba.dev.chapter_12._12_3_entrada_e_saida_de_dados_baseada_em_gui_simples_com_joptionpane;

//Aqui importo o JOptionPane para o a minha classe.
import javax.swing.JOptionPane;

public class SomaContext {
    public static void main(String[] args){
        int valor_1 = 0, valor_2 = 0;
        boolean nao_passa = false;
        do{
            nao_passa = false;
            try {
                //Crio a variavel e atribuo o valor que o usuario digitar a ela nesta variavel, uso o JOptionPane para criar uma caixa de dialogo que permite a inserco de texto e retorna uma String.
                String texto_1 = JOptionPane.showInputDialog("Introduza o primeiro valor: ");

                //Converto o texto em uma String usando o metodo estatico parseInt() da classe Integer.
                valor_1 = Integer.parseInt(texto_1);

                String texto_2 = JOptionPane.showInputDialog("Introduza o segundo valor: ");

                valor_2 = Integer.parseInt(texto_2);
            }catch (Exception ex){
                //Capturo qualquer excecao e aprensento ao usuario usando o metodo estatico showMessageDialog() da classe JOptionPane.
                JOptionPane.showMessageDialog(null, "Introduza um valor numerico inteiro válido!", "Erro valor inválido!", JOptionPane.ERROR_MESSAGE);
                nao_passa = true;
            }
        }while(nao_passa);

        //Somo os valores convertidos
        int resultado_soma = valor_1 + valor_2;

        //Apresento os valores usando o metodo estatico showMessageDialog() da classe JOptionPane.
        JOptionPane.showMessageDialog(null, String.format("O resultado da soma foi %d", resultado_soma), "Resultado da soma!", JOptionPane.INFORMATION_MESSAGE);



    }
}
