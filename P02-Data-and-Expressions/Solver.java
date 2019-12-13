import java.util.Scanner;

/**
 * Prints the results of a set equation given 
 * variables input by the user.
 *
 * Project 02 A
 * @author Will Humphlett - COMP 1210 - LLB 001
 * @version 1/23/2019
 */
 
public class Solver {
/**
 * Allows for user input of x, y, and z, inputs those
 * values into a set equation, then produces the result.
 *
 * @param args Command line arguments - not used.
 */
   public static void main(String[] args) {
      //Defines variables:
      Scanner userInput = new Scanner(System.in);
      double x = 0;
      double y = 0;
      double z = 0;
      double result = 0;
      
      //Defines the result equation:
      System.out.println("result = (10x + 4.1) (5y + 8.7) / z");
    
      //Allows for input of variable x:
      System.out.print("\tEnter x: ");
      x = userInput.nextDouble();
      
      //Allows for input of variable y:
      System.out.print("\tEnter y: ");
      y = userInput.nextDouble();
      
      //Allows for input of variable z:
      System.out.print("\tEnter z: ");
      z = userInput.nextDouble();
      
      //If else preventing logic crash:
      if (z == 0) { //Prevent /0
         result = z;
      }
      else { //completes the equation
         result = ((10 * x) + 4.1) * ((5 * y) + 8.7) / z;
      }
      System.out.println("result = " + result);
   }
}