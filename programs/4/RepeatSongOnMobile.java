/* You've set a song on repeat. Implement code wherein the song will keep
on playing till you put if off of repeat*/
import java.util.Scanner;

public class RepeatSongOnMobile {
    public static void main(String[] args) {
        boolean repeatStatus = true;
        Scanner input = new Scanner(System.in);
        String answer;

        while(repeatStatus) {
            System.out.println("Playing current song");
            
            System.out.println("Do you want to turn off repeat?");
            
            answer = input.next();

            if(answer.equals("yes"))
                repeatStatus = false;
        }
        System.out.println("Playing next song");

        input.close();
    }
}