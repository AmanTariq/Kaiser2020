package qa.testing;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class Ebay2Class2 {
	WebDriver driver;
	@BeforeMethod
	public void befSetup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Te\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.orbitz.com");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	@AfterMethod
	public void aftSetup() {
		driver.close();
	}
	@Test
	public void URL() {
		String eURL = "https://www.orbitz.com/";
		String eTIT = "Orbitz Flights, Cheap Vacations, Rental Cars & Hotel Deals";
		String aURL = driver.getCurrentUrl();
		String aTIT = driver.getTitle();
		System.out.println(aURL);
		System.out.println(aTIT);
		System.out.println(eTIT);
		System.out.println(aTIT);
		if (eURL.equals(aURL)) {System.out.println("passed bravely ");
		 }
		else System.out.println("Not Sure");}	
	@Test
	public void alerts() {
		
WebElement alert=driver.findElement(By.id("join-rewards-banner")); alert.click();
if (alert.isDisplayed()) {System.out.println("still passed");}
	}
	
	@Test
	public void links() {
		 List<WebElement> lik=driver.findElements(By.tagName("a"));
for (WebElement webe:lik) {String swebe=webe.getText();
		System.out.println("This is my web iframes : " + swebe);}
if (lik.isEmpty()) {System.out.println("NO PROBLEM");}}
	@Test
	public void text() {

	List<WebElement> like = driver.findElements(By.tagName("a"));
	for (WebElement webe : like) {//    <kjhk>
		String swebe = webe.getText().toUpperCase();
		System.out.println(swebe);

	}
	Reporter.log("This Test is complated and passed so!!!!");
}
}