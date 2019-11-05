// Imports
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.text.DecimalFormat;

/**
 * Defines the attributes of a SoftballTeam.
 *
 * Project 10
 * @author Will Humphlett - COMP1210 - LLB001
 * @version 4/10/2019
 */
public class SoftballTeam {
// Instance Variables
   private String teamName;
   private SoftballPlayer[] roster = new SoftballPlayer[24];
   private int playerCount;
   private String[] excludedRecords = new String[30];
   private int excludedCount;
   private int ignoredCount;
// Class Variables
   private static int teamCount = 0;
/** Max Team Capacity Constant. */
   public static final int MAX_PLAYERS = 24;
/** Max Excluded Records Capacity Constant. */
   public static final int MAX_EXCLUDED = 30;
   
   /**
    * SoftballTeam constructor.
    */
   public SoftballTeam() {
      playerCount = 0;
      excludedCount = 0;
      ignoredCount = 0;
      teamCount++;
   }
   
   /**
    * Returns team name.
    *
    * @return String team name
    */
   public String getTeamName() {
      return teamName;
   }
   
   /**
    * Sets team name.
    *
    * @param teamNameIn - used
    */
   public void setTeamName(String teamNameIn) {
      teamName = teamNameIn;
   }
   
   /**
    * Returns team roster.
    *
    * @return SoftballPlayer[] roster
    */
   public SoftballPlayer[] getRoster() {
      return roster;
   }
   
   /**
    * Sets team roster.
    *
    * @param playerArrayIn - used
    */
   public void setRoster(SoftballPlayer[] playerArrayIn) {
      roster = playerArrayIn;
   }
   
   /**
    * Returns player count.
    *
    * @return int player count
    */
   public int getPlayerCount() {
      return playerCount;
   }
   
   /**
    * Sets player count.
    *
    * @param playerCountIn - used
    */
   public void setPlayerCount(int playerCountIn) {
      playerCount = playerCountIn;
   }
   
   /**
    * Returns excluded records.
    *
    * @return String[] excluded records
    */
   public String[] getExcludedRecords() {
      return excludedRecords;
   }
   
   /**
    * Sets excluded records.
    *
    * @param exRecordsIn - used
    */
   public void setExcludedRecords(String[] exRecordsIn) {
      excludedRecords = exRecordsIn;
   }
   
   /**
    * Returns excluded count.
    *
    * @return int excluded count
    */
   public int getExcludedCount() {
      return excludedCount;
   }
   
   /**
    * Sets excluded count.
    *
    * @param exCountIn - used
    */
   public void setExcludedCount(int exCountIn) {
      excludedCount = exCountIn;
   }
   
   /**
    * Returns ignored count.
    *
    * @return int ignored count
    */
   public int getIgnoredCount() {
      return ignoredCount;
   }
   
   /** 
    * Sets ignored count.
    *
    * @param igCountIn - used
    */
   public void setIgnoredCount(int igCountIn) {
      ignoredCount = igCountIn;
   }
   
   /**
    * Returns team count.
    *
    * @return int team count
    */
   public static int getTeamCount() {
      return teamCount;
   }
   
   /**
    * Resets team count.
    */
   public static void resetTeamCount() {
      teamCount = 0;
   }
   
   /**
    * Reads file to create rosters.
    *
    * @param fileNameIn - used
    * @throws FileNotFoundException - used
    */
   public void readPlayerFile(String fileNameIn) throws FileNotFoundException {
      // Read File Name
      Scanner fileScan = new Scanner(new File(fileNameIn));
      // Set Team Name
      teamName = fileScan.nextLine().trim();
      
      String line = null;
      while (fileScan.hasNextLine()) {
         // Line Read
         line = fileScan.nextLine();
         Scanner lineScan = new Scanner(line);
         lineScan.useDelimiter(",");
         // Player Read
         char category = lineScan.next().charAt(0);
         SoftballPlayer player;
         switch (category) {
            case 'O':
               player = new Outfielder(lineScan.next(), lineScan.next(),
                  lineScan.next(), lineScan.nextDouble(), lineScan.nextDouble(),
                  lineScan.nextDouble());
               break;
            case 'I':
               player = new Infielder(lineScan.next(), lineScan.next(),
                  lineScan.next(), lineScan.nextDouble(), lineScan.nextDouble(),
                  lineScan.nextDouble());
               break;
            case 'P':
               player = new Pitcher(lineScan.next(), lineScan.next(),
                  lineScan.next(), lineScan.nextDouble(),
                  lineScan.nextDouble(), lineScan.nextInt(),
                  lineScan.nextInt(), lineScan.nextDouble());
               break;
            case 'R':
               player = new ReliefPitcher(lineScan.next(),
                  lineScan.next(), lineScan.next(),
                  lineScan.nextDouble(), lineScan.nextDouble(),
                  lineScan.nextInt(), lineScan.nextInt(),
                  lineScan.nextDouble(), lineScan.nextInt());
               break;
            default:
               if (excludedCount < MAX_EXCLUDED) {
                  excludedRecords[excludedCount++] = "*** invalid category *** "
                     + line;
               }
               else {
                  ignoredCount++;
               }
               continue;
         }
         
         if (playerCount < MAX_PLAYERS) {
            roster[playerCount++] = player;
         }
         else if (excludedCount < MAX_EXCLUDED) {
            excludedRecords[excludedCount++] = 
               "Maximum player count of 24 exceeded for: " + line;
         }
         else {
            ignoredCount++;
         }
      }
   }
   
   /**
    * Generates team report.
    *
    * @return String report
    */
   public String generateReport() {
      String report = "";
      report += "\n---------------------------------------";
      report += "\nTeam Report for " + teamName;
      report += "\n---------------------------------------";
      for (SoftballPlayer player : roster) {
         if (player != null) {
            report += "\n\n" + player;
         }
      }
      return report;
   }
   
   /**
    * Generates team roster by number.
    *
    * @return String roster
    */
   public String generateReportByNumber() {
      // Sort By Natural Order
      SoftballPlayer[] byNumber = Arrays.copyOf(roster, playerCount);
      Arrays.sort(byNumber);
      
      String report = "";
      report += "\n---------------------------------------";
      report += "\nTeam Report for " + teamName + " (by Number)";
      report += "\n---------------------------------------";
      for (SoftballPlayer player : byNumber) {
         if (player != null) {
            report += "\n" + player.getNumber() + " " + player.getName() + " ";
            report += player.getPosition() + " " + player.stats();
         }
      }
      return report;
   }
   
   /**
    * Generates team roster by name.
    *
    * @return String roster
    */
   public String generateReportByName() {
      // Sort By Natural Order
      SoftballPlayer[] byName = Arrays.copyOf(roster, playerCount);
      Arrays.sort(byName, new NameComparator());
      
      String report = "";
      report += "\n---------------------------------------";
      report += "\nTeam Report for " + teamName + " (by Name)";
      report += "\n---------------------------------------";
      for (SoftballPlayer player : byName) {
         if (player != null) {
            report += "\n" + player.getNumber() + " " + player.getName() + " ";
            report += player.getPosition() + " " + player.stats();
         }
      }
      return report;
   }
   
   /**
    * Generates team roster by rating.
    *
    * @return String roster
    */
   public String generateReportByRating() {
     // Rating Format
      DecimalFormat rating = new DecimalFormat("0.000");
      // Sort By Natural Order
      SoftballPlayer[] byRating = Arrays.copyOf(roster, playerCount);
      Arrays.sort(byRating, new RatingComparator());
      
      String report = "";
      report += "\n---------------------------------------";
      report += "\nTeam Report for " + teamName + " (by Rating)";
      report += "\n---------------------------------------";
      for (SoftballPlayer player : byRating) {
         if (player != null) {
            report += "\n" + rating.format(player.rating()) + " ";
            report += player.getNumber() + " " + player.getName() + " ";
            report += player.getPosition() + " " + player.stats();
         }
      }
      return report;
   }
   
   /**
    * Generates excluded records report.
    *
    * @return String report
    */
   public String generateExcludedRecordsReport() {
      String report = "";
      report += "\n---------------------------------------";
      report += "\nExcluded Records Report";
      report += "\n---------------------------------------";
      for (String s : excludedRecords) {
         if (s != null) {
            report += "\n" + s;
         }
      }
      report += "\nNumber of ignored records from file: " + ignoredCount;
      return report;
   }
}