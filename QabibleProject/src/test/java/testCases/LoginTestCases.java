package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseClass;
import elementRepository.DashboardPage;
import elementRepository.LoginPage;

public class LoginTestCases extends BaseClass {
  @Test
  public void verifyLoginFeatureIsWorkingWithValidUser() {
	  LoginPage lp=new LoginPage(driver);
	  lp.inputUsername("carol");
	  lp.inputPassword("1q2w3e4r");
	  lp.clickLoginButton();
	  
	  DashboardPage dp=new DashboardPage(driver);
	  String actualResult=dp.getTextOfWelcomeText();
	  String expectedResult="Welcome to Payroll Application";
	  Assert.assertEquals(actualResult, expectedResult, "Incorrect Welcome Message");
	  
	 
  }
}
