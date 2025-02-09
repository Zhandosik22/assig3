package fitness;

import java.util.ArrayList;

public class User {
    private int id;
    private String name;
    private int age;
    private ArrayList<WorkoutPlan> workoutPlans;

    public User(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.workoutPlans = new ArrayList<>();
    }

    public void addWorkoutPlan(WorkoutPlan workoutPlan) {
        workoutPlans.add(workoutPlan);
    }

    public int getId() { return id; }

    public String getName() { return name; }

    public int getAge() { return age; }

    public ArrayList<WorkoutPlan> getWorkoutPlans() { return workoutPlans; }

    @Override
    public String toString() {
        return "User{id=" + id + ", name='" + name + "', age=" + age + '}';
    }
}
