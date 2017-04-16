
import java.util.Scanner;

public class SumOfThePowers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type a number: ");
        int power = Integer.parseInt(reader.nextLine());
        int sum = 0;
        int runningPower = 0;
        while (runningPower <= power) {
            sum += (int)Math.pow(2, runningPower);
            runningPower++;
        }
        System.out.println("The result is " + sum);

    }
}
