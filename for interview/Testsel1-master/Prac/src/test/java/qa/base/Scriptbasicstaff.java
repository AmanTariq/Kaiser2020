package qa.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class Scriptbasicstaff {
@Test
public void assertstest() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Te\\chrom\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		Thread.sleep(4000);
	String etitle="Facebook - Log In or Sign Up";
	String eurl="https://www.facebook.com/";
	String actitle=driver.getTitle();
	String acurl=driver.getCurrentUrl();
	Assert.assertEquals(etitle, actitle);
	Assert.assertEquals(eurl, acurl);
	
	}

}
