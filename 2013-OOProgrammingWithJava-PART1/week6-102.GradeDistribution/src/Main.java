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
            
            if(score >= 0 && score <= 60){
                list.addGrade(new Grade(score));
            }
            
            
        }
        
        list.printGrades();
        
        
        System.out.println("Grade distribution: ");
        
                    
        
        
        for(int i = 5; i >= 0; i--){
            
            System.out.print(i + ": ");
            int stars = list.searchByGrade(i);
            printStars(stars); 
            System.out.println("");
        }
        
        System.out.print("Acceptance percentage: ");
        
        int accepted = 0;
        int allScores = 0;
        
        for(int i = 5; i >= 0; i--){                      
            
            int amount = list.searchByGrade(i);
            if(i == 0){
                allScores += amount;
            }
            else{
                accepted += amount;
                allScores += amount;
            }
            
        }
        
        System.out.println(100*accepted/(double)allScores);
       
        
        
    }
    
    public static void printStars(int amount){
        int i = 0;
        while(true){
            if(i >= amount){
                break;
            }
            System.out.print("*");
            i++;
        }
    }
    
    
}
