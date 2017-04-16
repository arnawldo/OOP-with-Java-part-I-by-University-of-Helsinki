import java.util.Scanner;

public class TheEndPart {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type a word: ");
        String userWord = reader.nextLine();
        System.out.print("Length of the end part: ");
        int startIndex = userWord.length() - Integer.parseInt(reader.nextLine());
        System.out.print("Result: " + userWord.substring(startIndex, userWord.length()));

    }
}
