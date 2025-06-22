package Project_Student;

public class Course {
    private String courseName;
    private int duration; // in months
    private double fee;

    public Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    public String getCourseName() {
        return courseName;
    }

    public int getDuration() {
        return duration;
    }

    public double getFee() {
        return fee;
    }

    public String toString() {
        return courseName + " (" + duration + " months, ₹" + fee + ")";
    }
    
}
