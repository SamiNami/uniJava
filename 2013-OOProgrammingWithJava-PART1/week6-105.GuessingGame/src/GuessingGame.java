import java.util.Scanner;

public class GuessingGame {

    private Scanner reader;

    public GuessingGame() {
        // use only this scanner, othervise the tests do not work
        this.reader = new Scanner(System.in);
    }

    public void play(int lowerLimit, int upperLimit) {
        instructions(lowerLimit, upperLimit);
        
        int low = lowerLimit;
        int high = upperLimit;
        int average = average(low, high);
        String last = "";
        
        while(low < high){
           
           average = average(low, high);
            
            System.out.println("k");
           
           if(isGreaterThan(average)){
               low = average +1;
               last = "yes";
               
           } 
           else{
               high = average;
               last = "no";
           }
        }
        if(last == "yes"){
        average +=1;            
        }
        System.out.println("The number you're thinking of is " +average);

    }

    // implement here the methods isGreaterThan and average

    public void instructions(int lowerLimit, int upperLimit) {
        int maxQuestions = howManyTimesHalvable(upperLimit - lowerLimit);

        System.out.println("Think of a number between " + lowerLimit + "..." + upperLimit + ".");

        System.out.println("I promise you that I can guess the number you are thinking with " + maxQuestions + " questions.");
        System.out.println("");
        System.out.println("Next I'll present you a series of questions. Answer them honestly.");
        System.out.println("");
    }

    // a helper method:
    public static int howManyTimesHalvable(int number) {
        // we create a base two logarithm  of the given value

        // Below we swap the base number to base two logarithms!
        return (int) (Math.log(number) / Math.log(2)) + 1;
    }
    
    public boolean isGreaterThan(int value){
        System.out.println("Is your number greater than " + value+ "? (y/n)");
        String answer = reader.nextLine();
        
        return answer.equals("y");
    }
    
    public int average(int firstNumber, int secondNumber){
        return (firstNumber + secondNumber) / 2;
    }
    
}
