
import java.util.Collections;
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
            
            else if(command.equals("1")){
                System.out.println("whose number: ");
                String name = reader.nextLine();
                System.out.println("number: ");
                String number = reader.nextLine();
                                                
                phonebook.addNumber(name,number);
            }
            
            else if(command.equals("2")){
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
                  printNumbers(numbers);
                }
                
            }
            
            else if(command.equals("3")){
                System.out.println("number: ");
                String number = reader.nextLine();
                
                String name = phonebook.getName(number);
                if(name == null){
                    System.out.println("  not found");
                }
                else{
                    System.out.println(name);
                }
            }
            
            else if(command.equals("4")){
                System.out.println("whose address: ");
                String name = reader.nextLine();
                
                System.out.println("street: ");
                String street = reader.nextLine();
                
                System.out.println("city: ");
                String city = reader.nextLine();
                
                phonebook.addAddress(name, street, city);
            }
            
            else if(command.equals("5")){
                System.out.println("whose information: ");
                String name = reader.nextLine();
                
                List<String> addresses = phonebook.getAdresses(name);
                List<String> numbers = phonebook.getNumbers(name);
                
                    
                
                if(addresses == null && numbers == null){
                    System.out.println("  not found");
                
                }
                else if(addresses.isEmpty() && numbers.isEmpty()){
                    System.out.println("  not found");
                    }
                
                else if(addresses == null || addresses.isEmpty()){
                    
                    System.out.println("  address unknown");
                    System.out.println("  phone numbers:");
                    printNumbers(numbers);
                }
                else if(numbers == null || numbers.isEmpty()){
                    String address = fixAddress(addresses);          
                    
                    System.out.println("  address: " + address);
                    System.out.println("  phone number not found");
                    
                }
                
                
                else{                    
                    String address = fixAddress(addresses);
                    
                    System.out.println("  address: " + address);
                    System.out.println("  phone numbers:");
                    printNumbers(numbers);
                }
                
                
            }
            else if(command.equals("6")){
                System.out.println("whose information: ");
                String name = reader.nextLine();
                
                boolean deletedInfo = phonebook.deleteInformation(name);
                if(!deletedInfo){
                    System.out.println("  not found"); 
                }
            }
            
            
            else if(command.equals("7")){
                
                System.out.println("keyword (if empty, all listed): ");
                String term = reader.nextLine();
                
                List<Person> found = phonebook.searchPhonebook(term);
                
                if(found.isEmpty()){
                    System.out.println("not found");
                }
                else{
                                       
                    
                    for(Person person : found){
                    System.out.println(" "+person.getName());
                    
                    List<String> addresses = person.getAdresses();
                    String address = fixAddress(addresses);
                    
                    if(address.isEmpty()){
                        System.out.println("address unknown");
                    }
                    else{
                       System.out.println("  address:"+address); 
                    }
                    
                    
                    List<String> numbers = person.getNumbers();
                    
                    System.out.println("  phone numbers:");
                    printNumbers(numbers);
                }
                }
                
                
            }
            
        }
        
    }
    
    private static void printNumbers(List<String> numbers){
        for(String number : numbers){
           System.out.println("   "+number);
        }
    }
    
    private static String fixAddress(List<String> addresses){
       String adress="";
                    if(addresses.size() == 1){
                        adress = addresses.get(0);
                    }
                    else if(addresses.size() > 1){                        
                        for(String place : addresses){
                            adress += place + " ";
                        }
                    }     
                    return adress;
    }
    
}
