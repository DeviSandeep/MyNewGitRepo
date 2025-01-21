package basicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxAndRadioButton {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://selenium.qabible.in/check-box-demo.php");
		driver.manage().window().maximize();
		WebElement singleCheckBox=driver.findElement(By.id("gridCheck"));
		singleCheckBox.click();
		boolean b=singleCheckBox.isSelected();//To verify if checkbox is selected. This method will be used only for checkbox and radio button
		System.out.println(b);
		boolean c=singleCheckBox.isDisplayed();//To verify the presence of an element
		System.out.println(c);
		boolean d=singleCheckBox.isEnabled();//To verify if an element is enabled or not
		System.out.println(d);
		

	}

}
