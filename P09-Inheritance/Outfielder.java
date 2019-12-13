/**
 * Defines the attributes of an Outfielder.
 *
 * Project 09
 * @author Will Humphlett - COMP1210 - LLB001
 * @version 4/3/2019
 */
public class Outfielder extends SoftballPlayer {
// Instance Variable
   private double outfielderFieldingAvg;
  
  /**
    * Outfielder constructor.
    *
    * @param numberIn - used
    * @param nameIn - used
    * @param positionIn - used
    * @param specializationIn - used
    * @param battingAvgIn - used
    * @param fieldingAvgIn - used
    */ 
   public Outfielder(String numberIn, String nameIn, String positionIn,
      double specializationIn, double battingAvgIn, double fieldingAvgIn) {
      super(numberIn, nameIn, positionIn, specializationIn, battingAvgIn);
      outfielderFieldingAvg = fieldingAvgIn;
   }
   
   /**
    * Returns outfielder fielding average.
    *
    * @return double fielding avg
    */
   public double getOutfielderFieldingAvg() {
      return outfielderFieldingAvg;
   }
   
   /**
    * Sets outfielder fielding average.
    *
    * @param fieldingAvgIn - used
    */
   public void setOutfielderFieldingAvg(double fieldingAvgIn) {
      outfielderFieldingAvg = fieldingAvgIn;
   }
   
   /**
    * Calculates outfielder rating.
    *
    * @return double rating
    */
   public double rating() {
      return BASE_RATING * specialization * battingAvg * outfielderFieldingAvg;
   }
}