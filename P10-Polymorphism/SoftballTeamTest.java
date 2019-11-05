import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.io.FileNotFoundException;

/**
 * Tests SoftballTeam.
 *
 * Project 10
 * @author Will Humphlett - COMP1210 - LLB001
 * @version 4/10/2019
 */
public class SoftballTeamTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }

   /**
    * Tests team name.
    */
   @Test public void teamNameTest() {
      SoftballTeam team = new SoftballTeam();
      
      team.setTeamName("test");
      Assert.assertEquals("test", team.getTeamName());
   }
   
   /**
    * Tests team roster.
    */
   @Test public void rosterTest() {
      SoftballTeam team = new SoftballTeam();
      SoftballPlayer[] roster =
         {new Infielder("33", "Johnny John", "3B", 1.25, .275, .850)};
      
      team.setRoster(roster);
      Assert.assertEquals(roster, team.getRoster());
   }
   
   /**
    * Tests player count.
    */
   @Test public void playerCountTest() {
      SoftballTeam team = new SoftballTeam();
   
      team.setPlayerCount(3);
      Assert.assertEquals(3, team.getPlayerCount());
   }
   
   /**
    * Tests excluded records.
    */
   @Test public void excludedRecordsTest() {
      SoftballTeam team = new SoftballTeam();
      String[] exRec = {"test"};
   
      team.setExcludedRecords(exRec);
      Assert.assertEquals(exRec, team.getExcludedRecords());
   }
   
   /**
    * Tests excluded count.
    */
   @Test public void excludedCountTest() {
      SoftballTeam team = new SoftballTeam();
   
      team.setExcludedCount(3);
      Assert.assertEquals(3, team.getExcludedCount());
   }
   
   /**
    * Tests ignored count.
    */
   @Test public void ignoredCountTest() {
      SoftballTeam team = new SoftballTeam();
   
      team.setIgnoredCount(3);
      Assert.assertEquals(3, team.getIgnoredCount());
   }
   
   /**
    * Tests read file.
    *
    * @throws FileNotFoundException - used
    */
   @Test public void readPlayerFile() throws FileNotFoundException {
      SoftballTeam.resetTeamCount();
      SoftballTeam team = new SoftballTeam();
      team.readPlayerFile("softball_player_data3.large_team_file.csv");
      
      Assert.assertEquals(1, team.getTeamCount());
      Assert.assertEquals(24, team.getPlayerCount());
      Assert.assertEquals(30, team.getExcludedCount());
      Assert.assertEquals(5, team.getIgnoredCount());
   }
   
   /**
    * Tests generate report.
    *
    * @throws FileNotFoundException - used
    */
   @Test public void generateReportTest() throws FileNotFoundException {
      SoftballTeam team = new SoftballTeam();
      team.readPlayerFile("softball_player_data1.csv");
   
      String report = "";
      report += "\n---------------------------------------";
      report += "\nTeam Report for Auburn Stars";
      report += "\n---------------------------------------";
      report += "\n";
      report += "\n32 Pat Jones (RF) .375";
      report += "\nSpecialization Factor: 1.0 (class Outfielder) Rating: 3.562";
      report += "\n";
      report += "\n23 Jackie Smith (3B) .275";
      report += "\nSpecialization Factor: 1.25 (class Infielder) Rating: 2.922";
      report += "\n";
      report += "\n43 Jo Williams (RHP) 22 wins, 4 losses, 2.85 ERA";
      report += "\nSpecialization Factor: 2.0 (class Pitcher) Rating: 3.740";
      report += "\n";
      report += "\n34 Sammi James (LHP) 5 wins, 4 losses, 17 saves, 3.85 ERA";
      report += "\nSpecialization Factor: 2.0";
      report += " (class ReliefPitcher) Rating: 2.474";
      report += "\n";
      report += "\n09 Pat Williams (RF) .480";
      report += "\nSpecialization Factor: 1.0 (class Outfielder) Rating: 4.560";
      Assert.assertEquals(report, team.generateReport());
   }
   
   /**
    * Tests generate report by number.
    *
    * @throws FileNotFoundException - used
    */
   @Test public void generateReportByNumberTest() throws FileNotFoundException {
      SoftballTeam team = new SoftballTeam();
      team.readPlayerFile("softball_player_data1.csv");
   
      String report = "";
      report += "\n---------------------------------------";
      report += "\nTeam Report for Auburn Stars (by Number)";
      report += "\n---------------------------------------";
      report += "\n09 Pat Williams RF .480";
      report += "\n23 Jackie Smith 3B .275";
      report += "\n32 Pat Jones RF .375";
      report += "\n34 Sammi James LHP 5 wins, 4 losses, 17 saves, 3.85 ERA";
      report += "\n43 Jo Williams RHP 22 wins, 4 losses, 2.85 ERA";
      Assert.assertEquals(report, team.generateReportByNumber());
   }
   
   /**
    * Tests generate report by number (null).
    */
   @Test public void generateReportByNumberNullTest() {
      SoftballTeam team = new SoftballTeam();
      SoftballPlayer[] roster = {null};
      team.setTeamName("Auburn Stars");
      team.setPlayerCount(1);
      team.setRoster(roster);
   
      String report = "";
      report += "\n---------------------------------------";
      report += "\nTeam Report for Auburn Stars (by Number)";
      report += "\n---------------------------------------";
      Assert.assertEquals(report, team.generateReportByNumber());
   }
   
   /**
    * Tests generate report by name.
    *
    * @throws FileNotFoundException - used
    */
   @Test public void generateReportByNameTest() throws FileNotFoundException {
      SoftballTeam team = new SoftballTeam();
      team.readPlayerFile("softball_player_data1.csv");
   
      String report = "";
      report += "\n---------------------------------------";
      report += "\nTeam Report for Auburn Stars (by Name)";
      report += "\n---------------------------------------";
      report += "\n34 Sammi James LHP 5 wins, 4 losses, 17 saves, 3.85 ERA";
      report += "\n32 Pat Jones RF .375";
      report += "\n23 Jackie Smith 3B .275";
      report += "\n43 Jo Williams RHP 22 wins, 4 losses, 2.85 ERA";
      report += "\n09 Pat Williams RF .480";
      Assert.assertEquals(report, team.generateReportByName());
   }
   
   /**
    * Tests generate report by name (null).
    */
   @Test public void generateReportByNameNullTest() {
      SoftballTeam team = new SoftballTeam();
      SoftballPlayer[] roster = {null};
      team.setTeamName("Auburn Stars");
      team.setPlayerCount(1);
      team.setRoster(roster);
   
      String report = "";
      report += "\n---------------------------------------";
      report += "\nTeam Report for Auburn Stars (by Name)";
      report += "\n---------------------------------------";
      Assert.assertEquals(report, team.generateReportByName());
   }
   
   /**
    * Tests generate report by rating.
    *
    * @throws FileNotFoundException - used
    */
   @Test public void generateReportByRatingTest() throws FileNotFoundException {
      SoftballTeam team = new SoftballTeam();
      team.readPlayerFile("softball_player_data1.csv");
   
      String report = "";
      report += "\n---------------------------------------";
      report += "\nTeam Report for Auburn Stars (by Rating)";
      report += "\n---------------------------------------";
      report += "\n4.560 09 Pat Williams RF .480";
      report += "\n3.740 43 Jo Williams RHP 22 wins, 4 losses, 2.85 ERA";
      report += "\n3.562 32 Pat Jones RF .375";
      report += "\n2.922 23 Jackie Smith 3B .275";
      report += "\n2.474 34 Sammi James LHP 5 wins, 4 losses, ";
      report += "17 saves, 3.85 ERA";
      Assert.assertEquals(report, team.generateReportByRating());
   }
   
   /**
    * Tests generate report by rating (null).
    */
   @Test public void generateReportByRatingNullTest() {
      SoftballTeam team = new SoftballTeam();
      SoftballPlayer[] roster = {null};
      team.setTeamName("Auburn Stars");
      team.setPlayerCount(1);
      team.setRoster(roster);
   
      String report = "";
      report += "\n---------------------------------------";
      report += "\nTeam Report for Auburn Stars (by Rating)";
      report += "\n---------------------------------------";
      Assert.assertEquals(report, team.generateReportByRating());
   }
   
   /**
    * Tests generate excluded records report.
    *
    * @throws FileNotFoundException - used
    */
   @Test public void generateExcludedRecordsReportTest()
      throws FileNotFoundException {
      SoftballTeam team = new SoftballTeam();
      team.readPlayerFile("softball_player_data1.csv");
   
      String report = "";
      report += "\n---------------------------------------";
      report += "\nExcluded Records Report";
      report += "\n---------------------------------------";
      report += "\n*** invalid category *** L,13,Gayle Adams,2B,1.25,.225,.875";
      report += "\nNumber of ignored records from file: 0";
      Assert.assertEquals(report, team.generateExcludedRecordsReport());
   }
}
