 // Imports
import java.util.Comparator;

/**
 * Defines comparison by name.
 *
 * Project 10
 * @author Will Humphlett - COMP1210 - LLB001
 * @version 4/10/2019
 */
public class NameComparator implements Comparator<SoftballPlayer> {
   /**
    * Compares players based on lastname firstname.
    *
    * @param p1 - used 
    * @param p2 - used
    * @return int comparison
    */
   public int compare(SoftballPlayer p1, SoftballPlayer p2) {
      int p1i = p1.getName().indexOf(" ");
      int p2i = p2.getName().indexOf(" ");
      String p1Name = (p1.getName().substring(p1i + 1) 
         + p1.getName().substring(0, p1i)).toUpperCase();
      String p2Name = (p2.getName().substring(p2i + 1) 
         + p2.getName().substring(0, p2i)).toUpperCase();
         
      return p1Name.compareTo(p2Name);
   }
}