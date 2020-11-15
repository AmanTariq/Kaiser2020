package train;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Size {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Te\\chrom\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://intellipaat.com/blog/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		int total_links = driver.findElements(By.tagName("a")).size();
		System.out.println("Total links : " + total_links);
		int total_clases = driver.findElements(By.tagName("div")).size();
		System.out.println("Total Number of Classes by div : " + total_clases);
		int total_clasessp = driver.findElements(By.tagName("span")).size();
		System.out.println("Total Number of Classes by span : " + total_clasessp);
		int total_labels = driver.findElements(By.tagName("label")).size();
		System.out.println("Total labels are : " + total_labels);
		List<WebElement> total_inputs = driver.findElements(By.tagName("input"));
		System.out.println("TOTAL NUMBER IS " +total_inputs.size());
		System.out.println("Total number of inputs is : " + total_inputs);
		int total_buttons = driver.findElements(By.tagName("button")).size();
		System.out.println("Total buttons are : " + total_buttons);
		int total_scripts = driver.findElements(By.tagName("script")).size();
		System.out.println("Total Number of scripts is : " + total_scripts);
		int total_styles = driver.findElements(By.tagName("Style")).size();
		System.out.println("Total Number of styles is : " + total_styles);
		List<WebElement> like = driver.findElements(By.tagName("div"));
		for (WebElement webe : like) {//    <kjhk>
			String swebe = webe.getText().toUpperCase();
			System.out.println(swebe);
			

		}

	}}

