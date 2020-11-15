package train;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sizes {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Te\\chrom\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.worldometers.info/coronavirus/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
//		WebElement rr=driver.findElement(By.xpath("//*[@id='navbar-main']/ul/li[2]/a"));
//		rr.click();
		int totlinks=driver.findElements(By.tagName("a")).size();
		System.out.println("total are " +totlinks);
//		
		List<WebElement> links=driver.findElements(By.tagName("a"));
for (WebElement link:links) {
	String tx=link.getText();
//	int q=links.size();
//	System.out.println();
	if (!tx.trim().isEmpty()) {
		System.out.println(link.getText());
		System.out.println(link.getAttribute("div"));
		System.out.println("++++++++++++++");
	}
}
		// WebElement nn=driver.findElement(By.xpath("/html/head/style[5]/text()"));
//		WebElement id = driver.findElement(By.name("email"));
//		id.sendKeys("startariq20@gmail.com");
//		WebElement pas = driver.findElement(By.name("password"));
//		pas.sendKeys("Sarmast@200");
//		WebElement ent = driver.findElement(By.xpath("//*[@id='ui']/div/div/form/div/div[3]"));
//		ent.click();
//
//		ent.getText();
//		System.out.println(ent);

//		int total_iframs = driver.findElements(By.tagName("iframe")).size();
//		System.out.println("Total Number of iframes : " + total_iframs);
//		int total_links = driver.findElements(By.tagName("a")).size();
//		System.out.println("Total Number of links : " + total_links);
//		int total_clases = driver.findElements(By.tagName("div")).size();
//		System.out.println("Total Number of Classes by div : " + total_clases);
//		int total_clasessp = driver.findElements(By.tagName("span")).size();
//		System.out.println("Total Number of Classes by span : " + total_clasessp);
//		int total_labels = driver.findElements(By.tagName("label")).size();
//		System.out.println("Total labels are : " + total_labels);
//		int total_inputs = driver.findElements(By.tagName("input")).size();
//		System.out.println("Total number of inputs is : " + total_inputs);
//		int total_buttons = driver.findElements(By.tagName("button")).size();
//		System.out.println("Total buttons are : " + total_buttons);
//		int total_scripts = driver.findElements(By.tagName("script")).size();
//		System.out.println("Total Number of scripts is : " + total_scripts);
//		int total_styles = driver.findElements(By.tagName("Style")).size();
//		System.out.println("Total Number of styles is : " + total_styles);
//		int total_td=driver.findElements(By.tagName("td")).size();
//		System.out.println("The (td) number is "+total_td);
//		int total_i=driver.findElements(By.tagName("i")).size();
//		System.out.println("The total of (I) is "+total_i);

	}

}
