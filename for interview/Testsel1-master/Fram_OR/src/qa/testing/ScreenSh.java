package qa.testing;
import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class ScreenSh { 
	WebDriver driver;
@Test
public void TestJavaS1() throws Exception{
	System.setProperty("webdriver.chrome.driver", "C:\\Te\\chrom\\chromedriver.exe");
 // Open Firefox
 driver=new ChromeDriver();
// Maximize the window
driver.manage().window().maximize();
//call method
ScreenSh.captureScreenShot(driver);
// Pass the url
driver.get("http://www.facebook.com");
                  ScreenSh.captureScreenShot(driver); 
  } 
public static void captureScreenShot(WebDriver ldriver){
// Take screenshot and store as a file format             
 File src=((TakesScreenshot)ldriver).getScreenshotAs(OutputType.FILE);           
try {
// now copy the  screenshot to desired location using copyFile method
 
FileUtils.copyFile(src, new File("C:/selenium/"+System.currentTimeMillis()+".png"));                              } catch (IOException e) 
{
  System.out.println(e.getMessage()); 
 }
}

}
