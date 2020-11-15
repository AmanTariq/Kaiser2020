package train;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropD {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Te\\chrom\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		String m=driver.findElement(By.id("month")).getAttribute("value");
		String d=driver.findElement(By.id("day")).getAttribute("value");
		String y=driver.findElement(By.id("year")).getAttribute("value");
		System.out.println(m);
		System.out.println(d);
		System.out.println(y);
		
		List<WebElement> allm=driver.findElements(By.cssSelector("select#month>option"));
		List<WebElement> alld=driver.findElements(By.cssSelector("select#day>option"));
		List<WebElement> ally=driver.findElements(By.cssSelector("select#year>option"));
		
	for (WebElement month:allm) { 
		if(month.getText().trim().equals("Sep")) {
			month.click();
			break;		
		}}
	
	for (WebElement day:alld) { 
		if(day.getText().trim().equals("28")) {
			day.click();
			break;
		}}
		for (WebElement year:ally) { 
			if(year.getText().trim().equals("2020")) {
				year.click();
				break;
			}
		}
		String ma=driver.findElement(By.id("month")).getAttribute("value");
		String da=driver.findElement(By.id("day")).getAttribute("value");
		String ye=driver.findElement(By.id("year")).getAttribute("value");
		System.out.println(ma);
		System.out.println(da);
		System.out.println(ye);
		}}
	


