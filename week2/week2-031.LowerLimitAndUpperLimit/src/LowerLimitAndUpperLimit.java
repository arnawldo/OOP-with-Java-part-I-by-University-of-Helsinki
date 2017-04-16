
import java.util.Scanner;

public class LowerLimitAndUpperLimit {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // write your code here
        System.out.println("First: ");
        int firstNumber = Integer.parseInt(reader.nextLine());
        System.out.println("Second: ");
        int lastNumber = Integer.parseInt(reader.nextLine());

        int runningNumber = firstNumber;
        while ((runningNumber >= firstNumber) && (runningNumber <= lastNumber)){
            System.out.println(runningNumber);
            runningNumber++;
        }


    }
}
