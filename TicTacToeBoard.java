public class TicTacToeBoard{

  
  
  /*
  
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
    11  |   12   | 13       <----- row1
  ----------------------
        |        |
    21  |   22   | 23       <----- row2
  ----------------------  
        |        |
    31  |   32   | 33       <----- row3
    
    
    
    
    {' ', ' ', ' '}
    {' ', ' ', ' '}
    {' ', ' ', ' '}
    
    Enter your x and o in the chart bellow
 
   */
  
  static char[] row1 = {' ', ' ', ' '};
  static char[] row2 = {' ', ' ', ' '};
  static char[] row3 = {' ', ' ', ' '};
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  public static void main(String[] args){
  
    System.out.println(" " + row1[0] + " | " + row1[1] + "  | " + row1[2] + " ");
    System.out.println("-------------");
    System.out.println(" " + row2[0] + " | " + row2[1] + "  | " + row2[2] + " ");
    System.out.println("-------------");
    System.out.println(" " + row3[0] + " | " + row3[1] + "  | " + row3[2] + " ");
  }
}