public class Player{

 
private char symbol;
private boolean isWinner;
private String name;
private boolean isTurn;
  
   public Player(){

  }
  
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
  