package qa.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Ebay {
	@Test
	public void f() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Te\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ebay.com");
		Thread.sleep(2000);
		String eURL = "https://www.ebay.com/n/all-categories";
		String eTitle = "Shop by Category | eBay";
		Assert.assertTrue(driver.findElement(By.id("gh-btn")).isEnabled(), "PaSSSSSSED");
		driver.findElement(By.id("gh-btn")).click();
		Thread.sleep(2000);
		String aaa = driver.getCurrentUrl();
		String bbb = driver.getTitle();
		System.out.println(aaa);
		System.out.println(bbb);
		Assert.assertEquals(eURL, aaa, "Sure it has executed");
		Assert.assertEquals(eTitle, bbb, "Yess it is also done");
		driver.close();
	}

}








