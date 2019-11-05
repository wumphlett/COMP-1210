import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Tests RatingComparator.
 *
 * Project 10
 * @author Will Humphlett - COMP1210 - LLB001
 * @version 4/10/2019
 */
public class RatingComparatorTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }

   /**
    * Tests comparator by rating.
    */
   @Test public void ratingComparatorTest() {
      RatingComparator rc = new RatingComparator();
      
      Infielder player3 = new Infielder("40", "Champ Chump", "1B",
         1.29, .279, .950);
      Infielder player4 = new Infielder("10", "J Jackson", "SS",
         1.55, .375, .250);
      Assert.assertTrue(rc.compare(player3, player4) == -1);
      Assert.assertTrue(rc.compare(player4, player3) == 1);
      Assert.assertTrue(rc.compare(player4, player4) == 0);
   }
}
