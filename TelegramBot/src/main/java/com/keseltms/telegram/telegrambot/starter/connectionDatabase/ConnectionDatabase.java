package com.keseltms.telegram.telegrambot.starter.connectionDatabase;

import java.sql.*;
import java.util.HashMap;


public class ConnectionDatabase {
    public ResultSet result = null;

    public HashMap<String, String> connectionDatabase() throws ClassNotFoundException {
        HashMap<String, String> hashMap = new HashMap<>();
        Connection connection;
        Statement statement = null;


        try {
            Class.forName("com.keseltms.telegram.telegrambot.starter.connectionDatabase.ConnectionDatabase");
            String url = "jdbc:mysql://localhost:3306/city?useUnicode=true&serverTimezone=UTC";
            String username = "Andrei";
            String password = "user";
            connection = DriverManager.getConnection(url, username, password);
            statement = connection.createStatement();
            result = statement.executeQuery("SELECT * FROM city");
            while (result.next()) {
                hashMap.put(result.getString("name"), result.getString("description"));
            }
        } catch (SQLException exc) {
            exc.printStackTrace();
        } finally {
            try {
                if (statement != null) statement.close();
                if (result != null) result.close();
            } catch (SQLException exc) {
                exc.printStackTrace();
            }
        }
        return hashMap;
    }
}