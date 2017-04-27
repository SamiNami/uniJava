
import java.util.*;

public class StringUtils {

    public static boolean included(String word, String searched) {
        String cleanWord = word.trim().toUpperCase();
        String cleanSearched = searched.trim().toUpperCase();

        return cleanWord.contains(cleanSearched);
    }

}
