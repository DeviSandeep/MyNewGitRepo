package elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageResetIt {
WebDriver driver;
	
	public LoginPageResetIt(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//a[@href='/payrollapp/site/request-password-reset']")
	WebElement resetIt;
	
	@FindBy(xpath="//button[text()='Send']")
	WebElement send;
	
public void clickResetIt() {
		resetIt.click();
	}

public String getSendButtonText() {
		String s=send.getText();
		return s;
}


}



