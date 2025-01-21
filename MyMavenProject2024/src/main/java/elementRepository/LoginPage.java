package elementRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	//Declaring web element in element repository
	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;//this.driver is the driver in login page
		PageFactory.initElements(driver, this);//To initalize the elemenets
	}
	//Without page factory
//	By userName=By.id("loginform-username");
//	By password=By.id("loginform-password");
//	By loginButton=By.xpath("//button[text()='Login']");
	
	@FindBy(id="loginform-username")
	WebElement userName; //element declaration with page factory
	@FindBy(id="loginform-password")
	WebElement password;
	@FindBy(xpath="//button[text()='Login']")
	WebElement loginButton;
//Declaring Functions inside element repository
	public void inputUsername(String name) {
		//driver.findElement(userName).sendKeys("carol");//without page factory
		userName.sendKeys(name);//with page factory
	}
	
	public void inputPassword() {
		//driver.findElement(password).sendKeys("1q2w3e4r");//without page factory
		password.sendKeys("1q2w3e4r");//with page factory
	}
	public void clickLoginButton() {
		//driver.findElement(loginButton).click();
		loginButton.click();
	}


}
