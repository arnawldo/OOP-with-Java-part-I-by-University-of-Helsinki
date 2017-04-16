
import java.util.Scanner;

public class WordInsideWord {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type the first word: ");
        String userWord = reader.nextLine();
        System.out.println("Type the second word: ");
        String findWord = reader.nextLine();
        if (userWord.indexOf(findWord) != -1) {
            System.out.println("The word " + findWord + " is found in the word " + userWord);
        } else {
            System.out.println("The word " + findWord + " is not found in the word " + userWord);
        }
    }
}
