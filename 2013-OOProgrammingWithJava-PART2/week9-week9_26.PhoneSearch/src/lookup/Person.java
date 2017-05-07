package lookup;

import java.util.ArrayList;
import java.util.List;

public class Person implements Comparable<Person> {

    private String name;
    private List<String> numbers;
    private List<String> addresses;

    public Person(String name) {
        this.name = name;
        this.numbers = new ArrayList<String>();
        this.addresses = new ArrayList<String>();
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addNumber(String number) {
        this.numbers.add(number);
    }

    public void addAddress(String address) {
        this.addresses.add(address);
    }

    public String getName() {
        return this.name;
    }

    public List<String> getNumbers() {
        return this.numbers;
    }

    public List<String> getAdresses() {
        return this.addresses;
    }

    public boolean checkAddress(String term) {
        for (String address : this.addresses) {
            if (address.contains(term)) {
                return true;
            }
        }
        return false;
    }

    public void clearInfo() {
        this.numbers.clear();
        this.addresses.clear();
    }

    @Override
    public int compareTo(Person another) {
        return this.getName().compareTo(another.getName());

    }
}
