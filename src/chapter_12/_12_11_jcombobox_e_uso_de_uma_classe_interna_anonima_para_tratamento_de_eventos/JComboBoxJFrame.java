package chapter_12._12_11_jcombobox_e_uso_de_uma_classe_interna_anonima_para_tratamento_de_eventos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JComboBoxJFrame extends JFrame {

    private final JComboBox<String> stringJComboBox;
    private final JLabel jLabel;

    private final List<ComboItem> comboItems;

    public JComboBoxJFrame() {
        super("Usando JComboBox...");
        this.setLayout(new FlowLayout());

        jLabel = new JLabel("Selecione uma imagem no combobox.");

        comboItems = Arrays
                .asList(
                        new ComboItem("Camera com fundo verde", "camera.jpg"),
                        new ComboItem("A terra vista do espaço", "terra.jpg"),
                        new ComboItem("A lua vista do espaço", "lua.jpg"),
                        new ComboItem("Folhas verdes", "folhas.jpg"),
                        new ComboItem("Pessoas com roupas coloridas", "pessoas.jpg"),
                        new ComboItem("O ceu visto do espaço", "ceu.jpg"));

        /*Inicializando o combobox e adicionando os items*/
        this.stringJComboBox = new JComboBox<String>(Arrays.copyOf(this.comboItems.stream().map((x) -> x.name).collect(Collectors.toList()).toArray(),
                this.comboItems.stream().map((x) -> x.name).collect(Collectors.toList()).size() - 1,
                String[].class
        ));

        this.stringJComboBox.setMaximumRowCount(3);

        this.stringJComboBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if(e.getStateChange() == ItemEvent.DESELECTED){
                    JOptionPane.showMessageDialog(JComboBoxJFrame.this, "O elemento " + e.getItem() + "foi des-selecionado.");
                }
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    Object selectedItem = JComboBoxJFrame.this.stringJComboBox.getSelectedItem();
                    String name = selectedItem instanceof String ? (String)selectedItem : null;

                    ComboItem comboItem = JComboBoxJFrame.this.comboItems.stream().filter((c)->{
                        return c.name.trim().equalsIgnoreCase(name.trim());
                    }).findFirst().get();

                    if (comboItem != null) {
                        JComboBoxJFrame.this.jLabel.setIcon(comboItem.getIcon());
                    }
                }
            }
        });

        this.add(stringJComboBox);
        this.add(jLabel);
    }

}

class ComboItem {
    String name;
    String fileName;

    public ComboItem(String name, String fileName) {
        this.name = name;
        this.fileName = fileName;
    }

    public Icon getIcon() {
        return new ImageIcon("./files/combobox/" + this.fileName);
    }

    @Override
    public String toString() {
        return name;
    }
}
