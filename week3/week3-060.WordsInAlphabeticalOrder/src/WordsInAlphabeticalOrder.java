
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WordsInAlphabeticalOrder {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // create here an ArrayList
        ArrayList<String> words = new ArrayList<String>();
        String userinput;

        while (true) {
            System.out.println("Type a word: ");
            userinput =  reader.nextLine();
            if (userinput.equals("")) {
               break;
            }
            words.add(userinput);
        }

        System.out.println("You typed the following words:");
        Collections.sort(words);
        for (String word : words) {
            System.out.println(word);
        }
    }
}
