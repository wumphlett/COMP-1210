// Imports
import java.io.FileNotFoundException;

/**
 * Applet of SoftballTeam.
 *
 * Project 10
 * @author Will Humphlett - COMP1210 - LLB001
 * @version 4/10/2019
 */
public class SoftballPlayersPart2 {
   /**
    * Allows for pass in of file name in command line arguments.
    *
    * @param args Command line arguments - used
    * @throws FileNotFoundException - used
    */
   public static void main(String[] args) throws FileNotFoundException {
      if (args.length == 0) {
         System.out.println("File name expected as command line argument.");
         System.out.println("Program ending.");
      }
      else {
         SoftballTeam team = new SoftballTeam();
         team.readPlayerFile(args[0]);
         
         System.out.println(team.generateReport() + "\n");
         System.out.println(team.generateReportByNumber());
         System.out.println(team.generateReportByName());
         System.out.println(team.generateReportByRating());
         System.out.println(team.generateExcludedRecordsReport() + "\n");
      }
   }
}