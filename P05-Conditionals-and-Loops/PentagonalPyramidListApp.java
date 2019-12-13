import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
/**
 * Reads PentagonalPyramid files and produces data.
 *
 * Project 5
 * @author Will Humphlett - COMP1210 - LLB001
 * @version 2/18/2019
 */
public class PentagonalPyramidListApp {
/**
 * Allows for user input of file then calls on methods
 * to produce data.
 *
 * @param args Command line arguments - not used
 * @throws FileNotFoundException for Scanner on file
 */
   public static void main(String[] args) throws FileNotFoundException {
   // Variables and parameters
      Scanner keyboard = new Scanner(System.in);
      String input;
      String listName;
      ArrayList<PentagonalPyramid> inputList 
         = new ArrayList<PentagonalPyramid>();
         
      // Get file
      System.out.print("Enter file name: ");
      input = keyboard.nextLine();
      
      // Open Scanner on input file
      Scanner fileScan = new Scanner(new File(input));
      
      // Take Title
      listName = fileScan.nextLine();
      
      // Read and add each PentagonalPyramid
      while (fileScan.hasNext()) {
         String name = "";
         // Determines exact object name
         while (fileScan.hasNextLine() && !fileScan.hasNextDouble()) {
            name += fileScan.nextLine();
         }
         name = name.trim();
         double base = fileScan.nextDouble();
         double height = fileScan.nextDouble();
         PentagonalPyramid pp = new PentagonalPyramid(name, base, height);
         inputList.add(pp);
      }
      
      // Close File
      fileScan.close();
      
      // Create PentagonalPyramidList Object
      PentagonalPyramidList list 
         = new PentagonalPyramidList(listName, inputList);
      // Print List
      System.out.println("\n" + list);
      // Print Summary Info
      System.out.println(list.summaryInfo());
   }
}