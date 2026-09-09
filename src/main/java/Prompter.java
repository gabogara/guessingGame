
import java.util.Scanner;
public class Prompter {

    //Reads the user's input from the console.
    private Scanner input;

    // Creates a Prompter and initializes the Scanner.
    public Prompter(){
        input = new Scanner(System.in);
    }

    // Asks the administrator what type of item will be stored in the jar.
    public String askItemName(){
        System.out.printf("What type of item should go in the jar?: ");
        return input.nextLine();
    }

    // Asks the administrator for the maximum number of items.
    public int askMaxItems(String itemName){
        System.out.printf("What is the maximum amount of %s should go in the jar?: ", itemName);
        return Integer.parseInt(input.nextLine());
    }

    // Asks the player to guess how many items are in the jar.
    public int askAttempt(Jar jar){
        System.out.printf("How many %s are in the jar? Pick a number between 1 and %d: ",
                jar.getItemName(), jar.getMaxItems());
        return Integer.parseInt(input.nextLine());
    }

    // Displays the administrator setup header.
    public void printSetupHeader(){
        System.out.printf("%nADMINISTRATOR SETUP%n");
        System.out.println("------------------------------");
    }

    // Displays the end of the administrator setup section.
    public void printSetupFooter(){
        System.out.printf("------------------------------%n");
        System.out.println("");
    }

    // Welcomes the player to the game.
    public void printWelcome(){
        System.out.println("------------------------------");
        System.out.println("Welcome to the guessing game!");
    }

    // Tells the player that the guess is outside the allowed range.
    public void printOutOfRange(int maxItems){
        System.out.printf("%nThe picked number must be between 1 and %d.%n", maxItems);
    }

    // Tells the player that the guess is higher than the answer.
    public void printTooHigh(){
        System.out.println("Your guess is too high");
    }

    // Tells the player that the guess is lower than the answer.
    public void printTooLow(){
        System.out.println("Your guess is too low");
    }

    // Displays the winning message and the number of attempts.
    public void printWin(int numAttempts){
        System.out.printf("Congrats!!! You got it in %d attempt(s).%n", numAttempts);
    }
}