
import java.util.Scanner;

public class FirstPart {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type a word: ");
        String userWord = reader.nextLine();
        System.out.print("Length of the first part: ");
        int userIndex = Integer.parseInt(reader.nextLine());
        System.out.print("Result: ");
        System.out.print(userWord.substring(0, userIndex));
    }
}
