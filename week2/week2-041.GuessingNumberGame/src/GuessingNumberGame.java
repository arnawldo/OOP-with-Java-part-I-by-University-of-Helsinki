
import java.util.Random;
import java.util.Scanner;

public class GuessingNumberGame {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int numberDrawn = drawNumber();

        // program your solution here. Do not touch the above lines!
        int userInput = -1;
        int guessesMade = 0;
        while (userInput != numberDrawn){
            System.out.println("Guess a number: " );
            userInput = Integer.parseInt(reader.nextLine());
            guessesMade++;
            if (userInput < numberDrawn){
                System.out.println("The number is greater, guesses made: " + guessesMade);
            } else if (userInput > numberDrawn){
                System.out.println("The number is lesser, guesses made: " + guessesMade);
            }
        }
        System.out.println("Congratulations, your guess is correct!");


    }

    // DO NOT MODIFY THIS!
    private static int drawNumber() {
        return new Random().nextInt(101);
    }
}
