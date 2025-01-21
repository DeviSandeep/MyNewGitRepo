package basicSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentHtmlTable {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://selenium.qabible.in/table-pagination.php");
		driver.manage().window().maximize();
		/*//1) find the web element of the table footer row and print it
		List<WebElement> tableFooter=driver.findElements(By.xpath("//table[@id='dtBasicExample']//tfoot//tr//th"));
		for(int i=0;i<tableFooter.size();i++) {
		String tableFooterElements=tableFooter.get(i).getText();
		System.out.println(tableFooterElements);
		}
		//2) Find the webelement of the 3rd column of the table and print it
		List<WebElement> thirdColumn=driver.findElements(By.xpath("//table[@id='dtBasicExample']//tbody//tr//td[3]"));
		for(int i=0;i<thirdColumn.size();i++) {
			String thirdColumnElements=thirdColumn.get(i).getText();
			System.out.println(thirdColumnElements);
		}*/
		//3) Find the webelement of the 4th row of the table and print it
		List<WebElement> fourthRow=driver.findElements(By.xpath("//table[@id='dtBasicExample']//tbody//tr[4]//td"));
		for(int i=0;i<fourthRow.size();i++) {
			String fourthRowElements=fourthRow.get(i).getText();
			System.out.println(fourthRowElements);
		}
	}

}
