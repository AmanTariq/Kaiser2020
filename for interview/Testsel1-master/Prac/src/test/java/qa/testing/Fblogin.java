package qa.testing;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import qa.common.Xlreader1;
import qa.pages.Fbmeth;
public class Fblogin {
	WebDriver driver;

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
	@DataProvider(name = "dp")
	public String[][] dp() throws IOException {
		Xlreader1 edata = new Xlreader1();
		String filePath = System.getProperty("user.dir") + "\\src\\testdata2";
		return edata.readExcel(filePath, "b.xlsx", "s");
	}

	@Test(dataProvider = "dp")
	public void f(String x, String y) {
		System.setProperty("webdriver.chrome.driver", "C:\\Te\\chrom\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Fbmeth.email(driver).sendKeys(x);
		Fbmeth.pass(driver).sendKeys(y);
		Fbmeth.close(driver);
	}

}