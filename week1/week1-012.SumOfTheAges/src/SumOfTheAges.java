
import java.util.Scanner;

public class SumOfTheAges {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Implement your program here
//        Type your name: Matti\n" +
//                "Type your age: 14\n" +
//                "\n" +
//                "Type your name: Arto\n" +
//                "Type your age: 12\n" +
//                "\n" +
//                "Matti and Arto are 26 years old in total.


        System.out.print("Type your name: ");
        String firstName = reader.nextLine();
        System.out.print("Type your age: ");
        int firstAge = Integer.parseInt(reader.nextLine());

        System.out.print("Type your name: ");
        String secondName = reader.nextLine();
        System.out.print("Type your age: ");
        int secondAge = Integer.parseInt(reader.nextLine());

        int totalAge = firstAge + secondAge;
        System.out.println("\n" + firstName + " and " + secondName + " are " + totalAge + " years old in total");
    }
}
