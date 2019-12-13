import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Tests PentagonalPyramid methods.
 *
 * Project 08 A
 * @author Will Humphlett - COMP1210 - LLB001
 * @version 3/20/2019
 */
public class PentagonalPyramidTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }

   /**
    * Tests setLabel and getLabel.
    */
   @Test public void labelTest() {
      PentagonalPyramid test = new PentagonalPyramid("test", 1.0, 1.0);
      test.setLabel("ex");
      Assert.assertEquals("Label is not equal", "ex", test.getLabel());
      Assert.assertFalse("Allowed invalid value", test.setLabel(null));
   }
   
   /**
    * Tests setBaseEdge and getBaseEdge.
    */
   @Test public void baseEdgeTest() {
      PentagonalPyramid test = new PentagonalPyramid("test", 1.0, 1.0);
      test.setBaseEdge(2.0);
      Assert.assertEquals("Base edge is not equal", 2.0, test.getBaseEdge(),
         .000001);
      Assert.assertFalse("Allowed invalid value", test.setBaseEdge(0.0));
   }
   
   /**
    * Tests setHeight and getHeight.
    */
   @Test public void heightTest() {
      PentagonalPyramid test = new PentagonalPyramid("test", 1.0, 1.0);
      test.setHeight(2.0);
      Assert.assertEquals("Height is not equal", 2.0, test.getHeight(),
         .000001);
      Assert.assertFalse("Allowed invalid value", test.setHeight(0.0));
   }
   
   /**
    * Tests surfaceArea.
    */
   @Test public void surfaceAreaTest() {
      PentagonalPyramid test = new PentagonalPyramid("test", 1.0, 1.0);
      Assert.assertEquals("Surface area is incorrect", 4.755282,
         test.surfaceArea(), .000001);
   }
   
   /**
    * Tests volume.
    */
   @Test public void volumeTest() {
      PentagonalPyramid test = new PentagonalPyramid("test", 1.0, 1.0);
      Assert.assertEquals("Volume is incorrect", 0.573492, test.volume(),
         .000001);
   }
   
   /**
    * Tests getCount and resetCount.
    */
   @Test public void countTest() {
      PentagonalPyramid.resetCount();
      Assert.assertEquals("Count is not zero", 0, PentagonalPyramid.getCount());
      PentagonalPyramid test0 = new PentagonalPyramid("test0", 1.0, 1.0);
      PentagonalPyramid test1 = new PentagonalPyramid("test1", 1.0, 1.0);
      PentagonalPyramid test2 = new PentagonalPyramid("test2", 1.0, 1.0);
      Assert.assertEquals("Count does not reflect number of created pyramids",
         3, PentagonalPyramid.getCount());
   }
   
   /**
    * Tests the true outcome of equals.
    */
   @Test public void equalsTrueTest() {
      PentagonalPyramid test = new PentagonalPyramid("test", 1.0, 1.0);
      PentagonalPyramid objIn = new PentagonalPyramid("test", 1.0, 1.0);
      Assert.assertTrue("Object is not equal", test.equals(objIn));
   }
   
   /**
    * Tests the instanceof of equals.
    */
   @Test public void equalsObjFalseTest() {
      PentagonalPyramid test = new PentagonalPyramid("test", 1.0, 1.0);
      String objIn = "test";
      Assert.assertFalse("equals() does not differentiate objects",
         test.equals(objIn));
   }
   
   /**
    * Tests the parameter comparison of equals.
    */
   @Test public void equalsPyramidFalseTest() {
      PentagonalPyramid test = new PentagonalPyramid("test", 1.0, 1.0);
      PentagonalPyramid labelIn = new PentagonalPyramid("test1", 1.0, 1.0);
      Assert.assertFalse("label failure", test.equals(labelIn));
      PentagonalPyramid baseIn = new PentagonalPyramid("test", 1.1, 1.0);
      Assert.assertFalse("base edge failure", test.equals(baseIn));
      PentagonalPyramid heightIn = new PentagonalPyramid("test", 1.0, 1.1);
      Assert.assertFalse("height failure", test.equals(heightIn));
   }
   
   /**
    * Tests hashCode.
    */
   @Test public void hashCodeTest() {
      PentagonalPyramid test = new PentagonalPyramid("test", 1.0, 1.0);
      Assert.assertEquals("hashCode", 0, test.hashCode());
   }
   
   /**
    * Tests the toString of PentagonalPyramid.
    */
   @Test public void toStringTest() {
      PentagonalPyramid test = new PentagonalPyramid("test", 1.0, 1.0);
      String outputTest = "PentagonalPyramid \"test\" ";
      outputTest += "with base edge = 1.0 ";
      outputTest += "and height = 1.0 units has:";
      outputTest += "\n\tsurface area = 4.7552826 square units";
      outputTest += "\n\tvolume = 0.5734925 cubic units";
      Assert.assertEquals("Output string not equal", outputTest,
         test.toString());
   }
}
