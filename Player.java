public class Player{

    // the code bellow is all about the players turns and win.
private char symbol;
private boolean isWinner;
private String name;
private boolean isTurn;
  
   public Player(){

  }
     // the code bellow controls the turns.
   public Player(char newSymbol, boolean newIsWinner, String newName, boolean newIsTurn){
  
    symbol = newSymbol;
    isWinner = newIsWinner;
    name = newName;
    isTurn = newIsTurn;
    
  }
  
  //getters and setters
  
  public boolean getIsTurn(){
    return isTurn;
  }
  
  public void setIsTurn(Boolean newIsTurn){
    isTurn = newIsTurn;
  }
  
  public char getSymbol(){
    return symbol;
  }
  public void setSymbol(char newSymbol){
    symbol = newSymbol;
  }
  
     // the code bellow outputs the winner
   //getters and setters
   public boolean getisWinner(){
    return isWinner;
  }
  public void setSymbol(boolean newisWinner){
    isWinner = newisWinner;
  }
    
    
     //getters and setters
   public String getName(){
    return name;
  }
  public void setName(String newName){
    name = newName;
  }
  

  public String toString(){
  return symbol + " " + isWinner + " " + name + " " + isTurn;

  
  
  }
     
}
  