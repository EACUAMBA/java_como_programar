package com.eacuamba.dev.chapter_24_acesso_a_banco_de_dados_com_jdbc.
        _24_6_manipulando_banco_de_dados_com_o_jdbc.
        _24_6_1_consultando_e_conectando_se_a_um_banco_de_dados;

import java.sql.*;

public class DisplayAuthors {

    public static void main(String[] args) {
        final String DATABASE_URL = "jdbc:mysql://localhost:3306/books";
        final String SELECT_QUERY = "SELECT a.`author_id`, a.`first_name`, a.`last_name` FROM `author` AS a;";

        try (
                /*
                    O JDBC suporta descoberta automática de driver — ele carrega o driver de banco de dados na memória para você. Para garantir que o programa pode localizar a classe do driver, você deve incluir a localização da classe no classpath do programa ao executá-lo.
                 */
                Connection connection = DriverManager.getConnection(DATABASE_URL, "root", "root");
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery(SELECT_QUERY);
        ) {

            ResultSetMetaData resultSetMetaData = resultSet.getMetaData();
            int columnCount = resultSetMetaData.getColumnCount();

            System.out.printf("Authors Table of Books Database: %n%n");

            for (int i = 1; i <= columnCount; i++)
                System.out.printf("%-10s\t", resultSetMetaData.getColumnName(i));
            System.out.println();

            while (resultSet.next()) {
                for (int i = 1; i <= columnCount; i++)
                    System.out.printf("%-10s\t", resultSet.getObject(i));
                System.out.println();
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }
}
