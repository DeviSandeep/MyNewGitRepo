package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class AssertionsAssignment {
	WebDriver driver;

	@Test(enabled=false)
	public void verifyTheTextOfSendButton() {
		WebElement resetitHyperlink=driver.findElement(By.xpath("//a[text()='reset it']"));
		resetitHyperlink.click();
		WebElement sendButton=driver.findElement(By.xpath("//button[text()='Send']"));
		String actualResult=sendButton.getText();
		String expectedResult="SEND";
		Assert.assertEquals(actualResult, expectedResult,"Incorrect Send Button Text");
		
	}
	@Test(enabled=false)
	public void verifyTheFontTypeOfSendButtonText() {
		WebElement resetitHyperlink=driver.findElement(By.xpath("//a[text()='reset it']"));
		resetitHyperlink.click();
		WebElement sendButton=driver.findElement(By.xpath("//button[text()='Send']"));
		String actualResult=sendButton.getCssValue("font-family");
		String expectedResult="Sansarif";
		Assert.assertEquals(actualResult, expectedResult,"Incorrect Font Type");
		
	}
	
	@Test(enabled=false)
	public void verifyTheTooltipValueOfEditIcon() {
		  WebElement userName = driver.findElement(By.id("loginform-username"));
			userName.sendKeys("carol");
			WebElement pswrd = driver.findElement(By.id("loginform-password"));
			pswrd.sendKeys("1q2w3e4r");
			WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));
			login.click();
			WebElement client=driver.findElement(By.xpath("//a[text()='Clients']"));
			client.click();
			WebElement firstRowToolTip=driver.findElement(By.xpath("//a[@href='/payrollapp/client/update?id=1']"));
			String actualResult=firstRowToolTip.getDomAttribute("title");
			String expectedResult="Update";
			Assert.assertEquals(actualResult, expectedResult,"Incorrect Tool Tip Value");
	}
	@Test(retryAnalyzer =testNG.RetryAnalyzer.class)
	public void verifyTheSelectedValueOfTitleDropDown() {
		  WebElement userName = driver.findElement(By.id("loginform-username"));
			userName.sendKeys("carol");
			WebElement pswrd = driver.findElement(By.id("loginform-password"));
			pswrd.sendKeys("1q2w3e4r");
			WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));
			login.click();
			WebElement workers=driver.findElement(By.xpath("//ul//li[4]//a[@href='/payrollapp/worker/index']"));
			workers.click();
			WebElement subWorker=driver.findElement(By.xpath("//a[text()='Create Worker']"));
			subWorker.click();
			WebElement titleDropdown=driver.findElement(By.xpath("//select[@id='worker-title']"));
			Select titledd=new Select(titleDropdown);
			titledd.selectByValue("Ms");
			WebElement firstSelectedOption=titledd.getFirstSelectedOption();
			String actualResult=firstSelectedOption.getText();
			String expectedResult="Mr";
			Assert.assertEquals(actualResult, expectedResult,"Incorrect Dropdown Value Selected");
	}
	@Test(enabled=false)
	public void verifyCheckBoxIsSelected() {
		    WebElement userName = driver.findElement(By.id("loginform-username"));
			userName.sendKeys("carol");
			WebElement pswrd = driver.findElement(By.id("loginform-password"));
			pswrd.sendKeys("1q2w3e4r");
			WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));
			login.click();
			WebElement client=driver.findElement(By.xpath("//a[text()='Clients']"));
			client.click();
			WebElement createClient=driver.findElement(By.xpath("//a[text()='Create Client']"));
			createClient.click();
			JavascriptExecutor js = (JavascriptExecutor) driver;
		    js.executeScript("window.scrollBy(2500,1000)", "");
			WebElement poCheckBox=driver.findElement(By.id("client-require_po"));
		    poCheckBox.click();
			boolean actualResult=poCheckBox.isSelected();
			boolean expectedResult=true;
			Assert.assertEquals(actualResult, expectedResult, "PO check box not selected");
	}
  
	@BeforeMethod
	@Parameters("Browser")
	public void beforeMethod(String browser) {
		if(browser.equals("chrome")) {
		driver = new ChromeDriver();
		}
		else if(browser.equals("edge")) {
			driver = new EdgeDriver();
		}
		driver.get("https://www.qabible.in/payrollapp/site/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
	}

	@AfterMethod
	public void afterMethod() {
		driver.close();
	}

}
