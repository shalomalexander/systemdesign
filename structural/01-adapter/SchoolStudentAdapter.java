public class SchoolStudentAdapter implements Student {

    SchoolStudent schoolStudent;

    public SchoolStudentAdapter(SchoolStudent schoolStudent) {
        this.schoolStudent = schoolStudent;
    }

    public String getFirstName() {
        return this.schoolStudent.getFirstName();
    }

    public String getLastName() {
        return this.schoolStudent.getLastName();
    }

    public String getEmail() {
        return this.schoolStudent.getEmail();
    }
}
