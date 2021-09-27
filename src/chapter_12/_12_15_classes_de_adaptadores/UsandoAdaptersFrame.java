package chapter_12._12_15_classes_de_adaptadores;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class UsandoAdaptersFrame extends JFrame {
    private String message;
    private final JLabel statusBar;

    public UsandoAdaptersFrame(){
        super("Usando adaptadores para não impleementar todos metodos de um listener");

        this.statusBar = new JLabel();
        this.statusBar.setText("Clica o botao do mouse.");
        this.add(this.statusBar, BorderLayout.SOUTH);

        this.addMouseListener(new UsandoAdaptersFrame.MouseClickHandler());

    }

    public class MouseClickHandler extends MouseAdapter {
        @Override
        public void mouseClicked(MouseEvent e) {
            super.mouseClicked(e);

            UsandoAdaptersFrame x = UsandoAdaptersFrame.this;
            x.message = String.format("Você clicou %d vezes!", e.getClickCount());

            if(e.isMetaDown()){
             x.message += " com botão direito do mouse";
            }else if(e.isAltDown()){
                x.message += " com botão central do mouse";
            }else {
                x.message += " com botão esquerdo do mouse";
            }

            x.statusBar.setText(x.message);
        }
    }
}
