package com.db;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Locale;

public class Main {

    public static void main(String[] args) throws SQLException {


        Locale.setDefault(Locale.ENGLISH);

        DBConnection db = new DBConnection();
        ResultSet resultSet = db.getResult("select * from Users");
        while (resultSet.next()){
            System.out.println(resultSet.getString(2));
        }
        resultSet.close();
        db.close();
    }
}