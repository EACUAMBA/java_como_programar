package chapter_12._12_20_jtextarea;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Tela extends JFrame {
    private final JTextArea sourceText;
    private final JTextArea targetText;
    private final JButton copyButton;
    private final Font[] fonts;

    public Tela(){
        super("Aprendendo a usar JTextArea");

        this.fonts = new Font[]{new Font("Montserrat", Font.BOLD, 16), new Font("Montserrat", Font.BOLD, 14)};

        GridLayout gridLayout = new GridLayout(1, 3, 10, 10);
//        this.setLayout(gridLayout);

        this.sourceText = new JTextArea(10, 15);
        this.sourceText.setLineWrap(true);
        this.targetText = new JTextArea(10, 15);
        this.targetText.setEditable(false);

//        JTextArea source= (JTextArea)this.add(sourceText);
        sourceText.setFont(this.fonts[0]);
        this.copyButton = new JButton("Copiar ->");
        this.copyButton.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        String textTemp = Tela.this.sourceText.getSelectedText();
                        sourceText.setFont(fonts[1]);

                        Tela.this.targetText.setText(textTemp);
                        targetText.setFont(fonts[0]);
                    }
                }
        );


        Box box = Box.createHorizontalBox();
        box.add(new JScrollPane(this.sourceText));
        box.add(this.copyButton);
        box.add(new JScrollPane(this.targetText));

        this.add(box);
    }
}
