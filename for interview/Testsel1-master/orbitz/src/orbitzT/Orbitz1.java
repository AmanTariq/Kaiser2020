package orbitzT;

import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Orbitz1 {
	WebDriver driver;

	@Test
	public void altert() {
		System.setProperty("webdriver.chrome.driver", "C:\\Te\\chrom\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.orbitz.com");}
		/*WebElement alertbar = driver.findElement(By.id("rewardsPricingNames"));
		System.out.println(alertbar.isDisplayed());
		if (alertbar.isDisplayed()) {
			Reporter.log("this method is successfully executed for my web");
		} else {
			System.out.println("not sure");
		}
	}*/
	@Test
	public void logo() throws Exception {WebElement logo= driver.findElement(By.xpath("//*[@id='header-logo']/img"));
	logo.isDisplayed();
	File srcFile= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(srcFile, new File("C:\\selenium\\ss\\screenshots.png"));
	
	String aimagesrc=logo.getAttribute("src");
	System.out.println(aimagesrc);
	String eimagesrc="//www.orbitz.com/_dms/header/logo.svg?locale=en_US&siteid=70201";
	eimagesrc.isEmpty();
	if (aimagesrc.contentEquals(aimagesrc)) {System.out.println("The TC2 is passed");	
	}
	else {
		System.out.println("Fail");
	}}}
