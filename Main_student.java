package Project_Student;

public class Main_student {
    public static void main(String[] args) {

        Course javaCourse = new Course("Java Full Stack", 6, 30000);
        Course testingCourse = new Course("Manual + Automation Testing", 4, 20000);

        Student_manager manager = new Student_manager();

        Student s1 = new Student("Amit Sharma", "S001", javaCourse);
        Graduate_student s2 = new Graduate_student("Priya Singh", "S002", testingCourse, "Automation Tools");

        manager.addStudent(s1);
        manager.addStudent(s2);

        System.out.println();
        manager.displayAllStudents();

        System.out.println();
        manager.searchById("S002");
        System.out.println();
        manager.searchById("S005");
        
    }
}
