import java.util.*;
public class Competition {
    
    private HashMap<String, Jumper> jumpers;

    public Competition() {
        this.jumpers = new HashMap<String, Jumper>();
    }
    
    public void addJumper(String name, Jumper jumper){
        jumpers.put(name,jumper);
    }
    
    public void sortByPoints(){
        
    }
    // can be moved to UI
    public static int jump(){
        Random random = new Random();
        return random.nextInt(100) + 50;
    }
    // can be moved to UI
    public static int[] judges(){
           
    }
    
}
