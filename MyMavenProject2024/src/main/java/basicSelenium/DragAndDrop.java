package basicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://selenium.qabible.in/drag-drop.php");
		driver.manage().window().maximize();
		//declare source and target
		WebElement source1=driver.findElement(By.xpath("//span[text()='Draggable n°1']"));
		WebElement target=driver.findElement(By.id("mydropzone"));
		Actions dragAndDrop1=new Actions(driver);
		dragAndDrop1.dragAndDrop(source1, target).perform();

	}

}
