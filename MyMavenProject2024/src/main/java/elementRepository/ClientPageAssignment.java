package elementRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ClientPageAssignment {
	WebDriver driver;
	
	public ClientPageAssignment(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
//	By clientTab=By.xpath("//a[@href='/payrollapp/client/index']");
//	By firstRowToolTip=By.xpath("//a[@href='/payrollapp/client/update?id=1']");
	@FindBy(xpath="//a[@href='/payrollapp/client/index']")
	WebElement clientTab;
	@FindBy(xpath="//a[@href='/payrollapp/client/update?id=1']")
	WebElement toolTip;
	public void clickClientTab() {
		//driver.findElement(clientTab).click();
		clientTab.click();
	}
	
	public String toolTipValue() {
		//String ttValue=driver.findElement(firstRowToolTip).getDomAttribute("title");
		String ttValue=toolTip.getDomAttribute("title");
		return ttValue;
	}

}
