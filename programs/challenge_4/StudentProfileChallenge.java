/* create a class representing a student's profile with attributes- first name
, last name, expected graduation year, GPA, delcared major, and a behaviour
which increments the graduation year. Create 2 instances and dynamically allocate
attribute values using constructors, and call the method for one of the students*/

public class StudentProfileChallenge {
    public static void main(String[] args) {
        StudentProfile student_1 = new StudentProfile("Star", "Hooks", 2022, 4.7, "Java Programming");
        StudentProfile student_2 = new StudentProfile("Jeffery", "Hamdon", 2023, 4.0, "C++ Programming");
        
        int student_1NewGraduationYear = student_1.incrementExpectedGraduationYear();
        int student_2NewGraduationYear = student_2.incrementExpectedGraduationYear();
        System.out.println("Student 1's new expected graduation year is: " + student_1NewGraduationYear);
        System.out.println("Student 2's new expected graduation year is: " + student_2NewGraduationYear);
    }
}