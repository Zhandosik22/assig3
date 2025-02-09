package fitness;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FitnessApp {
    private ArrayList<User> users;

    public FitnessApp() {
        this.users = loadUsersFromDatabase();
    }

    private ArrayList<User> loadUsersFromDatabase() {
        ArrayList<User> users = new ArrayList<>();
        String sql = "SELECT * FROM users";

        try (Connection conn = DatabaseManager.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                users.add(new User(rs.getInt("id"), rs.getString("name"), rs.getInt("age")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return users;
    }

    public void registerUser(User user) {
        DatabaseManager.addUser(user.getName(), user.getAge());
        users = loadUsersFromDatabase();
    }

    public void displayUsers() {
        System.out.println("Registered Users:");
        for (User user : users) {
            System.out.println(user);
        }
    }
}
