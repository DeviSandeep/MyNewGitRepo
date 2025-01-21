package testNG;

import org.testng.annotations.Test;

import elementRepository.LoginPageResetIt;

import org.testng.annotations.BeforeMethod;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class ResetITTestCase {
	WebDriver driver;
	
  @Test
  public void toVerifyTheTextOfSendButton() {
	  LoginPageResetIt ri=new LoginPageResetIt(driver);
	  ri.clickResetIt();
	  String actualResult=ri.getSendButtonText();
	  String expectedResult="SEND";
	  Assert.assertEquals(actualResult, expectedResult, "Incorrect text for Send Button");
	  
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
