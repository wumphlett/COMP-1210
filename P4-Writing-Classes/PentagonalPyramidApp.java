import java.util.Scanner;
/**
 * Calculates information of a pentagonal pyramid based on
 * the user entered variables.
 *
 * Project 04
 * @author Will Humphlett - COMP1210 - LLB001
 * @version 2/6/2019
 */
public class PentagonalPyramidApp {
/**
 * Creates prompts for user inputs of variables then calculates
 * dimensional information of a pentagonal pyramid using the given variables.
 *
 * @param args Command line arguments - not used
 */
   public static void main(String[] args) {
    // Scanner
      Scanner user = new Scanner(System.in);
    // Default pyramid
      PentagonalPyramid pyramid = new PentagonalPyramid("default", 0, 0);
    // Initial prompt
      System.out.println("Enter label, base edge, "
         + "and height for a pentagonal pyramid.");
    // Label prompt
      System.out.print("\tlabel: ");
    // Defines label variable
      String label = user.nextLine();
      pyramid.setLabel(label);
    // Base edge prompt
      System.out.print("\tbase edge: ");
    // Defines baseEdge variable
      Double baseEdge = Double.parseDouble(user.nextLine());
      pyramid.setBaseEdge(baseEdge);
    // if baseEdge is valid
      if (!pyramid.setBaseEdge(baseEdge)) {
         System.out.println("Error: base edge must be greater than 0.");
         return;
      }
    // Height prompt
      System.out.print("\theight: ");
    // Defines height variable
      Double height = Double.parseDouble(user.nextLine());
      pyramid.setHeight(height);
    // if height is valid
      if (!pyramid.setHeight(height)) {
         System.out.println("Error: height must be greater than 0.");
         return;
      }
    // Print information
      System.out.println("\n" + pyramid);
   }
}