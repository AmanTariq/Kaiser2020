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
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import qa.common.Xlreader;
import qa.pages.CRMmeth;
public class CRMloginScreen {
	WebDriver driver;
  /*@Test
 /* @Parameters({"email","pass"})
  public void f(String a, String b) {
		System.setProperty("webdriver.chrome.driver", "C:\\Te\\chrom\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://ui.freecrm.com/");
		CRMlogin.email(driver).sendKeys(a);
		CRMlogin.pass(driver).sendKeys(b);
		CRMlogin.clik(driver).click();// NOT WORKING THE @Parameters
		CRMlogin.fp(driver).click();
		CRMlogin.CRMpro(driver).getText();
		CRMlogin.signup(driver).click();
  @DataProviderj
  (name="Data-Provider")
  public Object[][] dp(){
	  return new Object[][] {
		  {"email","pass"},
		  {"email1","pass1"},
		  {"email2","pass2"}};
	  }*/	
  @DataProvider(name ="dp")
  public String[][] dp() throws IOException{
      Xlreader reader = new Xlreader();
      String filePath = System.getProperty("user.dir")+"\\src\\testdata1";
      return reader.readExcel(filePath,"a.xlsx","s");
  }  
  @BeforeMethod
  public void basedriver() {
	//  @Parameters("Browser")
	//  public void basedriver(String browser) {
//		  if (browser.equals("Chrome")) {
//			  System.setProperty("webdriver.chrome.driver", "C:\\Te\\chrom\\chromedriver.exe");
//				WebDriver driver= new ChromeDriver();}
//		  else {
			  
	//	  }
//	  }
	  System.setProperty("webdriver.chrome.driver", "C:\\Te\\chrom\\chromedriver.exe");
//		WebDriver driver= new ChromeDriver();
	  driver.get("https://ui.freecrm.com/");
  }
  @AfterMethod
  public void closebrowser() {
	  driver.quit();
  }
	  @Test(dataProvider="dp")
	  public void f(String x, String y) {
		  
	  System.setProperty("webdriver.chrome.driver", "C:\\Te\\chrom\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://ui.freecrm.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		CRMmeth.email(driver).sendKeys(x);
		CRMmeth.pass(driver).sendKeys(y);
		CRMmeth.clik(driver).click();
		CRMmeth.close(driver);}
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
		} System.out.println("this is the body of the method may be");
  }
			}