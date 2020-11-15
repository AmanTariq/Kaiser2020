package train;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExistofElement {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Te\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//driver.findElement(By.id("grs"));
try {
	driver.findElement(By.id("gseer"));
	System.out.println("this element is available");
	}
	catch(NoSuchElementException t){System.out.println("this element is not available");

	}}}
