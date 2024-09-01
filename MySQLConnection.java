package EmployeeManagementSystem;

import java.sql.*;

public class MySQLConnection {

    Connection c;
    Statement s;

    public MySQLConnection(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");

            c = DriverManager.getConnection("jdbc:mysql:///EmployeeManagementSystem","root","1234");

            s = c.createStatement();
        }
        catch (Exception e){
            e.printStackTrace();
        }

    }
}