
package tools;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class PersonalDuplicateRemover implements DuplicateRemover {

    private Set<String> strings = new HashSet<String>();
    private int numberOfDuplicates;

        
        
    @Override
    public void add(String characterString) {
          boolean added = strings.add(characterString);
        if (!added) {
            numberOfDuplicates++;
        }
    }

    @Override
    public int getNumberOfDetectedDuplicates() {
       return numberOfDuplicates;
    }

    @Override
    public Set<String> getUniqueCharacterStrings() {
         return strings;
    }

    @Override
    public void empty() {
        strings.clear();
        numberOfDuplicates = 0;        
    }
    
}
