import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Tests ReliefPitcher.
 *
 * Project 11
 * @author Will Humphlett - COMP1210 - LLB001
 * @version 4/17/2019
 */
public class ReliefPitcherTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }

   /**
    * Tests relief pitcher number.
    */
   @Test public void numberTest() {
      ReliefPitcher player = new ReliefPitcher("34", "Sammi James", "LHP",
         2.0, .125, 5, 4, 3.85, 17);
      player.setNumber("0");
      Assert.assertEquals("0", player.getNumber());
   }
   
   /**
    * Tests relief pitcher name.
    */
   @Test public void nameTest() {
      ReliefPitcher player = new ReliefPitcher("34", "Sammi James", "LHP",
         2.0, .125, 5, 4, 3.85, 17);
      player.setName("empty");
      Assert.assertEquals("empty", player.getName());
   }
   
   /**
    * Tests relief pitcher position.
    */
   @Test public void positionTest() {
      ReliefPitcher player = new ReliefPitcher("34", "Sammi James", "LHP",
         2.0, .125, 5, 4, 3.85, 17);
      player.setPosition("none");
      Assert.assertEquals("none", player.getPosition());
   }
   
   /**
    * Tests relief pitcher specialization factor.
    */
   @Test public void specializationTest() {
      ReliefPitcher player = new ReliefPitcher("34", "Sammi James", "LHP",
         2.0, .125, 5, 4, 3.85, 17);
      player.setSpecializationFactor(99.9);
      Assert.assertEquals(99.9, player.getSpecializationFactor(), .000001);
   }
   
   /**
    * Tests relief pitcher batting avg.
    */
   @Test public void battingAvgTest() {
      ReliefPitcher player = new ReliefPitcher("34", "Sammi James", "LHP",
         2.0, .125, 5, 4, 3.85, 17);
      player.setBattingAvg(0.999);
      Assert.assertEquals(0.999, player.getBattingAvg(), .000001);
   }
   
   /**
    * Tests relief pitcher wins.
    */
   @Test public void winsTest() {
      ReliefPitcher player = new ReliefPitcher("34", "Sammi James", "LHP",
         2.0, .125, 5, 4, 3.85, 17);
      player.setWins(0);
      Assert.assertEquals(0, player.getWins());
   }
   
   /**
    * Tests relief pitcher losses.
    */
   @Test public void lossesTest() {
      ReliefPitcher player = new ReliefPitcher("34", "Sammi James", "LHP",
         2.0, .125, 5, 4, 3.85, 17);
      player.setLosses(0);
      Assert.assertEquals(0, player.getLosses());
   }
   
   /**
    * Tests relief pitcher ERA.
    */
   @Test public void eraTest() {
      ReliefPitcher player = new ReliefPitcher("34", "Sammi James", "LHP",
         2.0, .125, 5, 4, 3.85, 17);
      player.setEra(1.99);
      Assert.assertEquals(1.99, player.getEra(), .000001);
   }
   
   /**
    * Tests relief pitcher saves.
    */
   @Test public void savesTest() {
      ReliefPitcher player = new ReliefPitcher("34", "Sammi James", "LHP",
         2.0, .125, 5, 4, 3.85, 17);
      player.setSaves(0);
      Assert.assertEquals(0, player.getSaves());
   }
   
   /**
    * Tests relief pitcher stats override.
    */
   @Test public void statsTest() {
      ReliefPitcher player = new ReliefPitcher("34", "Sammi James", "LHP",
         2.0, .125, 5, 4, 3.85, 17);
      String stats = "5 wins, 4 losses, 17 saves, 3.85 ERA";
      Assert.assertEquals(stats, player.stats());
   }
   
   /**
    * Tests relief pitcher rating override.
    */
   @Test public void ratingTest() {
      ReliefPitcher player = new ReliefPitcher("34", "Sammi James", "LHP",
         2.0, .125, 5, 4, 3.85, 17);
      Assert.assertEquals(2.474226, player.rating(), .000001);
   }
   
   /**
    * Tests relief pitcher count.
    */
   @Test public void countTest() {
      SoftballPlayer.resetCount();
      ReliefPitcher player = new ReliefPitcher("34", "Sammi James", "LHP",
         2.0, .125, 5, 4, 3.85, 17);
      Assert.assertEquals(1, SoftballPlayer.getCount());
   }
   
   /**
    * Tests infielder compareTo.
    */
   @Test public void toCompareTest() {
      ReliefPitcher player1 = new ReliefPitcher("23", "Jackie Smith", "RHP",
         1.25, .275, 10, 10, .850, 5);
      ReliefPitcher player2 = new ReliefPitcher("23", "Johnny Jay", "RHP",
         1.00, .200, 10, 10, .800, 5);
      ReliefPitcher player3 = new ReliefPitcher("40", "Champ Chump", "RHP",
         1.29, .279, 10, 10, .950, 5);
      ReliefPitcher player4 = new ReliefPitcher("10", "J Jackson", "RHP",
         1.55, .375, 10, 10, .250, 5);
      Assert.assertEquals(0, player1.compareTo(player2));
      Assert.assertEquals(-1, player1.compareTo(player3));
      Assert.assertEquals(1, player1.compareTo(player4));
   }
   
   /**
    * Tests relief pitcher toString.
    */
   @Test public void toStringTest() {
      ReliefPitcher player = new ReliefPitcher("34", "Sammi James", "LHP",
         2.0, .125, 5, 4, 3.85, 17);
      String test = "34 Sammi James (LHP) 5 wins, 4 losses, 17 saves, 3.85 ERA";
      test += "\nSpecialization Factor: 2.0 (class ReliefPitcher)";
      test += " Rating: 2.474";
      Assert.assertEquals(test, player.toString());
   }
}
