package train;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Goodreads {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "C:\\Te\\chrom\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.goodreads.com/");

List<WebElement> books=driver.findElements(By.cssSelector("img[src$='.jpg']"));
System.out.println(books.size());
for (WebElement book:books) {
	System.out.println(book.getAttribute("alt"));
	System.out.println("================");
	
}
driver.close();
	}

}
