
public class Greatest {

    public static int greatest(int number1, int number2, int number3) {

        int min;

        if (number1 > number2 && number1 > number3) {
            min = number1;
        } else if (number2 > number1 && number2 > number3) {
            min = number2;
        } else {
            min = number3;
        }

        return min;
    }

    public static void main(String[] args) {
        int result = greatest(2, 7, 3);
        System.out.println("Greatest: " + result);
    }
}
