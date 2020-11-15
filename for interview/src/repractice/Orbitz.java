package repractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Orbitz {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\softanddrivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	driver.findElement(By.id("email")).sendKeys("laljan.jan@gmail.com");
	driver.findElement(By.id("pass")).sendKeys("lllbbbcccddd");
	driver.findElement(By.id("u_0_b")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[@id=\"mount_0_0\"]/div/div[1]/div[1]/div[2]/div[3]/div/div[1]/div[1]/ul/li[3]/span/div/a/span/svg")).click();
	

	}

}
