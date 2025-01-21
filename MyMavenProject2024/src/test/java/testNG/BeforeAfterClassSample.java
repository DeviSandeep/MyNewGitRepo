package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class BeforeAfterClassSample {
  @Test
  public void testCase1() {
	  System.out.println("Test Case 1 executed");
  }
  @Test
  public void testCase2() {
	  System.out.println("Test Case 2 executed");
  }
  @Test
  public void testCase3() {
	  System.out.println("Test Case 3 executed");
  }
  @Test
  public void testCase4() {
	  System.out.println("Test Case 4 executed");
  }
  @BeforeClass
  public void beforeClass() {
	  System.out.println("Before Class");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("After Class");
  }

}
