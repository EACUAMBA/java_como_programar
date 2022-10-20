package com.eacuamba.dev.chapter_24_acesso_a_banco_de_dados_com_jdbc._24_6_manipulando_banco_de_dados_com_o_jdbc._24_8_preparedstatements;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.List;
import java.util.Objects;

public class AddressBookDisplay extends JFrame {
    private Person currentPerson;
    private PersonQueries personQueries;
    private List<Person> personList;
    private int numberOfEntries = 0;
    private int currentEntryindex;

    private JButton
            browserJButton,
            nextButton,
            previousButton,
            queryButton,
            insertButton;

    private JLabel
            emailJLabel,
            firstNameLabel,
            idLabel,
            lastNameLabel,
            ofJLabel,
            phoneJLabel,
            queryJLabel;

    private JTextField
            emailJTextField,
            firstNameJTextField,
            idJTextField,
            indexJTextField,
            lastNameJTextField,
            maxJTextField,
            phoneJTextField,
            queryJTextField;

    private JPanel
            queryJPanel,
            navigateJPanel,
            displayJPanel;

    public AddressBookDisplay() {
        super("Address book");

        personQueries = new PersonQueries();

        navigateJPanel = new JPanel();
        previousButton = new JButton();
        indexJTextField = new JTextField(2);
        ofJLabel = new JLabel();
        maxJTextField = new JTextField(2);
        nextButton = new JButton();
        displayJPanel = new JPanel();
        idLabel = new JLabel();
        idJTextField = new JTextField(10);
        firstNameLabel = new JLabel();
        firstNameJTextField = new JTextField(10);
        lastNameLabel = new JLabel();
        lastNameJTextField = new JTextField(10);
        emailJLabel = new JLabel();
        emailJTextField = new JTextField(10);
        phoneJLabel = new JLabel();
        phoneJTextField = new JTextField(10);
        queryJPanel = new JPanel();
        queryJLabel = new JLabel();
        queryJTextField = new JTextField(10);
        queryButton = new JButton();
        browserJButton = new JButton();
        insertButton = new JButton();

        setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
        setSize(400, 300);
        setResizable(false);

        navigateJPanel.setLayout(new BoxLayout(navigateJPanel, BoxLayout.X_AXIS));

        previousButton.setText("Previous");
        previousButton.setEnabled(false);
        previousButton.addActionListener(e -> {
            previousButtonActionPerformed(e);
        });

        navigateJPanel.add(previousButton);
        navigateJPanel.add(Box.createHorizontalStrut(10));

        indexJTextField.setHorizontalAlignment(JTextField.CENTER);
        indexJTextField.addActionListener(e -> {
            indexTextFieldPerformed(e);
        });

        navigateJPanel.add(indexJTextField);
        navigateJPanel.add(Box.createHorizontalStrut(10));

        ofJLabel.setText("of");
        navigateJPanel.add(ofJLabel);
        navigateJPanel.add(Box.createHorizontalStrut(10));

        maxJTextField.setHorizontalAlignment(JTextField.CENTER);
        maxJTextField.setEditable(false);
        navigateJPanel.add(maxJTextField);
        navigateJPanel.add(Box.createHorizontalStrut(10));

        nextButton.setText("Next");
        nextButton.setEnabled(false);
        nextButton.addActionListener(e -> {
            nextButtonActionPerformat(e);
        });
        navigateJPanel.add(nextButton);
        add(navigateJPanel);

        displayJPanel.setLayout(new GridLayout(5, 2, 4, 4));

        idLabel.setText("Address ID: ");
        displayJPanel.add(idLabel);

        idJTextField.setEditable(false);
        displayJPanel.add(idJTextField);

        firstNameLabel.setText("First Name: ");
        displayJPanel.add(firstNameLabel);
        displayJPanel.add(firstNameJTextField);

        lastNameLabel.setText("Last Name: ");
        displayJPanel.add(lastNameLabel);
        displayJPanel.add(lastNameJTextField);

        emailJLabel.setText("Email: ");
        displayJPanel.add(emailJLabel);
        displayJPanel.add(emailJTextField);

        phoneJLabel.setText("Phone Number: ");
        displayJPanel.add(phoneJLabel);
        displayJPanel.add(phoneJTextField);
        add(displayJPanel);

        queryJPanel.setLayout(new BoxLayout(queryJPanel, BoxLayout.X_AXIS));

        queryJPanel.setBorder(BorderFactory.createTitledBorder(
                "Find an entry by last name:"
        ));
        queryJLabel.setText("Last Name: ");
        queryJPanel.add(Box.createHorizontalStrut(5));
        queryJPanel.add(queryJLabel);
        queryJPanel.add(Box.createHorizontalStrut(10));
        queryJPanel.add(queryJTextField);
        queryJPanel.add(Box.createHorizontalStrut(10));

        queryButton.setText("Find");
        queryButton.addActionListener(e -> {
            queryButtonActionPerformed(e);
        });

        queryJPanel.add(queryButton);
        queryJPanel.add(Box.createHorizontalStrut(5));
        add(queryJPanel);

        browserJButton.setText("Browser all Entries");
        browserJButton.addActionListener(e -> {
            browserButtonActionPerformad(e);
        });
        add(browserJButton);

        insertButton.setText("Insert new Entry");
        insertButton.addActionListener(e -> {
            insertButtonActionPerformed(e);
        });
        add(insertButton);

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                //personQueries.close();
                System.exit(0);
                super.windowClosing(e);
            }
        });
        setVisible(true);
    }

    private void previousButtonActionPerformed(ActionEvent e) {
        currentEntryindex--;

        if (currentEntryindex < 0)
            currentEntryindex = numberOfEntries - 1;

        indexJTextField.setText("" + (currentEntryindex + 1));
        indexTextFieldPerformed(e);

    }

    private void nextButtonActionPerformat(ActionEvent e) {
        currentEntryindex++;

        if (currentEntryindex >= numberOfEntries)
            currentEntryindex = 0;

        indexJTextField.setText("" + (currentEntryindex + 1));
        indexTextFieldPerformed(e);
    }


    private void queryButtonActionPerformed(ActionEvent e) {
        personList = personQueries.getAllPeopleByLastName("%" + queryJTextField.getText() + "%");
        numberOfEntries = personList.size();

        if (numberOfEntries != 0) {
            currentEntryindex = 0;
            this.fillPerson(currentPerson);
        }
    }

    private void indexTextFieldPerformed(ActionEvent e) {
        currentEntryindex = (Integer.parseInt(indexJTextField.getText()) - 1);

        if (numberOfEntries != 0 && currentEntryindex < numberOfEntries) {
            this.fillPerson(currentPerson);
        }
    }


    private void browserButtonActionPerformad(ActionEvent e) {
        try {
            personList = personQueries.getAllPeople();
            numberOfEntries = personList.size();

            if (numberOfEntries != 0) {
                currentEntryindex = 0;
                currentPerson = personList.get(currentEntryindex);
                this.fillPerson(currentPerson);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    private void insertButtonActionPerformed(ActionEvent e) {
        int result = personQueries.addPerson(Person.builder()
                .firstName(firstNameJTextField.getText())
                .lastName(lastNameJTextField.getText())
                .phoneNumber(phoneJTextField.getText())
                .email(emailJTextField.getText())
                .build());

        if (result == 1) {
            JOptionPane.showMessageDialog(
                    this,
                    "Person Added",
                    "Person Added",
                    JOptionPane.PLAIN_MESSAGE
            );
        } else {
            JOptionPane.showMessageDialog(
                    this,
                    "Person not added",
                    "Person not added",
                    JOptionPane.PLAIN_MESSAGE
            );
        }
        browserButtonActionPerformad(e);
    }

    private void fillPerson(Person person) {
        Person currentPerson = person;
        currentPerson = personList.get(currentEntryindex);
        idJTextField.setText(Objects.toString(currentPerson.getId()));
        firstNameJTextField.setText(currentPerson.getFirstName());
        lastNameJTextField.setText(currentPerson.getLastName());
        emailJTextField.setText(currentPerson.getEmail());
        phoneJTextField.setText(currentPerson.getPhoneNumber());
        maxJTextField.setText(Objects.toString(numberOfEntries));
        indexJTextField.setText(Objects.toString(currentEntryindex + 1));
        nextButton.setEnabled(true);
        previousButton.setEnabled(true);
    }

    public static void main(String[] args) {
        new AddressBookDisplay();
    }

}
