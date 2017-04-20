import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type a number:");
        int factorial = Integer.parseInt(reader.nextLine());
        int start = 1;
        int sum =1;
        
        
        while(start <= factorial){
            sum *= start;
            System.out.println(sum);
            start++;
            
                   
        }
        
    }
}
