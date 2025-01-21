package testNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterSample {
  @Test
  @Parameters({"Para1","Para2"})//To connect xml file and test case. The value in the xml file 100 will be replaced in this line
  public void testCase1(int a, String b) {
	  System.out.println(a);
	  System.out.println(b);
	  
	  
  }
}
