package qa.testing;

import org.testng.annotations.Test;
import qa.common.Xlreader1;
import qa.pages.Fmeth;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;

public class Xlpractice {
	WebDriver driver;

	@Test
	@DataProvider(name = "dp")
	public String[][] dp() throws IOException {
		Xlreader1 eread = new Xlreader1();
		String filePath = System.getProperty("user.dir") + "\\src\\testdata4";
		return eread.readExcel(filePath, "ddd.xlsx", "w");
	}
	@Test(dataProvider = "dp")
	public void f(String email, String pass) {
		System.setProperty("webdriver.chrome.driver", "C:\\Te\\chrom\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Fmeth.email(driver).sendKeys(email);
		Fmeth.pass(driver).sendKeys(pass);
		Fmeth.clos(driver);
	}
}