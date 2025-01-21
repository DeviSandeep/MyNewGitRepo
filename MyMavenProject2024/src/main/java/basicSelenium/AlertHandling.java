package basicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandling {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://selenium.qabible.in/javascript-alert.php");
		driver.manage().window().maximize();
		//Handling alert
		WebElement clickMeButton=driver.findElement(By.xpath("//button[@class='btn btn-success']"));
		clickMeButton.click();
		//Switch to function is used to handle alert under webdriver. We cannot find webelement for alerts.
		driver.switchTo().alert().accept();// To accept ok button
		WebElement clickMeYellowButton=driver.findElement(By.xpath("//button[@class='btn btn-warning']"));
		clickMeYellowButton.click();
		driver.switchTo().alert().dismiss();//To click on cancel on the popup
		WebElement clickOnPromptBox=driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
		clickOnPromptBox.click();
		String textName=driver.switchTo().alert().getText();//to get the text on the alert
		System.out.println(textName);
		driver.switchTo().alert().sendKeys("Devi Sandeep Nair");//To enter value in alert text box, it wont work as there is selenium error.

	}

}
