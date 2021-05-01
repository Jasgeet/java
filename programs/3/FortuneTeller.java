/* implement a frotune teller game */
import java.util.Scanner;

public class FortuneTeller {
    public static void main(String[] args) {
        System.out.println("Enter a number from 1 to 10");
        Scanner input = new Scanner(System.in);
        int fortuneNumber = input.nextInt();

        if(fortuneNumber < 5) 
            System.out.println("Enjoy the good luck a friend brings you");
        else
            System.out.println("Your shoe selection will make you very happy today");

        input.close();
    }
}