import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int sum = 1, runningNumber;

        System.out.println("Type a number: ");
        runningNumber = Integer.parseInt(reader.nextLine());
        while (runningNumber > 0) {
            sum *= runningNumber;
            runningNumber--;
        }
        System.out.println("Factorial is " + sum);

    }
}
