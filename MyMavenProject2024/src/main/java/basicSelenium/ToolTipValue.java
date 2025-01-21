package basicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToolTipValue {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		//How to automate tool tip, value of title attribute is used for tool tip
		WebElement toolTip=driver.findElement(By.xpath("//select[@title='Search in']"));
		String toolTipValue=toolTip.getDomAttribute("title");//To fetch the attribute value
		System.out.println(toolTipValue);
		

	}

}
