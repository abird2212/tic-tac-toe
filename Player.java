public class Player{

 
private char symbol;
private boolean isWinner;
private String name;
  
   public Player(){

  }
  
   public Player(char newSymbol, boolean newIsWinner, String newName){
  
    symbol = newSymbol;
    isWinner = newIsWinner;
    name = newName;
    
  }
  
  //getters and setters
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
  return symbol + " " + isWinner + " " + name;

  
  
  }
     
}
  