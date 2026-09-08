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
    System.out.printf("The created Object is: %s and have %d items%n", jar.getItemName(),jar.getMaxItems());
    jar.fill();
    boolean guessedCorrectly = false;
    int attempt;
    int numAttempts = 0;
    System.out.println("------------------------------");
    System.out.println("Welcome to the guessing game!");
    while(!guessedCorrectly){
      System.out.printf("How many %s are in the jar? Pick a number between 1 and %d: ", jar.getItemName(),
              jar.getMaxItems());
      attempt = Integer.parseInt(input.nextLine());
      if(attempt <1 || attempt > maxItems){
        System.out.printf("%nThe picked number must be between 1 and %d.%n", maxItems);
        continue;
      }
      numAttempts++;
      checkEntry(attempt, numAttempts, jar);
      if(attempt == jar.getNumItems()){
        guessedCorrectly = true;
      }

    }
  }

  public static void checkEntry(int attempt, int numAttempts, Jar jar){
    if(attempt > jar.getNumItems()){
      System.out.println("Your guess is too high");
    }
    else if(attempt < jar.getNumItems()){
      System.out.println("Your guess is too low");
    }else{
      System.out.printf("Congrats!!! You got it in %d attempt(s).%n",  numAttempts);
    }
  }
}
