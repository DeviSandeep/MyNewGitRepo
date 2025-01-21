package basicSelenium;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageScroll {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		//Javascriptexecutor interface is used to scroll page
		JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("window.scrollBy(0,2500)", "");//window.scrollBy(0,2500) is java script command
	    //0-> horizontal scroll ,2500-> vertical scroll
	    //for scrolling from bottom to top
	    js.executeScript("window.scrollBy(0,-2500)", ""); 
	     

	}

}
