import java.util.*;

public class Jumper {
    private String name;
    private int points;
    private ArrayList<Integer> jumps;

    public Jumper(String name) {
        this.name = name;
        this.points = 0;
        this.jumps = new ArrayList<Integer>();
    }
    
    public String getName(){
        return this.name;
    }
    
    public int getPoints(){
        return this.points;
    }
    
    public ArrayList<Integer> getJumps(){
        return this.jumps;
    }
    
    public void addPoints(int points){
        this.points += points;
    }
    
    public void addJump(int length){
        this.jumps.add(length);
    }
    
    @Override
    public String toString(){
        return this.name + " (" + this.points + " points)";
    }
    
}
