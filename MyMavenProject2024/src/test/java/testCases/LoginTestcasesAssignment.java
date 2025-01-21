package testCases;

import org.testng.annotations.Test;

import elementRepository.ClientPageAssignment;
import elementRepository.LoginPageAssignment;

import org.testng.annotations.BeforeMethod;

import java.sql.Driver;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class LoginTestcasesAssignment 
{
	WebDriver driver;
  @Test
  public void verifyLoginIsWorking() {
	  LoginPageAssignment lpa=new LoginPageAssignment(driver);
	  lpa.inputUsername();
	  lpa.inputPassword();
	  lpa.clickLoginButton();
	  ClientPageAssignment cpa=new ClientPageAssignment(driver);
	  cpa.clickClientTab();
	  String actualResult=cpa.toolTipValue();
	  String expectedResult="Update";
	  Assert.assertEquals(actualResult, expectedResult,"Incorrect Tool Tip Value");
	  
  }
  @BeforeMethod
  public void beforeMethod() {
	  driver=new ChromeDriver();
	    driver.get("https://www.qabible.in/payrollapp/site/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
}

  @AfterMethod
  public void afterMethod() {
	  driver.close();
  }

}
