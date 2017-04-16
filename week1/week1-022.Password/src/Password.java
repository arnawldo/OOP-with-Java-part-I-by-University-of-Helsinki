
import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String password = "carrot"; // Use carrot as password when running tests.
        String userInput;
        // Write your code here
        while (true) {
            System.out.print("Type the password: ");
            userInput = reader.nextLine();
            if (userInput.equals(password)) {
                System.out.print("Right!\nThe secret is: " + password + "!");
                break;
            } else {
                System.out.print("Wrong!");
            }


        }
    }
}
