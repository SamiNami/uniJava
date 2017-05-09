package dungeon;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;




public class Board {
    
    private int length;
    private int height;
    private List<Piece> pieces;

    public Board(int length, int height) {
        this.length = length;
        this.height = height;
        pieces = new ArrayList<Piece>();
    }
    
    public void addPiece(Piece piece){
        pieces.add(piece);
    }
    
    public void printBoard(){
        for(int hei = 0; hei < this.height; hei++){
            for(int len = 0; len < this.length; len++){
                
                if(!this.checkForPiece(len, hei)){
                    System.out.print("*");
                }               
                
            }
            System.out.println("");            
        }
    }
    
    public boolean checkForPiece(int length, int heigth){
        for(Piece piece : pieces){
            if(piece.getLength() == length && piece.getHeight() == heigth){
                piece.printPiece();
                return true;
            }
        }
        return false;
    }
    
    public boolean checkIfPositionTaken(int l,int h){
        for(Piece piece : pieces){
            if(piece.getLength() == l && piece.getHeight() == h){
                return true;
            }
        }
        return false;
    }
    
    public void printPositions(){
        for(Piece piece : pieces){
            System.out.println(piece);
        }
    }
    
    // might need to check string here
    public void movePlayer(String move,Boolean vampMove){
        
        for(int i = 0; i < move.length();i++){
            
            char character = move.charAt(i);
            movePlayer(character);
            
            if(vampMove){
              moveVampires();  
            }
            
            checkIfPlayerTouchZombie();           
            
        }   
                
    }
    
    
    
    
    private void movePlayer(char character){
        int playerLength = pieces.get(0).getLength();
        int playerHeight = pieces.get(0).getHeight();
        
        // might need to add in preventions
        if(character == 'a'){
            if(playerLength - 1 >= 0){
                playerLength -= 1;
                pieces.get(0).setLength(playerLength);
            }
        }
        else if(character == 'd'){
            if(playerLength + 1 < length){
                playerLength += 1;
                pieces.get(0).setLength(playerLength);
            }
        }
        else if(character == 'w'){
            if(playerHeight - 1 >= 0){
                playerHeight -= 1;
                pieces.get(0).setHeight(playerHeight);
            }
        }
        else if(character == 's'){
            if(playerHeight + 1 < height){
                playerHeight += 1;
                pieces.get(0).setHeight(playerHeight);
            }
        }
    }
    
    public void checkIfPlayerTouchZombie(){
        int playerLength = pieces.get(0).getLength();
        int playerHeight = pieces.get(0).getHeight();
        
        ArrayList<Object> toBeRemoved = new ArrayList<Object>();
        
        for(Piece piece : pieces){
            if(piece.getType().equals("vamp")){
                
                if(playerLength == piece.getLength() && playerHeight == piece.getHeight()){
                    toBeRemoved.add(piece);
                }
                
            }
            
        }
        
        this.pieces.removeAll(toBeRemoved);
        
    }
    
    public boolean checkWin(){     
        return this.pieces.size() == 1;       
    }
    
    public void moveVampires(){
        
        Random random = new Random();
        
        for(Piece piece : pieces){
            if(piece.getType().equals("vamp")){
                
               int number = random.nextInt(4);
                
               makeVaMove(number,piece);
            }
            
        }
        
        
    }
    
    public void makeVaMove(int number,Piece piece){
        
        int vLength = piece.getLength();
        int vHeight = piece.getHeight();
        
        
        if(number == 0){
            
            if(vLength - 1 >= 0){
                vLength -= 1;
                
                if(!checkIfPositionTakenByVamp(vLength,vHeight)){
                piece.setLength(vLength);
                }
            }
            
            
        }
        else if(number == 1){
            
            if(vLength + 1 < length){
                vLength += 1;
                
                if(!checkIfPositionTakenByVamp(vLength,vHeight)){
                    piece.setLength(vLength);
                }
                
            }
                       
           
        }
        else if(number == 2){
            
            if(vHeight - 1 >= 0){
                vHeight -= 1;
                
                if(!checkIfPositionTakenByVamp(vLength,vHeight)){
                piece.setHeight(vHeight);
                }
            }
        }
        else if(number == 3){
            
             if(vHeight + 1 < height){
                vHeight += 1;
                
                if(!checkIfPositionTakenByVamp(vLength,vHeight)){
                piece.setHeight(vHeight);
                }
            }
        }
                
    }
    
    public boolean checkIfPositionTakenByVamp(int l,int h){
        for(Piece piece : pieces){
            
            if(piece.getType().equals("vamp")){                
                if(piece.getLength() == l && piece.getHeight() == h){
                return true;                
                }
            }
            
            
        }
        return false;
    }
    
}
