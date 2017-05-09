
package farmsimulator;

import java.util.ArrayList;
import java.util.Collection;

public class Farm implements Alive{
    
    private String owner;
    private Barn barn;
    private Collection<Cow> herd;
    
    public Farm(String owner,Barn barn){
        this.owner = owner;
        this.barn = barn;
        this.herd = new ArrayList<Cow>();
    }
    
    public String getOwner(){
        return this.owner;
    }
    
    public void addCow(Cow cow){
        herd.add(cow);
    }
    
    public void manageCows(){
        barn.takeCareOf(herd);
    }
    
    public void installMilkingRobot(MilkingRobot robot){
        barn.installMilkingRobot(robot);
    }
    
    @Override
    public void liveHour() {
        for(Cow cow : herd){
            cow.liveHour();
        }
    }
    
    public String toString(){
        String cows = "";
        if(herd.isEmpty()){
            cows = "No cows.";
        }
        else{
            cows = "Animals:" + "\n";
            for(Cow cow : herd){
                cows += "        " +cow + "\n";                 
            }
        }
        
        
        return "Farm owner: " + this.owner + "\n" + "Barn bulk tank: " +
                this.barn.getBulkTank() + "\n" + cows;
                
    }
    
}
