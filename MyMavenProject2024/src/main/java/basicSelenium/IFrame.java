package basicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFrame {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/frames");
		driver.manage().window().maximize();
		//To switch driver to frame
		driver.switchTo().frame("frame1");
		//To print the label of the text
		WebElement freeText=driver.findElement(By.id("sampleHeading"));
		String text=freeText.getText();
		System.out.println(text);
		//To switch back driver back to main website
		driver.switchTo().defaultContent();// instead you can also you below command
		//driver.switchTo().parentFrame();

	}

}
