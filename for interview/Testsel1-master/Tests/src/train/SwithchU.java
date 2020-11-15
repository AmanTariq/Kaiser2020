package train;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwithchU {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "C:\\Te\\chromedriver_win32\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://facebook.com");
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

driver.findElement(By.id("privacy-link")).click();
String parentw=driver.getWindowHandle();
Set<String> allw=driver.getWindowHandles();
Thread.sleep(2000);
for(String sw:allw) {
	if(!sw.equals(parentw)) {
		driver.switchTo().window(sw);
	}
}
driver.findElement(By.xpath("//*[@id='content']/div/div/div[3]/div[2]/div[1]/div/a[1]")).click();
driver.switchTo().window(parentw);
	}
public static void switchcase() {
////Declaring a variable for switch expression  
//int number=20;  
////Switch expression  
//switch(number){  
////Case statements  
//case 10: System.out.println("10");   break;  
//case 20: System.out.println("20");   break;  
//case 30: System.out.println("30");   break;  
////Default case statement  
//default:System.out.println("Not in 10, 20 or 30");  
// ======================================================
// C - CSE, E - ECE, M - Mechanical
String branch = "Colombia";
int collegeYear = 2000;
switch (collegeYear) {
case 2000:
	switch (branch) {
	case "Colombia":
		System.out.println("it is out side of colombia it was holy days");
		break;
	case "Madreed":
		System.out.println("duble classes a day");
		break;
	case "USA":
		System.out.println("due to corona classes cancled");
	case "Afghanistan":System.out.println("sorry");break;
	case"China":System.out.println("Coooooroooooona");break;
	}
	break;
case 2003:
	switch (branch) {
	case "Colombia":
		System.out.println("Operating System, Java, Data Structure");
		break;
	case "USA":
		System.out.println("Micro processors, Logic switching theory");
		break;
	case "Madreed":
		System.out.println("Drawing, Manufacturing Machines");
		break;
	}
	break;
case 2004:
	switch (branch) {
	case "Colombia":
		System.out.println("Computer Organization, MultiMedia");
		break;
	case "USA":
		System.out.println("Fundamentals of Logic Design, Microelectronics");
		break;
	case "Madreed":
		System.out.println("Internal Combustion Engines, Mechanical Vibration");
		break;
	}
	break;
case 2005:
	switch (branch) {
	case "Colombia":
		System.out.println("Data Communication and Networks, MultiMedia");
		break;
	case "USA":
		System.out.println("Embedded System, Image Processing");
		break;
	case "Madreed":
		System.out.println("Production Technology, Thermal Engineering");
		break;
	}
	break;
}
}
public static void winhandl() throws Exception {
	System.setProperty("webdriver.chrome.driver", "C:\\Te\\chrom\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com");
	driver.manage().window().maximize();
	Thread.sleep(4000);
	String parentw = driver.getWindowHandle();
	System.out.println("parent window id is   " + parentw);
	Thread.sleep(4000);
	driver.findElement(By.xpath("//*[@id='terms-link']")).click();
	Thread.sleep(4000);
	Set<String> allwin = driver.getWindowHandles();
	Thread.sleep(4000);
	int count = allwin.size();
	System.out.println("all windows are " + count);
	for (String child : allwin) {
		if (!parentw.equalsIgnoreCase(child)) {
			driver.switchTo().window(child);
			driver.findElement(By.name("btnk")).sendKeys("Selenium webdriver docs");
			Thread.sleep(3000);
			driver.close();
		}
	}
	driver.switchTo().window(parentw);
	System.out.println("Parent window title is " + driver.getTitle());
}
}
