import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        NumberStatistics numStats = new NumberStatistics();
        NumberStatistics numEven = new NumberStatistics();
        NumberStatistics numOdd = new NumberStatistics();
        System.out.println("Type numbers: ");
        
        while(true){
            int number = Integer.parseInt(reader.nextLine());
            if(number == -1){
                System.out.println("Sum " + numStats.sum());
                System.out.println("Even " + numEven.sum());
                System.out.println("Odd " + numOdd.sum());
                break;
            }
            else{
                numStats.addNumber(number);
                if(number % 2 == 0){
                    numEven.addNumber(number);
                }
                else{
                    numOdd.addNumber(number);
                }
            }
        }

    }
}
