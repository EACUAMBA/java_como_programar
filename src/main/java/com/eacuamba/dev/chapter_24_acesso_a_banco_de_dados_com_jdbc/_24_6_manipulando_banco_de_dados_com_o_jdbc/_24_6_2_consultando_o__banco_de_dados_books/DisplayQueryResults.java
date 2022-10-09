package com.eacuamba.dev.chapter_24_acesso_a_banco_de_dados_com_jdbc
        ._24_6_manipulando_banco_de_dados_com_o_jdbc
        ._24_6_2_consultando_o__banco_de_dados_books;

import javax.swing.*;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.SQLException;
import java.util.regex.PatternSyntaxException;

public class DisplayQueryResults {
    private static final String DATABASE_URL = "jdbc:mysql://localhost:3306/books";
    private static final String USER = "root";
    private static final String PASSWORD = "root";

    private static String DEAFULT_QUERY = "SELECT * FROM `author`;";
    private static ResultSetTableModel resultSetTableModel;

    public static void main(String[] args) {
        try{
            resultSetTableModel = new ResultSetTableModel(DATABASE_URL, USER, PASSWORD, DEAFULT_QUERY);

            final JTextArea queryArea = new JTextArea(DEAFULT_QUERY, 3, 100);
            queryArea.setWrapStyleWord(true);
            queryArea.setLineWrap(true);

            JScrollPane scrollPane = new JScrollPane(
                    queryArea,
                    JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
                    JScrollPane.HORIZONTAL_SCROLLBAR_NEVER
            );
            JButton submitButton = new JButton("Submit query");
            Box boxNorth = Box.createHorizontalBox();
            boxNorth.add(scrollPane);
            boxNorth.add(submitButton);

            JTable table = new JTable(resultSetTableModel);

            JLabel filterLabel = new JLabel("Filter:");
            final JTextField filterTextField = new JTextField();
            JButton filterButton = new JButton("Apply filter");

            Box boxSouth = Box.createHorizontalBox();
            boxSouth.add(filterLabel);
            boxSouth.add(filterTextField);
            boxSouth.add(filterButton);

            JFrame window = new JFrame("Apresentando resultados da consulta");
            window.setLayout(new BorderLayout());
            window.add(boxNorth, BorderLayout.NORTH);
            window.add(new JScrollPane(table), BorderLayout.CENTER);
            window.add(boxSouth, BorderLayout.SOUTH);

            submitButton.addActionListener(event ->{
                try{
                    resultSetTableModel.setQuery(queryArea.getText());
                } catch (SQLException throwables) {
                    JOptionPane.showMessageDialog(window, throwables.getMessage(), "Erro no banco de dados", JOptionPane.ERROR_MESSAGE);

                    try{
                        resultSetTableModel.setQuery(DEAFULT_QUERY);
                        queryArea.setText(DEAFULT_QUERY);
                    } catch (SQLException e) {
                        JOptionPane.showMessageDialog(window, throwables.getMessage(), "Erro no banco de dados", JOptionPane.ERROR_MESSAGE);
                        resultSetTableModel.disconnectFromDatabase();
                        System.exit(1);
                    }
                }
            });

            TableRowSorter<TableModel> sorter = new TableRowSorter<>(resultSetTableModel);
            table.setRowSorter(sorter);

            filterButton.addActionListener(event ->{
                String text = filterTextField.getText();

                if(text.trim().length() == 0){
                    sorter.setRowFilter(null);
                }else {
                    try{
                        sorter.setRowFilter(
                                RowFilter.regexFilter(text)
                        );
                    }catch (PatternSyntaxException e){
                        JOptionPane.showMessageDialog(window, "Regex mal escrito.", "Erro", JOptionPane.ERROR_MESSAGE);
                    }
                }

            });

            window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            window.setSize(500, 250);
            window.setVisible(true);

            window.addWindowListener(new WindowAdapter() {
                @Override
                public void windowClosed(WindowEvent e) {
                    resultSetTableModel.disconnectFromDatabase();
                    System.exit(0);
                }
            });
        } catch (SQLException throwables) {
            JOptionPane.showMessageDialog(
                    null,
                    throwables.getMessage(),
                    "Erro",
                    JOptionPane.ERROR_MESSAGE
            );
        }
    }
}
