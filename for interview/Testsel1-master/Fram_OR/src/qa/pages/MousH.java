package qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MousH {
	static WebDriver driver;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Te\\chrom\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		Actions action=new Actions(driver);
		WebElement acc=driver.findElement(By.id("nav-link-accountList"));
		action.moveToElement(acc).build().perform();
		driver.findElement(By.className("nav-text")).click();
		
		
	    //Launching sample website

	}

}
