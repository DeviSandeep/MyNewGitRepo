package basicSelenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindowHandling {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/browser-windows");
		driver.manage().window().maximize();
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,1500)");
		WebElement newTabButton=driver.findElement(By.id("tabButton"));
		newTabButton.click();
		String parentWindow=driver.getWindowHandle();
		System.out.println(parentWindow);
		Set<String> allWindows=driver.getWindowHandles();
		System.out.println(allWindows);
		for(String childWindow:allWindows)
		{
			if(!childWindow.equals(parentWindow))//If childwindow not equals to parent window
			{
				driver.switchTo().window(childWindow);//Now the control of driver is in child window
				WebElement childWindowLabel=driver.findElement(By.id("sampleHeading"));
				String text=childWindowLabel.getText();
				System.out.println(text);
			}
			
		}
		//switch back to parent window
		driver.switchTo().window(parentWindow);

	}

}
