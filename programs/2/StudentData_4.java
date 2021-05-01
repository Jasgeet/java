import java.util.Scanner;

public class StudentData_4 {
    public static void main(String[] args) {
        String fullName = "Jasgeet Singh";
        double GPA = 8.15;
        System.out.println(fullName + " has a GPA of " + GPA);

        System.out.println("Enter new GPA");
        Scanner input = new Scanner(System.in);
        GPA = input.nextDouble();
        System.out.println(fullName + " now has a GPA of " + GPA);
        
        input.close();
    }
}
