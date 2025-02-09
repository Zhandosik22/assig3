package fitness;

public class Main {
    public static void main(String[] args) {
        FitnessApp app = new FitnessApp();

        int id1 = DatabaseManager.addUser("Merey", 18);
        int id2 = DatabaseManager.addUser("Zhandos", 17);

        User user1 = new User(id1, "Merey", 18);
        User user2 = new User(id2, "Zhandos", 17);

        app.registerUser(user1);
        app.registerUser(user2);

        app.displayUsers();
    }
}

