import java.text.DecimalFormat;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
/**
 * Stores the name and list of PentagonalPyramid objects.
 *
 * Project 08 A
 * @author Will Humphlett - COMP1210 - LLB001
 * @version 3/20/2019
 */
public class PentagonalPyramidList2 {
// Fields
   private String name = "";
   private PentagonalPyramid[] array;
   private int number;
/**
 * Constructor for PentagonalPyramidList2.
 *
 * @param nameIn - used
 * @param arrayIn - used
 * @param numberIn - used
 */
   public PentagonalPyramidList2(String nameIn, PentagonalPyramid[] arrayIn, 
      int numberIn) {
      name = nameIn;
      array = arrayIn;
      number = numberIn;
   }
   /**
    * Returns name of a given list.
    *
    * @return String name of list
    */
   public String getName() {
      return name;
   }
   /**
    * Returns array.
    *
    * @return list ArrayList
    */
   public PentagonalPyramid[] getList() {
      return array;
   }
   /**
    * Returns number of pyramids in a given list.
    *
    * @return int number of pyramids
    */
   public int numberOfPentagonalPyramids() {
      return number;
   }
   /**
    * Returns total surface area of the list.
    *
    * @return double total surface area
    */
   public double totalSurfaceArea() {
      double totalSurfaceArea = 0.0;
      for (int i = 0; i < number; i++) {
         PentagonalPyramid temp = array[i];
         totalSurfaceArea += temp.surfaceArea();
      }
      return totalSurfaceArea;
   }
   /**
    * Returns total volume of the list.
    *
    * @return double total volume
    */
   public double totalVolume() {
      double totalVolume = 0.0;
      for (int i = 0; i < number; i++) {
         PentagonalPyramid temp = array[i];
         totalVolume += temp.volume();
      }
      return totalVolume;
   }
   /**
    * Return average surface area of the list.
    *
    * @return double average surface area
    */
   public double averageSurfaceArea() {
      double averageSurfaceArea = 0.0;
      if (number != 0) {
         averageSurfaceArea = totalSurfaceArea() / (double) number;
      }
      return averageSurfaceArea;
   }
   /**
    * Return average volume of the list.
    *
    * @return double average volume
    */
   public double averageVolume() {
      double averageVolume = 0.0;
      if (number != 0) {
         averageVolume = totalVolume() / (double) number;
      }
      return averageVolume;
   }
   /**
    * Creates and returns the string assigned to a created list.
    *
    * @return String created string
    */
   public String toString() {
      String output = name;
      int index = 0;
      if (number > 0) {
         output += "\n";
         while (index < number) {
            output += "\n" + array[index];
            if (index + 1 < number) {
               output += "\n";
            }
            index++;
         }
      }
      return output;
   }
   /**
    * Creates and returns the summary info of a list.
    *
    * @return String summary info
    */
   public String summaryInfo() {
      DecimalFormat df = new DecimalFormat("#,##0.0##");
      String output = "----- Summary for " + getName() + " -----";
      output += "\nNumber of PentagonalPyramid: " + number;
      output += "\nTotal Surface Area: " + df.format(totalSurfaceArea());
      output += "\nTotal Volume: " + df.format(totalVolume());
      output += "\nAverage Surface Area: " + df.format(averageSurfaceArea());
      output += "\nAverage Volume: " + df.format(averageVolume());
      return output;
   }
   /**
    * Reads file and creates a PentagonalPyramidList.
    *
    * @param fileName - used
    * @throws FileNotFoundException - used
    * @return PentagonalPyramidList created list
    */
   public PentagonalPyramidList2 readFile(String fileName) 
      throws FileNotFoundException {
      
      Scanner fileScan = new Scanner(new File(fileName));
      String newName = "";
      PentagonalPyramid[] newArray = new PentagonalPyramid[100];
      int newNumber = 0;
      
      newName = fileScan.nextLine();
      
      while (fileScan.hasNext()) {
         String pyramidName = "";
         while (fileScan.hasNextLine() && !fileScan.hasNextDouble()) {
            pyramidName += fileScan.nextLine();
         }
         pyramidName = pyramidName.trim();
         double pyramidBase = fileScan.nextDouble();
         double pyramidHeight = fileScan.nextDouble();
         
         newArray[newNumber++] = new PentagonalPyramid(pyramidName, 
            pyramidBase, pyramidHeight);
      }
      fileScan.close();
      
      PentagonalPyramidList2 newList = new PentagonalPyramidList2(newName, 
         newArray, newNumber);
      return newList;
   }
   /**
    * Adds a new PentagonalPyramid object.
    *
    * @param labelIn - used
    * @param baseIn - used
    * @param heightIn - used
    */
   public void addPentagonalPyramid(String labelIn, double baseIn, 
      double heightIn) {
      array[number++] = new PentagonalPyramid(labelIn, baseIn, heightIn);
   }
   /**
    * Finds PentagonalPyramid from list.
    *
    * @param labelIn - used
    * @return PentagonalPyramid found pyramid
    */
   public PentagonalPyramid findPentagonalPyramid(String labelIn) {
      for (int i = 0; i < number; i++) {
         if (array[i].getLabel().equalsIgnoreCase(labelIn)) {
            return array[i];
         }
      }
      return null;
   }
   /**
    * Deletes PentagonalPyramid from list.
    *
    * @param labelIn - used
    * @return PentagonalPyramid deleted pyramid
    */
   public PentagonalPyramid deletePentagonalPyramid(String labelIn) {
      PentagonalPyramid result = findPentagonalPyramid(labelIn);
      for (int i = 0; i < number; i++) {
         if (array[i].getLabel().equalsIgnoreCase(labelIn)) {
            for (int j = i; j < number; j++) {
               array[j] = array[j + 1];
            }
            array[number--] = null;
         }
      }
      return result;
   }
   /**
    * Edits PentagonalPyramid from list.
    *
    * @param labelIn - used
    * @param baseIn - used
    * @param heightIn - used
    * @return boolean if edit was completed
    */
   public boolean editPentagonalPyramid(String labelIn, double baseIn, 
      double heightIn) {
      boolean result = false;
      for (int i = 0; i < number; i++) {
         if (array[i].getLabel().equalsIgnoreCase(labelIn)) {
            array[i].setBaseEdge(baseIn);
            array[i].setHeight(heightIn);
            result = true;
         }
      }
      return result;
   }
}