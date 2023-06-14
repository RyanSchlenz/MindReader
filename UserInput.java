import java.util.Random; // Random number generation 
import java.util.Scanner; // need for reading user input

public class Mentalism {
  public static void main(String[] args) {
    // Create random number generator 
    Random randomGenerator = new Random();
    final int maxValue = 5; 
    final int minValue = 1; 
    // Generate random number in range from 1 to 5
    int numberToGuess = randomGenerator.nextInt(maxValue) + minValue; 
    int numberToAdd = numberToGuess * 2; 
    // Scanner named keyboardInput used to read inout
    Scanner keyboardInput = new Scanner(System.in);

    // Use System.out.print() to display prompt text
    System.out.print("Hello. What is your name? ");
    // Read input as string (may contain spaces)
    String name = keyboardInput.nextLine();
    // System.out.println() adds new lines (\n) at the end of the output
    System.out.println("Welcome, " + name + ", we'll perform some mind reading.");
    System.out.println("Think of a number between 1 and 5");
    System.out.print("Hit Enter/Return when ready for the next step.");
    // Read input as String but don't save it, since it's blank
    keyboardInput.nextLine();

    System.out.println("Multiply the number by 2.");
    System.out.print("Hit Enter/Return for the next step.");
    keyboardInput.nextLine();

    System.out.println("Now add " + numberToAdd);
    System.out.print("Hit Enter/Return when ready for the next step.");
    keyboardInput.nextLine();

    System.out.println("Now, divide the number by 2.");
    System.out.print("Hit Enter/Return when ready for the next step.");
    keyboardInput.nextLine();

    System.out.println("Now, subtract the original number that you thought of.");
    System.out.print("Hit Enter/Return when ready for the last step.");
    keyboardInput.nextLine();

    System.out.print("Well, " + name + " let me read your mind... ");
    System.out.println("The number that you have now is " + numberToGuess + ".");
  }
}
