package elementRepository;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.GeneralUtilities;

public class ClientPage {
	WebDriver driver;
	GeneralUtilities utilities = new GeneralUtilities();

	public ClientPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//a[@href='/payrollapp/client/index']")
	WebElement clientTab;
	@FindBy(xpath = "//a[@href='/payrollapp/client/update?id=1']")
	WebElement toolTipValue;
	@FindBy(xpath="//a[text()='Create Client']")
	WebElement createClient;
	@FindBy(id="client-require_po")
	WebElement poCheckBox;
	@FindBy(id="client-invoice_order")
	WebElement invoiceOrderDropDown;

	public void clickClientTab() {
		utilities.clickOnElement(clientTab);
	}

	public String toolTipValue() {
		return utilities.getToolTipValue(toolTipValue);
	}
	
	public void clickCreateClientTab() {
		utilities.clickOnElement(createClient);
	}
	
	public boolean selectValueInCheckboxIsSelected() {
		utilities.scrollThePage(driver,2500,1000);
		utilities.clickOnElement(poCheckBox);
		return utilities.selectCheckBoxValue(poCheckBox);
	}
	public String getInvoiceOrderDropDownValue() {
		utilities.scrollThePage(driver,2000,1000);
		return utilities.getValueOFTheDropdown(invoiceOrderDropDown,"Invoice per week");
	}
}
