package com.eacuamba.dev.chapter_24_acesso_a_banco_de_dados_com_jdbc._24_6_manipulando_banco_de_dados_com_o_jdbc._24_6_2_consultando_o__banco_de_dados_books;

import javax.swing.table.AbstractTableModel;
import java.sql.*;

public class ResultSetTableModel extends AbstractTableModel {

    private final Connection connection;
    private final Statement statement;
    private ResultSet resultSet;
    private ResultSetMetaData resultSetMetaData;
    private int numberOfRows;

    private boolean connectedToDatabase;

    public ResultSetTableModel(String URL, String USER, String PASSWORD, String query) throws SQLException {
        this.connection = DriverManager.getConnection(URL, USER, PASSWORD);
        this.statement = this.connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);

        this.connectedToDatabase = true;
        this.setQuery(query);
    }

    public void setQuery(String query) throws SQLException {
        this.checkConnection();

        this.resultSet = this.statement.executeQuery(query);

        this.resultSetMetaData = this.resultSet.getMetaData();

        this.resultSet.last();
        this.numberOfRows = this.resultSet.getRow();

        this.fireTableStructureChanged();
    }

    public void checkConnection(){
        if(!this.connectedToDatabase)
            throw new IllegalStateException("Not connected to database.");
    }

    @Override
    public int getRowCount() {
        return this.numberOfRows;
    }

    @Override
    public int getColumnCount() {
        this.checkConnection();

        try{
            return this.resultSetMetaData.getColumnCount();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return 0;
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        this.checkConnection();

        try{
            String columnClassName = this.resultSetMetaData.getColumnClassName(columnIndex + 1);
            return Class.forName(columnClassName);
        } catch (SQLException | ClassNotFoundException throwables) {
            throwables.printStackTrace();
        }

        return Object.class;
    }

    @Override
    public String getColumnName(int column) {
        this.checkConnection();

        try{
            return this.resultSetMetaData.getColumnLabel(column + 1);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return "";
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        this.checkConnection();

        try{
            this.resultSet.absolute(rowIndex + 1);
            return this.resultSet.getObject(columnIndex + 1);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return "";
    }

    public void disconnectFromDatabase(){
        if(this.connectedToDatabase){
            try{
                this.connection.close();
                this.statement.close();
                this.resultSet.close();

            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }finally {
                this.connectedToDatabase = false;
            }
        }
    }
}
