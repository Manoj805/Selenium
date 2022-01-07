import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunch {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","D:\\Manoj\\Selenium\\Driver\\chromedriver.exe" );
		WebDriver driver =new ChromeDriver();
	//	driver.get("https://www.snapdeal.com/"); //Browser
		driver.get("http://demo.automationtesting.in/Alerts.html"); //Alert
		driver.manage().window().maximize();
	//	Thread.sleep(1000);
	/*	driver.navigate().to("https://outlook.live.com/owa/");
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
		driver.navigate().forward();
	    Thread.sleep(1000);
		driver.navigate().refresh();
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		String title = driver.getTitle();
		System.out.println(title);
		driver.close();
		driver.quit();*/
	//	WebElement user = driver.findElement(By.id("inputValEnter"));
	//	user.sendKeys("Cricket Bat");
//		driver.findElement(By.id("userName")).sendKeys("8056252208");
	//	WebElement check = driver.findElement(By.id("checkUser"));
	//	check.click();
		WebElement clck = driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
		clck.click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		driver.findElement(By.xpath("(//a[@class=\"analystic\"])[2]")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		driver.switchTo().alert().dismiss();
		driver.findElement(By.xpath("(//a[@class='analystic'])[3]")).click();
	  // WebElement val = driver.findElement(By.xpath("//button[@onclick='promptbox()']"));
		//val.sendKeys("My Automation");
		driver.findElement(By.xpath("//button[text()='click the button to demonstrate the prompt box '] ")).click();
		driver.switchTo().alert().sendKeys("Automation is future");
		driver.switchTo().alert().accept();
		
	}

}
