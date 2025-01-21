package testNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderSample {
	//Define data provider
/*	@DataProvider (name = "data-provider")
	public Object[][] dpMethod(){
		return new Object[][] {{2, 3 , 5}, {5, 7, 9},{10,11,12}};
	}*/
	
  @Test(dataProvider ="data-provider",dataProviderClass =SampleTestCase.class  )// to connect to testcase
  public void testCase1(int a,int b,int c) {
	  int sum=a+b+c;
	  System.out.println(sum);
  }
}
