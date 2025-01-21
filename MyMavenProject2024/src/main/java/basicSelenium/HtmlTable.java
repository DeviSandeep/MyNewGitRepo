package basicSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HtmlTable {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://selenium.qabible.in/table-pagination.php");
		driver.manage().window().maximize();
		//find elements - It will find all elements based on the locator value to a list
		List<WebElement> firstRow=driver.findElements(By.xpath("//table[@id='dtBasicExample']//tbody//tr[1]//td"));
		for(int i=0;i<firstRow.size();i++) {
			String firstRowValues=firstRow.get(i).getText();
			System.out.println(firstRowValues);
			}
		
		

	}

}
