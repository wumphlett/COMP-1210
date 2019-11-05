import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Tests NameComparator.
 *
 * Project 11
 * @author Will Humphlett - COMP1210 - LLB001
 * @version 4/17/2019
 */
public class NameComparatorTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }

   /**
    * Tests comparator by name.
    */
   @Test public void nameComparatorTest() {
      NameComparator nc = new NameComparator();
   
      Infielder player1 = new Infielder("23", "Jackie Smith", "3B",
         1.25, .275, .850);
      Infielder player2 = new Infielder("23", "Johnny Jay", "2B",
         1.00, .200, .800);
      Infielder player3 = new Infielder("40", "Champ Chump", "1B",
         1.29, .279, .950);
      Infielder player4 = new Infielder("10", "J Jackson", "SS",
         1.55, .375, .250);
      Assert.assertTrue(nc.compare(player3, player4) < 0);
      Assert.assertTrue(nc.compare(player1, player4) > 0);
      Assert.assertTrue(nc.compare(player4, player4) == 0);
   }
}
