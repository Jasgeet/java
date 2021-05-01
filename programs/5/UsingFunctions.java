/* Create a function that announces developers' tea time after
conformation from user */
import java.util.Scanner;

public class UsingFunctions {
    public static void announceDeveloperTeaTime() {
        System.out.println("Please confirm before I announce Tea Time by pressing any key and then Enter");
        Scanner input = new Scanner(System.in);
        input.next();
        System.out.println("Its Tea Time developers");
    }
    public static void main(String[] args) {
        System.out.println("Welcome to your new job!");

        announceDeveloperTeaTime();

        System.out.println("Write code");
        System.out.println("Review code");
        
        announceDeveloperTeaTime();

        System.out.println("Get promoted");
    }

}