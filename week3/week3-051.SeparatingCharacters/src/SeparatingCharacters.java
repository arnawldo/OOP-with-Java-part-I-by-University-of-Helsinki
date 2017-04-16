
import java.util.Scanner;

public class SeparatingCharacters {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String userInput = reader.nextLine();
        int count = 1;
        while (count <= userInput.length()) {
            System.out.println(count + ". character: " + userInput.charAt(count - 1));
            count++;
        }
    }
}
