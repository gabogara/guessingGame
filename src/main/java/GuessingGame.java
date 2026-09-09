
public class GuessingGame {
  public static void main(String[] args) {

    Prompter io = new Prompter();
    io.printSetupHeader();
    String itemName = io.askItemName();

    int maxItems = io.askMaxItems(itemName);
    io.printSetupFooter();

    Jar jar = new Jar(itemName, maxItems);

    //for testing
    //io.printJarCreated(jar);

    jar.fill();
    boolean guessedCorrectly = false;
    int attempt;
    int numAttempts = 0;
    io.printWelcome();
    while(!guessedCorrectly){
      attempt = io.askAttempt(jar);
      if(attempt <1 || attempt > jar.getMaxItems()){
        io.printOutOfRange(maxItems);
        continue;
      }
      numAttempts++;
      guessedCorrectly = checkEntry(attempt, numAttempts, jar, io);
    }
  }

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
