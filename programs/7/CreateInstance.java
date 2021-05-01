/* create instance of class triangle, use parameterized constructors, 
instance/non-static and static variables, and a non-static method
to find the area of a triangle instance */
public class CreateInstance {
    public static void main(String[] args) {
        Triangle triangle_A = new Triangle(15, 8, 15, 8, 17);
        Triangle triangle_B = new Triangle(3, 2.598, 3, 3, 3);
        System.out.println("The area of 1st triangle is: " + triangle_A.findArea());
        System.out.println("The area of 2nd triangle is: " + triangle_B.findArea());

        System.out.println("Triangle A's height is: " + triangle_A.height);
        System.out.println("Number of sides in all triangles is: " + Triangle.numberOfSides);
    }
}