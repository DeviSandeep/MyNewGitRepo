package basicSelenium;

import java.time.Duration;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WeightHandling {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		// username and password
        //carol
		//1q2w3e4r
		driver.get("https://www.qabible.in/payrollapp/site/login");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
		WebElement username=driver.findElement(By.id("loginform-username"));
		username.sendKeys("carol");
		WebElement password=driver.findElement(By.id("loginform-password"));
		password.sendKeys("1q2w3e4r");
		WebElement loginButton=driver.findElement(By.xpath("//button[@class='btn btn-default']"));
		loginButton.click();
		//wait - To avoid unwanted failures when we navigate from one page to other
		//3 types of wait ->implicit,explicit and fluent wait
		//implicit wait -> driver will be made to wait when we redirect from one page to other. Need to be added only once at the beginning of the code. Implicit wait is general
		//explicit wait ->driver will be made to wait till the condition is met. Explicit wait is element specific
		//WebDriverWait class is used to handle explicit wait
		//WebDriverWait explicitWait=new WebDriverWait(driver, Duration.ofMillis(10000));
		//explicitWait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//a[@href='/payrollapp/client/index']")));
		//explicitWait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(null));.
		//explicitWait.until(ExpectedConditions.textToBePresentInElement(loginButton, null));
		WebElement client=driver.findElement(By.xpath("//a[@href='/payrollapp/client/index']"));
		client.click();
		//Fluent Wait
		// Waiting 30 seconds for an element to be present on the page, checking
		   // for its presence once every 5 seconds.
		   Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
		       .withTimeout(Duration.ofSeconds(30L))
		       .pollingEvery(Duration.ofSeconds(5L)).ignoring(NoSuchElementException.class);

		   WebElement foo = wait.until(new Function<WebDriver, WebElement>() {
		     public WebElement apply(WebDriver driver) {
		       return driver.findElement(By.id("foo"));
		     }
		   });
		
		

	}

}
