
import java.util.Scanner;

public class Temperatures {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        // Write your code here. 
        while(true){
            System.out.println("Add a number");
            double number = Double.parseDouble(reader.nextLine()); 
            if(number > -30 && number < 40){
                  Graph.addNumber(number);
            }
        }
        

        
        
        
                
               
        
        
        
        
        
        
    }
}