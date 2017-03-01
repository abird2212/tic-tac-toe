import java.util.Scanner;

public class PlayTTT_2{

public static void main(String[] args){
  
  GamePlay gameplay = new GamePlay();
  gameplay.introSplash();
 
    Board board = new Board();
    Scanner in = new Scanner(System.in);

    while(!board.TTTChecker()){
            
      board.playerMove(in, gameplay.playerTurn());
    }
    //if there is a winner then check who won
    if(!gameplay.getplayer1().getIsTurn()){
      System.out.println(gameplay.getplayer1().getName() + " WON!!!!");
    }
    else{
       System.out.println(gameplay.getplayer2().getName() + " WON!!!!");
     }
  }
}

    