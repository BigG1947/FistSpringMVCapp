package com.db;

import java.sql.*;

public class DBConnection {

    private Connection connection;
    private Statement statement;
    private DBConfig conf = new DBConfig();

    private Connection connect(){
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
        } catch (ClassNotFoundException e) {
            System.err.println("Oracle JDBC Driver is not found\n" + e);
        }

        String url = String.format("jdbc:oracle:thin:@%s:%d:%s", conf.getHost(), conf.getPort(), conf.getSid());

        try {
            connection = DriverManager.getConnection(url, conf.getUser(), conf.getPwd());
        } catch (SQLException e) {
            System.out.println("Connection Failed\n" + e);
        }

        if (connection != null) {
            return connection;
        } else {
            System.err.println("Connection is empty");
            throw new IllegalArgumentException();
        }
    }

    public ResultSet getResult(String query) {

        ResultSet resultSet = null;
        try {
            statement = connect().createStatement();
            resultSet = statement.executeQuery(query);
        } catch (SQLException e) {
            System.err.println(e);
        }
        return resultSet;
    }

    public void close() {
        try {
            statement.close();
            connection.close();
        } catch (SQLException e) {
            System.err.println(e);
        }
    }
}
