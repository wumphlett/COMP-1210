import java.util.Scanner;
import java.text.DecimalFormat;
import static java.lang.Math.sqrt;
import static java.lang.Math.abs;
import static java.lang.Math.pow;
/**
 * Evaluates an expression with a user provided value.
 *
 * Project 03 A
 * @author Will Humphlett - COMP1210 - LLB001
 * @version 1/30/2019
 */
public class ExpressionEvaluator {
/**
 * Allows for user input of a value x then evaluates a
 * set equation using the value of x provided.
 *
 * @param args Command line arguments - not used.
 */
   public static void main(String[] args) {
    // Variables and Objects
      double x = 0;
      double result = 0;
      int deciLeft = 0;
      int deciRight = 0;
      int deciIndex = 0;
      int resultLen = 0;
      String resultStr;
      Scanner userInput = new Scanner(System.in);
      DecimalFormat df = new DecimalFormat("#,##0.0###");
    // User input of x value
      System.out.print("Enter a value for x: ");
      x = userInput.nextDouble();
    // Calculation of result using user input of x
      result = sqrt(abs(1.2 * pow(x, 3) - 10 * x + 1) 
              + pow(5 * pow(x, 4) - 7 * pow(x, 3), 2)) 
              / (pow(x, 2) + 10);
    // Print result
      System.out.println("Result: " + result);
    // Determine deciLeft and deciRight
      resultStr = Double.toString(result);
      resultLen = resultStr.length();
      deciIndex = resultStr.indexOf(".");
      deciLeft = deciIndex;
      deciRight = resultLen - ++deciIndex;
    // Print deciLeft and deciRight
      System.out.println("# of characters to left of decimal point: " 
         + deciLeft);
      System.out.println("# of characters to right of decimal point: " 
         + deciRight);
    // Format result and print
      System.out.print("Formatted Result: " + df.format(result));
   }
}