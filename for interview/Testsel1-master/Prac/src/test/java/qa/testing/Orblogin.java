package qa.testing;
import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Orblogin {
	WebDriver driver;
	@BeforeTest
	public void BeforM() {
		System.setProperty("webdriver.chrome.driver", "C:\\Te\\chrom\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.orbitz.com/");	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	@AfterTest
	public void closethebrowser() {
		driver.close();}
/*@Test
public void alert() {
WebElement alert=driver.findElement(By.id("rewardsPricingNames"));
String aa=alert.getText();
System.out.println(aa);	
driver.findElement(By.xpath("//*[@id='join-rewards-close-btn']")).click();
if (alert.isDisplayed()) {System.out.println("OK OK OK");
}
else {System.out.println("|||||||||||||");
	}
}

	@Test
	public void logo() {
		WebElement log=driver.findElement(By.xpath("//*[@id='header-logo']/img"));
		if (log.isDisplayed()) {
			System.out.println("it is passed");
		}
		else {
			System.out.println("not");
		}
	}
	@Test
	public void joinR() {WebElement join=driver.findElement(By.xpath("//*[@id='rewardsHeader']/a/div"));
	join.click(); 
	if(join.isDisplayed()) {System.out.println("it is also passed");
	}
	else {
		System.out.println("may not be");}
	}*/
	@Test
	public void logo() throws Exception {
		WebElement logo= driver.findElement(By.xpath("//*[@id='header-logo']/img"));
	
	logo.isDisplayed();
	File srcFile= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(srcFile, new File("C:\\selenium\\ss\\screenshots.png"));
	
	String aimagesrc=logo.getAttribute("src");
	System.out.println(aimagesrc);
	String eimagesrc="//www.orbitz.com/_dms/header/logo.svg?locale=en_US&siteid=70201";
	eimagesrc.isEmpty();
	if (aimagesrc.contentEquals(aimagesrc)) {System.out.println("The TC2 is passed");	
	}
	else {
		System.out.println("Fail");
	}}
/*@Test
public void links() {
int totLinks=driver.findElements(By.tagName("a")).size();// NOT WORKING WHY  **********
	
	List<WebElement> linkes = driver.findElements(By.tagName("a"));
	for (WebElement webe : linkes) {//    <kjhk>
		String all = webe.getText();
		System.out.println(all);
	}}
@Test
public void mpUpdate() {
	WebElement txt=driver.findElement(By.xpath("//*[@id='alert11']/div/div[2]")); //WHY I CAN NOT GET ACTUAL TEXT
String tt=txt.getText(); System.out.println(tt); 
driver.findElement(By.id("travel-advisory-close-button")).click();
	if (txt.isDisplayed()) {System.out.println("it is passed");
	}
	else {
		System.out.println("Covid 19 issue3");
	}
}
@Test
public void searchbar() {
	WebElement search=driver.findElement(By.id("hotel-destination-hp-hotel"));
	search.sendKeys("Shinjuku"); search.submit();
	if (search.isDisplayed()) {System.out.println("it can find any registered area");
	}
	else {
		System.out.println("so sorry for the incoveniounce");
	}}
@Test
public void searchwidgetsair() {
	WebElement air=driver.findElement(By.xpath("//*[@id='tab-flight-tab-hp']/span[1]"));
	air.click(); 
	Boolean tx=air.isEnabled(); System.out.println(tx);
}
@Test
public void searchwidgetsHotl() {
	WebElement hot=driver.findElement(By.cssSelector("#tab-hotel-tab-hp > span.icon.icon-hotels"));}
	@Test
	public void vp() {
		WebElement vocp=driver.findElement(By.id("tab-package-tab-hp")); vocp.isDisplayed(); vocp.click();
		if (vocp.isDisplayed()) {System.out.println("it is working for global services");
	}
		else {
			System.out.println("my be busy");}
		}
	
	@Test
	public void cars() {
		WebElement car=driver.findElement(By.xpath(("//*[@id='tab-car-tab-hp']/span[1]")));
		if (car.isDisplayed()) {
			System.out.println("car is also pass");
		}
		else {
			System.out.println("not sure");
		}
	}
	@Test
	public void crois() {
		WebElement cros=driver.findElement(By.xpath(("//*[@id='tab-cruise-tab-hp']/span[1]")));
		if (cros.isDisplayed()) {
			System.out.println("ptint crose is passed");
		}
		else {
			System.out.println("not sure");
		}
	}
	@Test
	public void todo() {
		WebElement todo=driver.findElement(By.xpath("//*[@id='tab-activity-tab-hp']/span[1]"));
		todo.getText(); todo.click();
		if (todo.isDisplayed()) {System.out.println("this is passed");
	}
		else {
			System.out.println("NOT");}
		}
	@Test
	public void chbox() {
		WebElement chbx=driver.findElement(By.id("hotel-add-flight-checkbox-hp-hotel"));
		WebElement chb=driver.findElement(By.id("hotel-add-car-checkbox-hp-hotel"));
		chbx.click(); chb.click();
		if (chbx.isDisplayed()) {System.out.println("one passed"); if(chb.isDisplayed()) {System.out.println("YES");}
	}
		else {
			System.out.println("NOT NOT NOT");}
		}
	@Test
	public void chkin() {
		WebElement chin=driver.findElement(By.xpath("//*[@id='hotel-checkin-wrapper-hp-hotel']/label/span[2]"));
		WebElement chou=driver.findElement(By.xpath("//*[@id='hotel-checkout-wrapper-hp-hotel']/label/span[2]"));
		WebElement r=driver.findElement(By.id("hotel-rooms-hp-hotel"));
		WebElement ch=driver.findElement(By.id("hotel-1-adults-hp-hotel"));
		WebElement adult=driver.findElement(By.id("hotel-1-children-hp-hotel"));
	chin.click();chou.click();r.click();ch.click();adult.click();
	}
@Test
public void bodyblue(){
	WebElement botex=driver.findElement(By.id("mer-signup-toggle-btn"));
	String ss=botex.getText();
	System.out.println(ss);
	
}
@Test
public void bodyblu(){
	WebElement botexsec=driver.findElement(By.xpath("//*[@id='chatbotCTA-container']/div[2]/div/div[2]/p"));
	String s=botexsec.getText();
	System.out.println(s);
	
}
@Test
public void chat() {
	WebElement cht=driver.findElement(By.id("chatbotCTA-chatnow-button"));
	cht.click(); if (cht.isDisplayed()) {System.out.println("almost passed");}
	else {
		System.out.println("not nto");
	}
}
@Test
public void buldtx() {
	WebElement bld=driver.findElement(By.xpath("//*[@id='hero-sponsorship']/div[2]"));
	bld.click();
	if (bld.isDisplayed()) {System.out.println("it is also passed");}
	else {
		System.out.println("not not ");
	}
}
	@Test
	public void treetxt() {
		WebElement tsx=driver.findElement(By.xpath("//*[@id='editorial-1']/div/div/div[1]/div/div[2]/div/div/p/a"));
		WebElement tssx=driver.findElement(By.xpath("//*[@id='editorial-1']/div/div/div[2]/div/div[2]/div/div/p/a"));
		WebElement ts=driver.findElement(By.xpath("//*[@id='editorial-1']/div/div/div[3]/div/div[2]/div/div/p/a"));
		String atx=tsx.getText(); System.out.println(atx);
		String btx=tssx.getText(); System.out.println(btx);
		String ctx=ts.getText(); System.out.println(ctx);
		if (tsx.isDisplayed()) {System.out.println("totally fine");}
		else {
			System.out.println("my be some problem in the consule haha");
		}
	}
//	@Test
//	public void sximgs() {
//		WebElement imga=driver.findElement(By.linkText("https://forever.travel-assets.com/flex/flexmanager/images/2020/06/09/ORB_BlogDealsTiles_LocalGetaways_lpad_532x299_20200608.jpg"));
//		WebElement imgb=driver.findElement(By.xpath("//*[@id='editorial-2']/div/div/div[4]/div/div[1]/a/figure/img"));
//		WebElement imgc=driver.findElement(By.xpath("//*[@id='editorial-2']/div/div/div[2]/div/div[1]/a/figure/img"));
//		WebElement imgd=driver.findElement(By.xpath("//*[@id='editorial-2']/div/div/div[5]/div/div[1]/a/figure/img"));
//		WebElement imge=driver.findElement(By.xpath("//*[@id='editorial-2']/div/div/div[3]/div/div[1]/a/figure/img"));
//		WebElement imgf=driver.findElement(By.xpath("//*[@id='editorial-2']/div/div/div[6]/div/div[1]/a/figure/img"));
//		if (imga.isDisplayed()) {System.out.println("find for all to be executed at once");}
	
@Test
public void bigtx() {
	WebElement ptx=driver.findElement(By.xpath("/html/body/div[9]/div"));
	String a= ptx.getText(); System.out.println(a);
}*/
@Test
public void sendph() {
	WebElement ph=driver.findElement(By.id("mad-t2d-form-input")); ph.sendKeys("571 276 9024");
	WebElement phsub=driver.findElement(By.xpath("//*[@id='mad-banner-wrapper']/div/div[1]/div[1]/section/fieldset/button"));
	phsub.click();
	Reporter.log("This report is almost pass on runing of more then 22 test cases in One class");
}
}