package qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Fbmeth {
	public static WebElement element;
	public static WebElement email(WebDriver driver) {
		element=driver.findElement(By.id("email"));
		return element;
	}
	public static WebElement pass(WebDriver driver) {
		element=driver.findElement(By.id("pass"));
		return element;
	}
	public static WebElement login(WebDriver driver) {
		element=driver.findElement(By.xpath("//*[@id='loginbutton']"));
		return element;
	}
public static void close(WebDriver driver) {
	driver.close();
}

}
