import java.util.Scanner;

public class ReversingName {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type your name: ");
        String userInput = reader.nextLine();
        System.out.println("In reverse order: ");
        int position = userInput.length();
        while (position > 0) {
            System.out.print(userInput.charAt(position - 1));
            position--;
        }
    }
}
