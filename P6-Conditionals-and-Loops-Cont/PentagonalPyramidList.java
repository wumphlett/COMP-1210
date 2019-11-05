import java.util.ArrayList;
import java.text.DecimalFormat;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
/**
 * Stores the name and list of PentagonalPyramid objects.
 *
 * Project 5
 * @author Will Humphlett - COMP1210 - LLB001
 * @version 2/18/2019
 */
public class PentagonalPyramidList {
// Fields
   private String listName = "";
   private ArrayList<PentagonalPyramid> list 
      = new ArrayList<PentagonalPyramid>();
/**
 * Constructor for PentagonalPyramidList.
 *
 * @param listNameIn - used
 * @param listIn - used
 */
   public PentagonalPyramidList(String listNameIn, 
      ArrayList<PentagonalPyramid> listIn) {
      listName = listNameIn;
      list = listIn;
   }
   /**
    * Returns name of a given list.
    *
    * @return String name of list
    */
   public String getName() {
      return listName;
   }
   /**
    * Returns number of pyramids in a given list.
    *
    * @return int number of pyramids
    */
   public int numberOfPentagonalPyramids() {
      int listNumber = list.size();
      return listNumber;
   }
   /**
    * Returns total surface area of the list.
    *
    * @return double total surface area
    */
   public double totalSurfaceArea() {
      int index = 0;
      double listTotalSurfaceArea = 0;
      while (index < list.size()) {
         listTotalSurfaceArea += list.get(index).surfaceArea();
         index++;
      }
      return listTotalSurfaceArea;
   }
   /**
    * Returns total volume of the list.
    *
    * @return double total volume
    */
   public double totalVolume() {
      int index = 0;
      double listTotalVolume = 0;
      while (index < list.size()) {
         listTotalVolume += list.get(index).volume();
         index++;
      }
      return listTotalVolume;
   }
   /**
    * Return average surface area of the list.
    *
    * @return double average surface area
    */
   public double averageSurfaceArea() {
      double listAvgSurfaceArea = 0.0;
      if (list.size() != 0) {
         listAvgSurfaceArea = totalSurfaceArea() / list.size();
      }
      return listAvgSurfaceArea;
   }
   /**
    * Return average volume of the list.
    *
    * @return double average volume
    */
   public double averageVolume() {
      double listAvgVolume = 0.0;
      if (list.size() != 0) {
         listAvgVolume = totalVolume() / list.size();
      }
      return listAvgVolume;
   }
   /**
    * Creates and returns the string assigned to a created list.
    *
    * @return String created string
    */
   public String toString() {
      String output = "";
      int index = 0;
      output = getName();
      if (list.size() > 0) {
         output += "\n";
         while (index < list.size()) {
            output += "\n";
            output += (list.get(index));
            if (index + 1 < list.size()) {
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
      String output = "";
      output += "----- Summary for " + getName() + " -----";
      output += "\nNumber of PentagonalPyramid: " + list.size();
      output += "\nTotal Surface Area: " + df.format(totalSurfaceArea());
      output += "\nTotal Volume: " + df.format(totalVolume());
      output += "\nAverage Surface Area: " + df.format(averageSurfaceArea());
      output += "\nAverage Volume: " + df.format(averageVolume());
      return output;
   }
   /**
    * Returns array list.
    *
    * @return list ArrayList
    */
   public ArrayList<PentagonalPyramid> getList() {
      return list;
   }
   /**
    * Reads file and creates a PentagonalPyramidList.
    *
    * @param fileName - used
    * @throws FileNotFoundException - used
    * @return PentagonalPyramidList created list
    */
   public PentagonalPyramidList readFile(String fileName) 
      throws FileNotFoundException {
      Scanner fileScan = new Scanner(new File(fileName));
      String newListName;
      ArrayList<PentagonalPyramid> newList = new ArrayList<PentagonalPyramid>();
      newListName = fileScan.nextLine();
      while (fileScan.hasNext()) {
         String name = "";
         while (fileScan.hasNextLine() && !fileScan.hasNextDouble()) {
            name += fileScan.nextLine();
         }
         name = name.trim();
         double base = fileScan.nextDouble();
         double height = fileScan.nextDouble();
         PentagonalPyramid pp = new PentagonalPyramid(name, base, height);
         newList.add(pp);
      }
      fileScan.close();
      PentagonalPyramidList newPPList 
         = new PentagonalPyramidList(newListName, newList);
      return newPPList;
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
      PentagonalPyramid pp = new PentagonalPyramid(labelIn, baseIn, heightIn);
      list.add(pp);
   }
   /**
    * Finds PentagonalPyramid from list.
    *
    * @param labelIn - used
    * @return PentagonalPyramid found pyramid
    */
   public PentagonalPyramid findPentagonalPyramid(String labelIn) {
      for (PentagonalPyramid pp : getList()) {
         if (pp.getLabel().equalsIgnoreCase(labelIn)) {
            return pp;
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
      if (findPentagonalPyramid(labelIn) != null) {
         PentagonalPyramid deleted = findPentagonalPyramid(labelIn);
         list.remove(findPentagonalPyramid(labelIn));
         return deleted;
      }
      else {
         return null;
      }
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
      if (findPentagonalPyramid(labelIn) != null) {
         findPentagonalPyramid(labelIn).setBaseEdge(baseIn);
         findPentagonalPyramid(labelIn).setHeight(heightIn);
         return true;
      }
      return false;
   }
}