import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.io.FileNotFoundException;

/**
 * Tests PentagonalPyramidList2 methods.
 *
 * Project 08 B
 * @author Will Humphlett - COMP1210 - LLB001
 * @version 3/25/2019
 */
public class PentagonalPyramidList2Test {
   private String listName = "test";
   private PentagonalPyramid[] listArray = new PentagonalPyramid[100];
   private int listNumber = 0;
   private PentagonalPyramidList2 test = new PentagonalPyramidList2(listName, 
         listArray, listNumber);
      

   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }

   /**
    * Tests getName.
    *
    * @throws FileNotFoundException - used
    */
   @Test public void getNameTest() throws FileNotFoundException {
      test = test.readFile("PentagonalPyramid_data_1.txt");
      Assert.assertEquals("list name not equal", 
         "PentagonalPyramid Test List", test.getName());
   }
   
   /**
    * Tests getList.
    *
    * @throws FileNotFoundException - used
    */
   @Test public void getListTest() throws FileNotFoundException {
      test = test.readFile("PentagonalPyramid_data_1.txt");
      PentagonalPyramid[] testArray = new PentagonalPyramid[100];
      testArray[0] = new PentagonalPyramid("Ex1", 1.0, 2.0);
      testArray[1] = new PentagonalPyramid("Ex 2", 12.3, 25.5);
      testArray[2] = new PentagonalPyramid("Ex 3", 123.4, 900.0);
      Assert.assertArrayEquals("array not equal", testArray, test.getList());
   }
   
   /**
    * Tests numberOfPentagonalPyramid.
    *
    * @throws FileNotFoundException - used
    */
   @Test public void numberOfPentagonalPyramidTest() 
      throws FileNotFoundException {
      test = test.readFile("PentagonalPyramid_data_1.txt");
      Assert.assertEquals("number not equal", 3, 
         test.numberOfPentagonalPyramids());
   }
   
   /**
    * Tests totalSurfaceArea.
    *
    * @throws FileNotFoundException - used
    */
   @Test public void totalSurfaceAreaTest() throws FileNotFoundException {
      test = test.readFile("PentagonalPyramid_data_1.txt");
      Assert.assertEquals("total surface area not equal", 306175.467, 
         test.totalSurfaceArea(), .001);
   }
   
   /**
    * Tests totalVolume.
    *
    * @throws FileNotFoundException - used
    */
   @Test public void totalVolumeTest() throws FileNotFoundException {
      test = test.readFile("PentagonalPyramid_data_1.txt");
      Assert.assertEquals("total volume not equal", 7861815.475, 
         test.totalVolume(), .001);
   }
   
   /**
    * Tests averageSurfaceArea.
    *
    * @throws FileNotFoundException - used
    */
   @Test public void averageSurfaceArea1Test() throws FileNotFoundException {
      test = test.readFile("PentagonalPyramid_data_1.txt");
      Assert.assertEquals("average surface area not equal", 102058.489, 
         test.averageSurfaceArea(), .001);
   }
   
   /**
    * Tests the divide by zero exception in averageSurfaceArea.
    *
    * @throws FileNotFoundException - used
    */
   @Test public void averageSurfaceArea0Test() throws FileNotFoundException {
      test = test.readFile("PentagonalPyramid_data_0.txt");
      Assert.assertEquals("average surface area not zero", 0, 
         test.averageSurfaceArea(), 0);
   }
   
   /**
    * Tests averageVolume.
    *
    * @throws FileNotFoundException - used
    */
   @Test public void averageVolume1Test() throws FileNotFoundException {
      test = test.readFile("PentagonalPyramid_data_1.txt");
      Assert.assertEquals("average volume not equal", 2620605.158, 
         test.averageVolume(), .001);
   }
   
   /**
    * Tests divide by zero exception in averageVolume.
    *
    * @throws FileNotFoundException - used
    */
   @Test public void averageVolume0Test() throws FileNotFoundException {
      test = test.readFile("PentagonalPyramid_data_0.txt");
      Assert.assertEquals("average VOlume not zero", 0, 
         test.averageVolume(), 0);
   }
   
   /**
    * Tests toString.
    *
    * @throws FileNotFoundException - used
    */
   @Test public void toString1Test() throws FileNotFoundException {
      test = test.readFile("PentagonalPyramid_data_1.txt");
      String name = "PentagonalPyramid Test List";
      name += "\n";
      name += "\nPentagonalPyramid \"Ex1\" with base edge = 1.0";
      name += " and height = 2.0 units has:";
      name += "\n\tsurface area = 7.008203 square units";
      name += "\n\tvolume = 1.1469849 cubic units";
      name += "\n";
      name += "\nPentagonalPyramid \"Ex 2\" with base edge = 12.3";
      name += " and height = 25.5 units has:";
      name += "\n\tsurface area = 1,086.4892066 square units";
      name += "\n\tvolume = 2,212.4737204 cubic units";
      name += "\n";
      name += "\nPentagonalPyramid \"Ex 3\" with base edge = 123.4";
      name += " and height = 900.0 units has:";
      name += "\n\tsurface area = 305,081.9691528 square units";
      name += "\n\tvolume = 7,859,601.8538338 cubic units";
      Assert.assertEquals("string does not match", name, test.toString());
   }
   
   /**
    * Tests empty list of toString.
    *
    * @throws FileNotFoundException - used
    */
   @Test public void toString0Test() throws FileNotFoundException {
      test = test.readFile("PentagonalPyramid_data_0.txt");
      String name = "PentagonalPyramid Empty Test List";
      Assert.assertEquals("string does not match", name, test.toString());
   }
   
   /**
    * Tests summaryInfo.
    *
    * @throws FileNotFoundException - used
    */
   @Test public void summaryInfoTest() throws FileNotFoundException {
      test = test.readFile("PentagonalPyramid_data_1.txt");
      String summary = "----- Summary for PentagonalPyramid Test List -----";
      summary += "\nNumber of PentagonalPyramid: 3";
      summary += "\nTotal Surface Area: 306,175.467";
      summary += "\nTotal Volume: 7,861,815.475";
      summary += "\nAverage Surface Area: 102,058.489";
      summary += "\nAverage Volume: 2,620,605.158";
      Assert.assertEquals("summary does not match", summary, 
         test.summaryInfo());
   }
   
   /**
    * Tests addPentagonalPyramid.
    *
    * @throws FileNotFoundException - used
    */
   @Test public void addPentagonalPyramidTest() throws FileNotFoundException {
      test = test.readFile("PentagonalPyramid_data_1.txt");
      test.addPentagonalPyramid("test", 1.0, 1.0);
      PentagonalPyramid[] testList = test.getList();
      PentagonalPyramid addTest = new PentagonalPyramid("test", 1.0, 1.0);
      Assert.assertEquals("object not equal", addTest, testList[3]);
   }
   
   /**
    * Tests findPentagonalPyramid.
    *
    * @throws FileNotFoundException - used
    */
   @Test public void findPentagonalPyramidTest() throws FileNotFoundException {
      test = test.readFile("PentagonalPyramid_data_1.txt");
      PentagonalPyramid findTest = new PentagonalPyramid("Ex1", 1.0, 2.0);
      Assert.assertEquals("object not equal", findTest, 
         test.findPentagonalPyramid("Ex1"));
   }
   
   /**
    * Tests deletePentagonalPyramid.
    *
    * @throws FileNotFoundException - used
    */
   @Test public void deletePentagonalPyramid1Test() 
      throws FileNotFoundException {
      test = test.readFile("PentagonalPyramid_data_1.txt");
      test.deletePentagonalPyramid("Ex 3");
      PentagonalPyramid[] testList = test.getList();
      Assert.assertNull("object exists", test.findPentagonalPyramid("Ex 3"));
      Assert.assertNull("object exists", testList[2]);
   }
   
   /**
    * Tests failed deletePentagonalPyramid.
    *
    * @throws FileNotFoundException - used
    */
   @Test public void deletePentagonalPyramid0Test() 
      throws FileNotFoundException {
      test = test.readFile("PentagonalPyramid_data_1.txt");
      Assert.assertNull("object exists", test.deletePentagonalPyramid("test"));
   }
   
   /**
    * Tests editPentagonalPyramid.
    *
    * @throws FileNotFoundException - used
    */
   @Test public void editPentagonalPyramid1Test() throws FileNotFoundException {
      test = test.readFile("PentagonalPyramid_data_1.txt");
      Boolean edit = test.editPentagonalPyramid("Ex 3", 1.0, 1.0);
      PentagonalPyramid editTest = new PentagonalPyramid("Ex 3", 1.0, 1.0);
      PentagonalPyramid[] testList = test.getList();
      Assert.assertTrue("object not edited", edit);
      Assert.assertEquals("object not edited correctly", editTest, testList[2]);
   }
   
   /**
    * Tests failed editPentagonalPyramid.
    *
    * @throws FileNotFoundException - used
    */
   @Test public void editPentagonalPyramid0Test() throws FileNotFoundException {
      test = test.readFile("PentagonalPyramid_data_1.txt");
      Boolean edit = test.editPentagonalPyramid("Ex 4", 1.0, 1.0);
      Assert.assertFalse("object edited", edit);
   }
   
   /**
    * Tests findPentagonalPyramidWithShortestBaseEdge.
    *
    * @throws FileNotFoundException - used
    */
   @Test public void findPentagonalPyramidWithShortestBaseEdgeTest() 
      throws FileNotFoundException {
      test = test.readFile("PentagonalPyramid_data_1.txt");
      PentagonalPyramid shortestEdge = new PentagonalPyramid("Ex1", 1.0, 2.0);
      Assert.assertEquals("did not find shortest edge", shortestEdge, 
         test.findPentagonalPyramidWithShortestBaseEdge());
   }
   
   /**
    * Tests conditions of find shortest base edge.
    */
   @Test public void findPentagonalPyramidWithShortestBaseEdge2Test() {
      PentagonalPyramid test1 = new PentagonalPyramid("test1", 5.0, 5.0);
      PentagonalPyramid test2 = new PentagonalPyramid("test2", 1.0, 5.0);
      PentagonalPyramid test3 = new PentagonalPyramid("test3", 9.0, 5.0);
      PentagonalPyramid[] array = {test1, test2, test3};
      test = new PentagonalPyramidList2("test", array, 3);
      Assert.assertEquals("did not find shortest edge", test2, 
         test.findPentagonalPyramidWithShortestBaseEdge());
   }
   
   /**
    * Tests findPentagonalPyramidWithLongestBaseEdge.
    *
    * @throws FileNotFoundException - used
    */
   @Test public void findPentagonalPyramidWithLongestBaseEdgeTest() 
      throws FileNotFoundException {
      test = test.readFile("PentagonalPyramid_data_1.txt");
      PentagonalPyramid longestEdge = 
         new PentagonalPyramid("Ex 3", 123.4, 900.0);
      Assert.assertEquals("did not find longest edge", longestEdge, 
         test.findPentagonalPyramidWithLongestBaseEdge());
   }
   
   /**
    * Tests conditions of find longest base edge.
    */
   @Test public void findPentagonalPyramidWithLongestBaseEdge2Test() {
      PentagonalPyramid test1 = new PentagonalPyramid("test1", 5.0, 5.0);
      PentagonalPyramid test2 = new PentagonalPyramid("test2", 1.0, 5.0);
      PentagonalPyramid test3 = new PentagonalPyramid("test3", 9.0, 5.0);
      PentagonalPyramid[] array = {test1, test2, test3};
      test = new PentagonalPyramidList2("test", array, 3);
      Assert.assertEquals("did not find longest edge", test3, 
         test.findPentagonalPyramidWithLongestBaseEdge());
   }
   
   /**
    * Tests findPentagonalPyramidWithSmallestVolume.
    *
    * @throws FileNotFoundException - used
    */
   @Test public void findPentagonalPyramidWithSmallestVolumeTest() 
      throws FileNotFoundException {
      test = test.readFile("PentagonalPyramid_data_1.txt");
      PentagonalPyramid smallestVolume = new PentagonalPyramid("Ex1", 1.0, 2.0);
      Assert.assertEquals("did not find smallest volume", smallestVolume, 
         test.findPentagonalPyramidWithSmallestVolume());
   }
   
   /**
    * Tests conditions of find smallest volume.
    */
   @Test public void findPentagonalPyramidWithSmallestVolume2Test() {
      PentagonalPyramid test1 = new PentagonalPyramid("test1", 5.0, 5.0);
      PentagonalPyramid test2 = new PentagonalPyramid("test2", 1.0, 5.0);
      PentagonalPyramid test3 = new PentagonalPyramid("test3", 9.0, 5.0);
      PentagonalPyramid[] array = {test1, test2, test3};
      test = new PentagonalPyramidList2("test", array, 3);
      Assert.assertEquals("did not find smallest volume", test2, 
         test.findPentagonalPyramidWithSmallestVolume());
   }
   
   /**
    * Tests findPentagonalPyramidWithLargestVolume.
    *
    * @throws FileNotFoundException - used
    */
   @Test public void findPentagonalPyramidWithLargestVolumeTest() 
      throws FileNotFoundException {
      test = test.readFile("PentagonalPyramid_data_1.txt");
      PentagonalPyramid largestVolume = 
         new PentagonalPyramid("Ex 3", 123.4, 900.0);
      Assert.assertEquals("did not find largest volume", largestVolume, 
         test.findPentagonalPyramidWithLargestVolume());
   }
   
   /**
    * Tests conditions of find largest volume.
    */
   @Test public void findPentagonalPyramidWithLargestVolume2Test() {
      PentagonalPyramid test1 = new PentagonalPyramid("test1", 5.0, 5.0);
      PentagonalPyramid test2 = new PentagonalPyramid("test2", 1.0, 5.0);
      PentagonalPyramid test3 = new PentagonalPyramid("test3", 9.0, 5.0);
      PentagonalPyramid[] array = {test1, test2, test3};
      test = new PentagonalPyramidList2("test", array, 3);
      Assert.assertEquals("did not find shortest edge", test3, 
         test.findPentagonalPyramidWithLargestVolume());
   }
}