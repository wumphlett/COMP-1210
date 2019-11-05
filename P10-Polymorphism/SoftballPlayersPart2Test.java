import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.io.FileNotFoundException;

/**
 * Tests SoftballPlayersPart2.
 *
 * Project 10
 * @author Will Humphlett - COMP1210 - LLB001
 * @version 4/10/2019
 */
public class SoftballPlayersPart2Test {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }

   /**
    * Tests main method 0.
    *
    * @throws FileNotFoundException - used
    */
   @Test public void mainTest0() throws FileNotFoundException {
      SoftballTeam.resetTeamCount();
      
      String[] args0 = {};
      SoftballPlayersPart2.main(args0);
      
      Assert.assertEquals(0, SoftballTeam.getTeamCount());
   }
   
   /**
    * Tests main method 1.
    *
    * @throws FileNotFoundException - used
    */
   @Test public void mainTest1() throws FileNotFoundException {
      SoftballTeam.resetTeamCount();
      
      String[] args1 = {"softball_player_data3.large_team_file.csv"};
      SoftballPlayersPart2.main(args1);
      
      Assert.assertEquals(1, SoftballTeam.getTeamCount());
   }
   
   /**
    * Tests default constructor.
    */
   @Test public void spp2Test() {
      SoftballPlayersPart2 app = new SoftballPlayersPart2();
   }
}
