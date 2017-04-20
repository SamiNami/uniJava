
import java.util.Scanner;

public class SumOfThePowers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type a number");
        
        int target = Integer.parseInt(reader.nextLine());
        int sum = 0;
        int count = 0;
        
        
        while(count <= target){
            int result = (int)Math.pow(2, count);
            sum += result;
            System.out.println(sum);
            count++;
        }
        
        
    }
}
