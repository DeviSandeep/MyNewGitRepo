package basicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardAndMouseEvents {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/buttons");
		driver.manage().window().maximize();
		//Actions - Class used to handle keyboard and mouse, need to create an object for action class. Along with action class we should always call the method perform
		//To automate double click button
		Actions keyboard=new Actions(driver);
		WebElement doubleClick=driver.findElement(By.id("doubleClickBtn"));
		keyboard.doubleClick(doubleClick).perform();
		//To automate right click button
		WebElement rightClickbutton=driver.findElement(By.id("rightClickBtn"));
		keyboard.contextClick(rightClickbutton).perform();
		//Mouse hover
		keyboard.moveToElement(doubleClick).perform();
		//To automate keyboard actions
		keyboard.sendKeys(Keys.ARROW_DOWN).perform();
		
	}

}
