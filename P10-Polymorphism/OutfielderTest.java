import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Tests Outfielder.
 *
 * Project 10
 * @author Will Humphlett - COMP1210 - LLB001
 * @version 4/10/2019
 */
public class OutfielderTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }

   /**
    * Tests outfielder number.
    */
   @Test public void numberTest() {
      Outfielder player = new Outfielder("32", "Pat Jones", "RF",
         1.0, .375, .950);
      player.setNumber("0");
      Assert.assertEquals("0", player.getNumber());
   }
   
   /**
    * Tests outfielder name.
    */
   @Test public void nameTest() {
      Outfielder player = new Outfielder("32", "Pat Jones", "RF",
         1.0, .375, .950);
      player.setName("empty");
      Assert.assertEquals("empty", player.getName());
   }
   
   /**
    * Tests outfielder position.
    */
   @Test public void positionTest() {
      Outfielder player = new Outfielder("32", "Pat Jones", "RF",
         1.0, .375, .950);
      player.setPosition("none");
      Assert.assertEquals("none", player.getPosition());
   }
   
   /**
    * Tests outfielder specialization factor.
    */
   @Test public void specializationTest() {
      Outfielder player = new Outfielder("32", "Pat Jones", "RF",
         1.0, .375, .950);
      player.setSpecializationFactor(99.9);
      Assert.assertEquals(99.9, player.getSpecializationFactor(), .000001);
   }
   
   /**
    * Tests outfielder batting avg.
    */
   @Test public void battingAvgTest() {
      Outfielder player = new Outfielder("32", "Pat Jones", "RF",
         1.0, .375, .950);
      player.setBattingAvg(0.999);
      Assert.assertEquals(0.999, player.getBattingAvg(), .000001);
   }
   
   /**
    * Tests outfielder fielding avg.
    */
   @Test public void outfielderFieldingAvgTest() {
      Outfielder player = new Outfielder("32", "Pat Jones", "RF",
         1.0, .375, .950);
      player.setOutfielderFieldingAvg(.999);
      Assert.assertEquals(.999, player.getOutfielderFieldingAvg(), .000001);
   }
   
   /**
    * Tests outfielder stats.
    */
   @Test public void statsTest() {
      Outfielder player = new Outfielder("32", "Pat Jones", "RF",
         1.0, .375, .950);
      Assert.assertEquals(".375", player.stats());
   }
   
   /**
    * Tests outfielder rating override.
    */
   @Test public void ratingTest() {
      Outfielder player = new Outfielder("32", "Pat Jones", "RF",
         1.0, .375, .950);
      Assert.assertEquals(3.5625, player.rating(), .000001);
   }
   
   /**
    * Tests outfielder count.
    */
   @Test public void countTest() {
      SoftballPlayer.resetCount();
      Outfielder player = new Outfielder("32", "Pat Jones", "RF",
         1.0, .375, .950);
      Assert.assertEquals(1, SoftballPlayer.getCount());
   }
   
   /**
    * Tests outfielder compareTo.
    */
   @Test public void toCompareTest() {
      Outfielder player1 = new Outfielder("23", "Jackie Smith", "LF",
         1.25, .275, .850);
      Outfielder player2 = new Outfielder("23", "Johnny Jay", "RF",
         1.00, .200, .800);
      Outfielder player3 = new Outfielder("40", "Champ Chump", "CF",
         1.29, .279, .950);
      Outfielder player4 = new Outfielder("10", "J Jackson", "LF",
         1.55, .375, .250);
      Assert.assertEquals(0, player1.compareTo(player2));
      Assert.assertEquals(-1, player1.compareTo(player3));
      Assert.assertEquals(1, player1.compareTo(player4));
   }
   
   /**
    * Tests outfielder toString.
    */
   @Test public void toStringTest() {
      Outfielder player = new Outfielder("32", "Pat Jones", "RF",
         1.0, .375, .950);
      String test = "32 Pat Jones (RF) .375";
      test += "\nSpecialization Factor: 1.0 (class Outfielder) Rating: 3.562";
      Assert.assertEquals(test, player.toString());
   }
}