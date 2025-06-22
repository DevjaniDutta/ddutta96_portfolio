package Project_Student;

public class Student {
    private String name;
    private String id;
    private Course course;

    public Student(String name, String id, Course course) {
        this.name = name;
        this.id = id;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public Course getCourse() {
        return course;
    }

    public void displayDetails() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Course: " + course);
    }
    
}
