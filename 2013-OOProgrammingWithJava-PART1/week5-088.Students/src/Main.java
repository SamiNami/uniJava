
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       Scanner reader = new Scanner(System.in);
       ArrayList<Student> list = new ArrayList<Student>();
       
       
       while(true){
           System.out.println("name: ");
           String name = reader.nextLine();
           
           if(name.isEmpty()){
               break;
           }
           
           System.out.println("studentnumber: ");
           String sNumber = reader.nextLine();
           
           Student student = new Student(name,sNumber);
           list.add(student);
       }
       for(Student std : list){
           System.out.println(std);
       }
       
       System.out.println("Give search term: ");
       String term = reader.nextLine();
       System.out.println("Result: ");
       
       for(Student std : list){
           String name = std.getName();
           if (name.contains(term)){
               System.out.println(std);
           }
       }
       
    }
}