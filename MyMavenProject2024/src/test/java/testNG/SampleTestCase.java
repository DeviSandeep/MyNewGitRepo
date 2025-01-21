package testNG;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
//Test Objective: Verify Login Feature Is Working with valid credentials
public class SampleTestCase {
	WebDriver driver;//We need driver for all methods so declare globally
  @Test(enabled=false)//to diable testcase
  public void verifyLoginFeatureIsWorkingWithValidCredentials() 
  {
	  WebElement userName = driver.findElement(By.id("loginform-username"));
		userName.sendKeys("carol");
		WebElement pswrd = driver.findElement(By.id("loginform-password"));
		pswrd.sendKeys("1q2w3e4r");
		WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));
		login.click();
		WebElement welcomtext=driver.findElement(By.xpath("//p[text()='Welcome to Payroll Application']"));
		String actualResult=welcomtext.getText();
		String expectedResult="Welcome to Payrol Application";
		//assertion
		Assert.assertEquals(actualResult, expectedResult, "Login feature is not working...");
  }
  @Test
  public void verifyTheTextOfTheSearchButtonInClientPage() {
	  WebElement userName = driver.findElement(By.id("loginform-username"));
		userName.sendKeys("carol");
		WebElement pswrd = driver.findElement(By.id("loginform-password"));
		pswrd.sendKeys("1q2w3e4r");
		WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));
		login.click();
		WebElement client=driver.findElement(By.xpath("//a[text()='Clients']"));
		client.click();
		WebElement search=driver.findElement(By.xpath("//button[text()='Search']"));
		String actualResult=search.getText();
		String expectedResult="Searh";
		//Assert.assertEquals(actualResult, expectedResult,"Incorrect Text");
		//System.out.println("**********************");
		//Soft Assertion
		SoftAssert softAssert=new SoftAssert();
		softAssert.assertEquals(actualResult, actualResult,"Expected result not as expected");
		System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!");
		softAssert.assertAll();
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
  @DataProvider (name = "data-provider")
	public Object[][] dpMethod(){
		return new Object[][] {{2, 3 , 5}, {5, 7, 9},{10,11,12}};
	}

}
