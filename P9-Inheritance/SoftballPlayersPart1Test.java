import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Tests SoftballPlayersPart1.
 *
 * Project 09
 * @author Will Humphlett - COMP1210 - LLB001
 * @version 4/3/2019
 */
public class SoftballPlayersPart1Test {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }

   /**
    * Tests get/resetCount.
    */
   @Test public void countTest() {
      SoftballPlayer.resetCount();
      SoftballPlayersPart1.main(null);
      Assert.assertEquals(4, SoftballPlayer.getCount());
   }
}
