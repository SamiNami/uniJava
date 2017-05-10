package dictionary;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class MindfulDictionary {

    private Map<String, String> dictonary;
    private String file;

    public MindfulDictionary() {
        this.dictonary = new HashMap<String, String>();
    }

    public MindfulDictionary(String file) {
        this.dictonary = new HashMap<String, String>();
        this.file = file;
    }

    public boolean save() {

        File readFile = new File(this.file);

        try {
            FileWriter writer = new FileWriter(readFile);
                String toWrite = "";
            for (String key : dictonary.keySet()) {

                toWrite += key + ":";

                toWrite += dictonary.get(key) + "\n";         
                
            }
            writer.write(toWrite);
            writer.close();
            
            return true;
        } catch (Exception e) {
            return false;
        }

    }

    public boolean load() {

        File readFile = new File(this.file);

        try {
            Scanner reader = new Scanner(readFile);
            while (reader.hasNextLine()) {

                String line = reader.nextLine();
                String[] parts = line.split(":");

                this.add(parts[0], parts[1]);
            }
            return true;
        } catch (Exception e) {
            return false;
        }

    }

    public void add(String word, String translation) {

        if (!dictonary.containsKey(word)) {
            dictonary.put(word, translation);
        }
    }

    public String translate(String word) {

        if (dictonary.containsKey(word)) {
            return dictonary.get(word);
        } else if (dictonary.containsValue(word)) {

            for (String key : dictonary.keySet()) {
                if (dictonary.get(key).equals(word)) {
                    return key;
                }

            }

        }

        return null;

    }

    public void remove(String word) {
        if (dictonary.containsKey(word)) {
            dictonary.remove(word);
        } else if (dictonary.containsValue(word)) {

            List<String> toBeRemoved = new ArrayList<String>();

            for (String key : dictonary.keySet()) {
                if (dictonary.get(key).equals(word)) {
                    toBeRemoved.add(key);
                }
            }

            for (String key : toBeRemoved) {
                dictonary.remove(key);
            }

        }

    }

}
