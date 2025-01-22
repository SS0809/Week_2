package selfproblems;
import java.util.ArrayList;
class UniversityStudent {
    private String name;
    private ArrayList<UniversityCourse> enrolledCourses = new ArrayList<>();

    public UniversityStudent(String name) {
        this.name = name;
    }

    public void enrollCourse(UniversityCourse course) {
        enrolledCourses.add(course);
        course.addStudent(this); 
        System.out.println(name + " enrolled in " + course.getCourseName());
    }

    public String getName() {
        return name;
    }
}
class Professor {
    private String name;
    private ArrayList<UniversityCourse> assignedCourses =  new ArrayList<>();

    public Professor(String name) {
        this.name = name;
    }

    public void assignProfessor(UniversityCourse course) {
        assignedCourses.add(course);
        course.setProfessor(this);
        System.out.println(name + " assigned to teach " + course.getCourseName());
    }

    public String getName() {
        return name;
    }
}
class UniversityCourse {
    private String courseName;
    private Professor professor;
    private ArrayList<UniversityStudent> enrolledStudents = new ArrayList<>();

    public UniversityCourse(String courseName) {
        this.courseName = courseName;
    }

    public void addStudent(UniversityStudent student) {
        enrolledStudents.add(student);
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public String getCourseName() {
        return courseName;
    }

    public void displayDetails() {
        System.out.println("course: " + courseName);
        System.out.println("professor: " + (professor != null ? professor.getName() : "No professor assigned"));
        System.out.println("enrolled Students: ");
        for (UniversityStudent student : enrolledStudents) {
            System.out.println("- " + student.getName());
        }
    }
}
public class UniversityCourses {
    public static void main(String[] args) {
        UniversityCourse maths = new UniversityCourse("Maths");
        UniversityCourse physics = new UniversityCourse("Physics");
        UniversityCourse chemistry = new UniversityCourse("Chemistry");
        UniversityStudent student1 = new UniversityStudent("Saurabh");
        UniversityStudent student2 = new UniversityStudent("Uday");
        Professor prof1 = new Professor("Dr. Neha Jain ");
        Professor prof2 = new Professor("Dr. Prabhat Kumar");
        student1.enrollCourse(maths);
        student1.enrollCourse(physics);
        student2.enrollCourse(chemistry);
        prof1.assignProfessor(maths);
        prof2.assignProfessor(physics);
        maths.displayDetails();
        physics.displayDetails();
        chemistry.displayDetails();
    }
}
