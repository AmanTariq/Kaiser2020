package qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Fmeth {
	public static WebElement element;
	public static WebElement email(WebDriver driver) {
		element.findElement(By.id("email"));
		return element;
	}
	public static WebElement pass(WebDriver driver) {
		element.findElement(By.id("pass"));
		return element;
	}
	public static WebElement log(WebDriver driver) {
		element.findElement(By.id("loginbutton")); 
		return element;
	}
	public static void clos(WebDriver driver) {driver.close();
	}}

