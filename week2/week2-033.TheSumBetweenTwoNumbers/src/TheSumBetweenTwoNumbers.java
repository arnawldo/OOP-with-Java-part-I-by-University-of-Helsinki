
import java.util.Scanner;


public class TheSumBetweenTwoNumbers {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int startNumber, stopNumber, sum = 0;
        System.out.println("First: ");
        startNumber = Integer.parseInt(reader.nextLine());
        System.out.println("Last: ");
        stopNumber = Integer.parseInt(reader.nextLine());
        int runningNumber = startNumber;
        while ((runningNumber >= startNumber) && (runningNumber <= stopNumber)) {
            sum += runningNumber;
            runningNumber++;
        }
        System.out.println("The sum is " + sum);
        
    }
}
