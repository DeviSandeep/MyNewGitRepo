package basicSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicWebElement {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://selenium.qabible.in/table-pagination.php");
		driver.manage().window().maximize();
		//find the web element of first column
		List<WebElement> firstColumn=driver.findElements(By.xpath("//table[@id='dtBasicExample']//tbody//tr//td[1]"));
		String locator=null;
		for(int i=0;i<firstColumn.size();i++) {
			if(firstColumn.get(i).getText().equals("Ashton Cox"))//To compare with the first value of the locator
			{
				//We are getting the value of the 4th column
				locator="//table[@id='dtBasicExample']//tbody//tr["+(i+1)+"]//td[4]";
				break;//Once we receive the locator value break the loop
			}
		}
		WebElement dynamicLocator=driver.findElement(By.xpath(locator));
		String text=dynamicLocator.getText();
		System.out.println(text);
		

	}

}
