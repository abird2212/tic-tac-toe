import java.util.Scanner;

public class GamePlay{

  
  
  private Player player1 = new Player('x', false, "");
  private Player player2 = new Player('x', false, "");
  
  
public GamePlay(){

}

  public Player getplayer1(){
    return player1;
  }
  
   public Player getplayer2(){
    return player2;
  }
  
  public void introSplash(){
    
    
      System.out.println ("                                                ");
  System.out.println ("                             _______________    ");
  System.out.println ("                             | How to play |    ");
  System.out.println ("                             | Tic Tac Toe |    ");
  System.out.println ("                              -------------     ");
  System.out.println ("                                                     ");
  System.out.println ("      1. Give your names. (player 1 is X and 2 is O) ");
  System.out.println ("                                                     ");
     
  
  
  Scanner in = new Scanner(System.in);
  
  System.out.println("What's your name Player 1: ");
  System.out.println ( "                                         ");
  
    String nameP1 = in.next();
    
    player1.setName(nameP1);
    
    // Player player1 = new Player('x', false, nameP1);
    
    System.out.println("Player 2 give a name: ");
    System.out.println ( "                                         ");
    
    String nameP2 = in.next();
    
    player2.setName(nameP2);
    
    // player player2 = new Player('o', false, nameP2);
    
  

    System.out.println ( "                                                                                                    ");
    System.out.println ( "     2. player 1 goes first picking a place to put their x                                          ");
    System.out.println ( "                                                                                                    ");
    System.out.println ( "     3. player 2 goes second picking a place to put their o                                        ");
    System.out.println ( "                                                                                                    ");
    System.out.println ( "     4. This process continues until player 1 or 2 gets three of their variables in a straight line");
    System.out.println ( "                                                                                                    ");
    System.out.println ( "     5. Things to know:                                                                             ");
    System.out.println ( "   - Do not enter the same #'s as the other player!                                                 ");
    System.out.println ( "   - If someone enters something other than a # the game will turn off!                             ");
    System.out.println ( "   - This is a work in progress game!                                                               ");
    System.out.println ( "                                                                                                    ");
    System.out.println ( "                                                                                                    ");
  
    System.out.println ( "                                         ");
    System.out.println ( "         0       1       2               ");
    System.out.println ( "         |       |       |               ");
    System.out.println ( "         v       v       v               ");
    System.out.println ( "                                         ");
    System.out.println ( "             |        |                  ");
    System.out.println ( "         00  |   01   | 02       <----- 0");
    System.out.println ( "       ----------------------            ");
    System.out.println ( "             |        |                  ");
    System.out.println ( "         10  |   11   | 12       <----- 1");
    System.out.println ( "       ----------------------            ");
    System.out.println ( "             |        |                  ");
    System.out.println ( "         20  |   21   | 22       <----- 2");
    System.out.println ( "                                         ");
    System.out.println ( "                                         ");
    
  }


}

