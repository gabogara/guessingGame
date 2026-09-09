
import java.util.Scanner;
public class Prompter {
    private Scanner input;
    public Prompter(){
        input = new Scanner(System.in);
    }
    public String askItemName(){
        System.out.printf("What type of item should go in the jar?: ");
        return input.nextLine();
    }
    public int askMaxItems(String itemName){
        System.out.printf("What is the maximum amount of %s should go in the jar?: ", itemName);
        return Integer.parseInt(input.nextLine());
    }
    public int askAttempt(Jar jar){
        System.out.printf("How many %s are in the jar? Pick a number between 1 and %d: ",
                jar.getItemName(), jar.getMaxItems());
        return Integer.parseInt(input.nextLine());
    }

    public void printSetupHeader(){
        System.out.printf("%nADMINISTRATOR SETUP%n");
        System.out.println("------------------------------");
    }

    public void printSetupFooter(){
        System.out.printf("------------------------------%n");
        System.out.println("");
    }
    public void printWelcome(){
        System.out.println("------------------------------");
        System.out.println("Welcome to the guessing game!");
    }
    public void printJarCreated(Jar jar){
        System.out.printf("The created Object is: %s and have %d items%n",
                jar.getItemName(), jar.getNumItems());
    }

    public void printOutOfRange(int maxItems){
        System.out.printf("%nThe picked number must be between 1 and %d.%n", maxItems);
    }

    public void printTooHigh(){
        System.out.println("Your guess is too high");
    }

    public void printTooLow(){
        System.out.println("Your guess is too low");
    }

    public void printWin(int numAttempts){
        System.out.printf("Congrats!!! You got it in %d attempt(s).%n", numAttempts);
    }
}