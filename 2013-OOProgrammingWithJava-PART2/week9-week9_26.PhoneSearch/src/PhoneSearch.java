
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneSearch {

    private Map<String, Person> personByName = new HashMap<String, Person>();

    public void addNumber(String name, String number) {

        if (personByName.containsKey(name)) {
            personByName.get(name).addNumber(number);           
        } else {
            Person person = new Person(name);
            person.addNumber(number);
            personByName.put(name, person);
        }

    }

    public List<String> getNumbers(String name) {

        if (personByName.get(name) == null) {
            return null;
        }

        Person person = personByName.get(name);
        return person.getNumbers();

    }

}
