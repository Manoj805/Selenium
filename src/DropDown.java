import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", 
				"D:\\Manoj\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		Thread.sleep(2000);
		WebElement date = driver.findElement(By.id("day"));
		Select s = new Select(date);
		s.selectByValue("11");
		Thread.sleep(2000);
		WebElement mont = driver.findElement(By.id("month"));
		Select s1 = new Select(mont);
		s1.selectByVisibleText("Sep");
		Thread.sleep(2000);
		WebElement yr = driver.findElement(By.id("year"));
		Select s2 =new Select(yr);
		s2.selectByVisibleText("1995");
		Thread.sleep(2000);
		WebElement mal = driver.findElement(By.xpath("//label[text()='Male']"));
		mal.click();
		
	}

}
