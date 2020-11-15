package train;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Resiz {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Te\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/resizable/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.switchTo().frame(0);
		WebElement a=driver.findElement(By.cssSelector("div.ui-resizable-handle"));
		Actions action=new Actions(driver);
		action.clickAndHold(a).moveByOffset(80, 50).perform();
	}

}
