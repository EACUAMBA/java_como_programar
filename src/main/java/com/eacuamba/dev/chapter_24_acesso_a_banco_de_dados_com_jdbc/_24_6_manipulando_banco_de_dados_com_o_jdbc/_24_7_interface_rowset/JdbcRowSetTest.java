package com.eacuamba.dev.chapter_24_acesso_a_banco_de_dados_com_jdbc._24_6_manipulando_banco_de_dados_com_o_jdbc._24_7_interface_rowset;


import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetProvider;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Types;

public class JdbcRowSetTest {

    public static void main(String[] args) {
        final String DATABASE_URL = "jdbc:mysql://localhost:3306/books";
        final String SELECT_QUERY = "SELECT a.`author_id` AS 'ID', a.`first_name` AS 'First Name', a.`last_name` AS 'Last Name' FROM `author` AS a;";

        try (
                JdbcRowSet jdbcRowSet = RowSetProvider.newFactory().createJdbcRowSet();
        ) {

            jdbcRowSet.setUrl(DATABASE_URL);
            jdbcRowSet.setUsername("root");
            jdbcRowSet.setPassword("root");
            jdbcRowSet.setCommand(SELECT_QUERY);
            jdbcRowSet.execute();

            ResultSetMetaData resultSetMetaData = jdbcRowSet.getMetaData();
            int columnCount = resultSetMetaData.getColumnCount();

            System.out.printf("Authors Table of Books Database: %n%n");

            for (int i = 1; i <= columnCount; i++)
                System.out.printf("%-20s\t", resultSetMetaData.getColumnLabel(i));
            System.out.println();

            while (jdbcRowSet.next()) {
                for (int i = 1; i <= columnCount; i++) {
                    String value = "";
                    switch (resultSetMetaData.getColumnType(i)) {
                        case Types.INTEGER: {
                            value = jdbcRowSet.getInt(i) + " - " + resultSetMetaData.getColumnTypeName(i);
                            break;
                        }
                        case Types.VARCHAR: {
                            value = jdbcRowSet.getString(i) + " - " + resultSetMetaData.getColumnTypeName(i);
                            break;
                        }
                        default:{
                            value = jdbcRowSet.getString(i) + " - " + resultSetMetaData.getColumnTypeName(i);
                        }
                    }
                    System.out.printf("%-20s\t", value);
                }
                System.out.println();
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }
}
