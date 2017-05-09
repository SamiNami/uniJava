
package dungeon;

public class Vampire implements Piece{
    private int length; // left to right
    private int height; // to to bottom

    public Vampire(int length, int height) {
        this.length = length;
        this.height = height;
    }
    
    @Override
    public int getLength(){
        return length;
    }
    
    @Override
    public int getHeight(){
        return height;
    }
    
    @Override
    public void setLength(int length){
        this.length = length;
    }
    
    @Override
    public void setHeight(int height){
        this.height = height;
    }
    
    @Override
    public void printPiece(){
        System.out.print("v");
    }
    
    @Override
    public String toString(){
        return "v " + length + " " +height;
    }
    @Override
    public String getType(){
        return "vamp";
    }
}
