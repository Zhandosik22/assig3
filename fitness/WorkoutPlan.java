package fitness;

public class WorkoutPlan {
    private String planName;
    private String[] exercises;
    private int durationInMinutes;

    public WorkoutPlan(String planName, String[] exercises, int durationInMinutes) {
        this.planName = planName;
        this.exercises = exercises;
        this.durationInMinutes = durationInMinutes;
    }

    public String getPlanName() {
        return planName;
    }

    public String[] getExercises() {
        return exercises;
    }

    public int getDurationInMinutes() {
        return durationInMinutes;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Workout Plan: ").append(planName).append("\n");
        sb.append("Duration: ").append(durationInMinutes).append(" minutes\n");
        sb.append("Exercises: ");
        for (String exercise : exercises) {
            sb.append(exercise).append(", ");
        }
        return sb.toString().trim();
    }
}