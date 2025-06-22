package Project_Student;

public class Graduate_student  extends Student {
        private String specialization;

    public Graduate_student(String name, String id, Course course, String specialization) {
        super(name, id, course);
        this.specialization = specialization;
    }

    public String getSpecialization() {
        return specialization;
    }


    public void displayDetails() {
        super.displayDetails();
        System.out.println("Specialization: " + specialization);
    }
}
