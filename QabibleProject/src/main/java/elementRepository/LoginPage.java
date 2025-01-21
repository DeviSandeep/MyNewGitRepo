package elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
}
	@FindBy(id="loginform-username")
	WebElement userName;
	@FindBy(id="loginform-password")
	WebElement password;
	@FindBy(xpath="//button[text()='Login']")
	WebElement loginButton;

	public void inputUsername(String name) {
		
		userName.sendKeys(name);
	}
	
	public void inputPassword(String passwo) {
			password.sendKeys(passwo);
	}
	public ClientPage clickLoginButton() {
		
		loginButton.click();
		return new ClientPage(driver);
	}
}
	

