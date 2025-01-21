package elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.GeneralUtilities;

public class WorkerPage {
	WebDriver driver;
	GeneralUtilities utilities=new GeneralUtilities();
	public WorkerPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}
	
	@FindBy(xpath="//ul//li[4]//a[@href='/payrollapp/worker/index']")
	WebElement workerMenu;
	
	@FindBy(xpath="//a[text()='Create Worker']")
	WebElement createWorkerMenu;
	
	@FindBy(xpath="//select[@id='worker-title']")
	WebElement dropDownValue;
	
	public void clickWorkerMenu() {
		workerMenu.click();
	}
	
	public void clickCreateWorkerMenu() {
		createWorkerMenu.click();
	}
	
	public String getDropDownValue() {
		return utilities.getValueOFTheDropdown(dropDownValue,"MS");
	}
	


}
