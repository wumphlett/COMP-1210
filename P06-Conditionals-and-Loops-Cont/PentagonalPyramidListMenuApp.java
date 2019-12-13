import java.util.Scanner;
import java.util.ArrayList;
import java.io.FileNotFoundException;
/**
 * Creates a menu for manipulating PentagonalPyramid lists.
 *
 * Project 06
 * @author Will Humphlett - COMP1210 - LLB001
 * @version 2/26/2019
 */
public class PentagonalPyramidListMenuApp {
/**
   * Defines the menu, allows for user input options, performs
   * actions based on user input.
   *
   * @param args Command line arguments - not used
   * @throws FileNotFoundException - used
   */
   public static void main(String[] args) throws FileNotFoundException {
     // Scanner and instance variables
      Scanner keyboard = new Scanner(System.in);
      ArrayList<PentagonalPyramid> list = new ArrayList<PentagonalPyramid>();
      PentagonalPyramidList ppl = new PentagonalPyramidList("", list);
     // Print menu
      String menu = "";
      menu += "PentagonalPyramid List System Menu";
      menu += "\nR - Read File and Create PentagonalPyramid List";
      menu += "\nP - Print PentagonalPyramid List";
      menu += "\nS - Print Summary";
      menu += "\nA - Add PentagonalPyramid";
      menu += "\nD - Delete PentagonalPyramid";
      menu += "\nF - Find PentagonalPyramid";
      menu += "\nE - Edit PentagonalPyramid";
      menu += "\nQ - Quit";
      System.out.println(menu);
      // Prompt for code
      char code = 'Q';
      do {
         System.out.print("Enter Code [R, P, S, A, D, F, E, or Q]: ");
         code = keyboard.nextLine().charAt(0);
         code = Character.toUpperCase(code);
         switch (code) {
            case 'R': // Read File
               String file = "";
               // Obtain file name
               System.out.print("\tFile Name: ");
               file = keyboard.nextLine();
               // Read file
               ppl = ppl.readFile(file);
               System.out.println("\tFile read in and"
                  + " PentagonalPyramid List created");
               break;
            case 'P': // Print
               System.out.println(ppl);
               break;
            case 'S': // Summary
               System.out.println("\n" + ppl.summaryInfo());
               break;
            case 'A': // Add
               String addLabel = "";
               double addBase = 0.0;
               double addHeight = 0.0;
               // Obtain new paramaters
               System.out.print("\tLabel: ");
               addLabel = keyboard.nextLine().trim();
               System.out.print("\tBase Edge: ");
               addBase = Double.parseDouble(keyboard.nextLine());
               System.out.print("\tHeight: ");
               addHeight = Double.parseDouble(keyboard.nextLine());
               // Create and add new object
               ppl.addPentagonalPyramid(addLabel, addBase, addHeight);
               System.out.println("\t*** PentagonalPyramid added ***");
               break;
            case 'D': // Delete
               // Obtain deleted object label
               String deleteLabel = "";
               System.out.print("\tLabel: ");
               deleteLabel = keyboard.nextLine().trim();
               // if else object to be deleted exists
               if (ppl.findPentagonalPyramid(deleteLabel) == null) {
                  System.out.println("\t\"" + deleteLabel + "\" not found");
               }
               else {
                  System.out.println("\t\"" 
                     + ppl.findPentagonalPyramid(deleteLabel).getLabel() 
                     + "\" deleted");
                  ppl.deletePentagonalPyramid(deleteLabel);
               }
               break;
            case 'F': // Find
               // Obtain found object label
               String findLabel = "";
               System.out.print("\tLabel: ");
               findLabel = keyboard.nextLine().trim();
               // if else object to be found exists
               if (ppl.findPentagonalPyramid(findLabel) != null) {
                  System.out.println(ppl.findPentagonalPyramid(findLabel));
               }
               else {
                  System.out.println("\t\"" + findLabel + "\" not found");
               }
               break;
            case 'E': // Edit
               String editLabel = "";
               double editBase = 0.0;
               double editHeight = 0.0;
               // Obtain edited parameters
               System.out.print("\tLabel: ");
               editLabel = keyboard.nextLine().trim();
               System.out.print("\tBase Edge: ");
               editBase = Double.parseDouble(keyboard.nextLine());
               System.out.print("\tHeight: ");
               editHeight = Double.parseDouble(keyboard.nextLine());
               // if else object to be edited exists
               if (ppl.findPentagonalPyramid(editLabel) != null) {
                  // Edit object
                  ppl.editPentagonalPyramid(editLabel, editBase, editHeight);
                  System.out.println("\t\"" 
                     + editLabel
                     + "\" successfully edited");
               }
               else {
                  System.out.println("\t\"" + editLabel + "\" not found");
               }
               break;
            case 'Q': // Quit
            
               break;
            default: // Invalid Code Catch-all
               System.out.println("\t*** invalid code ***");
               break;
         }
         System.out.print("\n");
      } while (code != 'Q');
   }
}