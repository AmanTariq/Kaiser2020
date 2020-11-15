package qa.testing;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Readxl {

	public static void main(String[] args) throws Exception {
		  System.setProperty("webdriver.chrome.driver", "C:\\Te\\chrom\\chromedriver.exe");
			WebDriver driver= new ChromeDriver();
			driver.get("https://www.facebook.com/");
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			
			XlsReader1 reader=new XlsReader1();
			reader.readExcel("C:\\Users\\Amanullah Tariq\\eclipse-workspace\\rEPstor\\src\\testdata2\\hhh.xlsx", "hhh", "Sh");
			System.out.println(";alskdfja;sdkf "+reader);

	}

}
