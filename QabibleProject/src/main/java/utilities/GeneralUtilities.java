package utilities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
import org.testng.annotations.Test;

public class GeneralUtilities {

	public String getElementText(WebElement element) {
		String text = element.getText();
		return text;
	}

	public String getToolTipValue(WebElement element) {
		String ttValue = element.getDomAttribute("title");
		return ttValue;
	}

	public String getValueOFTheDropdown(WebElement element, String value) {
		Select titledd = new Select(element);
		titledd.selectByValue(value);
		WebElement firstSelectedOption = titledd.getFirstSelectedOption();
		String text = firstSelectedOption.getText();
		return text;
	}

	public boolean selectCheckBoxValue(WebElement element) {
		boolean selectedCheckBoxValue = element.isSelected();
		return selectedCheckBoxValue;
	}

	public void scrollThePage(WebDriver driver,int xaxis, int yaxix) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy("+(xaxis)+","+(yaxix)+")", "");//To pass as parameter
	}

	public void clickOnElement(WebElement element) {
		element.click();
	}

	/*public class RetryAnalyzer implements IRetryAnalyzer {
		int counter = 0;
		int retryLimit = 3;

		public boolean retry(ITestResult result) {

			if (counter < retryLimit) {
				counter++;
				return true;
			}
			return false;
		}*/
	}

