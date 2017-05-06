
import java.util.List;
import java.util.Scanner;

public class UserInterface {

    private Scanner reader;
    private PhoneSearch phonebook;

    public UserInterface(Scanner reader, PhoneSearch phonebook) {
        this.reader = reader;
        this.phonebook = phonebook;
    }

    public void start() {
        uiExplain();
        takeCommands();
    }

    private void uiExplain() {
        System.out.println("phone search\n"
                + "available operations:\n"
                + " 1 add a number\n"
                + " 2 search for a number\n"
                + " 3 search for a person by phone number\n"
                + " 4 add an address\n"
                + " 5 search for personal information\n"
                + " 6 delete personal information\n"
                + " 7 filtered listing\n"
                + " x quit");
    }

    private void takeCommands(){
        
        while(true){
            System.out.println("");
            System.out.println("command: ");
            String command = reader.nextLine();
            
            if(command.equals("x")){
                break;
            }
            
            if(command.equals("1")){
                System.out.println("whose number: ");
                String name = reader.nextLine();
                System.out.println("number: ");
                String number = reader.nextLine();
                                                
                phonebook.addNumber(name,number);
            }
            
            if(command.equals("2")){
                System.out.println("whose number: ");
                String name = reader.nextLine();
                
                List<String> numbers = phonebook.getNumbers(name);
                if(numbers == null){
                    System.out.println("  not found");
                }
                else if(numbers.isEmpty()){
                    System.out.println("  not found");
                }
                else{
                  for(String number : numbers){
                      System.out.println("  "+number);
                  }  
                }
                
            }
            
        }
        
    }
}
