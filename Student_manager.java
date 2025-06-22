package Project_Student;

import java.util.ArrayList;

public class Student_manager {
    private ArrayList<Student> students;

    public Student_manager() {
        students = new ArrayList<>();
    }

    public void addStudent(Student s) {
        students.add(s);
        System.out.println("Student added: " + s.getName());
    }

    public void displayAllStudents() {
        if (students.isEmpty()) {
            System.out.println("No students to display.");
            return;
        }

        System.out.println("All Students:");
        for (Student s : students) {
            s.displayDetails();
            System.out.println("----------------");
        }
    }

    public void searchById(String id) {
        for (Student s : students) {
            if (s.getId().equalsIgnoreCase(id)) {
                System.out.println("Student found:");
                s.displayDetails();
                return;
            }
        }
        System.out.println("Student with ID " + id + " not found.");
    }
    
}
