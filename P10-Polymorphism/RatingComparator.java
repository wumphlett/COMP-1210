// Imports
import java.util.Comparator;

/**
 * Defines comparison by rating.
 *
 * Project 10
 * @author Will Humphlett - COMP1210 - LLB001
 * @version 4/10/2019
 */
public class RatingComparator implements Comparator<SoftballPlayer> {
   /**
    * Compares players based on lastname firstname.
    *
    * @param p1 - used 
    * @param p2 - used
    * @return int comparison
    */
   public int compare(SoftballPlayer p1, SoftballPlayer p2) {
      double p1Rating = p1.rating();
      double p2Rating = p2.rating();
      
      if (Math.abs(p1Rating - p2Rating) < .00001) {
         return 0;
      }
      else {
         return p1Rating > p2Rating ? -1 : 1;
      }
   }
}