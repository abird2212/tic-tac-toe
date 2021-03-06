public class PlayTTT{


public static void main(String[] args){
  
 /* 
  System.out.println(" 
  _________________
   \ How to play /
    -------------
    
    1. player "1" goes first picking a place to put their "x"
    2. player "2" goes fsecond picking a place to put their "o"
    3. this continues until player 1 or 2 gets three of their variebules in a straight line
  
  
    [0]    [1]    [2]
     |      |      |
     v      v      v
  
        |        |
    11  |   12   | 13       <----- [0]
  ----------------------
        |        |
    21  |   22   | 23       <----- [1]
  ----------------------  
        |        |
    31  |   32   | 33       <----- [2]
    
    
    ")
  
  */
  
  
  
  Scanner in = new Scanner(System.in);
  
  System.out.println("Whats your name Player 1: ");
    
    String nameP1 = in.next();
    
    Player player1 = new Player('x', false, nameP1);
    
    System.out.println("Player 2 give a name: ");
    
    String nameP2 = in.next();
    
    Player player2 = new Player('o', false, nameP2);
    
    Board board = new Board();
    
    System.out.println("Player " + player1.getName() + ", give row and then column: ");
    int row = in.nextInt();
    int col = in.nextInt();
    
    board.makeMove(player1.getSymbol(), row, col);
    board.drawBoard();
  }
}