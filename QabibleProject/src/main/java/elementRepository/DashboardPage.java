package elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.GeneralUtilities;

public class DashboardPage {
WebDriver driver;
GeneralUtilities utilities=new GeneralUtilities();
	
	public DashboardPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath="//p[text()='Welcome to Payroll Application']")
	WebElement welcomeText;
	
	public String getTextOfWelcomeText()
	{
		
		return utilities.getElementText(welcomeText);

	}
}
