package train;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Rclick {

	public static void main(String[] args) throws Exception {
System.setProperty("webdriver.chrome.driver", "C:\\Te\\chromedriver_win32\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
Actions action=new Actions(driver);
WebElement right=driver.findElement(By.xpath("//span[text()='right click me']"));
Thread.sleep(2000);
action.contextClick(right).perform();
Thread.sleep(2000);
action.sendKeys(Keys.ARROW_DOWN).perform();
Thread.sleep(2000);
action.sendKeys(Keys.ARROW_DOWN).perform();
Thread.sleep(2000);
action.sendKeys(Keys.ARROW_DOWN).perform();
action.sendKeys(Keys.RETURN).perform();



	}

}
