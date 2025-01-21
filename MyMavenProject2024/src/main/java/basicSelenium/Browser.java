package basicSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browser {

	public static void main(String[] args) {
		WebDriver driver=new EdgeDriver();//Launch Edge browser
		//WebDriver driver=new FirefoxDriver();
        driver.get("https://www.google.com.sg/");

	}

}
