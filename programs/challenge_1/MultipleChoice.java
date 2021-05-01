/* Implement a MCQ, take user's input, and inform if its correct or not */
import java.util.Scanner;

public class MultipleChoice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String choiceOne = "2b years";
        String choiceTwo = "12b years";
        String choiceThree = "11m years";
        String choiceFour = "10m years";
        String correctAnswer = choiceTwo;
        String userAnswer;
        
        System.out.println("How old is our planet?");
        System.out.println(choiceOne);
        System.out.println(choiceTwo);
        System.out.println(choiceThree);
        System.out.println(choiceFour);
        System.out.println("Enter your option");
        userAnswer = input.nextLine();
        
        if(userAnswer.toLowerCase().equals(correctAnswer))
            System.out.println("Congratulations, you've got it right!");
        else {
            System.out.println("Woops, you're incorrect, correct answer is:");
            System.out.println(correctAnswer);
        }
        input.close();
    }
}