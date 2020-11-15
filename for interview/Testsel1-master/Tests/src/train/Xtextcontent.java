package train;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Xtextcontent {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Te\\chromedriver_win32\\chromedriver.exe");
		WebDriver dt= new ChromeDriver();
		dt.get("https://www.orbitz.com");
		Thread.sleep(3000);
		//dt.manage().window().maximize();
		/*dt.findElement(By.xpath("//a[text()='noopener']")).click();*/
		
		// dt.findElement(By.id("u_0_m")).sendKeys("ooiuyhoiuy");
//		 dt.findElement(By.xpath("//input[@type='text' and @aria-label='Last name']")).sendKeys("yyyyyyyy");
//		 dt.findElement(By.xpath("//*[@id='u_0_m']")).sendKeys("aaaaaaaaaa");
//		 dt.findElement(By.xpath("//label[text()='Male']")).click();
		 /* using and operator
		 * syntax:jhfjhgf
		 * //TagName[@Att1='Val' and @Att2='Val']
		 *  //TagName[@Att='Val' and Text()='Val']*/
//  dt.findElement(By.xpath("//input[@type='text' or @name='firstname']")).sendKeys("bbbbbb");
//  dt.findElement(By.xpath("//input[@name='lastname' or text()='Last name']")).sendKeys("aaaaaaaa");
		 /*  using or operators	 
		/*	//TagName[@Att1='Val' or @Att2='Val']
		 *  //TagName[@Att='Val' or Text()='Val']*/
		dt.findElement(By.xpath("//*[contains(text(),'VacationRentals']")).click();
		 /*  using contain operators
		 *  //TagName[contains(@Att, 'partialVal')]
		 *  //TagName[contains(text(), 'partialVal')]	 
		 *  
		 *  using starts-with
		 *  //TagName[starts-with(@Att,'Starting values)']
		 *  //TagName[starts-with(text(),'starting value')]
		 *  
		 *  using hybrid
		 *  syntax
		 *  //TagName[contains(@Att1,'partial value') and stars-with(text(), 'starting value')]
		 *  //TagName[@Att1='Value' or starts-with(@Att2, 'Starting value')]
		 *  //*[@Att='value']
		 *  
		 *  based on parent an child
		 *  //div[@id='uyuyu']/child::dive[3]
		 */}}