import java.util.Scanner;

public class Board{
  
  
 private char[][] board = {{' ', ' ', ' '},
                           {' ', ' ', ' '},
                           {' ', ' ', ' '}};


  public Board(){

  }
  
  public void makeMove(char symbol, int row, int col){
    board[row][col] = symbol;
  }
  
// the code below draws the board and shows where the person has gone.
  public void drawBoard(){
    
    System.out.println("                                                                             ");
    System.out.println("            " + board[0][0] + " | " +  board[0][1] + " | " + board[0][2] + " ");
    System.out.println("           -----------");
    System.out.println("            " + board[1][0] + " | " +  board[1][1] + " | " + board[1][2] + " ");
    System.out.println("           -----------");
    System.out.println("            " + board[2][0] + " | " +  board[2][1] + " | " + board[2][2] + " ");
    System.out.println("                                                                             ");
 
  }

  
  // <----------> side to side:
  // the code bellow tests the board for a winner by checking every way they could possibly win.
  public boolean TTTChecker(){
    
    boolean winner = false;
    
    if((board[0][0] == board[0][1]) && (board[0][1] == board[0][2]) && board[0][0] !=' ')
      winner = true;
    else if ((board[1][0] == board[1][1]) && (board[1][1] == board[1][2]) && board[1][0] !=' ')
      winner = true;
    else if((board[2][0] == board[2][1]) && (board[2][1] == board[2][2]) && board[2][0] !=' ')
     winner = true;
    else if((board[0][0] == board[1][0]) && (board[0][0] == board[2][0]) && board[0][0] !=' ')
      winner = true;   
    else if((board[0][1] == board[1][1]) && (board[1][1] == board[2][1]) && board[0][1] !=' ')
     winner = true;    
    else if((board[0][2] == board[1][2]) && (board[0][2] == board[2][2]) && board[0][2] !=' ')
      winner = true; 
    else if((board[0][0] == board[1][1]) && (board[0][0] == board[2][2]) && board[0][0] !=' ')
      winner = true; 
    else if((board[0][2] == board[1][1]) && (board[0][2] == board[2][0]) && board[0][2] !=' ')
      winner = true;    
    else
      winner = false;
    
      return winner;
    }
  // the code bellow gives the players turns allowing them to enter the location the want.
  public void playerMove(Scanner in, Player player){
          System.out.println("Player " + player.getName() + ", give row and then column: ");
      int row = in.nextInt();
      int col = in.nextInt();

      this.makeMove(player.getSymbol(), row, col);
        this.drawBoard();
  }

}
  
  
