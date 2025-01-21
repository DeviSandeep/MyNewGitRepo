package basicSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;


public class WeightHandlingAssignment {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.qabible.in/payrollapp/site/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
		WebElement username=driver.findElement(By.id("loginform-username"));
		username.sendKeys("carol");
		WebElement password=driver.findElement(By.id("loginform-password"));
		password.sendKeys("1q2w3e4r");
		WebElement loginButton=driver.findElement(By.xpath("//button[@class='btn btn-default']"));
		loginButton.click();
		WebDriverWait explicitWait=new WebDriverWait(driver, Duration.ofMillis(10000));
		explicitWait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//a[@href='/payrollapp/worker/index']")));
		WebElement workers=driver.findElement(By.xpath("//a[@href='/payrollapp/worker/index']"));
		workers.click();
		WebElement firstName=driver.findElement(By.id("workersearch-first_name"));
		firstName.sendKeys("Dennis");
		WebElement search=driver.findElement(By.xpath("//button[text()='Search']"));
		search.click();
		WebDriverWait explicitWait1=new WebDriverWait(driver, Duration.ofMillis(10000));
		WebElement delete=driver.findElement(By.xpath("//tbody//tr[1]//td[8]//span[@class='glyphicon glyphicon-trash']"));
		delete.click();
		WebDriverWait explicitWait2=new WebDriverWait(driver, Duration.ofMillis(10000));
		driver.switchTo().alert().accept();
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
			       .withTimeout(Duration.ofSeconds(30L))
			       .pollingEvery(Duration.ofSeconds(5L)).ignoring(NoSuchElementException.class);
		String classAttributeValue=delete.getAttribute("class");
		System.out.println(classAttributeValue);
		

	}

}
