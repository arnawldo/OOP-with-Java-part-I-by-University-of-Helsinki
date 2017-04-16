
import java.util.Scanner;


public class UpToCertainNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        // Write your code here
        int stopNumber;
        int runningNumber = 1;

        System.out.println("Up to what number? ");
        stopNumber = Integer.parseInt(reader.nextLine());
        while (runningNumber <= stopNumber) System.out.println(runningNumber++);

        
    }
}
