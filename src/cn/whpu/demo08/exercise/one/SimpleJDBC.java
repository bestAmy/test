package cn.whpu.demo08.exercise.one;

import java.sql.*;

public class SimpleJDBC {
    public static void main(String[] args)   throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver"); // Load the JDBC driver
        System.out.println("Driver loaded");
        // Establish a connection
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/demo?serverTimezone=GMT%2B8","root","zqy17607168034.");
        System.out.println("Database connected");
        // Create a statement and Execute a statement
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery ("select firstName, mi, lastName from Student where lastName = 'Smith'");
        // Iterate through the result and print the student names
        while (((ResultSet) resultSet).next())
            System.out.println(resultSet.getString(1) + "\t" +   resultSet.getString(2) + "\t" + resultSet.getString(3));
        connection.close(); // Close the connection
    }

}
