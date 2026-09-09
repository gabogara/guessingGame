
import java.util.Random;

public class Jar{

  private String itemName;
  private int maxItems;
  private int numItems;

  // Creates a jar with an item type and a maximum capacity.
  public Jar(String itemName, int maxItems){
    this.itemName = itemName;
    this.maxItems = maxItems;
  }

  // Returns the name of the items stored in the jar.
  public String getItemName(){
    return itemName;
  }

  // Returns the maximum number of items the jar can hold.
  public int getMaxItems(){
    return maxItems;
  }

  // Returns the actual number of items currently in the jar.
  public int getNumItems(){
    return numItems;
  }

  // Fills the jar with a random number of items between 1 and maxItems.
  public void fill(){
    Random random = new Random();
    int randomNumber = random.nextInt(maxItems)+1;
    // Uncomment this line when testing the generated number.
    //System.out.printf("The random number is %d.%n", randomNumber);
    this.numItems = randomNumber;
  }
}