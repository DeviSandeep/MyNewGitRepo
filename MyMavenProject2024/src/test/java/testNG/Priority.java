package testNG;

import org.testng.annotations.Test;

public class Priority {
  @Test(priority = 1)
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
  @Test(priority = 2)
  public void testCase4() {
	  System.out.println("Test Case 4 executed");
  }
  @Test(priority = 4)
  public void testCase5() {
	  System.out.println("Test Case 5 executed");
  }
}
