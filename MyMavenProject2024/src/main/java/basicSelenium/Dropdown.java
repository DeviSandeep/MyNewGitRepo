package basicSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://selenium.qabible.in/select-input.php");
		driver.manage().window().maximize();
		//declare webelement for dropdown
		WebElement dropdown=driver.findElement(By.id("single-input-field"));
		//select is a library class and  is used to select values from dropdown and select class have many methods
		Select dd=new Select(dropdown);
		dd.selectByVisibleText("Yellow");//By visible text
		dd.selectByIndex(2); //By index position
		dd.selectByValue("Green"); //By value
		WebElement firstSelectedOption=dd.getFirstSelectedOption();// Will return the web element of the selected value
		String text=firstSelectedOption.getText();
		System.out.println(text);
		
		//MultiSelect
	/*	WebElement multiDropdown=driver.findElement(By.id("multi-select-field"));
		Select md=new Select(multiDropdown);
		md.selectByVisibleText("Red");
		md.selectByVisibleText("Yellow");
		List<WebElement> multiSelect=md.getAllSelectedOptions();
		for(int i=0;i<multiSelect.size();i++) {
		String s=multiSelect.get(i).getText();//get(i)- To iterate to each index
		System.out.println(s);
		}*/
	}

}
