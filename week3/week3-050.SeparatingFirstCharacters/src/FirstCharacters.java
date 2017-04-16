import java.util.Scanner;

public class FirstCharacters {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type your name: ");
        String userInput = reader.nextLine();
        if (userInput.length() > 3) {
            System.out.print("1. character: " + userInput.charAt(0));
            System.out.println("2. character: " + userInput.charAt(1));
            System.out.println("3. character: " + userInput.charAt(2));
        }

    }
}
