import java.util.Scanner;

public class PlayTTT_2{


public static void main(String[] args){
  

  
  GamePlay gameplay = new GamePlay();
  gameplay.introSplash();
 
  
    Board board = new Board();
    Scanner in = new Scanner(System.in);

    while(!board.TTTChecker()){
      System.out.println("Player " + gameplay.getplayer1().getName() + ", give row and then column: ");
      int row = in.nextInt();
      int col = in.nextInt();

      board.makeMove(gameplay.getplayer1().getSymbol(), row, col);
        board.drawBoard();

      
      
      
      System.out.println("Player " + gameplay.getplayer2().getName() + ", give row and then column: ");
      row = in.nextInt();
      col = in.nextInt();
      
       board.makeMove(gameplay.getplayer2().getSymbol(), row, col);
        board.drawBoard();
      
      
    
   
    }
  }
}

    