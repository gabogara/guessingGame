import java.util.Scanner;


public class GuessingGame {
    public static void main(String[] args) {
     
      Scanner input = new Scanner(System.in);
      System.out.printf("%nADMINISTRATOR SETUP%n");
      System.out.println("------------------------------");
      System.out.printf("What type of item should go in the jar?: ");
      String itemName = input.nextLine();
      System.out.printf("What is the maximum amount of %s should go in the jar?: ", itemName);
      int maxItems = Integer.parseInt(input.nextLine());
      System.out.printf("------------------------------%n");
      System.out.println("");
      
      Jar jar = new Jar(itemName, maxItems);
      System.out.printf("The created Object is: %s and have %d items%n", jar.getItemName(),jar.getNumItems());
      jar.fill();
      boolean guess = false;
      int attempt;
      int numAttempts = 1;
      System.out.println("------------------------------");
      System.out.println("Welcome to the guessing game!");
      while(!guess){
        System.out.printf("How many %s are in the jar? Pick a number between 1 and %d: ", itemName, maxItems);
        attempt = Integer.parseInt(input.nextLine());
        if(attempt <0 || attempt > maxItems){
          System.out.printf("%nThe picked number must be between 1 and %d.%n", maxItems);
          System.out.printf("How many %s are in the jar? Pick a number between 1 and %d: ", itemName, maxItems);
          attempt = Integer.parseInt(input.nextLine());
        }
        if(attempt == jar.getNumItems()){
          System.out.printf("Congrats!!! You got it in %d attempt(s).%n",  numAttempts);
          guess = true;
        }
        numAttempts ++;
      }
    }
}
