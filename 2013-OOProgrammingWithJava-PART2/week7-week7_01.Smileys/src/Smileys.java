
public class Smileys {

    public static void main(String[] args) {

        printWithSmileys("Method");
        printWithSmileys("Beerbottle");
        printWithSmileys("Interface");
    }

    private static void printWithSmileys(String characterString) {

        characterString = prepareString(characterString);

        printRow(characterString.length() / 2);
        System.out.println(characterString);
        printRow(characterString.length() / 2);

    }

    private static String prepareString(String characterString) {
        if (characterString.length() % 2 == 1) {
            characterString += " ";
        }

        return characterString = ":) " + characterString + " :)";
    }

    private static void printRow(int length) {

        for (int i = 0; i < length; i++) {
            System.out.print(":)");
        }

        System.out.println("");
    }
}
