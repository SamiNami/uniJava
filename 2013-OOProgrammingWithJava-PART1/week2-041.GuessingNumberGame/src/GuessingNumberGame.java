
import java.util.Random;
import java.util.Scanner;

public class GuessingNumberGame {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int numberDrawn = drawNumber();

        System.out.println("Guess a number: ");
        int guess = 200;
        int count = 0;

        while (numberDrawn != guess) {
            guess = Integer.parseInt(reader.nextLine());
            if (numberDrawn > guess) {
                System.out.print("The number is greater");
            } else if (numberDrawn < guess) {
                System.out.print("The number is lesser");
            } else {
                System.out.print("Congratulations, your guess is correct!");
            }
            count++;
            System.out.print(", guesses made: " + count);
            

        }
    }

    // DO NOT MODIFY THIS!
    private static int drawNumber() {
        return new Random().nextInt(101);
    }
}
