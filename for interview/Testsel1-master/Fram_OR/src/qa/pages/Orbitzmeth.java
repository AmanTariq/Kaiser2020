package qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Orbitzmeth {

	public static WebElement element;

	public static WebElement alertBar(WebDriver driver) {
		element = driver.findElement(By.id("rewardsPricingNames"));
		return element;
	}

	public static WebElement alertbarclose(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id='join-rewards-close-btn']/span[1]"));
		return element;
	}

	public static WebElement logo(WebDriver driver) {
		element = driver.findElement(By.id("header-logo"));
		return element;
	}

	public static WebElement join(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id='rewardsHeader']/a/div"));
		return element;
	}

	public static WebElement mpupdat(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id='alert11']/div/div[2]"));
		String tt = element.getText();
		System.out.println(tt);
		element = driver.findElement(By.id("travel-advisory-close-button"));
		return element;
	}

	public static WebElement searchbar(WebDriver driver) {
		element = driver.findElement(By.id("hotel-destination-hp-hotel"));
		return element;
	}

	public static WebElement searchwfly(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id='tab-flight-tab-hp']/span[1]"));
		return element;
	}

	public static WebElement schHtl(WebDriver driver) {
		element = driver.findElement(By.cssSelector("#tab-hotel-tab-hp > span.icon.icon-hotels"));
		return element;
	}

	public static WebElement schvp(WebDriver driver) {
		element = driver.findElement(By.id("tab-package-tab-hp"));
		return element;
	}

	public static WebElement cars(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id='tab-car-tab-hp']/span[1]"));
		return element;
	}

	public static WebElement crois(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id='tab-cruise-tab-hp']/span[1]"));
		return element;
	}

	public static WebElement todo(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id='tab-activity-tab-hp']/span[1]"));
		return element;
	}

	public static WebElement chbox(WebDriver driver) {
		element = driver.findElement(By.id("hotel-add-flight-checkbox-hp-hotel"));
		return element;
	}

	public static WebElement chboxb(WebDriver driver) {
		element = driver.findElement(By.id("hotel-add-car-checkbox-hp-hotel"));
		return element;
	}

	public static WebElement chkin(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id='hotel-checkin-wrapper-hp-hotel']/label/span[2]"));
		return element;
	}

	public static WebElement china(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id='hotel-checkout-wrapper-hp-hotel']/label/span[2]"));
		return element;
	}

	public static WebElement chinb(WebDriver driver) {
		element = driver.findElement(By.id("hotel-rooms-hp-hotel"));
		return element;
	}

	public static WebElement chinc(WebDriver driver) {
		element = driver.findElement(By.id("hotel-1-adults-hp-hotel"));
		return element;
	}

	public static WebElement chind(WebDriver driver) {
		element = driver.findElement(By.id("hotel-1-children-hp-hotel"));
		return element;
	}

	public static WebElement bluebod(WebDriver driver) {
		element = driver.findElement(By.id("mer-signup-toggle-btn"));
		return element;
	}

	public static WebElement blubod(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id='chatbotCTA-container']/div[2]/div/div[2]/p"));
		return element;
	}

	// public static WebElement chat(WebDriver drvier)
	// {element=driver.findElement(By.id(("chatbotCTA-chatnow-button")));return
	// element;
	// }
	public static WebElement buldtx(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id='hero-sponsorship']/div[2]"));
		return element;
	}

	public static WebElement treetx(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id='editorial-1']/div/div/div[1]/div/div[2]/div/div/p/a"));
		return element;
	}

	public static WebElement treetxa(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id='editorial-1']/div/div/div[2]/div/div[2]/div/div/p/a"));
		return element;
	}

	public static WebElement treetxb(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id='editorial-1']/div/div/div[3]/div/div[2]/div/div/p/a"));
		return element;
	}

	/*
	 * @Test
	 * 
	 * public void sximgs() { WebElement imga=driver.findElement(By.linkText(
	 * "https://forever.travel-assets.com/flex/flexmanager/images/2020/06/09/ORB_BlogDealsTiles_LocalGetaways_lpad_532x299_20200608.jpg"
	 * )); WebElement imgb=driver.findElement(By.xpath(
	 * "//*[@id='editorial-2']/div/div/div[4]/div/div[1]/a/figure/img")); WebElement
	 * imgc=driver.findElement(By.xpath(
	 * "//*[@id='editorial-2']/div/div/div[2]/div/div[1]/a/figure/img")); WebElement
	 * imgd=driver.findElement(By.xpath(
	 * "//*[@id='editorial-2']/div/div/div[5]/div/div[1]/a/figure/img")); WebElement
	 * imge=driver.findElement(By.xpath(
	 * "//*[@id='editorial-2']/div/div/div[3]/div/div[1]/a/figure/img")); WebElement
	 * imgf=driver.findElement(By.xpath(
	 * "//*[@id='editorial-2']/div/div/div[6]/div/div[1]/a/figure/img")); if
	 * (imga.isDisplayed())
	 * {System.out.println("find for all to be executed at once");}
	 */
	public static WebElement bigtx(WebDriver driver) {
		element = driver.findElement(By.xpath("/html/body/div[9]/div"));
		return element;
	}

	public static WebElement sendhp(WebDriver driver) {
		element = driver.findElement(By.id("mad-t2d-form-input"));
		return element;
	}

	public static WebElement sendpha(WebDriver driver) {
		element = driver
				.findElement(By.xpath("//*[@id='mad-banner-wrapper']/div/div[1]/div[1]/section/fieldset/button"));
		return element;
	}
//Reporter.log("This report is almost pass on runing of more then 22 test cases in One class");*/
}