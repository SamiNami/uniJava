
import java.util.Scanner;

public class Accounts {

    public static void main(String[] args) {
        Account samisAccount = new Account("Sami's acount",100.00);
        samisAccount.deposit(20);
        System.out.println(samisAccount);
    }

}
