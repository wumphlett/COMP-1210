// Imports
import java.text.DecimalFormat;

/**
 * Defines the attributes of a SoftballPlayer.
 *
 * Project 10
 * @author Will Humphlett - COMP1210 - LLB001
 * @version 4/10/2019
 */
public abstract class SoftballPlayer implements Comparable<SoftballPlayer> {
// Instance Variables
   protected String playerNumber;
   protected String playerName;
   protected String playerPosition;
   protected double specialization;
   protected double battingAvg;
// Class Variable
   protected static int totalPlayers = 0;
/** Base Rating Constant. */
   public static final int BASE_RATING = 10;
   
   /**
    * SoftballPlayer constructor.
    *
    * @param numberIn - used
    * @param nameIn - used
    * @param positionIn - used
    * @param specializationIn - used
    * @param battingAvgIn - used
    */
   public SoftballPlayer(String numberIn, String nameIn, String positionIn,
      double specializationIn, double battingAvgIn) {
      playerNumber = numberIn;
      playerName = nameIn;
      playerPosition = positionIn;
      specialization = specializationIn;
      battingAvg = battingAvgIn;
      totalPlayers++;
   }
   
   /**
    * Returns player number.
    *
    * @return String number
    */
   public String getNumber() {
      return playerNumber;
   }
   
   /**
    * Sets player number.
    * 
    * @param numberIn - used
    */
   public void setNumber(String numberIn) {
      playerNumber = numberIn;
   }
   
   /**
    * Returns player name.
    *
    * @return String name
    */
   public String getName() {
      return playerName;
   }
   
   /**
    * Sets player name.
    *
    * @param nameIn - used
    */
   public void setName(String nameIn) {
      playerName = nameIn;
   }
   
   /**
    * Returns player position.
    *
    * @return String position
    */
   public String getPosition() {
      return playerPosition;
   }
   
   /**
    * Sets player position.
    *
    * @param positionIn - used
    */
   public void setPosition(String positionIn) {
      playerPosition = positionIn;
   }
   
   /**
    * Returns specialization.
    *
    * @return double specialization
    */
   public double getSpecializationFactor() {
      return specialization;
   }
   
   /**
    * Sets specialization.
    *
    * @param specializationIn - used
    */
   public void setSpecializationFactor(double specializationIn) {
      specialization = specializationIn;
   }
   
   /**
    * Returns batting average.
    *
    * @return double avg
    */
   public double getBattingAvg() {
      return battingAvg;
   }
   
   /**
    * Sets batting average.
    * 
    * @param battingAvgIn - used
    */
   public void setBattingAvg(double battingAvgIn) {
      battingAvg = battingAvgIn;
   }
   
   /**
    * Returns player count.
    * 
    * @return int count
    */
   public static int getCount() {
      return totalPlayers;
   }
   
   /**
    * Resets player count.
    */
   public static void resetCount() {
      totalPlayers = 0;
   }
   
   /**
    * Creates a stats string from batting avg.
    *
    * @return String stats
    */
   public String stats() {
      DecimalFormat stats = new DecimalFormat(".000");
      return stats.format(getBattingAvg());
   }
   
   /**
    * Abstract player rating.
    *
    * @return double
    */
   public abstract double rating();
   
   /**
    * SoftballPlayer compareTo.
    *
    * @param softballPlayerIn - used
    * @return int comparison
    */
   public int compareTo(SoftballPlayer softballPlayerIn) {
      int i = Integer.parseInt(this.getNumber())
         - Integer.parseInt(softballPlayerIn.getNumber());
      if (i == 0) {
         return 0;
      }
      else {
         return i > 0 ? 1 : -1;
      }
   }
    
   /**
    * SoftballPlayer toString.
    *
    * @return String toString
    */
   public String toString() {
      DecimalFormat rating = new DecimalFormat("#.000");
      
      String output = playerNumber + " " + playerName + " (";
      output += playerPosition + ") " + stats();
      output += "\nSpecialization Factor: " + specialization;
      output += " (" + this.getClass() + ") Rating: " + rating.format(rating());
      return output;
   }
}