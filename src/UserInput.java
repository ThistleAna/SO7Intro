// User input in java
// 1. import java Scanner class
import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        // 2. create object for the scanner
        Scanner reader = new Scanner(System.in);
        System.out.println("LOGIN PAGE");
        System.out.println("Enter username = "); // ask the user to enter information
        // 3. Create the field, and store user information to suitable variable
        String username = reader.nextLine();

        // your turn, ask user to enter the password, this password is combination of numbers (int)
        System.out.println("Enter password =  ");
        // store this information inside password variable, read the user input
        int password = reader.nextInt();
        // print user password
        System.out.println("You have entered : " + username);
        System.out.println("You have entered : " + password);


    }
}
