package qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CRMmeth {
	public static WebElement element;

	public static WebElement email(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id='ui']/div/div/form/div/div[1]/div/input"));
		return element;
	}

	public static WebElement pass(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id='ui']/div/div/form/div/div[2]/div/input"));
		return element;
	}

	public static WebElement clik(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id='ui']/div/div/form/div/div[3]")); 
		return element;
	}

	public static WebElement fp(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id='ui']/div/div/div[1]/a"));
		return element;
	}

	public static WebElement CRMpro(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id='ui']/div/div/div[2]/a"));
		return element;
	}

	public static WebElement signup(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id='ui']/div/div/div[3]/a"));
		return element;

	}

	public static void close(WebDriver driver) {
		// TODO Auto-generated method stub
		
	}
	
}
