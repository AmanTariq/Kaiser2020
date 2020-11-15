package qa.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class HoverMous {
	WebDriver driver;
	
	@Test
	public void hover() throws Exception {
	System.setProperty("webdriver.chrome.driver", "C:\\Te\\chrom\\chromedriver.exe");
	driver = new ChromeDriver();
    //Launching sample website
    driver.get("https://www.overstock.com/?&cid=52085&kid=43700042939818891&track=psggl&utm_source=google&utm_"
    		+ "medium=ostkcpc&utm_campaign=52085&pos=&targetid=kwd-12621351&gclsrc=aw.ds&ds_rl=1263858&ds_rl=1263864&ds_"
    		+ "rl=1263858&gclid=CjwKCAjw57b3BRBlEiwA1ImytoSqphV-zDQtnfsaP2YngDtVRjFnSn-ylWYuvvHfSC67YFW_jhKr6hoCKNwQAvD_BwE");
    driver.manage().window().maximize();
     
    //Mouseover on submit button
    Actions action = new Actions(driver);
    WebElement btn = driver.findElement(By.xpath("//*[@id='TopNav']/div[1]/div[7]/a"));
    action.moveToElement(btn).perform();     
    //Thread.sleep just for user to notice the event
    Thread.sleep(3000);
    
     
    //Closing the driver instance
    driver.quit();
}   
}

