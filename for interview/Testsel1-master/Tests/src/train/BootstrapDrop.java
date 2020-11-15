package train;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootstrapDrop {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Te\\chrom\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement but=driver.findElement(By.className("multiselect-selected-text"));
		but.click();
		List<WebElement> subb=driver.findElements(By.xpath("//ul[contains(@class,'multiselect-container')]//li//a//label"));
		System.out.println(subb.size());
		/*for (int i=0; i<subb.size(); i++) {
			System.out.println(subb.get(i).getText());
			if (subb.get(i).getText().equals("Angular")) {
				subb.get(i).click();
				break;*/
		for (int i=0; i<subb.size(); i++) {
			System.out.println(subb.get(i).getText());
				subb.get(i).click();
			}
		}
	

}//ul[contains(@class,'multiselect-container')]//li//a//label












