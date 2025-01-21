package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class GroupingBasics {
  @Test(groups ="Medium")
  public void testCase1() {
	  System.out.println("Test Case 1 executed");
  }
  @Test
  public void testCase2() {
	  System.out.println("Test Case 2 executed");
  }
  @Test(groups ="Critical")
    public void testCase3() {
	  System.out.println("Test Case 3 executed");
  }
  @Test
  public void testCase4() {
	  System.out.println("Test Case 4 executed");
  }
  @Test(groups="Critical")
  public void testCase5() {
	  System.out.println("Test Case 5 executed");
  }
  
  @BeforeMethod(alwaysRun =true)
  public void beforeMethod() {
	  System.out.println("Before Method");
  }

  @AfterMethod(alwaysRun =true)
  public void afterMethod() {
	  System.out.println("After Method");
  }

}
