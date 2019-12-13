/**
 * Creates and prints different types of softball players.
 *
 * Project 09
 * @author Will Humphlett - COMP1210 - LLB001
 * @version 4/3/2019
 */
public class SoftballPlayersPart1 {
   /**
    * Main creates and prints players.
    *
    * @param args Command line arguments - not used
    */
   public static void main(String[] args) {
      // Players
      Outfielder p1 = new Outfielder("32", "Pat Jones", "RF", 1.0, .375, .950);
      Infielder p2 = new Infielder("23", "Jackie Smith", "3B",
         1.25, .275, .850);
      Pitcher p3 = new Pitcher("43", "Jo Williams", "RHP",
         2.0, .125, 22, 4, 2.85);
      ReliefPitcher p4 = new ReliefPitcher("34", "Sammi James", "LHP",
         2.0, .125, 5, 4, 3.85, 17);
      
      // Print
      System.out.println(p1);
      System.out.println("\n" + p2);
      System.out.println("\n" + p3);
      System.out.print("\n" + p4);
   }
}