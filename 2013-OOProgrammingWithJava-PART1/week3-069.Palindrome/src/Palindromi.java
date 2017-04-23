
import java.util.Scanner;

public class Palindromi {

    public static String reverse(String text) {
        int i = 1;
        String reverse = "";
        while (i <= text.length()) {
            reverse += text.charAt(text.length() - i);
            i++;
        }
        return reverse;
    }

    public static boolean palindrome(String text) {
        String reverse = reverse(text);
        return text.equals(reverse);
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Type a text: ");
        String text = reader.nextLine();
        if (palindrome(text)) {
            System.out.println("The text is a palindrome!");
        } else {
            System.out.println("The text is not a palindrome!");
        }
    }
}
