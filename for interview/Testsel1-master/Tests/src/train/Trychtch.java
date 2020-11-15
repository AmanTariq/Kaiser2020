package train;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Trychtch {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Te\\chrom\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");

		try {
			driver.findElement(By.id("0_13"));
		} catch (Exception e) {
			System.out.println("Hh");

		}
		/*
		 * try { WebElement sup=driver.findElement(By.id("0_13"));
		 * System.out.println("it is displayd "); System.out.println(sup.getText());}
		 * catch (Exception e){ System.out.println("it is not found failedddd"); }
		 */
		System.out.println("Hello");
		driver.quit();

	}

}
