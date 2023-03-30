//OR, at least one must be T to compile the body of the if
import java.util.Scanner;
public class QuitTheGame {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter q or Q to quit the game!");
        String response = reader.next(); // read user input as String

        if (!response.equals("q") && ! response.equals("Q")) {
            System.out.println("Continue playing....");
        } else {
            System.out.println("You quit the game.");
        }
    }
}
