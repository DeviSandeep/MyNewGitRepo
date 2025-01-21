package testCases;

import org.testng.annotations.Test;

import elementRepository.DashboardPage;
import elementRepository.LoginPage;

import org.testng.annotations.BeforeMethod;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class LoginTestCases {
	WebDriver driver;
  @Test
  public void verifyLoginFeatureIsWorking() {
	  LoginPage lp=new LoginPage(driver);
	  lp.inputUsername("carol");
	  lp.inputPassword();
	  lp.clickLoginButton();
	  DashboardPage dp=new DashboardPage(driver);
	  String actualResult=dp.getTextOfWelcomeLabel();
	  String expectedResult="Welcome to Payroll Application";
	  Assert.assertEquals(actualResult, expectedResult, "Incorrect Welcome Message");
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
