import java.util.*;


public class Main {

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        // this doesn't implement student
        SchoolStudent schoolStudent = new SchoolStudent("Shalom", "Alexander", "shalom@gmail.com");

        // this implements student
        CollegeStudent collegeStudnet = new CollegeStudent("Sharon", "Alexander", "sharon@gmail.com");

        students.add(collegeStudnet);
        students.add(schoolStudent);

        // This is the adapter
        students.add(new SchoolStudentAdapter(schoolStudent));
    }
}
