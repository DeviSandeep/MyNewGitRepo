package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseClass;
import elementRepository.LoginPage;
import elementRepository.WorkerPage;

public class WorkerClass extends BaseClass {
  @Test
  public void verifyTheValueOfDropDown() {
	  LoginPage lp=new LoginPage(driver);
	  lp.inputUsername("carol");
	  lp.inputPassword("1q2w3e4r");
	  lp.clickLoginButton();
	  
	  WorkerPage wp=new WorkerPage(driver);
			  wp.clickWorkerMenu();
	  wp.clickCreateWorkerMenu();
	  String actualResult=wp.getDropDownValue();
	  String expectedResult="MR";
	  Assert.assertEquals(actualResult, expectedResult, "Incorrect Value Of Dropdown");	
	  
  }
}
