public class TicTacToe{  

  public static void main(String[] args){
    
    String result = game(11, 12, 13, 21, 22,  23, 31, 32, 33);
    
    System.out.println(result);
    
  }
  
  public static String game(boolean p11, boolean p12, boolean p13, boolean p21, 
                                  boolean p22, boolean p23, boolean p31, boolean p32,boolean p33) {

    {
   // all possable combos

   /*if (11 && 12 && 13);
   return true

   else if (11 && 22 && 33);
   return true;

   else if (31 && 22 && 13);
   return true;

    else if (12 && 22 && 32);
   return true;

    else if (21 && 22 && 23);
   return true;

    else if (11 && 12 && 13);
   return true;

    else if (21 && 21 && 23);
   return true;

    else if (13 && 23 && 33);
   return true;

    else if (31 && 32 && 33);
   return true;


  }*/

  // x wins
    
    String x_wins = "x wins!";
    String o_wins = "o wins!";
    String tie = "tie!";

   if (x == 11 && x == 12 && x == 13)
   return x_wins;

   else if (x == 11 && x == 22 && x == 33)
   return x_wins;

   else if (x == 31 && x == 22 && x == 13)
   return x_wins;

    else if (x == 12 && x == 22 && x == 32)
   return x_wins;

    else if (x == 21 && x == 22 && x == 23)
   return x_wins;

    else if (x == 11 && x == 12 && x == 13)
   return x_wins;

    else if (x == 21 && x == 21 && x == 23)
   return x_wins;

    else if (x == 13 && x == 23 && x == 33)
   return x_wins;

    else if (x == 31 && x == 32 && x == 33)
   return x_wins;


    // change to o wins


  if else (o == 11 && o == 12 && o == 13)
   return o_wins;

   else if (o == 11 && o == 22 && o == 33)
   return o_wins;

   else if (o == 31 && o == 22 && o == 13)
   return o_wins;

    else if (o == 12 && o == 22 && o == 32)
   return o_wins;

    else if (o == 21 && o == 22 && o == 23)
   return o_wins;

    else if (o == 11 && o == 12 && o == 13)
   return o_wins;

    else if (o == 21 && o == 21 && o == 23)
   return o_wins;

    else if (o == 13 && o == 23 && o == 33)
   return o_wins;

    else if (o == 31 && o == 32 && o == 33)
   return o_wins;

    return tie;


  }


}