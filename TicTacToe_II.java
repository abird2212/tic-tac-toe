//add import to get user input

import java.util.Scanner;
public class TicTacToe_II{
  
  //this is your tic tac toe multi-dimensional array
  
  static char[][] board = {{' ', ' ', ' '},
                           {' ', ' ', ' '},
                           {' ', ' ', ' '}};
  
  //this is main method
  //this is where the program starts
  //this method should look familiar
  
  public static void main(String[] args){
    
    //set up Scanner to get user input
    
    Scanner input = new Scanner(System.in);
    
    //prompt the user for a row  
    
    //turn 1
    
    System.out.println("Which row?"); 
    
    //save the row number into a variable
    
    int row = input.nextInt();
    
    //prompt the user for a column
    System.out.println("Which column?"); 
    //save the row number into a variable
    int col = input.nextInt();
    
    //update the board array by using the index
    board[row][col] = 'x';
    
    //To-do: can you alter the code above to allow the user to either 
    //enter 'x' or 'o' ?
    
    //draw the board by calling the custom 'drawBoard' method
    drawBoard();
    
    //turn 2  
    
    System.out.println("Which row?"); 
   
    row = input.nextInt();
   
    System.out.println("Which column?"); 
    
    col = input.nextInt();
   
    board[row][col] = 'o';
    
    drawBoard();
    
    //turn 3
    
     System.out.println("Which row?"); 
    
    row = input.nextInt();

    System.out.println("Which column?"); 
    
    col = input.nextInt();
    
    board[row][col] = 'x';
    
   //turn 4

    drawBoard();
    
     System.out.println("Which row?"); 
    
    row = input.nextInt();
  
    System.out.println("Which column?"); 
    
    col = input.nextInt();
  
    board[row][col] = 'o';
    
    drawBoard();
    
     //turn 5
    
     System.out.println("Which row?"); 
    
    row = input.nextInt();

    System.out.println("Which column?"); 
    
    col = input.nextInt();
    
    board[row][col] = 'x';
    
    drawBoard();
    
     //turn 6
    
     System.out.println("Which row?"); 
    
    row = input.nextInt();

    System.out.println("Which column?"); 
    
    col = input.nextInt();
    
    board[row][col] = 'o';
    
    drawBoard();
    
     //turn 7
    
     System.out.println("Which row?"); 
    
    row = input.nextInt();

    System.out.println("Which column?"); 
    
    col = input.nextInt();
    
    board[row][col] = 'x';
    
    drawBoard();
    
      //turn 8
    
     System.out.println("Which row?"); 
    
    row = input.nextInt();

    System.out.println("Which column?"); 
    
    col = input.nextInt();
    
    board[row][col] = 'o';
    
    drawBoard();
    
      //turn 9/last turn
    
     System.out.println("Which row?"); 
    
    row = input.nextInt();

    System.out.println("Which column?"); 
    
    col = input.nextInt();
    
    board[row][col] = 'x';
    
    drawBoard();

    
  }
  
  //this is a custom method that draws the tic tac toe board
  public static void drawBoard(){
    
    System.out.println(" " + board[0][0] + " | " +  board[0][1] + " | " + board[0][2] + " ");
    System.out.println("-----------");
    System.out.println(" " + board[1][0] + " | " +  board[1][1] + " | " + board[1][2] + " ");
    System.out.println("-----------");
    System.out.println(" " + board[2][0] + " | " +  board[2][1] + " | " + board[2][2] + " ");
  }
  
  
  public boolean check_winner(){
    boolean x_wins = false;

       if (board[0][0] == 'x' && board[0][1] == 'x' && x == 02)
   x_wins = true;

   else if (x == 10 && x == 11 && x == 12)
   x_wins = true;

   else if (x == 20 && x == 21 && x == 22)
   x_wins = true;

    else if (x == 00 && x == 10 && x == 20)
   x_wins = true;

    else if (x == 01 && x == 11 && x == 21)
   x_wins = true;

    else if (x == 02 && x == 12 && x == 22)
   x_wins = true;

    else if (x == 02 && x == 11 && x == 22)
    x_wins = true;

    else if (x == 20 && x == 11 && x == 02)
   x_wins = true;

    return x_wins
   
  }
  
  
}//end of class
