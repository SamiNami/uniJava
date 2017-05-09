
package farmsimulator;


public class MilkingRobot {
    private BulkTank tank;
    
    public MilkingRobot(){
        
    }
    
    public BulkTank getBulkTank(){
        return this.tank;
    }
    
    public void setBulkTank(BulkTank tank){
        this.tank = tank;
    }
    
    public void milk(Milkable milkable){
        if(tank == null){
            throw new IllegalStateException("No tank has been installed");
        }
        else{
            tank.addToTank(milkable.milk());
        }
    }
    
}
