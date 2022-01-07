import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Automation_Practice {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				"D:\\Manoj\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://automationpractice.com/");
		driver.manage().window().maximize();
		driver.findElement(By.name("search_query")).sendKeys("T-shirts");
		driver.findElement(By.name("submit_search")).click();
		driver.findElement(By.linkText("Faded Short Sleeve T-shirts")).click();
		Select s1= new Select(driver.findElement(By.id("group_1")));
		s1.selectByIndex(1);
		driver.findElement(By.name("Submit")).click();
		driver.findElement(By.linkText("Proceed to checkout")).click();
		
	}

}
