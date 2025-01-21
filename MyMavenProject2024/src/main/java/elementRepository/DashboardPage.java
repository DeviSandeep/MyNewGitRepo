package elementRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashboardPage {
	WebDriver driver;
	
	public DashboardPage(WebDriver driver) {
		this.driver=driver;
		
	}
	By welcomeText=By.xpath("//p[text()='Welcome to Payroll Application']");
	
	public String getTextOfWelcomeLabel() {
		String text=driver.findElement(welcomeText).getText();
		return text;
	}

}
