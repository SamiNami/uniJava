import java.util.Random;

public class PasswordRandomizer {
    private Random random = new Random();
    private int length;

    public PasswordRandomizer(int length) {
      this.length = length;  
    }

    public String createPassword() {
        String password = "";
        while(password.length() < this.length){
            int number = random.nextInt(25) +1;
            char symbol = "abcdefghijklmnopqrstuvwxyz".charAt(number);
            password += symbol;
        }
        
        return password;
    }
}
