
package farmsimulator;

import java.util.Collection;

public class Barn {
    private MilkingRobot robot;
    private BulkTank tank;
    
    public Barn(BulkTank tank){
        this.tank = tank;
    }
    
    public BulkTank getBulkTank(){
        return tank;
    }
    
    public void installMilkingRobot(MilkingRobot milkingRobot){
        this.robot = milkingRobot;
        robot.setBulkTank(tank);     
        }
    
    public void takeCareOf(Cow cow){
        if(robot == null){
            throw new IllegalStateException("No robot installed!");
        }
        else{
            tank.addToTank(cow.milk());
        }
    }
    
    public void takeCareOf(Collection<Cow> cows){
        if(robot == null){
            throw new IllegalStateException("No robot installed!");
        }
        else{
            for(Cow cow : cows){
                tank.addToTank(cow.milk());
            }
        }
    }
    @Override
    public String toString(){
        return tank.toString();
    }
}
