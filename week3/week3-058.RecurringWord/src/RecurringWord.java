
import java.util.ArrayList;
import java.util.Scanner;

public class RecurringWord {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // create here the ArrayList
        ArrayList<String> words = new ArrayList<String>();
        String userInput;

        while (true) {
            System.out.print("Type a word: ");
            userInput = reader.nextLine();
            if (words.contains(userInput)) {
                System.out.print("You gave twice the word " + userInput);
                break;
            }
            words.add(userInput);
        }

    }
}
