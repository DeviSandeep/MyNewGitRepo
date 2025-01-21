package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class SampleAnnotation {
  @Test
  public void testCase1() {
	  System.out.println("Testcase 1 executed");
  }
  @Test
  public void testCase2() {
	  System.out.println("Testcase 2 executed");
  }
  @Test
  public void testCase3() {
	  System.out.println("Testcase 3 executed");
  }
  @Test
  public void testCase4() {
	  System.out.println("Testcase 4 executed");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Before method executed");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("After method executed");
  }

}
