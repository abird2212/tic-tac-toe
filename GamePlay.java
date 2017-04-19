import java.util.Scanner;

public class GamePlay{

  
  // the code bellow makes sure player 1 is x and p2 is o
  private Player player1 = new Player('x', false, "", true);
  private Player player2 = new Player('o', false, "", false);
  
  
public GamePlay(){

}
// the code bellow is p1
  public Player getplayer1(){
    return player1;
  }
  // the code bellow is p2
   public Player getplayer2(){
    return player2;
  }
   // the code bellow is the turn system that makes sure that a player waits for their turn and also that they get one.
  public Player playerTurn(){
    if(player1.getIsTurn()){
      player1.setIsTurn(false);
      player2.setIsTurn(true);
      return player1;
    }
    else{
      player2.setIsTurn(false);
      player1.setIsTurn(true);
      return player2;
    }
  }
  
  public void introSplash(){
    
    // the code bellow is the menu/title players see when they run the game. 
    
  System.out.println ("                                                ");
  System.out.println ("                              ________________   ");
  System.out.println ("                              |   How to play|   ");
  System.out.println ("                              | Tic Tac Toe  |   ");
  System.out.println ("                              ----------------   ");
  System.out.println ("                                                     ");
  System.out.println ("      1. Give your names. (player 1 is X and 2 is O) ");
  System.out.println ("                                                     ");
     
  // the code bellow allows the players to give their names so they can see the name of the winner at the end.
  
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
    
  
 // the code bellow is the intructions the players see before they play 
    System.out.println ( "                                                                                                    ");
    System.out.println ( "     2. player 1 goes first picking a place to put their x                                          ");
    System.out.println ( "                                                                                                    ");
    System.out.println ( "     3. player 2 goes second picking a place to put their o                                        ");
    System.out.println ( "                                                                                                    ");
    System.out.println ( "     4. This process continues until player 1 or 2 gets three of their variables in a straight line");
    System.out.println ( "                                                                                                    ");
    System.out.println ( "     5. Things to know:                                                                             ");
    System.out.println ( "   - Do not enter the same cordnates as the other player!                                                 ");
    System.out.println ( "   - If someone enters something other than a # the game will turn off!                             ");
    System.out.println ( "   - This is a work in progress game!                                                               ");
    System.out.println ( "                                                                                                    ");
    System.out.println ( "                                                                                                    ");
   // the code bellow is the chart that shows how ti place your letter as a player.
    System.out.println ( "                                         ");
    System.out.println ( "                                         ");
    System.out.println ( "         0       1       2               ");
    System.out.println ( "         |       |       |               ");
    System.out.println ( "         v       v       v       enter  |");
    System.out.println ( "                                 these  |");
    System.out.println ( "             |        |          first  v");
    System.out.println ( "             |        |                  ");
    System.out.println ( "         00  |   01   | 02       <----- 0");
    System.out.println ( "    ---------------------------          ");
    System.out.println ( "             |        |                  ");
    System.out.println ( "         10  |   11   | 12       <----- 1");
    System.out.println ( "             |        |                  ");
    System.out.println ( "    ---------------------------          ");
    System.out.println ( "             |        |                  ");
    System.out.println ( "         20  |   21   | 22       <----- 2");
    System.out.println ( "             |        |                  ");
    System.out.println ( "                                         ");
    System.out.println ( "                                         ");
    
  }


}

