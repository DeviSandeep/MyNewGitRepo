package basicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleFormDemo {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://selenium.qabible.in/simple-form-demo.php");
		driver.manage().window().maximize();
		WebElement enterMessage=driver.findElement(By.xpath("//input[@id='single-input-field']"));
		enterMessage.sendKeys("Testing Selenium");
		WebElement showMessageButton=driver.findElement(By.cssSelector("button#button-one"));
		showMessageButton.click();
		WebElement valueATextbox=driver.findElement(By.xpath("//input[@id='value-a']"));
		valueATextbox.sendKeys("30");
		WebElement valueBTextbox=driver.findElement(By.xpath("//input[@id='value-b']"));
		valueBTextbox.sendKeys("40");
		WebElement getTotalButton=driver.findElement(By.cssSelector("button#button-two"));
		getTotalButton.click();
		String s=showMessageButton.getText();
		System.out.println(s);
		String y=getTotalButton.getText();
		System.out.println(y);
		
		String backgroundColor=showMessageButton.getCssValue("background-color");
		System.out.println(backgroundColor);
		String borderColor=getTotalButton.getCssValue("border-color");
		System.out.println(borderColor);
		
		String tagNameShowButton=showMessageButton.getTagName();
		System.out.println(tagNameShowButton);
		String tagNameTotalButton=getTotalButton.getTagName();
		System.out.println(tagNameTotalButton);
		
		String attributeValueShowButton=showMessageButton.getAttribute("class");
		System.out.println(attributeValueShowButton);
		String attributeValueTotalButton=getTotalButton.getAttribute("id");
		System.out.println(attributeValueTotalButton);
		
		
		

	}

}
