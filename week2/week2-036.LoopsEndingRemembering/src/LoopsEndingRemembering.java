import java.util.Scanner;

public class LoopsEndingRemembering {
    public static void main(String[] args) {
        // program in this project exercises 36.1-36.5
        // actually this is just one program that is split in many parts
        
        Scanner reader = new Scanner(System.in);

        int inputNumber = 0, sum = 0, count = 0, evenCount = 0;
        float average;
        System.out.println("Type numbers: ");
        while (inputNumber != -1) {
            inputNumber = Integer.parseInt(reader.nextLine());
            if (inputNumber != -1) {
                sum += inputNumber;
                count ++;
                if (inputNumber % 2 == 0) {
                    evenCount++;
                }
            }
            System.out.println(inputNumber);
        }
        average = sum / (float)count;

        System.out.println("Thank you and see you later!");
        System.out.println("The sum is " + sum);
        System.out.println("How many numbers: " + count);
        System.out.println("Average: " + average);
        System.out.println("Even numbers: " + evenCount);
        System.out.println("Odd numbers: " + (count - evenCount));

    }
}
