package qa.testing;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import qa.pages.CRMmeth;

public class CRMlogin1 {
  @Test
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
      XlsReader edata = new XlsReader();
      String filePath = System.getProperty("user.dir")+"\\src\\testdata";
      //objExcelFile.readExcel(filePath,"Tbook1.xlsx","Test1");
      return edata.readExcel(filePath,"axl.xlsx","Test1");
  }	  
	  @Test(dataProvider="dp")
	  public void f(String x, String y) {
	  System.setProperty("webdriver.chrome.driver", "C:\\Te\\chrom\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://ui.freecrm.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		CRMmeth.email(driver).sendKeys(x);
		CRMmeth.pass(driver).sendKeys(y);
		//CRMmeth.clik(driver).click();
		CRMmeth.close(driver);
  }
	  }