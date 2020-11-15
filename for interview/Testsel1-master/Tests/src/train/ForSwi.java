package train;

import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ForSwi {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Te\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement pol = driver.findElement(By.id("privacy-link"));
		pol.click();
		String main = driver.getWindowHandle();
		driver.getCurrentUrl();
		System.out.println(driver.getCurrentUrl());
		Set<String> all = driver.getWindowHandles();
		driver.getCurrentUrl();
		String ll = driver.getCurrentUrl();
		System.out.println(ll);
		for (String loops : all) {
			if (driver.switchTo().window(loops).getTitle().equals("Data Policy")) {
				driver.getTitle();
				WebElement FP = driver
						.findElement(By.xpath("//*[@id='content']/div/div/div[3]/div[2]/div[1]/div/a[1]"));
				FP.click();
				WebElement logi = driver
						.findElement(By.xpath("//*[@id='helpCenterRootID']/div[2]/div[1]/div/div[3]/div/div/a[1]"));
				logi.click();
				WebElement email = driver.findElement(By.id("email"));
				email.sendKeys("744647746");
				System.out.println(email);
				WebElement pas = driver.findElement(By.id("pass"));
				pas.sendKeys("aabbccdd");
				System.out.println(pas);
				WebElement loginb = driver.findElement(By.id("loginbutton"));
				loginb.click();
			} else {
				System.out.println("ooo" + main);
			}
			driver.switchTo().window(main);
			WebElement policy = driver.findElement(By.id("cookie-use-link"));
			policy.click();
			System.out.println("this is the policy page" + policy);
		}
	}
}
