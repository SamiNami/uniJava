import java.util.Scanner;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        GradeList list = new GradeList();
        
        while(true){
            System.out.println("Type exam scores, -1 completes");
            int score = Integer.parseInt(reader.nextLine());
            
            if(score == -1){
                break;
            }
            
            list.addGrade(new Grade(score));
            
        }
        
        list.printGrades();
        
        
        System.out.println("Grade distribution: ");
        
        for(Grade grade : list.searchByGrade(5)){
            System.out.println(grade);
        }
        
        System.out.println("Acceptance percentage: ");
        
    }
}
