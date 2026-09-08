
import java.util.Random;

public class Jar{

  private String itemName;
  private int maxItems;
  private int numItems;

  public Jar(String itemName, int maxItems){
    this.itemName = itemName;
    this.maxItems = maxItems;
  }

  public String getItemName(){
    return itemName;
  }

  public int getMaxItems(){
    return maxItems;
  }

  public int getNumItems(){
    return numItems;
  }

  public void fill(){
    Random random = new Random();
    int randomNumber = random.nextInt(maxItems)+1;
    System.out.printf("The random number is %d.%n", randomNumber);
    this.numItems = randomNumber;
  }






}