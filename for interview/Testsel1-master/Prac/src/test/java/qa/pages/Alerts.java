package qa.pages;

import org.openqa.selenium.Alert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Te\\chrom\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.dezlearn.com/javascript-alerts/");
		driver.manage().window().maximize();
driver.findElement(By.id("s_alert1")).click();
Thread.sleep(3000);
Alert a=driver.switchTo().alert();
System.out.println(a.getText());
a.accept();
driver.findElement(By.id("c_alert2")).click();
Thread.sleep(3000);
Alert b=driver.switchTo().alert();
System.out.println(b.getText());
b.dismiss();
driver.findElement(By.id("p_alert3")).click();
Thread.sleep(2000);
Alert c=driver.switchTo().alert();
c.sendKeys("Afghanistan");
Thread.sleep(1000);
System.out.println(c.getText());
c.accept();
	}

}
