package train;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDrop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Te\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		Actions action=new Actions(driver);
		driver.switchTo().frame(0);
		WebElement usa=driver.findElement(By.id("draggable"));
	    WebElement afg=driver.findElement(By.id("droppable"));
		//action.dragAndDrop(usa, afg).perform();
	    action.clickAndHold(usa).moveToElement(afg).release(usa).build().perform();

		
	}
	
	
	
	
	
	

}
