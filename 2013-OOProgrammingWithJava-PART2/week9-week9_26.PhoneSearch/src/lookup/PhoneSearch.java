package lookup;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneSearch {

    private Map<String, Person> personByName = new HashMap<String, Person>();
    private Map<String, Person> personByNumber = new HashMap<String, Person>();
    //private ArrayList<Person> personlist = new ArrayList<Person>();

    public void addNumber(String name, String number) {

        if (personByName.containsKey(name)) {
            personByName.get(name).addNumber(number);

            Person person = personByName.get(name);
            personByNumber.put(number, person);
        } else {
            Person person = new Person(name);
            person.addNumber(number);

            personByName.put(name, person);
            personByNumber.put(number, person);
        }

    }

    public List<String> getNumbers(String name) {

        if (personByName.get(name) == null) {
            return null;
        }

        Person person = personByName.get(name);
        return person.getNumbers();

    }

    public String getName(String number) {

        if (personByNumber.get(number) == null) {
            return null;
        }

        return personByNumber.get(number).getName();
    }

    public void addAddress(String name, String street, String city) {
        String address = street + " " + city;

        if (personByName.containsKey(name)) {
            personByName.get(name).addAddress(address);
        } else {
            Person person = new Person(name);
            person.addAddress(address);
            personByName.put(name, person);
            // might need change
            personByNumber.put(null, person);
        }
    }

    public List<String> getAdresses(String name) {

        if (personByName.get(name) == null) {
            return null;
        }

        return personByName.get(name).getAdresses();
    }

    public List<Person> searchPhonebook(String term) {
        List<Person> found = new ArrayList<Person>();

        for (String key : personByName.keySet()) {
            if (key.contains(term)) {
                found.add(personByName.get(key));
            }
        }

        List<Person> unfilteredpeople = new ArrayList<Person>();

        for (String key : personByName.keySet()) {
            unfilteredpeople.add(personByName.get(key));
        }

        for (Person person : unfilteredpeople) {
            if (person.checkAddress(term)) {
                found.add(person);
            }
        }

        Collections.sort(found);

        return found;
    }

    public boolean deleteInformation(String name) {

        if (!personByName.containsKey(name)) {
            return false;
        }
        Person person = personByName.get(name);

        List<String> numbers = person.getNumbers();

        for (String number : numbers) {
            personByNumber.remove(number);
        }

        person.clearInfo();

        return true;
    }

}
