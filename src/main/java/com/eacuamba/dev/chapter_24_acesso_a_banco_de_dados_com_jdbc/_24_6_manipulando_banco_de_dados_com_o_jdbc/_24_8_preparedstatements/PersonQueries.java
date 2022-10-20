package com.eacuamba.dev.chapter_24_acesso_a_banco_de_dados_com_jdbc._24_6_manipulando_banco_de_dados_com_o_jdbc._24_8_preparedstatements;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PersonQueries {
    private static final String DATABASE_URL = "jdbc:mysql://localhost:3306/address";
    private static final String USER = "root";
    private static final String PASSWORD = "root";

    private Connection connection;
    private PreparedStatement selectAllPeoplePreparedStatement;
    private PreparedStatement selectPeopleByLastNamePreparedStatement;
    private PreparedStatement insertNewPersonPreparedStatement;

    public PersonQueries() {
        try {
            this.connection = DriverManager.getConnection(DATABASE_URL, USER, PASSWORD);
            this.selectAllPeoplePreparedStatement = connection.prepareStatement("SELECT * FROM `person`;");
            this.selectPeopleByLastNamePreparedStatement = connection.prepareStatement("SELECT * FROM `person` WHERE `last_name` LIKE ?");
            this.insertNewPersonPreparedStatement = connection.prepareStatement("INSERT INTO `person` (`first_name`, `last_name`, `email`, `phone_number`) VALUES (?, ?, ?, ?);");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
            System.exit(1);
        }
    }

    public List<Person> getAllPeople() {
        List<Person> people = new ArrayList<>();
        ResultSet resultSet = null;
        try {
            resultSet = this.selectAllPeoplePreparedStatement.executeQuery();
            people.addAll(this.getPeopleFromResultSet(resultSet));
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
            try{
                resultSet.close();
            } catch (SQLException e) {
                e.printStackTrace();
                this.close();
            }
        }
        return people;
    }

    public List<Person> getAllPeopleByLastName(String lastName) {
        List<Person> people = new ArrayList<>();
        ResultSet resultSet = null;
        try {
            this.selectPeopleByLastNamePreparedStatement.setString(1, lastName);
            resultSet = this.selectPeopleByLastNamePreparedStatement.executeQuery();
            people.addAll(this.getPeopleFromResultSet(resultSet));
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
            try{
                resultSet.close();
            } catch (SQLException e) {
                e.printStackTrace();
                this.close();
            }
        }
        return people;
    }

    public int addPerson(Person person) {
        int executeUpdate = -1;
        try {
            this.insertNewPersonPreparedStatement.setString(1, person.getFirstName());
            this.insertNewPersonPreparedStatement.setString(2, person.getLastName());
            this.insertNewPersonPreparedStatement.setString(3, person.getEmail());
            this.insertNewPersonPreparedStatement.setString(4, person.getPhoneNumber());

            executeUpdate = this.insertNewPersonPreparedStatement.executeUpdate();

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return executeUpdate;
    }

    private List<Person> getPeopleFromResultSet(ResultSet resultSet) throws SQLException {
        List<Person> people = new ArrayList<>();
        while (resultSet.next()) {
            people.add(
                    Person.builder()
                            .id(resultSet.getInt("id"))
                            .firstName(resultSet.getString("first_name"))
                            .lastName(resultSet.getString("last_name"))
                            .email(resultSet.getString("email"))
                            .phoneNumber(resultSet.getString("phone_number"))
                            .build()
            );
        }
        return people;
    }

    public void close(){
        try{
            this.connection.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
