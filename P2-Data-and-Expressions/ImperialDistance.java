import java.util.Scanner;

/**
 * Defines given measurement in alternate imperial units.
 *
 * @author Will Humphlett - COMP 1210 - LLB 001
 * @version 1/23/2019
 */
 
public class ImperialDistance {
/**
 * Allows for user input of a distance then converts said
 * distance in to alternate imperial units.
 *
 * @param args Command line arguments - not used.
 */
   public static void main(String[] args) {
      //Defines variables:
      Scanner userInput = new Scanner(System.in);
      int inchesInput = 0;
      int miles = 0;
      int yards = 0;
      int feet = 0;
      int inches = 0;
   
      //Allows user to insert distance in inches:
      System.out.print("Enter the raw distance measurement in inches: ");
      inchesInput = userInput.nextInt();
      
      //If Else to ensure value entered is not negative:
      if (inchesInput < 0) { //Prevents negative input
         System.out.println("Measurement must be non-negative!");
      }
      else { //Continues program as normal
      //Use of devision and remainder functions to break down overall distance:
         miles = inchesInput / 63360;
         inches = inchesInput % 63360;
         yards = inches / 36;
         inches = inches % 36;
         feet = inches / 12;
         inches = inches % 12;
         
      //Displays said data by breakdown:
         System.out.println("\nMeasurement by combined miles, yards, "
            + "feet, inches:");
         System.out.println("\tmiles: " + miles);
         System.out.println("\tyards: " + yards);
         System.out.println("\tfeet: " + feet);
         System.out.println("\tinches: " + inches);
         System.out.println("\n" + inchesInput + " in = " + miles + " mi, "
            + yards + " yd, " + feet + " ft, " + inches + " in");
      }
   }
}