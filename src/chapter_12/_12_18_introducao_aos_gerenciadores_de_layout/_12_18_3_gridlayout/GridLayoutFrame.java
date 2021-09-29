package chapter_12._12_18_introducao_aos_gerenciadores_de_layout._12_18_3_gridlayout;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GridLayoutFrame extends JFrame implements ActionListener {
    private final JButton[] jButtons;
    private final String[] designacoes;
    private boolean toggle = true;
    private final Container container;
    private final GridLayout gridLayout1;
    private final GridLayout gridLayout2;

    public GridLayoutFrame(){
        super("Aprendendo a usaro o Grid layout");
        designacoes = new String[]{"Um", "Dois", "Tres", "Quatro", "Cinco", "Seis"};

        gridLayout1 = new GridLayout(2, 3, 5, 5);
        gridLayout2 = new GridLayout(3, 2);
        container = getContentPane();
        setLayout(gridLayout1);

        jButtons = new JButton[designacoes.length];
        for(int i = 0; i < jButtons.length; i++){
            jButtons[i] = new JButton(designacoes[i]);
            jButtons[i].addActionListener(this);
            this.add(jButtons[i]);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(toggle)
            container.setLayout(gridLayout2);
        else
            container.setLayout(gridLayout1);

        toggle = !toggle;
        container.validate(); // Refaz o layout
    }
}
