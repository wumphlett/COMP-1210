import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Tests Infielder.
 *
 * Project 09
 * @author Will Humphlett - COMP1210 - LLB001
 * @version 4/3/2019
 */
public class InfielderTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }

   /**
    * Tests infielder number.
    */
   @Test public void numberTest() {
      Infielder player = new Infielder("23", "Jackie Smith", "3B",
         1.25, .275, .850);
      player.setNumber("0");
      Assert.assertEquals("0", player.getNumber());
   }
   
   /**
    * Tests infielder name.
    */
   @Test public void nameTest() {
      Infielder player = new Infielder("23", "Jackie Smith", "3B",
         1.25, .275, .850);
      player.setName("empty");
      Assert.assertEquals("empty", player.getName());
   }
   
   /**
    * Tests infielder position.
    */
   @Test public void positionTest() {
      Infielder player = new Infielder("23", "Jackie Smith", "3B",
         1.25, .275, .850);
      player.setPosition("none");
      Assert.assertEquals("none", player.getPosition());
   }
   
   /**
    * Tests infielder specialization factor.
    */
   @Test public void specializationTest() {
      Infielder player = new Infielder("23", "Jackie Smith", "3B",
         1.25, .275, .850);
      player.setSpecializationFactor(99.9);
      Assert.assertEquals(99.9, player.getSpecializationFactor(), .000001);
   }
   
   /**
    * Tests infielder batting avg.
    */
   @Test public void battingAvgTest() {
      Infielder player = new Infielder("23", "Jackie Smith", "3B",
         1.25, .275, .850);
      player.setBattingAvg(0.999);
      Assert.assertEquals(0.999, player.getBattingAvg(), .000001);
   }
   
   /**
    * Tests infielder fielding avg.
    */
   @Test public void infielderFieldingAvgTest() {
      Infielder player = new Infielder("23", "Jackie Smith", "3B",
         1.25, .275, .850);
      player.setInfielderFieldingAvg(.999);
      Assert.assertEquals(.999, player.getInfielderFieldingAvg(), .000001);
   }
   
   /**
    * Tests infielder stats.
    */
   @Test public void statsTest() {
      Infielder player = new Infielder("23", "Jackie Smith", "3B",
         1.25, .275, .850);
      Assert.assertEquals(".275", player.stats());
   }
   
   /**
    * Tests infielder rating override.
    */
   @Test public void ratingTest() {
      Infielder player = new Infielder("23", "Jackie Smith", "3B",
         1.25, .275, .850);
      Assert.assertEquals(2.921875, player.rating(), .000001);
   }
   
   /**
    * Tests infielder count.
    */
   @Test public void countTest() {
      SoftballPlayer.resetCount();
      Infielder player = new Infielder("23", "Jackie Smith", "3B",
         1.25, .275, .850);
      Assert.assertEquals(1, SoftballPlayer.getCount());
   }
   
   /**
    * Tests infielder toString.
    */
   @Test public void toStringTest() {
      Infielder player = new Infielder("23", "Jackie Smith", "3B",
         1.25, .275, .850);
      String test = "23 Jackie Smith (3B) .275";
      test += "\nSpecialization Factor: 1.25 (class Infielder) Rating: 2.922";
      Assert.assertEquals(test, player.toString());
   }
}
