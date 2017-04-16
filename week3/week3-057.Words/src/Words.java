import java.util.ArrayList;
import java.util.Scanner;

public class Words {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<String>();
        String userInput = "initial String";

        while (!userInput.equals("")) {
            System.out.print("Type a word: ");
            userInput = reader.nextLine();
            words.add(userInput);
        }

        System.out.println("You typed the following words:");
        for (String word: words) {
            System.out.println(word);
        }
    }
}
