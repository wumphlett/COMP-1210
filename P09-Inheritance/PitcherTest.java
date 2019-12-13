import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Tests Pitcher.
 *
 * Project 09
 * @author Will Humphlett - COMP1210 - LLB001
 * @version 4/3/2019
 */
public class PitcherTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }

   /**
    * Tests pitcher number.
    */
   @Test public void numberTest() {
      Pitcher player = new Pitcher("43", "Jo Williams", "RHP",
         2.0, .125, 22, 4, 2.85);
      player.setNumber("0");
      Assert.assertEquals("0", player.getNumber());
   }
   
   /**
    * Tests pitcher name.
    */
   @Test public void nameTest() {
      Pitcher player = new Pitcher("43", "Jo Williams", "RHP",
         2.0, .125, 22, 4, 2.85);
      player.setName("empty");
      Assert.assertEquals("empty", player.getName());
   }
   
   /**
    * Tests pitcher position.
    */
   @Test public void positionTest() {
      Pitcher player = new Pitcher("43", "Jo Williams", "RHP",
         2.0, .125, 22, 4, 2.85);
      player.setPosition("none");
      Assert.assertEquals("none", player.getPosition());
   }
   
   /**
    * Tests pitcher specialization factor.
    */
   @Test public void specializationTest() {
      Pitcher player = new Pitcher("43", "Jo Williams", "RHP",
         2.0, .125, 22, 4, 2.85);
      player.setSpecializationFactor(99.9);
      Assert.assertEquals(99.9, player.getSpecializationFactor(), .000001);
   }
   
   /**
    * Tests pitcher batting avg.
    */
   @Test public void battingAvgTest() {
      Pitcher player = new Pitcher("43", "Jo Williams", "RHP",
         2.0, .125, 22, 4, 2.85);
      player.setBattingAvg(0.999);
      Assert.assertEquals(0.999, player.getBattingAvg(), .000001);
   }
   
   /**
    * Tests pitcher wins.
    */
   @Test public void winsTest() {
      Pitcher player = new Pitcher("43", "Jo Williams", "RHP",
         2.0, .125, 22, 4, 2.85);
      player.setWins(0);
      Assert.assertEquals(0, player.getWins());
   }
   
   /**
    * Tests pitcher losses.
    */
   @Test public void lossesTest() {
      Pitcher player = new Pitcher("43", "Jo Williams", "RHP",
         2.0, .125, 22, 4, 2.85);
      player.setLosses(0);
      Assert.assertEquals(0, player.getLosses());
   }
   
   /**
    * Tests pitcher ERA.
    */
   @Test public void eraTest() {
      Pitcher player = new Pitcher("43", "Jo Williams", "RHP",
         2.0, .125, 22, 4, 2.85);
      player.setEra(1.99);
      Assert.assertEquals(1.99, player.getEra(), .000001);
   }
   
   
   /**
    * Tests pitcher stats override.
    */
   @Test public void statsTest() {
      Pitcher player = new Pitcher("43", "Jo Williams", "RHP",
         2.0, .125, 22, 4, 2.85);
      String stats = "22 wins, 4 losses, 2.85 ERA";
      Assert.assertEquals(stats, player.stats());
   }
   
   /**
    * Tests pitcher rating override.
    */
   @Test public void ratingTest() {
      Pitcher player = new Pitcher("43", "Jo Williams", "RHP",
         2.0, .125, 22, 4, 2.85);
      Assert.assertEquals(3.740259, player.rating(), .000001);
   }
   
   /**
    * Tests pitcher count.
    */
   @Test public void countTest() {
      SoftballPlayer.resetCount();
      Pitcher player = new Pitcher("43", "Jo Williams", "RHP",
         2.0, .125, 22, 4, 2.85);
      Assert.assertEquals(1, SoftballPlayer.getCount());
   }
   
   /**
    * Tests pitcher toString.
    */
   @Test public void toStringTest() {
      Pitcher player = new Pitcher("43", "Jo Williams", "RHP",
         2.0, .125, 22, 4, 2.85);
      String test = "43 Jo Williams (RHP) 22 wins, 4 losses, 2.85 ERA";
      test += "\nSpecialization Factor: 2.0 (class Pitcher) Rating: 3.740";
      Assert.assertEquals(test, player.toString());
   }
}
