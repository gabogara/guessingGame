
import java.util.Random;

public class Jar{

  private String itemName;
  private int numItems;
  
  public Jar(String itemName, int numItems){
    this.itemName = itemName;
    this.numItems = numItems;
  }

  public String getItemName(){
    return itemName;
  }
  
  public int getNumItems(){
    return numItems;
  }
  
  public void fill(){
    Random random = new Random();
    int randomNumber = random.nextInt(numItems)+1;
    System.out.printf("The random number is %d.%n", randomNumber);
    this.numItems = randomNumber;
  }
  
  




}