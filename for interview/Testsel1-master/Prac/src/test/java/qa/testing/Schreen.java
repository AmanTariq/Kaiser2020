package qa.testing;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Schreen {
	WebDriver driver;
  @Test
  public void f() throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Te\\chrom\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.ebay.com/");	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement srch=driver.findElement(By.id("gh-ac")); srch.sendKeys("Mountain bike");
		WebElement clk=driver.findElement(By.id("gh-btn"));
		clk.click();
		
		File sfile= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(sfile, new File("C:\\selenium\\screenshots.png"));
		String aimg=srch.getAttribute("src");
		System.out.println(aimg);
		String a=clk.getText();
		System.out.println(a);
		String eimg="https://www.ebay.com/sch/i.html?_from=R40&_trksid=p2334524.m570.l1313.TR10.TRC1.A0.H0."
	+ "Xmountain+bike+.TRS1&_nkw=mountain+bike+&_sacat=0&LH_TitleDesc=0&_osacat=0&_odkw=mountain+bike+used";
		
		
  if (aimg.contentEquals(eimg)) {
	  System.out.println("the program test is passed");
  }
  else{
	  System.out.println("it is not working ");
  }}
}
