/* find the area of triangle by taking base and height input, which must not
be less than or equal to zero */
import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        double base, height, area;

        System.out.println("Enter the base");
        Scanner input = new Scanner(System.in);
        base = input.nextInt();
        while(base <= 0) {
            System.out.println("Enter valid base");
            base = input.nextInt();
        }
        
        System.out.println("Enter the height");
        height = input.nextInt();
        while(height <= 0) {
            System.out.println("Enter valid height");
            height = input.nextInt();
        }
        
        area = (base * height)/2;
        System.out.println("The area of triangle is: " + area);

        input.close();
    }
}