
import java.util.Scanner;

public class LowerLimitAndUpperLimit {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int first = Integer.parseInt(reader.nextLine());
        int last = Integer.parseInt(reader.nextLine());
        
        while(first <= last){
            System.out.println(first);
            first++;
        }

    }
}
