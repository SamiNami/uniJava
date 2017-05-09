
package dungeon;

import java.util.Scanner;
import java.util.Random;


public class Dungeon {
    
    private int length;
    private int height;
    private int vampires;
    private int moves;
    private boolean vampiresMove;
    
    private Scanner reader;
    private Random random;
    
    public Dungeon(int length, int height, int vampires, int moves, boolean vampiresMove){
        
            this.length = length;
            this.height = height;
            this.vampires = vampires;
            this.moves = moves;
            this.vampiresMove = vampiresMove;
            this.reader = new Scanner(System.in);
            this.random = new Random();
        
        
    }
    
    public void run(){
        Board board = new Board(length,height);
        
        board = gamePrep(board);
        
        startPlaying(board);
    }
    
    private Board gamePrep(Board board){
        
        Player player = new Player();
        board.addPiece(player);
        
        for(int i = 0; i < this.vampires; i++){
            int startL = random.nextInt(this.length);
            int startH = random.nextInt(this.height);
            
            while(board.checkIfPositionTaken(startL,startH)){
                startL = random.nextInt(this.length);
                startH = random.nextInt(this.height);
            }
            
            Vampire vamp = new Vampire(startL,startH);
            board.addPiece(vamp);
        }                      
          
        return board;
    }
    
    private void startPlaying(Board board){
        
        while(moves > 0){
            System.out.println(moves);
            this.moves--;
            System.out.println("");
            board.printPositions();
            System.out.println("");
            board.printBoard();
            
            
           String move = reader.nextLine();
           board.movePlayer(move,vampiresMove);
           
           if(board.checkWin()){
               System.out.println("YOU WIN");
               break;
           }
           
        }
        System.out.println("YOU LOSE");
    }
    
        
}
