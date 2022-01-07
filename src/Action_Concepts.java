import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action_Concepts {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", 
				"D:\\Manoj\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/drop.html");
		driver.manage().window().maximize();
	//	WebElement course = driver.findElement(By.xpath("//div[@title='Courses']"));
		Actions Act = new Actions(driver);
	/*	Act.moveToElement(course).perform();
		Thread.sleep(2000);
		WebElement orac = driver.findElement(By.xpath("//div[@title='Oracle']"));
		Act.moveToElement(orac).perform();
		WebElement text = driver.findElement(By.linkText("Oracle DBA Certification Training"));
		Act.click(text).perform(); //using click concept
		Thread.sleep(2000);
		WebElement rightclick = driver.findElement(By.linkText("All Courses"));
		Act.contextClick(rightclick).perform();
		WebElement doubleclick = driver.findElement(By.name("p"));
		doubleclick.sendKeys("mail");
		Act.doubleClick(doubleclick).perform(); */
		
		WebElement Source = driver.findElement(By.id("draggable"));
		WebElement Destination = driver.findElement(By.id("droppable"));
		Act.dragAndDrop(Source, Destination).perform();
		
	}

}
