package train;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pclasszisetext {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "C:\\Te\\chromedriver_win32//chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://weather.com/weather/tenday/l/e55d3d7a89d43b8338e104cfab058fc9df6390a0698200f694a76a8fd3f2e5f6");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
int total_links=driver.findElements(By.tagName("a")).size();
System.out.println("the total of links is "+total_links);
List<WebElement> mm=driver.findElements(By.tagName("div"));
for(WebElement oo:mm) {String texte=oo.getText(); System.out.println(texte);
	
}
	}

}
