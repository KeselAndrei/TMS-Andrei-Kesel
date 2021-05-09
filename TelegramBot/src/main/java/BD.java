import lombok.ToString;

import java.sql.*;
import java.util.HashMap;

@ToString
public class BD {
    public HashMap<String, String> SQL() {
        HashMap<String, String> hashMap = new HashMap<>();
        Connection connection;
        Statement statement = null;
        ResultSet result = null;

        String url = "jdbc:mysql://localhost:3306/city?useUnicode=true&serverTimezone=UTC";
        String login = "Andrei";
        String password = "user";

        try {
            Class.forName("BD");
            connection = DriverManager.getConnection(url, login, password);
            statement = connection.createStatement();
            result = statement.executeQuery("SELECT * FROM city");

            while (result.next()) {
                hashMap.put(result.getString("name"), result.getString("description"));
            }
        } catch (ClassNotFoundException | SQLException exc) {
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