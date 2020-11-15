package qa.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MousActions {
	WebDriver driver;
  @Test
  public void f() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Te\\chrom\\chromedriver.exe");
		driver = new ChromeDriver();
		Actions action=new Actions(driver);
		driver.get("https://jqueryui.com/droppable/");
		Thread.sleep(2000);
		driver.switchTo().frame(0);
		WebElement drag=driver.findElement(By.id("draggable"));
		WebElement drop=driver.findElement(By.id("droppable"));
		action.dragAndDrop(drag, drop).perform();
		Thread.sleep(3000);
		/*if(action.dragAndDrop(drag, drop) != null) {
			System.out.println("this method is passed");
		}
		else {
			System.out.println("sooorrrryyyy");}*/
		action.doubleClick().perform();
		if (action.doubleClick() != null) {
			System.out.println("wunderfull");
		}
		else {
			System.out.println("NO NO NO");
		}
		Thread.sleep(4000);
		action.contextClick(drop).perform();
		Thread.sleep(4000);
		action.clickAndHold(drag).moveToElement(drag).release(drag).build().perform();
		driver.quit();
		
  }}