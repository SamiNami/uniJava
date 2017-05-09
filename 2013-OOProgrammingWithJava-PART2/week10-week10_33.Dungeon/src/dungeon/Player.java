package dungeon;

public class Player implements Piece {

    private int length; // left to right
    private int height; // to to bottom

    public Player() {
        this.length = 0;
        this.height = 0;
    }

    @Override
    public int getLength() {
        return this.length;
    }

    @Override
    public int getHeight() {
        return height;
    }
    
    @Override
    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public void printPiece() {
        System.out.print("@");
    }

    @Override
    public String toString() {
        return "@ " + length + " " + height;
    }
    
    @Override
    public String getType(){
        return "player";
    }

    

}
