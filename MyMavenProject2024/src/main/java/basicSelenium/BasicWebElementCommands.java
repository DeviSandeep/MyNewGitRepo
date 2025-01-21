package basicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicWebElementCommands {

	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.qabible.in/payrollapp/site/login");
	driver.manage().window().maximize();
    WebElement username=driver.findElement(By.id("loginform-username"));
    username.sendKeys("DeviSandeep");//To pass value to a text field
    WebElement password=driver.findElement(By.id("loginform-password"));
    password.sendKeys("password123");
    
	//xpath Syntax
////tagName[@attributeType='attributeValue']
	////tagName[text()='visibleText']
    
	WebElement loginButton=driver.findElement(By.xpath("//button[text()='Login']"));
	//loginButton.click();//To click button
	username.clear();//To clear data in text field
	//To automate style properties(font type, background color etc.)
	String backgroundColor=loginButton.getCssValue("background-color");//background color of login button
	System.out.println(backgroundColor);
	//To read the attribute value
	String attributeValue=loginButton.getAttribute("class");
	System.out.println(attributeValue);
	//To read tagname of an element
	String tagName=loginButton.getTagName();
	System.out.println(tagName);
	
	//cssSelector: Syntax: tagName#idValue
	//tagName.classAttributeValue
	//tagName[attributeType=attributeValue]
	
	String s=loginButton.getText();
	System.out.println(s);//To display the visible text of element in UI
	
	
	
	}
}
