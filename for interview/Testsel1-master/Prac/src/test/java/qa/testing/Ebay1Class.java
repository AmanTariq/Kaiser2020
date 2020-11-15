package qa.testing;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.*;
public class Ebay1Class {
	WebDriver driver;
	@BeforeClass
	public void befCls() {
		System.out.println("STOOOORT OF CLASS");
		System.out.println("METHOD STARTS");
	}
	@AfterClass
	public void aftCls(){
		System.out.println("EEEND OF CLASS");
		System.out.println("METHOD ENDS");
	}
	@BeforeMethod
	public void befSetup() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Te\\chrom\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.ebay.com");
		Thread.sleep(2000);
	}
	@AfterMethod
	public void aftSetup() {
		driver.close();
	}
	
	@Test
	public void f() throws Exception {
		
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
	}
	@Test
	public void Udem11() throws Exception {
	SoftAssert sa=new SoftAssert();
		String eURL = "https://www.ebay.com/n/all-categories";
		String eTitle = "Shop by Category | eBay";
		sa.assertTrue(driver.findElement(By.id("gh-btn")).isEnabled(), "PaSSSSSSED");
		driver.findElement(By.id("gh-btn")).click();
		Thread.sleep(2000);
		String aaa = driver.getCurrentUrl();
		String bbb = driver.getTitle();
		System.out.println(aaa);
		System.out.println(bbb);
		sa.assertEquals(eURL, aaa, "Sure it has executed");
		sa.assertEquals(eTitle, bbb, "Yess it is also done");
		//sa.assertAll();
	}
}