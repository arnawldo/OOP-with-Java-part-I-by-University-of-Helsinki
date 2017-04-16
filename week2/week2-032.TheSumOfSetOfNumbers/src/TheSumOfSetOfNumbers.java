
import java.util.Scanner;

public class TheSumOfSetOfNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int runningNumber = 1;
        int sum = 0;
        int stopNumber;
        System.out.println("Until what? ");
        stopNumber = Integer.parseInt(reader.nextLine());

        while (runningNumber <= stopNumber) {
            sum += runningNumber;
            runningNumber++;
        }

        System.out.println("Sum is " + sum);

    }
}
