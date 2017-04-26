
import java.util.ArrayList;

public class Phonebook {

    private ArrayList<Person> peoplelist = new ArrayList();

    public void add(String name, String number) {
        Person person = new Person(name, number);
        peoplelist.add(person);

    }

    public void printAll() {

        for (Person person : peoplelist) {
            System.out.println(person);
        }

    }
    
    public String searchNumber(String name){
        for (Person person : peoplelist) {
           if(person.getName().equals(name)){
               return person.getNumber();
           }
              
        }
        return "number not known";
    }

}
