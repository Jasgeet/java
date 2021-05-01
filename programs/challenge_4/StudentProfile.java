public class StudentProfile {
    String firstName;
    String lastName;
    int expectedGraduationYear;
    double GPA;
    String major;

    public StudentProfile(String firstName, String lastName, int expectedGraduationYear, double GPA, String major) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.expectedGraduationYear = expectedGraduationYear;
        this.GPA = GPA;
        this.major = major;
    }

    public int incrementExpectedGraduationYear() {
        this.expectedGraduationYear += 1;
        return this.expectedGraduationYear;
    } 
}
