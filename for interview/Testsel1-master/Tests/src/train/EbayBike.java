package train;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EbayBike {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Te\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
driver.get("https://www.ebay.com/");
driver.manage().window().maximize();
//driver.findElement(By.id(("gh-ac"))).sendKeys("montain bike");
//driver.findElement(By.id("gh-btn")).click();
//Thread.sleep(2000);
driver.findElement(By.partialLinkText("Carbon Full Suspension Mountain Bike")).click();
Thread.sleep(2000);
String text=driver.findElement(By.xpath("//*[@id='srp-river-results']/ul/li[35]/div/div[2]/a/h3")).getText();
String price=driver.findElement(By.xpath("//*[@id='srp-river-results']/ul/li[35]/div/div[2]/div[3]/div[1]/span")).getText();
System.out.println(text);
System.out.println(price);

	}

}