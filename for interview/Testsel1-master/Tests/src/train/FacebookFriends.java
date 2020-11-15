package train;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookFriends {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Te\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		//int names = driver.findElements(By.tagName("div")).size();
//		
//		{
//			WebElement names1=driver.findElement(By.id("email")); names1.sendKeys("laljan.jan@gmail.com");
//			WebElement pas =driver.findElement(By.id("pass")); pas.sendKeys("lllbbbcccddd");
			//WebElement all=driver.findElement(By.xpath(""))
			// List<WebElement> lik=driver.findElements(By.tagName("iframe"));{
//		for (WebElement webe:lik) {String swebe=webe.getText();
			// System.out.println(swebe);
//			System.out.println("Total Number of iframes : " + names1);
//		}
//		int total_links = driver.findElements(By.tagName("a")).size();
//		System.out.println("Total links : " + total_links);
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
//		List<WebElement> like = driver.findElements(By.tagName("div"));
//		for (WebElement webe : like) {//    <kjhk>
//			String swebe = webe.getText().toUpperCase();
//			System.out.println(swebe);
//
//		}

	}}

