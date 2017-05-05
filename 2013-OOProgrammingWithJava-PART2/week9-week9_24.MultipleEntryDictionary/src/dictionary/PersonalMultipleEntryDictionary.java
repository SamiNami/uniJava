
package dictionary;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;


public class PersonalMultipleEntryDictionary implements  MultipleEntryDictionary {
    
    private Map<String,Set<String>> dictonary;
     
    public PersonalMultipleEntryDictionary (){
           this.dictonary = new HashMap<String,Set<String>>(); 
        }
    
    @Override
    public void add(String word, String entry) {
        if(!this.dictonary.containsKey(word)){
            dictonary.put(word,new HashSet<String>());
        }
        
        Set<String> wordTranslations = this.dictonary.get(word);
        wordTranslations.add(entry);
        
    }

    @Override
    public Set<String> translate(String word) {         
        return this.dictonary.get(word);
    }

    @Override
    public void remove(String word) {
        this.dictonary.remove(word);
    }
    
}
