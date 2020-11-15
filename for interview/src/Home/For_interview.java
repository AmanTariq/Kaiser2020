package Home;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class For_interview {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\softanddrivers\\chromedriver_win32\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("https://www.facebook.com/");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
driver.findElement(By.xpath("//label[@for='fname']"));
driver.findElement(By.xpath("//input[@name='fname']"));
driver.findElement(By.id("lname"));
driver.findElement(By.id("male"));
driver.findElement(By.id("female"));
driver.findElement(By.id("other"));
driver.findElement(By.xpath("//input[@class='magazine'][text()='Magazine']"));
driver.findElement(By.xpath("//input[type='submit']"));

	}

}
