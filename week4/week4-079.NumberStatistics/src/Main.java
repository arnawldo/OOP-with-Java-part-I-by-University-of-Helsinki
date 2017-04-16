import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // Write test code here
        // Remember to remove all the extra code when doing assignments  79.3 and 79.4

        // Define three NumberStatistics objects in your program:
        // The first is used to track the sum of all given numbers.
        // The second takes care of even numbers and the third the odd numbers.

        // The tests does not work if you do not create the objects in the correct order

        int userInput = 0;
        NumberStatistics allStats = new NumberStatistics();
        NumberStatistics evenStats = new NumberStatistics();
        NumberStatistics oddStats = new NumberStatistics();

        System.out.println("Type numbers:");
        while(userInput != -1) {
            userInput = Integer.parseInt(reader.nextLine());
            allStats.addNumber(userInput);
            if (userInput % 2 == 0) {
                evenStats.addNumber(userInput);
            } else {
                oddStats.addNumber(userInput);
            }
        }

        System.out.println("sum: " + allStats.sum());
        System.out.println("sum of even: " + evenStats.sum());
        System.out.println("sum of odd: " + oddStats.sum());

    }
}
