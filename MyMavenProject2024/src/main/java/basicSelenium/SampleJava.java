package basicSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleJava {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();//driver is a reference variable of webdriver interface.new ChromeDriver is an object. Chromedriver is the implemented class
        driver.get("https://www.google.com.sg/");
        driver.manage().window().maximize();//To maximize window
        String title=driver.getTitle();// To get the title of current page
        System.out.println(title);
        //To read the current url in address bar
        String url=driver.getCurrentUrl();
        System.out.println(url);
        
        String htmlCode=driver.getPageSource();//To retrieve the html code of the page
        System.out.println(htmlCode);
        driver.navigate().back();//To press the back button of browser
        driver.navigate().forward();//forward button
        driver.navigate().refresh();//To refresh the browser
        //driver.close();//browser window will be closed
       // driver.quit();// to close all the windows open in browser
        driver.manage().deleteAllCookies();//To delete all the cookies in the opened browser
        
	}

}
