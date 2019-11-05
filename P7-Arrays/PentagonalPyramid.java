import java.text.DecimalFormat;
import static java.lang.Math.tan;
import static java.lang.Math.toRadians;
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;
/**
 * Class PentagonalPyramid calculates information concerning a
 * pentagonal pyramid given user inputed variables.
 *
 * Project 7
 * @author Will Humphlett - COMP1210 - LLB001
 * @version 3/6/2019
 */
public class PentagonalPyramid {
// instance variables
   private String label = "";
   private double baseEdge = 0;
   private double height = 0;
   
/**
 * Constructor for PentagonalPyramid.
 * Creates the object with given parameters.
 *
 * @param labelIn - used
 * @param baseEdgeIn - used
 * @param heightIn - used
 */
   public PentagonalPyramid(String labelIn, double baseEdgeIn, 
      double heightIn) {
      setLabel(labelIn);
      setBaseEdge(baseEdgeIn);
      setHeight(heightIn);
   }
   /**
    * Sets the label to the given String.
    *
    * @param labelIn - used
    * @return boolean if label is set
    */
   public boolean setLabel(String labelIn) {
      boolean isLabelSet = false;
      if (labelIn != null) {
         label = labelIn.trim();
         isLabelSet = true;
      }
      // returns a boolean dependant upon if the given paramater is valid
      return isLabelSet;
   }
   /**
    * Retrieves the label of the object.
    *
    * @return String the label of the object
    */
   public String getLabel() {
      return label;
   }
   /**
    * Sets the base edge to the given double.
    *
    * @param baseEdgeIn - used
    * @return boolean if base is set
    */
   public boolean setBaseEdge(double baseEdgeIn) {
      boolean isBaseSet = false;
      if (baseEdgeIn > 0) {
         baseEdge = baseEdgeIn;
         isBaseSet = true;
      }
      // returns a boolean dependant upon if the given paramater is valid
      return isBaseSet;
   }
   /**
    * Retrieves the base edge of the object.
    *
    * @return double the base edge of the object
    */
   public double getBaseEdge() {
      return baseEdge;
   }
   /**
    * Sets the height to the given.
    *
    * @param heightIn - used
    * @return boolean if height is set
    */
   public boolean setHeight(double heightIn) {
      boolean isHeightSet = false;
      if (heightIn > 0) {
         height = heightIn;
         isHeightSet = true;
      }
      // returns a boolean dependant upon if the given paramater is valid
      return isHeightSet;
   }
   /**
    * Retrieves the height of the object.
    *
    * @return double the height of the object
    */
   public double getHeight() {
      return height;
   }
   /**
    * Calculates and returns the surface area of the pentagonal pyramid.
    *
    * @return double calculated surface area
    */
   public double surfaceArea() {
      double surfaceArea = (5.0 / 4.0) * tan(toRadians(54)) * pow(baseEdge, 2)
         + (5 * baseEdge / 2) * sqrt(pow(height, 2)
         + pow(baseEdge * tan(toRadians(54)) / 2, 2));
      return surfaceArea;
   }
   /**
    * Calculates and returns the volume of the pentagonal pyramid.
    *
    * @return double calculated surface areavolume
    */
   public double volume() {
      double volume = (5.0 / 12.0) * tan(toRadians(54)) * height 
         * pow(baseEdge, 2);
      return volume;
   }
   /**
    * Creates and returns the string assigned to a created object.
    *
    * @return String created string
    */
   public String toString() {
      DecimalFormat df = new DecimalFormat("#,##0.0######");
      String output = "PentagonalPyramid \"" + label + "\" ";
      output += "with base edge = " + baseEdge + " ";
      output += "and height = " + height + " units has:";
      output += "\n\tsurface area = " + df.format(surfaceArea()) 
         + " square units";
      output += "\n\tvolume = " + df.format(volume()) + " cubic units";
      return output;
   }
}