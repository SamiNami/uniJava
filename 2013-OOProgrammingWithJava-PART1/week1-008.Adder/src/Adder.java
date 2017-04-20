
import java.util.Scanner;

public class Adder {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Please provide an integer");
        int number1 = Integer.parseInt(reader.nextLine());
        
        System.out.println("Please provide another integer");
        int number2 = Integer.parseInt(reader.nextLine());
        
        System.out.println("Sum of the numbers: " + (number1 + number2));
        
    }
}
