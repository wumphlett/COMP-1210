/**
 * Defines the InvalidCategoryException.
 *
 * Project 11
 * @author Will Humphlett - COMP1210 - LLB001
 * @version 4/17/2019
 */
public class InvalidCategoryException extends Exception {
   /**
    * Defines exception and String.
    *
    * @param category - used
    */
   public InvalidCategoryException(String category) {
      super("For category: " + "\"" + category + "\"");
   }
}