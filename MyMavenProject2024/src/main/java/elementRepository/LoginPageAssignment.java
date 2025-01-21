package elementRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageAssignment {
	WebDriver driver;
	
	public LoginPageAssignment(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
//	By userName=By.id("loginform-username");
//	By password=By.id("loginform-password");
//    By loginButton=By.xpath("//button[text()='Login']");
	@FindBy(id="loginform-username")
	WebElement userName; //element declaration with page factory
	@FindBy(id="loginform-password")
	WebElement password;
	@FindBy(xpath="//button[text()='Login']")
	WebElement loginButton;
	
public void inputUsername() {
	//driver.findElement(userName).sendKeys("carol");
	userName.sendKeys("carol");
	}

public void inputPassword() {
	//driver.findElement(password).sendKeys("1q2w3e4r");
	password.sendKeys("1q2w3e4r");
}

public void clickLoginButton() {
	//driver.findElement(loginButton).click();
	loginButton.click();
}

}
