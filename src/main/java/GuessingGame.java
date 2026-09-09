
public class GuessingGame {
  public static void main(String[] args) {

    // Creates the object responsible for user input and game messages.
    Prompter io = new Prompter();

    // Collects the jar configuration from the administrator.
    io.printSetupHeader();
    String itemName = io.askItemName();

    int maxItems = io.askMaxItems(itemName);
    io.printSetupFooter();

    // Creates and fills the jar with a random number of items.
    Jar jar = new Jar(itemName, maxItems);
    jar.fill();

    boolean guessedCorrectly = false;
    int attempt;
    int numAttempts = 0;
    io.printWelcome();

    // Continues asking for guesses until the player finds the correct answer.
    while(!guessedCorrectly){
      attempt = io.askAttempt(jar);
      // Rejects guesses outside the allowed range.
      if(attempt <1 || attempt > jar.getMaxItems()){
        io.printOutOfRange(maxItems);
        continue;
      }
      // Counts only valid guesses as attempts.
      numAttempts++;
      guessedCorrectly = checkEntry(attempt, numAttempts, jar, io);
    }
  }

  // Compares the player's guess with the number of items in the jar.
  public static boolean checkEntry(int attempt, int numAttempts, Jar jar, Prompter io){
    if(attempt > jar.getNumItems()){
      io.printTooHigh();
      return false;
    }
    else if(attempt < jar.getNumItems()){
      io.printTooLow();
      return false;
    }else{
      io.printWin(numAttempts);
      return true;
    }
  }
}
