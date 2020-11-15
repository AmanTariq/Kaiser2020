package train;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fore {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Te\\chrom\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/home");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
//		List<WebElement> links=driver.findElements(By.tagName("a"));
//		int si=links.size();
//		System.out.println(si);
//		for (int i=1;i<links.size();i++) { System.out.println(links.get(i).getAttribute("href"));
		WebElement em =driver.findElement(By.xpath("//*[@id='blueBarDOMInspector']/div/div[1]/div/div[1]/h1/a/i"));
		//em.getAttribute("readonly");
		System.out.println(em.getCssValue("font-size"));
		
	}}

