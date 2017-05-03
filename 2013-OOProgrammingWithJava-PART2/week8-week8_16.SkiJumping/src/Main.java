
public class Main {

    public static void main(String[] args) {
        // Write your main program here. Implementing your own classes will be very useful.
        
        Jumper jumper = new Jumper("eki");
        jumper.addJump(50);
        jumper.addJump(20);
        System.out.println(jumper.getJumps());
        System.out.println(jumper);
        
        int jump = Competition.jump();
        System.out.println(jump);
    }
}
