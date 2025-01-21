package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseClass;
import constant.Constant;
import elementRepository.ClientPage;
import elementRepository.LoginPage;

public class ClientTestCase extends BaseClass{
  @Test(retryAnalyzer = retryAnalyzer.RetryAnalyzer.class)
  public void verifyToolTipValueInClientPage() {
	  LoginPage lp=new LoginPage(driver);
	  lp.inputUsername("carol");
	  lp.inputPassword("1q2w3e4r");
	  
	  
	  ClientPage cp=lp.clickLoginButton();
	  cp.clickClientTab();
	  String actualResult=cp.toolTipValue();
	  String expectedResult="date";
	  Assert.assertEquals(actualResult, expectedResult,Constant.errMessageForClientTestCase);
  }
  @Test
  public void verifyCheckBoxIsSelected() {
	  LoginPage lp=new LoginPage(driver);
	  lp.inputUsername("carol");
	  lp.inputPassword("1q2w3e4r");
	  lp.clickLoginButton();
	  
	  ClientPage cp=new ClientPage(driver);
	  cp.clickClientTab();
	  cp.clickCreateClientTab();
	  boolean actualResult=cp.selectValueInCheckboxIsSelected();
	  boolean expectedResult=true;
	   Assert.assertEquals(actualResult, expectedResult, "PO check box not selected");
}
  @Test(groups="Critical")
  public void verifyTheValueOfInvoiceOrderDropDown() {
	  LoginPage lp=new LoginPage(driver);
	  lp.inputUsername("carol");
	  lp.inputPassword("1q2w3e4r");
	  lp.clickLoginButton();
	  
	  ClientPage cp=new ClientPage(driver);
	  cp.clickClientTab();
	  cp.clickCreateClientTab();
	 String actualResult=cp.getInvoiceOrderDropDownValue();
	 String expectedResult="Invoice per week";
	  Assert.assertEquals(actualResult, expectedResult, "Incorrect drop down value");
  }
}
