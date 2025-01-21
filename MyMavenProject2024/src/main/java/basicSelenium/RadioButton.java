package basicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) {
		
	WebDriver driver=new ChromeDriver();
	driver.get("https://selenium.qabible.in/radio-button-demo.php");
	driver.manage().window().maximize();
	WebElement maleRadioButton=driver.findElement(By.id("inlineRadio1"));
	maleRadioButton.click();
	boolean mr=maleRadioButton.isSelected();
	System.out.println(mr);
	WebElement femaleRadioButton=driver.findElement(By.id("inlineRadio2"));
	boolean fr=femaleRadioButton.isSelected();
	System.out.println(fr);
	
	WebElement showSelectedButton=driver.findElement(By.id("button-one"));
	boolean ss=showSelectedButton.isDisplayed();
	System.out.println(ss);
	
	boolean sse=showSelectedButton.isEnabled();
	System.out.println(sse);

}
}
