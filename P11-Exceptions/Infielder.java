/**
 * Defines the attributes of an Infielder.
 *
 * Project 11
 * @author Will Humphlett - COMP1210 - LLB001
 * @version 4/17/2019
 */
public class Infielder extends SoftballPlayer {
// Instance Variable
   private double infielderFieldingAvg;

  /**
    * Infielder constructor.
    *
    * @param numberIn - used
    * @param nameIn - used
    * @param positionIn - used
    * @param specializationIn - used
    * @param battingAvgIn - used
    * @param fieldingAvgIn - used
    */ 
   public Infielder(String numberIn, String nameIn, String positionIn,
      double specializationIn, double battingAvgIn, double fieldingAvgIn) {
      super(numberIn, nameIn, positionIn, specializationIn, battingAvgIn);
      infielderFieldingAvg = fieldingAvgIn;
   }
   
   /**
    * Returns infielder fielding average.
    *
    * @return double fielding avg
    */
   public double getInfielderFieldingAvg() {
      return infielderFieldingAvg;
   }
   
   /**
    * Sets infielder fielding average.
    *
    * @param fieldingAvgIn - used
    */
   public void setInfielderFieldingAvg(double fieldingAvgIn) {
      infielderFieldingAvg = fieldingAvgIn;
   }
   
   /**
    * Calculates infielder rating.
    *
    * @return double rating
    */
   public double rating() {
      return BASE_RATING * specialization * battingAvg * infielderFieldingAvg;
   }
}