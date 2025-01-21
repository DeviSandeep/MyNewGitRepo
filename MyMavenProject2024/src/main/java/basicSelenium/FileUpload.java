package basicSelenium;

import java.awt.AWTException;
import java.awt.Desktop.Action;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FileUpload {

	public static void main(String[] args) throws AWTException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/selenium/upload/");
		driver.manage().window().maximize();
		Robot robot=new Robot();
		//To press and release a key
		//robot.keyPress(KeyEvent.VK_CONTROL);
		//robot.keyRelease(KeyEvent.VK_CONTROL);
		WebElement chooseFileButton=driver.findElement(By.id("uploadfile_0"));
		//chooseFileButton.click();
		//the tag name for choose file button is input so we cannot directly use.click instead we should mouse hover and click
		//for that we have to use class
		Actions clickAction=new Actions(driver);
		clickAction.moveToElement(chooseFileButton).click().perform();
		
		//To copy the path of the file you want to upload to a system clip board
		//copy any keyword to system clip board - Java class StringSelection and getSystemClipboard method.
	     StringSelection ss = new StringSelection("C:\\Users\\sande\\OneDrive\\Desktop\\Class 23 notes.docx");
	     Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
	     //To press control v(paste) and enter
	     robot.keyPress(KeyEvent.VK_CONTROL);
	     robot.delay(1000);
	         robot.keyPress(KeyEvent.VK_V);
	         robot.keyRelease(KeyEvent.VK_V);
	           robot.delay(1000);
	    robot.keyRelease(KeyEvent.VK_CONTROL);
	         robot.keyPress(KeyEvent.VK_ENTER);
	         robot.delay(1000);
	         robot.keyRelease(KeyEvent.VK_ENTER);
	         robot.delay(1000);
	         WebElement submitButton=driver.findElement(By.id("submitbutton"));
	         submitButton.click();

	}

}
