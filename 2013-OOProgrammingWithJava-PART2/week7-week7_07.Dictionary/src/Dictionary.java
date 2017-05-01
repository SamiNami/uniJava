
import java.util.HashMap;
import java.util.ArrayList;

public class Dictionary {

    private HashMap<String, String> dictionary;

    public Dictionary() {
        this.dictionary = new HashMap<String, String>();
    }

    public String translate(String word) {
        if (this.dictionary.containsKey(word)) {
            return this.dictionary.get(word);
        }

        return null;
    }

    public void add(String word, String translation) {
        this.dictionary.put(word, translation);
    }

    public int amountOfWords() {
        return this.dictionary.size();
    }

    public ArrayList<String> translationList() {
        ArrayList<String> content = new ArrayList<String>();
        for (String key : dictionary.keySet()) {
            content.add(key + " = " + translate(key));
        }
        return content;
    }

}
