
import java.util.Scanner;


public class UpToCertainNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        int num = 1;        
        int target = Integer.parseInt(reader.nextLine());
        
        while(num <= target){
            System.out.println(num);
            num++;
        }
        
    }
}
